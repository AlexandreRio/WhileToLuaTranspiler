package org.xtext.tl.mydsl;

/**
 * Operator of the 3 address code, identify an instruction
 */
public class CodeOp {

  public static int OP_NOP    = 0x0;
  public static int OP_IFNNIL = 0x1;
  public static int OP_GOTO   = 0x2;


  /** Code Op identifier, see the constant above */
  private int op;
  /** Optional label parameter in the label table */
  private String lb;

  public CodeOp(int operator, String label) {
    this.op  = operator;
    this.lb = label;
  }

  public String toString() {
    return this.op + " : " + this.lb;
  }
}
