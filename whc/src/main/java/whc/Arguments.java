package whc;

import org.apache.commons.cli.Options;

public class Arguments {

  private Options opt;

  public Arguments() {
    Options options = new Options();

    options.addOption("i" , "input"  , true  , "While input file");
    options.addOption("h" , "help"   , false , "display help");
    options.addOption("o" , "output" , true  , "output file");
    options.addOption("d" , "dump"   , false , "dump internal structures");

    opt = options;
  }

  public Options getOptions() {
    return this.opt;
  }
}
