package org.xtext.tl.mydsl;

import java.util.HashMap;
import java.util.Set;

public class VariableDescriptor {

  private HashMap<String, BinTree> variables;

  public VariableDescriptor() {
    this.variables = new HashMap<String, BinTree>();
  }

  public void addVariable(String name) {
    this.variables.put(name, null);
  }

  public void addVariable(String name, BinTree value) {
    this.variables.put(name, value);
  }

  public Set<String> keySet() {
    return this.variables.keySet();
  }

  public int size() {
    return this.variables.size();
  }
}

