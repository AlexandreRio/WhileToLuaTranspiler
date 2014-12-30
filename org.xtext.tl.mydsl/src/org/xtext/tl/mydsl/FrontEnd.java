package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.Output;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandsImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl;
import org.xtext.tl.mydsl.myDsl.impl.FunctionImpl;
import org.xtext.tl.mydsl.myDsl.impl.VarsImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprImpl;
import org.xtext.tl.mydsl.myDsl.impl.NotImpl;
import org.xtext.tl.mydsl.myDsl.impl.OrImpl;
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
  private static HashMap<String, FunctionDescriptor> funDescMap = new HashMap<String, FunctionDescriptor>();

  private static List<Label> labelTable = new ArrayList<Label>();

  /**
   * Map the name of a function in the source code (key) the its name in the target code (value).
   * It avoid illegal character usage.
   * */
  private static HashMap<String, String> funNameTranslation = new HashMap<String, String>();

  public static void main (String[] args) throws Exception {
    PTree p = new PTree();
    FileReader reader = new FileReader(new File(args[0]));
    EObject root = p.parse(reader);
    parcours(root);

    // print the content
    for (String key : funDescMap.keySet()) {
      System.out.println(key + "\n\tparamètres: " + funDescMap.get(key).getNbIn() +
          "\n\tsorties: " + funDescMap.get(key).getNbOut());
      System.out.print("\tsymboles :");
      for (String v : funDescMap.get(key).keySet())
        System.out.print(v + " ");
      System.out.println("");
    }
    System.out.println("Nombre de fonction: " + funDescMap.size());
  }

  /**
   * Navigate through all the functions of the AST.
   * First call should be made from the root element.
   *
   * @see #parcours(EObject, String)
   * @param obj: Node of the AST 
   */
  private static void parcours(EObject obj) {
    if (obj instanceof ModelImpl) {
      for(EObject func : ((ModelImpl)obj).getModel())
        parcours(func);
    }
    else if (obj instanceof FunctionImpl) {
      String funInSourceName = ((FunctionImpl)obj).getFunName();
      String funInTargetName = "f" + funNameTranslation.size();

      funNameTranslation.put(funInSourceName, funInTargetName);

      parcours(obj, funInTargetName);
    }

    return;
  }

  /**
   * Navigate through a function node of the AST.
   *
   * @param obj: 
   * @see FunctionImpl
   * @param funName:
   */
  private static void parcours(EObject obj, String funName) {
    if (obj == null || funName == null)
      return;

    if (obj instanceof FunctionImpl) {
      funDescMap.put(funName, new FunctionDescriptor(0, 0));

      parcours(((FunctionImpl)obj).getDef(), funName);
    } else if (obj instanceof DefinitonImpl) {
      int in = 0;
      Input inImp = ((DefinitonImpl)obj).getInputVars();
      if (inImp.getV() != null)
        in++;
      if (inImp.getV2() != null)
        in += inImp.getV2().size();

      int out = 0;
      Output outImpl = ((DefinitonImpl)obj).getOutputVars();
      if (outImpl.getV() != null)
        out++;
      if (outImpl.getV2() != null)
        out += outImpl.getV2().size();

      funDescMap.get(funName).setNbIn(in);
      funDescMap.get(funName).setNbOut(out);

      parcours(((DefinitonImpl)obj).getCommandList(), funName);
    } else if (obj instanceof CommandsImpl) {
      for (EObject f : ((CommandsImpl)obj).getC()) {
        // generate new label name
        String labelName = "l" + labelTable.size();
        parcours(f, funName);
      }
    } else if (obj instanceof CommandImpl) {
      CommandImpl ob = (CommandImpl) obj;
      String name = ob.getNom();

      // vars := exps
      if (ob.getVarL() != null && ob.getExpL() != null) {
        parcours(ob.getVarL(), funName);
        parcours(ob.getExpL(), funName);
      } // nop
      else if (ob.getNom() == null) {
        TAC nopTAC = new TAC(new CodeOp(CodeOp.OP_NOP, null), null, null, null);
      }

      parcours(ob.getExp() , funName);
      parcours(ob.getExp1(), funName);
      parcours(ob.getExp2(), funName);
      parcours(ob.getC1()  , funName);
      parcours(ob.getC2()  , funName);
    } else if (obj instanceof VarsImpl) {
      funDescMap.get(funName).addVar(((VarsImpl)obj).getV1());

      for (EObject v : ((VarsImpl)obj).getV2())
        parcours(v, funName);
    } else if (obj instanceof ExprImpl) {
      parcours(((ExprImpl)obj).getExpEt(), funName);
      parcours(((ExprImpl)obj).getExprSimple(), funName);
      parcours(((ExprImpl)obj).getExpTerminale(), funName);
    } else if (obj instanceof AndImpl) {
      parcours(((AndImpl)obj).getExpOu(), funName);

      for (EObject ou : ((AndImpl)obj).getExpOu2())
        parcours(ou, funName);
    } else if (obj instanceof OrImpl) {
      parcours(((OrImpl)obj).getExpNon(), funName);

      for (EObject no : ((OrImpl)obj).getExpNon2())
        parcours(no, funName);
    } else if (obj instanceof NotImpl) {
      parcours(((NotImpl)obj).getExpEq(), funName);
    } else if (obj instanceof EqImpl) {
      parcours(((EqImpl)obj).getExprEq1(), funName);
      parcours(((EqImpl)obj).getExprEq2(), funName);
      parcours(((EqImpl)obj).getExp()    , funName);
    } else if (obj instanceof ExprSimpleImpl) {
      parcours(((ExprSimpleImpl)obj).getExpr(), funName);

      parcours(((ExprSimpleImpl)obj).getLexpr(), funName);
    } else if (obj instanceof ExprTermImpl) {
      funDescMap.get(funName).addVar(((ExprTermImpl)obj).getExprTerm());
    }
  }

  private static void parcours(EObject obj, String funName, String labelName) {
  }
}
