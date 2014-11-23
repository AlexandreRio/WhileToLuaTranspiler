package org.xtext.tl.mydsl;

import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

import org.eclipse.emf.ecore.EObject;
import org.xtext.tl.mydsl.myDsl.ExprSimple;
import org.xtext.tl.mydsl.myDsl.impl.AndImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandImpl;
import org.xtext.tl.mydsl.myDsl.impl.CommandsImpl;
import org.xtext.tl.mydsl.myDsl.impl.DefinitonImpl;
import org.xtext.tl.mydsl.myDsl.impl.EqImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprSimpleImpl;
import org.xtext.tl.mydsl.myDsl.impl.ExprTermImpl;
import org.xtext.tl.mydsl.myDsl.impl.LexprImpl;
import org.xtext.tl.mydsl.myDsl.impl.ModelImpl;
import org.xtext.tl.mydsl.myDsl.impl.NotImpl;
import org.xtext.tl.mydsl.myDsl.impl.OrImpl;
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
			int functionNumber = ((ModelImpl)obj).eContents().size();
			if (functionNumber > 1)
				for (int i=0; i<functionNumber-2; i++)
					ret += prettyPrint(((ModelImpl)obj).getModel().get(i)) + "\n\n";

			ret += prettyPrint(((ModelImpl)obj).getModel().get(functionNumber-1));

			return ret;
		}
		else if (obj instanceof functionImpl) {
			return "function " + ((functionImpl)obj).getFunName() + " :\n" +
					prettyPrint(((functionImpl)obj).getDef());
		}
		else if (obj instanceof ExprImpl) {
			if (((ExprImpl)obj).getExpEt()!=null)
			{
				return prettyPrint((((ExprImpl)obj).getExpEt()));
			}
			else if (((ExprImpl)obj).getExprSimple()!=null)
			{
				return prettyPrint((((ExprImpl)obj).getExprSimple()));
			}
			else if (((ExprImpl)obj).getExpTerminale()!=null)
			{
				return prettyPrint((((ExprImpl)obj).getExpTerminale()));
			}
		}
		else if (obj instanceof AndImpl) {
			String ret = "";
			ret = prettyPrint(((AndImpl)obj).getExpOu());
			if (((AndImpl)obj).getExpOu2()!=null)
			{
				ret = ret+ " and "+ prettyPrint(((AndImpl)obj).getExpOu2());
			}
			return ret;
		}
		else if (obj instanceof OrImpl) {
			String ret = "";
			ret = prettyPrint(((OrImpl)obj).getExpNon());
			if (((OrImpl)obj).getExpNon2()!=null)
			{
				ret = ret+ " and "+ prettyPrint(((OrImpl)obj).getExpNon2());
			}
			return ret;
		}
		else if  (obj instanceof NotImpl){	
			String ret = "";
			if (((NotImpl)obj).getNon()!=null)
			{
				ret = ret+((NotImpl)obj).getNon();
			}
			return ret + prettyPrint(((NotImpl)obj).getExpEq()) ;
		}
		else if ( (obj instanceof EqImpl))
		{
			String ret = "";
			if (((EqImpl)obj).getExprSimple1()!=null)
			{
				ret = ret + ((EqImpl)obj).getExprSimple1();
			}
			else 
			{
				ret = ret + ((EqImpl)obj).getExpTerminale1();
			}
			
			if ((((EqImpl)obj).getExprSimple1()  !=null)
			  ||(((EqImpl)obj).getExpTerminale1()!=null))
			{
				ret = ret+" =? ";
				if (((EqImpl)obj).getExprSimple2()!=null)
				{
					ret = ret + ((EqImpl)obj).getExprSimple2();
				}
				else 
				{
					ret = ret + ((EqImpl)obj).getExpTerminale2();
				}
			}
			return ret;
		}
		else if ( (obj instanceof ExprTermImpl))
		{
			if (((ExprTermImpl)obj).getSymboles()!=null)
			{
				return ((ExprTermImpl)obj).getSymboles();
			}
			else if (((ExprTermImpl)obj).getVariables()!=null)
			{
				return ((ExprTermImpl)obj).getVariables();
			}
			else 
			{
				return "nil";
			}
		}
		else if (obj instanceof ExprSimpleImpl){
			String ret = "(" + ((ExprSimple)obj).getMot();
			if ((((ExprSimple)obj).getMot().equals("cons"))||(((ExprSimple)obj).getMot().equals("list")))
			{
				ret = ret+ prettyPrint(((ExprSimple)obj).getLexpr());
			}
			else
			{
				ret = ret+" " + prettyPrint(((ExprSimple)obj).getExpr());
			}
			return (ret + ")");
		}
		else if (obj instanceof LexprImpl){
			if (((LexprImpl)obj).getExp()!=null)
			{
				return ( " " + prettyPrint(((LexprImpl)obj).getExp()));
			}
		}
		else if (obj instanceof DefinitonImpl) {
			return "read " + ((DefinitonImpl)obj).getInputVars() + "\n" +
					"%" + prettyPrint(((DefinitonImpl)obj).getCommandList()) +
					"%write " + ((DefinitonImpl)obj).getOutputVars();
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