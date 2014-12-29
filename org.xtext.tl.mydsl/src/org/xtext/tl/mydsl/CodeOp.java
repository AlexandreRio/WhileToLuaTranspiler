package org.xtext.tl.mydsl;

/**
 * Operator of the 3 address code, identify an instruction
 */
public class CodeOp {

  public static int OP_NOP    = 0x0;
  public static int OP_IFNNIL = 0x1;
  public static int OP_GOTO   = 0x2;


  private int op;
  private Label lb;

  public CodeOp(int operator, Label label) {
    this.op  = operator;
    this.lb = label;
  }

}
