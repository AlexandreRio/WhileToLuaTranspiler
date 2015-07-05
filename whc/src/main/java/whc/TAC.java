package whc;

/**
 * Three Address Code representation
 */
public class TAC {

  /** Code of the operator */
  private CodeOp op;
  /** Place where the code will write the result */
  private String a1;
  /** Place to look for the first parameter */
  private String a2;
  /** Place to look for the second parameter */
  private String a3;

  public TAC(CodeOp operator, String a1, String a2, String a3) {
    this.op = operator;
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
  }

  public String toString() {
    return "<" + this.op + " " +
      (a1 == null ? "_" : a1) + " " +
      (a2 == null ? "_" : a2) + " " +
      (a3 == null ? "_" : a3) + ">";
  }

  /**
   * @return the op
   */
  public CodeOp getOp() {
    return op;
  }

  /**
   * @return the a1
   */
  public String getA1() {
    return a1;
  }

  /**
   * @return the a2
   */
  public String getA2() {
    return a2;
  }

  /**
   * @return the a3
   */
  public String getA3() {
    return a3;
  }
}

