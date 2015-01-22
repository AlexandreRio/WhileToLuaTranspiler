package org.xtext.tl.mydsl;

/**
 * Operator of the 3 address code, identify an instruction
 */
public class CodeOp {

  public final static int OP_NOP    = 0x000;
  public final static int OP_IF     = 0x001;
  public final static int OP_IFELSE = 0x002;
  public final static int OP_GOTO   = 0x003;
  public final static int OP_WHILE  = 0x004;
  public final static int OP_MOV    = 0x005;
  public final static int OP_CONS   = 0x006;
  public final static int OP_LIST   = 0x007;
  public final static int OP_HD     = 0x008;
  public final static int OP_TL     = 0x009;
  public final static int OP_NIL    = 0x00a;

  /** Code Op identifier, see the constant above */
  private int op;
  /** Optional label parameter in the label table */
  private String lb1;
  /** Optional label parameter in the label table */
  private String lb2;

  public CodeOp(int operator, String lb1, String lb2) {
    this.op  = operator;
    this.lb1 = lb1;
    this.lb2 = lb2;
  }

  public CodeOp(int operator, String lb) {
    this(operator, lb, null);
  }

  public CodeOp(int operator) {
    this(operator, null, null);
  }

  public String toString() {
    if (this.lb1 == null && this.lb2 == null)
      return this.op + "";
    else if(this.lb1 != null && this.lb2 == null)
      return this.op + " : " + this.lb1;
    else
      return this.op + " : " + this.lb1 + " : " + this.lb2;
  }

  /**
   * @return the op
   */
  public int getOp() {
    return op;
  }

  /**
   * @return the lb1
   */
  public String getLb1() {
    return lb1;
  }

  /**
   * @return the lb2
   */
  public String getLb2() {
    return lb2;
  }
}
