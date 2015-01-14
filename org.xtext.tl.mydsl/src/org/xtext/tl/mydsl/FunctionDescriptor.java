package org.xtext.tl.mydsl;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class FunctionDescriptor {

  private int nbIn;
  private int nbOut;
  private List<String> in;
  private List<String> out;
  private String labelName;

  private VariableDescriptor tableSymboles;

  public FunctionDescriptor(int nbParam, int nbReturn) {
    this.nbIn  = nbParam;
    this.nbOut = nbReturn;
    this.in    = new ArrayList<String>();
    this.out   = new ArrayList<String>();
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

  public void addInput(String name) {
    this.in.add(name);
  }

  public void addInput(List<String> nameList) {
    this.in.addAll(nameList);
  }

  public void addOuput(String name) {
    this.out.add(name);
  }

  public void addOuput(List<String> nameList) {
    this.out.addAll(nameList);
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
   * @return the in
   */
  public List<String> getIn() {
    return in;
  }

  /**
   * @return the out
   */
  public List<String> getOut() {
    return out;
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
