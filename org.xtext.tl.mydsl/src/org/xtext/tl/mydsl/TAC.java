package org.xtext.tl.mydsl;

/**
 * Three Address Code representation
 */
public class TAC {

  /** Code of the operator */
  private CodeOp op;
  /** Place where the code will write the result */
  private Address a1;
  /** Place to look for the first parameter */
  private Address a2;
  /** Place to look for the second parameter */
  private Address a3;

  public TAC(CodeOp operator, Address a1, Address a2, Address a3) {
    this.op = operator;
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
  }
}

