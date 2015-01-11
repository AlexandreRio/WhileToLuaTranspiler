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
   * Same thing for variables
   */
  private HashMap<String, String> varNameTranslation;

  public FrontEnd(String filename) throws Exception {
    this.funDescMap = new LinkedHashMap<String, FunctionDescriptor>();
    this.labelTable = new LabelTable();

    this.funNameTranslation = new HashMap<String, String>();
    this.varNameTranslation = new HashMap<String, String>();

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
      Input inImp = ((DefinitonImpl) obj).getInputVars();
      if (inImp.getV() != null)
        in++;
      if (inImp.getV2() != null)
        in += inImp.getV2().size();

      int out = 0;
      Output outImpl = ((DefinitonImpl) obj).getOutputVars();
      if (outImpl.getV() != null)
        out++;
      if (outImpl.getV2() != null)
        out += outImpl.getV2().size();

      this.funDescMap.get(funName).setNbIn(in);
      this.funDescMap.get(funName).setNbOut(out);

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
        //TODO: TAC for affectation

        //create a list of value, right part
        //traiterExpr(ob.getExpL())
        //create a list of variable, left part
        List<String> vars = getVars(ob.getVarL(),
            new ArrayList<String>(), funName);
        for (String var : vars) {
          TAC movTAC = new TAC(new CodeOp(CodeOp.OP_MOV, null), var,
              "place", null);
        }
        traiterExpr(ob.getExpL(), funName, new ExprRes());
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
          ExprRes res = traiterExpr(ob.getExp(), funName,
              new ExprRes());
          String ifLabel = labelTable.generateLabel();
          String elseLabel = labelTable.generateLabel();

          TAC ifTAC = new TAC(new CodeOp(CodeOp.OP_IFNNIL, ifLabel),
              null, res.getRes(), null);
          TAC gotoTAC = new TAC(
              new CodeOp(CodeOp.OP_GOTO, elseLabel), null, null,
              null);
          labelTable.add(labelName, res.getTAC());
          labelTable.add(labelName, ifTAC);
          labelTable.add(labelName, gotoTAC);

          parcours(ob.getC1(), funName, ifLabel);
          parcours(ob.getC2(), funName, elseLabel);
        } // if with no else statement
        else {
          ExprRes ifExprRes = new ExprRes();
          ifExprRes.setRes(funDescMap.get(funName).generateTempVar());

          ExprRes res = traiterExpr(ob.getExp(), funName, ifExprRes);
          String ifLabel = labelTable.generateLabel();

          TAC ifTAC = new TAC(new CodeOp(CodeOp.OP_IFNNIL, ifLabel),
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
   * @param list list of the current variables visited, for first call should be empty
   * @param funName name of the current function we are in
   * @return List of the variables referenced by this VarsImpl node
   */
  public List<String> getVars(EObject obj, List<String> list,
      String funName) {
    if (list == null)
      return null;

    if (obj instanceof VarsImpl) {
      String varInSourceName = ((VarsImpl) obj).getV1();
      String varInTargetName = "v" + varNameTranslation.size();

      varNameTranslation.put(varInSourceName, varInTargetName);

      funDescMap.get(funName).addVar(varInTargetName);
      list.add(((VarsImpl) obj).getV1());
      return getVars(((VarsImpl) obj).getV2(), list, funName);
    } else
      return list;
  }

  public ExprRes traiterExpr(EObject obj, String funName,
      ExprRes curRes) throws Exception {
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
      //parcours(((OrImpl)obj).getExpNon(), funName);

      //for (EObject no : ((OrImpl)obj).getExpNon2())
      //  parcours(no, funName);
    } else if (obj instanceof NotImpl) {
      return null;
      //parcours(((NotImpl)obj).getExpEq(), funName);
    } else if (obj instanceof EqImpl) {
      return null;
      //parcours(((EqImpl)obj).getExprEq1(), funName);
      //parcours(((EqImpl)obj).getExprEq2(), funName);
      //parcours(((EqImpl)obj).getExp()    , funName);
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
          for (Expr exp : le.getExp())
            listExprRes.add(traiterExpr(exp, funName, new ExprRes()));

          // maybe go backward…
          //TODO: evaluate by group of 2 if possible
          for (ExprRes expRes : listExprRes) {
            curRes.addTAC(expRes.getTAC());
            curRes.addTAC(new TAC(new CodeOp(CodeOp.OP_CONS, null), curRes.getRes(), expRes.getRes(), null));
          }

        } else if (ob.getMot().equals("list")) {

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
        funDescMap.get(funName).addVar(ob.getTermVar());
        curRes.setRes(ob.getTermVar());
      }
      return curRes;
    }
    return null;
  }

  public String toString() {
    String ret = "";
    for (String key : funDescMap.keySet()) {
      ret += key + "\n\tparamètres: "
          + funDescMap.get(key).getNbIn() + "\n\tsorties: "
          + funDescMap.get(key).getNbOut() + "\n\tlabel de début:"
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
  public HashMap<String, String> getVarNameTranslation() {
    return varNameTranslation;
  }
}
