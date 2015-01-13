package org.xtext.tl.mydsl;

public class BackEnd {

  private FrontEnd fe;

  private LabelTable lt;

  public BackEnd(FrontEnd front) {
    System.out.println(front);
    this.fe = front;
    this.lt = this.fe.getLabelTable();
  }

  /**
   * Get the name of the main function of the program
   */
  public String getMainWHFunction() {
    String ret = null;
    for (String key : this.fe.getFunDescMap().keySet())
      ret = key;
    return ret;
  }

  public void run() {
    String prog = "local wh = require \"libWH\"\n\n";

    String whMain = getMainWHFunction();


    for (String fun : this.fe.getFunDescMap().keySet()) {
      FunctionDescriptor fd = this.fe.getFunDescMap().get(fun);

      prog += "function " + fun + "()\n";
      Label lb = this.fe.getLabelTable().get(fd.getLabelName());
      prog += generate(lb);
      prog += "end\n\n";
    }

    prog += whMain + "()";

    System.out.println(prog);
  }

  private String generate(Label lb) {
    String ret = "";
    for (TAC tac : lb.getCode()) {
      switch (tac.getOp().getOp()) {
        case CodeOp.OP_NOP:
          ret += "wh.nop()\n";
          break;
        case CodeOp.OP_IF:
          ret += "if (wh.isNil(" + tac.getA2() + ")) then\n";
          Label l = this.lt.get(tac.getOp().getLb1());
          ret += "\t" + generate(l);
          ret += "end\n";
          break;
        case CodeOp.OP_IFELSE:
          ret += "if (wh.isNil(" + tac.getA2() + ")) then\n";
          l = this.lt.get(tac.getOp().getLb1());
          ret += "\t" + generate(l);
          ret += "else\n";
          l = this.lt.get(tac.getOp().getLb2());
          ret += "\t" + generate(l);
          ret += "end\n";
          break;
        case CodeOp.OP_CONS:
          ret += "local " + tac.getA1() + " = " + tac.getA2() + "\n";
          break;
      }
    }
    return ret;
  }
}
