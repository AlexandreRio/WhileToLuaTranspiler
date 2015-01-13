package org.xtext.tl.mydsl;

public class BackEnd {

  private FrontEnd fe;

  private LabelTable lt;

  public BackEnd(FrontEnd front) {
    //System.out.println(front);
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
    // Include the library
    String prog = "local wh = require \"libWH\"\n\n";

    String whMain = getMainWHFunction();

    // Write all the functions
    for (String fun : this.fe.getFunDescMap().keySet()) {
      FunctionDescriptor fd = this.fe.getFunDescMap().get(fun);
      Label lb = this.fe.getLabelTable().get(fd.getLabelName());

      prog += "function " + fun + "(";
      String delim = "";
      for (String param : fd.getIn()) {
        prog += delim + param;
        delim = ", ";
      }
      prog += ")\n";
      prog += generate(lb);
      prog += "end\n\n";
    }

    // Write the main
    int nbParam = this.fe.getFunDescMap().get(whMain).getNbIn();
    prog += "local nbParam = " + nbParam + "\n";
    prog += "local nbRead = #arg\n";
    prog += "if nbRead > nbParam then\n";
    prog += "local list = {}\n";
    prog += "for i=nbParam, nbRead do\n";
    prog += "  table.insert(list, arg[i])\n";
    prog += "end\n";
    prog += whMain + "(";
    for (int i=1; i<nbParam; i++) {
      prog += "arg[" + i + "], ";
    }
    prog += " list)\n";
    prog += "else\n";
    prog += "\t" + whMain + "(";
    for (int i=1; i<=nbParam; i++) {
      if (i == nbParam)
        prog += "arg[" + i + "]";
      else
        prog += "arg[" + i + "], ";
    }
    prog += ")\nend\n";

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
