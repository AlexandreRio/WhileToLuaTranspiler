package whc;

import org.apache.commons.cli.Options;

public class Arguments {

  private Options opt;

  public Arguments() {
    Options options = new Options();

    options.addOption("i" , "input"  , true  , "input file");
    options.addOption("h" , "help"   , false , "display help");
    options.addOption("o" , "output" , true  , "output file");

    opt = options;
  }

  public Options getOptions() {
    return this.opt;
  }
}
