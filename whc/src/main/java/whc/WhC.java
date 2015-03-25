package whc;

import java.io.PrintStream;
import java.io.File;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class WhC {

  public static void main (String[] args) throws Exception {
    CommandLineParser parser = new BasicParser();
    Arguments arg = new Arguments();
    Options options = arg.getOptions();

    try {
      PrintStream output = System.out;
      CommandLine line = parser.parse( options, args );

      if (line.hasOption("i")) {

        FrontEnd fe = new FrontEnd(line.getOptionValue("i"));
        BackEnd be = new BackEnd(fe);

        if (line.hasOption("h")) {
          displayHelp(options);
        }
        if (line.hasOption("o")) {
          output = new PrintStream(new File(line.getOptionValue("o")));
        } else {
          String defaultOutputName = be.getOutputFileName();
          output = new PrintStream(new File(defaultOutputName + ".lua"));
        }

        String program = be.run();
        output.println(program);

      } else {
        displayHelp(options);
      }
    }
    catch( ParseException exp ) {
      // oops, something went wrong
      System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
    }

  }

  private static void displayHelp(Options opt) {
    HelpFormatter formatter = new HelpFormatter();
    formatter.printHelp( "whc", opt, true );
  }
}
