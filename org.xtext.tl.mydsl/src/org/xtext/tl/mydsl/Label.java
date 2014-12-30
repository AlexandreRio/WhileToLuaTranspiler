package org.xtext.tl.mydsl;

import java.util.List;
import java.util.ArrayList;

/**
 * Label of a list of 3 address code
 */
public class Label {

  /** Name of the label, should be unique */
  private String name;
  /** List of instructions under this label */
  private List<TAC> code;

  public Label(String name) {
    this.name = name;
    this.code = new ArrayList<TAC>();
  }
}
