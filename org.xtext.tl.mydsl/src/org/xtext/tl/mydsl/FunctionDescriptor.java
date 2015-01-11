package org.xtext.tl.mydsl;

import java.util.Set;

public class FunctionDescriptor {

  private int nbIn;
  private int nbOut;
  private String labelName;

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

  /**
   * TODO better, unique name
   */
  public String generateTempVar() {
    String tempVarName = "tmp" + this.tableSymboles.size();
    this.addVar(tempVarName);
    return tempVarName;
  }

  public void addVar(String var) {
    this.tableSymboles.addVariable(var);
  }

  public Set<String> keySet() {
    return this.tableSymboles.keySet();
  }

  public void setNbIn(int nb) {
    this.nbIn = nb;
  }

  /**
   * @return the nbIn
   */
  public int getNbIn() {
    return nbIn;
  }

  public void setNbOut(int nb) {
    this.nbOut = nb;
  }

  /**
   * @return the labelName
   */
  public String getLabelName() {
    return labelName;
  }

  /**
   * @param labelName the labelName to set
   */
  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }

  /**
   * @return the nbOut
   */
  public int getNbOut() {
    return nbOut;
  }

}
