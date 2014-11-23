package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandsImpl;
import org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.functionImpl;


public class Pp {

	/** Tabulation string to use. */
	private static String INDENT = " ";

	public static void main(String... args) throws Exception {
		PrintStream output = System.out;
		String filename = null;
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
					 if (args[3].equals("-o") || args[3].equals("--output")) {
							output = new PrintStream(new File(args[4]));
					 } else {
						 error = true;
					 }
				}
			}
		} else {
			error = true;
		}

		if (!error) {
			PTree p = new PTree();
			FileReader reader = new FileReader(new File(args[0]));
			EObject root = p.parse(reader);

			output.println(prettyPrint(root));
		}
		else
			displayHelp();
	}

	private static void setIndent(int number) {
		if (number < 0)
			return;
		INDENT = "";
		for (int i = 0; i < number; i++)
			 INDENT += " ";
	}

	private static void displayHelp() {
		System.out.println("whilepp sample.wh");
		System.out.println("whilepp sample.wh -all 2");
		System.out.println("whilepp sample.wh -all 2 -o output.wh");
	}

	private static String prettyPrint(EObject obj) {
		if (obj instanceof ModelImpl) {
			String ret = "";
			for (EObject fun : ((ModelImpl)obj).eContents()) {
				ret += prettyPrint(fun);
			}
			return ret;
		}
		else if (obj instanceof functionImpl) {
			return "function " + ((functionImpl)obj).getFunName() + " :\n" +
					prettyPrint(((functionImpl)obj).getDef());
		}
		else if (obj instanceof DefinitonImpl) {
			return "read " + ((DefinitonImpl)obj).getInputVars() + "\n" +
					"%" + prettyPrint(((DefinitonImpl)obj).getCommandList()) +
					"%write " + ((DefinitonImpl)obj).getOutputVars() + "\n\n";
		}
		else if (obj instanceof CommandsImpl) {
			String ret = "";
			int commandNumber = ((CommandsImpl)obj).getC().size();
			if (commandNumber > 1)
				for (int i=0; i<commandNumber-2; i++)
					ret += prettyPrint(((CommandsImpl)obj).getC().get(i)) + ";\n";

			ret += prettyPrint(((CommandsImpl)obj).getC().get(commandNumber-1)) + "\n";
			return ret;
		}
		else if (obj instanceof CommandImpl) {
			if (((CommandImpl)obj).getVarL() != null && ((CommandImpl)obj).getExpL() != null)
			{
				return ((CommandImpl)obj).getVarL() + ":=" + ((CommandImpl)obj).getExpL();
			}
			else if (((CommandImpl)obj).getNom() == null) {
				return "nop";
			}
			else if (((CommandImpl)obj).getNom().equals("while"))
			{
				return ((CommandImpl)obj).getNom() + ' ' + ((CommandImpl)obj).getExp() + // pretty print à get exp? => oui, mais pour le moment il vaut mieux finir Command
						" do\n" + prettyPrint( ((CommandImpl)obj).getC1()) + "od" ;
			}
			else if (((CommandImpl)obj).getNom().equals("for"))
			{
				return ((CommandImpl)obj).getNom() + ' ' + ((CommandImpl)obj).getExp()+ // pretty print à get exp?
						" do\n" + prettyPrint( ((CommandImpl)obj).getC1()) + "od" ;
			}
			else if (((CommandImpl)obj).getNom().equals("foreach"))
			{
				return ((CommandImpl)obj).getNom() + ' ' + ((CommandImpl)obj).getExp1() +
						" in " + ((CommandImpl)obj).getExp2() + " do\n" +
						prettyPrint( ((CommandImpl)obj).getC1()) + "od";
			}
			else if (((CommandImpl)obj).getNom().equals("if"))
			{
				if  (((CommandImpl)obj).getC2() != null)
					return "if " + ((CommandImpl)obj).getExp()  + " then\n" +
						prettyPrint(((CommandImpl)obj).getC1()) + "\nelse\n" +
						prettyPrint(((CommandImpl)obj).getC2()) + "fi";
				else
					return "if " + ((CommandImpl)obj).getExp()  + " then\n" +
					prettyPrint(((CommandImpl)obj).getC1()) + "fi";
			}
		}
		
		return "";
	}
}