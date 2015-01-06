package org.xtext.tl.mydsl;

import java.util.List;
import java.util.ArrayList;

public class ExprRes {

  private String res;
  private List<TAC> code;

  public ExprRes() {
    this.code = new ArrayList<TAC>();
  }

  public void addTAC(TAC tac) {
    this.code.add(tac);
  }

  /**
   * @return the res
   */
  public String getRes() {
    return res;
  }

  /**
   * @param res the res to set
   */
  public void setRes(String res) {
    this.res = res;
  }

  /**
   * @return the code
   */
  public List<TAC> getTAC() {
    return code;
  }

}
