package org.xtext.tl.mydsl;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class LabelTable {

  private Map<String, Label> table;

  public LabelTable() {
    this.table = new HashMap<String, Label>();
  }

  public void add(String labelName, TAC code) {
    this.table.get(labelName).add(code);
  }

  public void add(String labelName, List<TAC> code) {
    for (TAC tac : code)
      this.table.get(labelName).add(tac);
  }

  /**
   * Create a new label name based on the size of the table, be careful
   * to not remove any element to keep the unicity of the name.
   *
   * @return Name of a non existing label
   */
  public String generateLabel() {
    String newLabelName = "l_" + table.size();
    this.table.put(newLabelName, new Label(newLabelName));
    return newLabelName;
  }

  public String toString() {
    String ret = "";
    for (String k : table.keySet()) {
      ret += k + " : " + table.get(k).size() + " lines\n";
      for (TAC code : table.get(k).getCode())
        ret += "\t" + code + "\n";
    }
    return ret;
  }
}
