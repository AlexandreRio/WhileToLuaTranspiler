package org.xtext.tl.mydsl;

import java.util.HashMap;

public class VariableDescriptor {

  private HashMap<String, Integer> variables;

  public VariableDescriptor() {
    this.variables = new HashMap<String, Integer>();
  }

  public void addVariable(String name) {
    this.variables.put(name, null);
  }

  public void addVariable(String name, int value) {
    this.variables.put(name, value);
  }
}

