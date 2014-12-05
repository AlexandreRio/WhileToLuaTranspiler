package org.xtext.tl.mydsl;

import java.util.HashMap;
import java.util.Set;

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

  public Set<String> keySet() {
    return this.variables.keySet();
  }

  public int size() {
    return this.variables.size();
  }
}

