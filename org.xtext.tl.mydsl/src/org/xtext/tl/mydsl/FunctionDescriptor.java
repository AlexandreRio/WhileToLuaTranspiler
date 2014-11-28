package org.xtext.tl.mydsl;

public class FunctionDescriptor {

  private int nbIn;
  private int nbOut;

  private VariableDescriptor tableSymboles;

  public FunctionDescriptor(int nbParam, int nbReturn) {
    this.nbIn  = nbParam;
    this.nbOut = nbReturn;
    this.tableSymboles = new VariableDescriptor();
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
