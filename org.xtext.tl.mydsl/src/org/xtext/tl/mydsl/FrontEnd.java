package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.Output;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandsImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl;
import org.xtext.tl.mydsl.myDsl.impl.FunctionImpl;

/**
 * Main class of the front end part of the compiler
 */
public class FrontEnd {

  /**
   * Link a function name to its descriptor
   * @see org.xtext.tl.mydsl.FunctionDescriptor
   */
  private static HashMap<String, FunctionDescriptor> funDescMap = new HashMap<String, FunctionDescriptor>();

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
      System.out.println(key + " paramètres: " + funDescMap.get(key).getNbIn() +
          " sorties: " + funDescMap.get(key).getNbOut());
      System.out.print("\tVariables locales :");
      for (String v : funDescMap.get(key).keySet())
        System.out.print(v + " ");
      System.out.println("");
    }
    System.out.println("Nombre de fonction: " + funDescMap.size());
  }

  /**
   * Navigate through the AST from the root element.
   *
   * @param obj: Root element
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
   *
   *
   * @param obj: instance of function object
   * @see functionImpl
   * @param funName:
   */
  private static void parcours(EObject obj, String funName) {
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
      for (EObject f : ((CommandsImpl)obj).getC())
        parcours(f, funName);
    } else if (obj instanceof CommandImpl) {
      parcours(((CommandImpl)obj).getVarL(), funName);
    }
    //VariableDescriptor localfunDescMap = new VariableDescriptor();
    //for (EObject com : ((DefinitonImpl)obj).getCommandList().getC()) {
    //  if (((CommandImpl)com).getVarL() != null)
    //    localfunDescMap.addVariable(((CommandImpl)com).getVarL());
    //}

  }
}

