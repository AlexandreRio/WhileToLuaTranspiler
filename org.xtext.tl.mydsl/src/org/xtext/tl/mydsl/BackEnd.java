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
    System.out.println(getMainWHFunction());
  }
}
