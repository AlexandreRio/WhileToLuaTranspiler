package org.xtext.tl.mydsl;

public class WhC {

  public static void main (String[] args) throws Exception {
    FrontEnd fe = new FrontEnd(args[0]);
    System.out.println(fe);
    BackEnd be = new BackEnd(fe);
    be.run();
  }
}
