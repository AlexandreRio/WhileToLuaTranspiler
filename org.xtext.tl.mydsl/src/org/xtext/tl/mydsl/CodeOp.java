package org.xtext.tl.mydsl;

/**
 * Operator of the 3 address code, identify an instruction
 */
public class CodeOp {

  public static int OP_NOP    = 0x000;
  public static int OP_IFNNIL = 0x001;
  public static int OP_GOTO   = 0x002;
  public static int OP_WHILE  = 0x003;
  public static int OP_MOV    = 0x004;
  public static int OP_CONS   = 0x005;
  public static int OP_LIST   = 0x006;
  public static int OP_HD     = 0x007;
  public static int OP_TL     = 0x008;


  /** Code Op identifier, see the constant above */
  private int op;
  /** Optional label parameter in the label table */
  private String lb;

  public CodeOp(int operator, String label) {
    this.op  = operator;
    this.lb = label;
  }

  public String toString() {
    if (this.lb == null)
      return this.op + "";
    else
      return this.op + " : " + this.lb;
  }
}
