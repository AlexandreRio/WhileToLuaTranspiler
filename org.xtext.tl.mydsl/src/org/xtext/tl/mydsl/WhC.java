package org.xtext.tl.mydsl;

import java.io.PrintStream;
import java.io.File;

public class WhC {

  public static void main (String[] args) throws Exception {
    PrintStream output = System.out;
    if (args.length >= 1) {
      FrontEnd fe = new FrontEnd(args[0]);
      BackEnd be = new BackEnd(fe);
      if (args.length == 3 && args[1].equals("-o")) {
        output = new PrintStream(new File(args[2]));
      } else {
        String defaultOutputName = be.getOutputFileName();
        output = new PrintStream(new File(defaultOutputName + ".lua"));
      }
      String program = be.run();
      output.println(program);
    }
  }
}
