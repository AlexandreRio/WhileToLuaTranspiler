package whc;

public class BackEnd {

  private FrontEnd fe;

  private LabelTable lt;

  public BackEnd(FrontEnd front) {
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

  public String getOutputFileName() {
    String mainFunction = this.getMainWHFunction();
    for (String funInWh : this.fe.getFunNameTranslation().keySet()) {
      if (this.fe.getFunNameTranslation().get(funInWh).equals(mainFunction))
        return funInWh;
    }
    return null;
  }

  public String run() {
    // Include the library
    String prog = "local wh = require \"libWH\"\n\n";

    String whMain = getMainWHFunction();

    // Write all the functions
    for (String fun : this.fe.getFunDescMap().keySet()) {
      FunctionDescriptor fd = this.fe.getFunDescMap().get(fun);
      Label lb = this.fe.getLabelTable().get(fd.getLabelName());

      // function signature
      prog += "function " + fun + "(";
      String delim = "";
      for (String param : fd.getIn()) {
        prog += delim + param;
        delim = ", ";
      }
      prog += ")\n";

      //local variable declaration and initialization
      for (String k : fd.keySet())
        prog += "local " + k + " = wh.newLeaf()\n";

      prog += generate(lb); //function body
      prog += "return ";
      delim = "";
      for (String ret : fd.getOut()) {
        prog += delim + ret;
        delim = ", ";
      }
      prog += "\nend\n\n";
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
    prog += "wh.printTree(" + whMain + "(";
    for (int i=1; i<nbParam; i++) {
      prog += "arg[" + i + "], ";
    }
    prog += " list))\n";
    prog += "else\n";
    prog += "\twh.printTree(" + whMain + "(";
    for (int i=1; i<=nbParam; i++) {
      if (i == nbParam)
        prog += "arg[" + i + "]";
      else
        prog += "arg[" + i + "], ";
    }
    prog += "))\nend\n";

    return prog;
  }

  /**
   * Generate Lua code based on TAC
   * @param lb List of TAC
   * @return Lua code
   * TODO refactor switch case
   */
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
          ret += "if (wh.isNotNil(" + tac.getA2() + ")) then\n";
          l = this.lt.get(tac.getOp().getLb1());
          ret += "\t" + generate(l);
          ret += "else\n";
          l = this.lt.get(tac.getOp().getLb2());
          ret += "\t" + generate(l);
          ret += "end\n";
          break;
        case CodeOp.OP_CONS:
          if (tac.getA3() == null)
            ret += "wh.setLeaf(" + tac.getA1() + ", " + tac.getA2() + ")\n";
          else
            ret += "wh.setLeaf(" + tac.getA1() + ", " + tac.getA2() + ", " + tac.getA3() + ")\n";
          break;
        case CodeOp.OP_MOV:
          ret += tac.getA1() + " = "+ tac.getA2() + "\n";
          break;
      }
    }
    return ret;
  }
}
