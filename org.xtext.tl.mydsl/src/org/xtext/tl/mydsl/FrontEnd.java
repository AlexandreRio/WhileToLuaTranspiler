package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.Lexpr;
import org.xtext.tl.mydsl.myDsl.Expr;
import org.xtext.tl.mydsl.myDsl.Output;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandsImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl;
import org.xtext.tl.mydsl.myDsl.impl.FunctionImpl;
import org.xtext.tl.mydsl.myDsl.impl.VarsImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprImpl;
import org.xtext.tl.mydsl.myDsl.impl.OrImpl;
import org.xtext.tl.mydsl.myDsl.impl.NotImpl;
import org.xtext.tl.mydsl.myDsl.impl.EqImpl;
import org.xtext.tl.mydsl.myDsl.impl.AndImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl;

import static org.xtext.tl.mydsl.CodeOp.*;

/**
 * Main class of the front end part of the compiler
 */
public class FrontEnd {

  /**
   * Link a function name to its descriptor
   * @see org.xtext.tl.mydsl.FunctionDescriptor
   */
  private LinkedHashMap<String, FunctionDescriptor> funDescMap;

  private LabelTable labelTable;

  /**
   * Map the name of a function in the source code (key) the its name in the target code (value).
   * It avoid illegal character usage.
   * */
  private HashMap<String, String> funNameTranslation;

  /**
   * Map the name of a function to a map for variable name in sourche and in target code.
   * @see #funNameTranslation
   */
  private HashMap<String, HashMap<String, String>> varNameTranslation;

  public FrontEnd(String filename) throws Exception {
    this.funDescMap = new LinkedHashMap<String, FunctionDescriptor>();
    this.labelTable = new LabelTable();

    this.funNameTranslation = new HashMap<String, String>();
    this.varNameTranslation = new HashMap<String, HashMap<String, String>>();

    PTree p = new PTree();
    FileReader reader = new FileReader(new File(filename));
    EObject root = p.parse(reader);
    this.parcours(root);
  }

  /**
   * Navigate through all the functions of the AST.
   * First call should be made from the root element.
   *
   * @see #parcours(EObject, String)
   * @param obj: Node of the AST
   */
  private void parcours(EObject obj) throws Exception {
    if (obj instanceof ModelImpl) {
      for (EObject func : ((ModelImpl) obj).getModel())
        parcours(func);
    } else if (obj instanceof FunctionImpl) {
      String funInSourceName = ((FunctionImpl) obj).getFunName();
      String funInTargetName = "f" + funNameTranslation.size();

      this.funNameTranslation.put(funInSourceName, funInTargetName);

      this.varNameTranslation.put(funInTargetName, new HashMap<String, String>());
      parcours(obj, funInTargetName);
    }

    return;
  }

  /**
   * Navigate through a function node of the AST.
   * Read and Write command are treated here,
   * for the rest see {@link #parcours(EObject, String, String}
   *
   * @param obj Function node of the AST
   * @param funName Name of the function in the target language
   * @see FunctionImpl
   */
  private void parcours(EObject obj, String funName) throws Exception {
    if (obj == null || funName == null)
      return;

    if (obj instanceof FunctionImpl) {
      this.funDescMap.put(funName, new FunctionDescriptor(0, 0));

      this.parcours(((FunctionImpl) obj).getDef(), funName);
    } else if (obj instanceof DefinitonImpl) {
      int in = 0;
      int out = 0;
      Input inImp    = ((DefinitonImpl) obj).getInputVars();
      Output outImpl = ((DefinitonImpl) obj).getOutputVars();
      FunctionDescriptor desc = this.funDescMap.get(funName);

      String inSource;
      String inTarget;
      // read
      if (inImp.getV() != null) {
        inSource = inImp.getV();
        inTarget = "v" + this.varNameTranslation.size();

        this.varNameTranslation.get(funName).put(inSource, inTarget);
        desc.addInput(inTarget);
        in++;
      }
      if (inImp.getV2() != null) {
        for (String v : inImp.getV2()) {
          inTarget = "v" + this.varNameTranslation.get(funName).size();
          this.varNameTranslation.get(funName).put(v, inTarget);
          desc.addInput(inTarget);
          in++;
        }
      }

      // write
      if (outImpl.getV() != null) {
        if (this.varNameTranslation.get(funName).containsKey(outImpl.getV())) {
          inTarget = this.varNameTranslation.get(funName).get(outImpl.getV());
        } else {
          inTarget = "v" + this.varNameTranslation.get(funName).size();
          this.varNameTranslation.get(funName).put(outImpl.getV(), inTarget);
        }
        desc.addOuput(inTarget);
        out++;
      }
      if (outImpl.getV2() != null) {
        for (String v : outImpl.getV2()) {
          if (this.varNameTranslation.get(funName).containsKey(v)) {
            inTarget = this.varNameTranslation.get(funName).get(v);
          } else {
            inTarget = "v" + this.varNameTranslation.get(funName).size();
            this.varNameTranslation.get(funName).put(v, inTarget);
          }
          out++;
          desc.addOuput(inTarget);
        }
      }

      desc.setNbIn(in);
      desc.setNbOut(out);

      this.parcours(((DefinitonImpl) obj).getCommandList(), funName);
    } else if (obj instanceof CommandsImpl) {
      String label = labelTable.generateLabel();
      if (funDescMap.get(funName).getLabelName() == null)
        funDescMap.get(funName).setLabelName(label);
      for (EObject f : ((CommandsImpl) obj).getC())
        this.parcours(f, funName, label);
    } else {
      throw new Exception("Unrecognised EObject node: " + obj);
    }
  }

  /**
   * Navigate through the AST when a label can be deducted.
   *
   * @param obj First call should be a Command node, after that
   * everything below in the AST
   * @param funName Name of the current function the target language
   * @param labelName Name of the current label
   * @see Label
   */
  private void parcours(EObject obj, String funName, String labelName)
    throws Exception {

    // for nested commands
    if (obj instanceof CommandsImpl) {
      for (EObject f : ((CommandsImpl) obj).getC())
        parcours(f, funName, labelName);
    } else if (obj instanceof CommandImpl) {
      CommandImpl ob = (CommandImpl) obj;
      String name = ob.getNom();

      // vars := exps
      if (ob.getVarL() != null && ob.getExpL() != null) {

        //create a list of value, right part
        List<ExprRes> resList = new ArrayList<ExprRes>();

        // individual element
        ExprRes individualRes = new ExprRes();
        individualRes.setRes(funDescMap.get(funName).generateTempVar());
        ExprRes res = traiterExpr(ob.getExpL().getExp(), funName, individualRes);
        resList.add(res);

        // list elements
        ExprRes tmpRes;
        for (Expr exp : ob.getExpL().getExpL()) {
          tmpRes = new ExprRes();
          tmpRes.setRes(funDescMap.get(funName).generateTempVar());
          resList.add(traiterExpr(exp, funName, tmpRes));
        }

        //create a list of variable, left part
        List<String> vars = getVars(ob.getVarL(), funName);

        if (vars.size() != resList.size())
          System.err.println("Not enough variable, or too many!");

        //append three address code
        //theoritically this loop can be merged with the following one,
        //just to separate the jobs
        for (ExprRes result : resList)
          labelTable.add(labelName, result.getTAC());

        TAC movTAC;
        String varName;
        for (int i=0; i<vars.size(); i++) {
          varName = vars.get(i);
          tmpRes  = resList.get(i);

          movTAC = new TAC(new CodeOp(CodeOp.OP_MOV, null), varName, tmpRes.getRes(), null);
          labelTable.add(labelName, movTAC);
        }
      } // nop
      else if (name == null) {
        TAC nopTAC = new TAC(new CodeOp(CodeOp.OP_NOP, null), null,
            null, null);
        labelTable.add(labelName, nopTAC);
      } else if (name.equals("while")) {
        String whileLabel = labelTable.generateLabel();

        TAC whileTAC = new TAC(new CodeOp(CodeOp.OP_WHILE, whileLabel),
            null, "place", null);
        labelTable.add(labelName, whileTAC);

        parcours(ob.getExp(), funName, whileLabel);
        parcours(ob.getC1(), funName, whileLabel);
      } else if (name.equals("for")) {
        //TODO: TAC

        parcours(ob.getExp(), funName);
        parcours(ob.getC1(), funName);
      } else if (name.equals("foreach")) {
        //TODO: TAC

        parcours(ob.getExp1(), funName);
        parcours(ob.getExp2(), funName);
        parcours(ob.getC1(), funName);
      } else if (name.equals("if")) {
        if (ob.getC2() != null) {
          ExprRes ifExpRes = new ExprRes();
          ifExpRes.setRes(funDescMap.get(funName).generateTempVar());

          ExprRes res = traiterExpr(ob.getExp(), funName, ifExpRes);
          String ifLabel = labelTable.generateLabel();
          String elseLabel = labelTable.generateLabel();

          TAC ifTAC = new TAC(new CodeOp(CodeOp.OP_IFELSE, ifLabel, elseLabel),
              null, res.getRes(), null);
          labelTable.add(labelName, res.getTAC());
          labelTable.add(labelName, ifTAC);

          parcours(ob.getC1(), funName, ifLabel);
          parcours(ob.getC2(), funName, elseLabel);
        } // if with no else statement
        else {
          ExprRes ifExprRes = new ExprRes();
          ifExprRes.setRes(funDescMap.get(funName).generateTempVar());

          ExprRes res = traiterExpr(ob.getExp(), funName, ifExprRes);
          String ifLabel = labelTable.generateLabel();

          TAC ifTAC = new TAC(new CodeOp(CodeOp.OP_IF, ifLabel),
              null, res.getRes(), null);
          labelTable.add(labelName, res.getTAC());
          labelTable.add(labelName, ifTAC);

          parcours(ob.getC1(), funName, ifLabel);
        }
      }

    }
  }

  /**
   * Create a list of variables from a VarsImpl node of the AST and add
   * them to the symbol tables of the function
   *
   * @param obj VarsImpl instance node of the AST
   * @param funName name of the current function we are in
   * @return List of the variables referenced by this VarsImpl node
   */
  public List<String> getVars(EObject obj, String funName) {
    List<String> ret = new ArrayList<String>();
    if (obj instanceof VarsImpl) {
      //individual variable
      String varInSourceName = ((VarsImpl) obj).getV1();
      String varInTargetName = "v" + this.varNameTranslation.size();

      varNameTranslation.get(funName).put(varInSourceName, varInTargetName);

      funDescMap.get(funName).addVar(varInTargetName);
      ret.add(varInTargetName);

      for (String var : ((VarsImpl)obj).getV2()) {
        varInTargetName = "v" + varNameTranslation.size();

        varNameTranslation.get(funName).put(var, varInTargetName);

        funDescMap.get(funName).addVar(varInTargetName);
        ret.add(varInTargetName);
      }
    }
    return ret;
  }

  /**
   * Go through an expression, create TAC to store temporary result
   *
   * @param obj Node of an expression
   * @param funName Name of the current function we are in
   * @param curRes Object to where the current result is and where the current TAC is
   * @return Object with the final result of the expression and a TAC list to produce this result
   *
   * @throws Exception if a node implementation instance is not recognised
   */
  public ExprRes traiterExpr(EObject obj, String funName, ExprRes curRes) throws Exception {
    if (obj instanceof ExprImpl) {
      ExprImpl ob = (ExprImpl) obj;

      if (ob.getExpEt() != null) {
        return traiterExpr(ob.getExpEt(), funName, curRes);
      } else if (ob.getExprSimple() != null) {
        return traiterExpr(ob.getExprSimple(), funName, curRes);
      } else if (ob.getExpTerminale() != null) {
        return traiterExpr(ob.getExpTerminale(), funName, curRes);
      } else {
        throw new Exception("Unrecognised node " + obj);
      }

    } else if (obj instanceof AndImpl) {
      parcours(((AndImpl) obj).getExpOu(), funName);

      for (EObject ou : ((AndImpl) obj).getExpOu2())
        parcours(ou, funName);
      return null;
    } else if (obj instanceof OrImpl) {
      return null;
    } else if (obj instanceof NotImpl) {
      return null;
    } else if (obj instanceof EqImpl) {
      return null;
    } else if (obj instanceof ExprSimpleImpl) {
      ExprSimpleImpl ob = (ExprSimpleImpl) obj;

      // head or tail
      if (ob.getExpr() != null) {
        if (ob.getMot().equals("hd")) {

        } else if (ob.getMot().equals("tl")) {

        }
      } // cons or list
      else if (ob.getLexpr() != null) {
        if (ob.getMot().equals("cons")) {
          List<ExprRes> listExprRes = new ArrayList<ExprRes>();
          Lexpr le = ob.getLexpr();
          for (Expr exp : le.getExp()) {
            ExprRes tmpRes = new ExprRes();
            String tmp = funDescMap.get(funName).generateTempVar();
            tmpRes.setRes(tmp);
            listExprRes.add(traiterExpr(exp, funName, tmpRes));
          }


          if (listExprRes.size() == 1) {
            curRes.addTAC(listExprRes.get(0).getTAC());
            curRes.addTAC(new TAC(new CodeOp(OP_CONS), curRes.getRes(), listExprRes.get(0).getRes(), null));
          } else if (listExprRes.size() == 2) {
            for (ExprRes twoOperandRes : listExprRes)
              curRes.addTAC(twoOperandRes.getTAC());
            curRes.addTAC(new TAC(new CodeOp(OP_CONS), curRes.getRes(), listExprRes.get(0).getRes(), listExprRes.get(1).getRes()));
          } else { // size > 2
            //this will transpose (cons A B C) into (cons (cons B C))
            int size = listExprRes.size();
            for (ExprRes twoOperandRes : listExprRes)
              curRes.addTAC(twoOperandRes.getTAC());

            ExprRes lastRes = new ExprRes();
            String lastTwoTmp = funDescMap.get(funName).generateTempVar();
            TAC lastTwo = new TAC(new CodeOp(OP_CONS),lastTwoTmp,listExprRes.get(size-2).getRes(),listExprRes.get(size-1).getRes());
            lastRes.setRes(lastTwoTmp);
            lastRes.addTAC(lastTwo);
            for (int i=size-3; i>=0; i--) {
              curRes.addTAC(lastRes.getTAC());
              curRes.setRes(funDescMap.get(funName).generateTempVar());
              curRes.addTAC(new TAC(new CodeOp(OP_CONS), curRes.getRes(), listExprRes.get(i).getRes(), lastRes.getRes()));
              lastRes.setRes(curRes.getRes());
              lastRes.clearTAC();
            }
          }

        } else if (ob.getMot().equals("list")) {
          //TODO utiliser une linked list, parcourir à l'envers et produire du TAC de cons avec plein de variables
          //temporaires
        }

        return curRes;
      }
    } else if (obj instanceof ExprTermImpl) {
      ExprTermImpl ob = (ExprTermImpl)obj;
      // Symboles
      if (ob.getTermSym() != null) {
        String symboles = ob.getTermSym();
      } // Variables
      else if (ob.getTermVar() != null) {
        funDescMap.get(funName).addVar(ob.getTermVar());
        curRes.setRes(ob.getTermVar());
      } // nil
      else {
        TAC nilTAC = new TAC(new CodeOp(OP_NIL), curRes.getRes(), null, null);
        curRes.addTAC(nilTAC);
      }
      return curRes;
    }
    return null;
  }

  public String toString() {
    String ret = "";
    for (String key : funDescMap.keySet()) {
      ret += key +
        "\n\tparamètres: " + funDescMap.get(key).getNbIn();
      for (String param : funDescMap.get(key).getIn())
        ret += " " + param;
      ret += "\n\tsorties: " + funDescMap.get(key).getNbOut();
      for (String sortie : funDescMap.get(key).getOut())
        ret += " " + sortie;
      ret += "\n\tlabel de début:"
        + funDescMap.get(key).getLabelName() + "\n";
      ret += "\tsymboles :";
      for (String v : funDescMap.get(key).keySet())
        ret += v + " ";
      ret += "\n";
    }
    ret += "Nombre de fonction: " + funDescMap.size() + "\n";
    ret += "Contenu de la table des labels:\n";
    ret += labelTable;

    return ret;
  }

  /**
   * @return the funDescMap
   */
  public HashMap<String, FunctionDescriptor> getFunDescMap() {
    return funDescMap;
  }

  /**
   * @return the labelTable
   */
  public LabelTable getLabelTable() {
    return labelTable;
  }

  /**
   * @return the funNameTranslation
   */
  public HashMap<String, String> getFunNameTranslation() {
    return funNameTranslation;
  }

  /**
   * @return the varNameTranslation
   */
  public HashMap<String, HashMap<String, String>> getVarNameTranslation() {
    return varNameTranslation;
  }
}
