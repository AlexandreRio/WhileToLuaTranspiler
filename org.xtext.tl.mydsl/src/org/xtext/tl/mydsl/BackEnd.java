package org.xtext.tl.mydsl;

public class BackEnd {

  private FrontEnd fe;

  public BackEnd(FrontEnd front) {
    this.fe = front;
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

    LabelTable lt = this.fe.getLabelTable();

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
        case CodeOp.OP_IFNNIL:
          break;
      }
    }
    return ret;
  }
}
