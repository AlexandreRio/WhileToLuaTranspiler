package org.xtext.tl.mydsl;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.Token;
import org.xtext.tl.mydsl.parser.antlr.internal.InternalMyDslLexer;
import org.xtext.tl.mydsl.parser.antlr.internal.InternalMyDslParser;

public class PrettyPrinter {

	/** Tabulation string to use. */
	private static String INDENT = " ";

	public static void main(String... args) throws IOException {
		PrintStream output = System.out;
		String filename;
		boolean error = false;

		if (args.length >= 1) {
			filename = args[0];
			if (args.length >= 3) {
				if (args[1].equals("-all")) {
					setIndent(Integer.parseInt(args[2]));
				} else if (args[1].equals("-o")) {
					output = new PrintStream(new File(args[2]));
				} else {
					error = true;
				}
				
				if (args.length == 5) {
					 if (args[3].equals("-o")) {
							output = new PrintStream(new File(args[4]));
					 } else {
						 error = true;
					 }
				}

			
			}
		} else {
			error = true;
		}

		if (!error)
			output.println(prettify(args[0]));
		else
			displayHelp();
	}

	private static void displayHelp() {
		System.out.println("whilepp sample.wh");
		System.out.println("whilepp sample.wh -all 2");
		System.out.println("whilepp sample.wh -all 2 -o output.wh");
	}

	private static StringBuilder prettify(String path) throws IOException {

		ANTLRFileStream filestream = new ANTLRFileStream(path);
		InternalMyDslLexer lexer = new InternalMyDslLexer(filestream);
		// CommonTokenStream stream = new CommonTokenStream(lexer);
		// InternalMyDslParser parser = new InternalMyDslParser(stream);
		// ParseTree tree;

		Token t;
		Token tmp;
		ArrayList<Token> tokens = new ArrayList<Token>();
		StringBuilder res = new StringBuilder();

		while ((t = lexer.nextToken()).getType() != -1)
			if (t.getType() != InternalMyDslParser.RULE_LC)
				tokens.add(t);

		int current_indent = 0;
		for (int i = 0; i < tokens.size(); i++) {
			t = tokens.get(i);
			// System.out.println(t.getText() + " : "
			// + t.getType());
			switch (t.getType()) {
			case 6: // output
				if (i < tokens.size() - 1) {
					tmp = tokens.get(i + 1);
					if (tmp.getType() == 14) {
						res.append(t.getText()
								+ "\n\n");
					} else {
						res.append(t.getText());
					}
				} else {
					res.append(t.getText());
				}
				break;
			case 14: // function
				res.append(t.getText() + " ");
				break;
			case 15: // :
				res.append(t.getText() + "\n" + printTab(current_indent));
				break;
			case 16: // read
				res.append(t.getText() + " ");
				break;
			case 17: // %
				res.append("\n" + t.getText());
				break;
			case 18: // write
				res.append(t.getText() + " ");
				break;
			case 19: // ,
				res.append(t.getText() + " ");
				break;
			case 20: // ;
				res.append(t.getText() + "\n" + printTab(current_indent));
				break;
			case 22: // :=
				res.append(" " + t.getText() + " ");
				break;
			case 23: // while
			case 27: // foreach
			case 26: // for
				res.append(t.getText() + " ");
				break;
			case 29: // if
				res.append(t.getText() + " ");
				break;
			case 24: // do
			case 30: // then
				current_indent++;
				res.append(" " + t.getText() + "\n" + printTab(current_indent));
				break;
			case 31: // else
				res.append("\n" + printTab(current_indent -1) + t.getText() + "\n" + printTab(current_indent));
				break;
			case 25: // od
			case 32: // fi
				current_indent--;
				res.append("\n" + t.getText());
				break;
			case 33: // and
			case 34: // or
				res.append(" " + t.getText() + " ");
				break;
			case 35: // not
				res.append(t.getText() + " ");
				break;
			case 36: // =?
				res.append(" " + t.getText() + " ");
				break;
			case 37: // (
				res.append(t.getText());
				break;
			case 38: // )
				res.append(t.getText());
				break;
			case 40: // cons
			case 41: // list
			case 42: // hd
			case 43: // tl
				res.append(t.getText() + " ");
				break;
			default:
				res.append(t.getText());
				break;
			}
		}
		return res;
	}

	private static void setIndent(int number) {
		if (number < 0)
			return;
		INDENT = "";
		for (int i = 0; i < number; i++)
			 INDENT += " ";
	}

	/**
	 * Construct a string of _number_ time the indentation pattern
	 * {@link #INDENT}
	 * 
	 * @param Level
	 *            of indentation
	 * @return Enough whitespace to indent
	 */
	private static String printTab(int number) {
		if (number < 0)
			return null;
		String ret = "";
		for (int i = 0; i < number; i++)
			ret += INDENT;
		return ret;
	}
}
