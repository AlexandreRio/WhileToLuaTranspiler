package whc;

public class BinTree {

  /** Left son */
  private BinTree lSon;
  /** Right son */
  private BinTree rSon;
  private String name;

  /**
   * Name of the symbol, null will code for nil
   */
  public BinTree(String name) {
    this.name = name;
    this.lSon = null;
    this.rSon = null;
  }

  /**
   * @return the lSon
   */
  public BinTree getlSon() {
    return lSon;
  }

  /**
   * @param lSon the lSon to set
   */
  public void setlSon(BinTree lSon) {
    if (this.name == null)
      return;
    this.lSon = lSon;
  }

  /**
   * @return the rSon
   */
  public BinTree getrSon() {
    return rSon;
  }

  /**
   * @param rSon the rSon to set
   */
  public void setrSon(BinTree rSon) {
    if (this.name == null)
      return;
    this.rSon = rSon;
  }

}
