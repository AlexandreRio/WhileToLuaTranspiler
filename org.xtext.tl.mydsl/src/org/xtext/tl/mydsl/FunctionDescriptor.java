package org.xtext.tl.mydsl;

import java.util.Set;

public class FunctionDescriptor {

  private int nbIn;
  private int nbOut;

  private VariableDescriptor tableSymboles;

  public FunctionDescriptor(int nbParam, int nbReturn) {
    this.nbIn  = nbParam;
    this.nbOut = nbReturn;
    this.tableSymboles = new VariableDescriptor();
  }

  public FunctionDescriptor(int nbParam, int nbReturn, VariableDescriptor localVars) {
    this(nbParam, nbParam);
    this.tableSymboles = localVars;
  }

  public Set<String> keySet() {
    return this.tableSymboles.keySet();
  }

  /**
   * @return the nbIn
   */
  public int getNbIn() {
    return nbIn;
  }

  /**
   * @return the nbOut
   */
  public int getNbOut() {
    return nbOut;
  }

}
