package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.Output;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.functionImpl;

public class FrontEnd {

  private static HashMap<String, FunctionDescriptor> map = new HashMap<String, FunctionDescriptor>();

  public static void main (String[] args) throws Exception {
    PTree p = new PTree();
    FileReader reader = new FileReader(new File(args[0]));
    EObject root = p.parse(reader);
    parcours(root);

    for (String key : map.keySet()) {
      System.out.println(key + " paramètres: " + map.get(key).getNbIn() +
          " sorties: " + map.get(key).getNbOut());
      System.out.print("\tVariables locales :");
      for (String v : map.get(key).keySet())
        System.out.print(v + " ");
      System.out.println("");
    }
    System.out.println("Nombre de fonction: " + map.size());
  }

  /**
   *
   * @param obj: Root element
   */
  private static void parcours(EObject obj) {
    if (obj instanceof ModelImpl) {
      for(EObject func : ((ModelImpl)obj).getModel())
        parcours(func);
    }
    else if (obj instanceof functionImpl) {
      int in = 0;
      Input inImp = ((functionImpl)obj).getDef().getInputVars();
      if (inImp.getV() != null)
        in++;
      if (inImp.getV2() != null)
        in += inImp.getV2().size();

      int out = 0;
      Output outImpl = ((functionImpl)obj).getDef().getOutputVars();
      if (outImpl.getV() != null)
        out++;
      if (outImpl.getV2() != null)
        out += outImpl.getV2().size();

      VariableDescriptor localMap = new VariableDescriptor();
      for (EObject com : ((functionImpl)obj).getDef().getCommandList().getC()) {
        if (((CommandImpl)com).getVarL() != null)
          localMap.addVariable(((CommandImpl)com).getVarL());
      }

      map.put(((functionImpl)obj).getFunName(), new FunctionDescriptor(in, out, localMap));
    }

    return;
  }
}
