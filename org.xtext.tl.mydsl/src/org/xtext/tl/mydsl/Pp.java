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
import org.xtext.tl.mydsl.myDsl.impl.FunctionImpl;


public class Pp {

  /** Tabulation string to use. */
  private static String INDENT = " ";

  public static void main(String... args) throws Exception {
    PrintStream output = System.out;
    boolean error = false;

    if (args.length >= 1) {
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
    else if (obj instanceof FunctionImpl) {
      return "function " + ((FunctionImpl)obj).getFunName() + " :\n" +
        prettyPrint(((FunctionImpl)obj).getDef());
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
        for (EObject ou : ((AndImpl)obj).getExpOu2())
          ret += " and " + prettyPrint(ou);
      }
      return ret;
    }
    else if (obj instanceof OrImpl) {
      String ret = "";
      ret = prettyPrint(((OrImpl)obj).getExpNon());
      if (((OrImpl)obj).getExpNon2()!=null)
      {
        for (EObject non : ((OrImpl)obj).getExpNon2())
          ret += " or "+ prettyPrint(non);
      }
      return ret;
    }
    else if  (obj instanceof NotImpl){
      String ret = "";
      if (((NotImpl)obj).getNon()!=null)
      {
        for (String no : ((NotImpl)obj).getNon())
          ret +=  no + " ";
      }
      return ret + prettyPrint(((NotImpl)obj).getExpEq()) ;
    }
    else if ( (obj instanceof EqImpl))
    {
      if (((EqImpl)obj).getExp() != null)
      {
        return "(" + prettyPrint(((EqImpl)obj).getExp()) + ")";
      } else
      {
        return prettyPrint(((EqImpl)obj).getExprEq1()) + "=?" + prettyPrint(((EqImpl)obj).getExprEq2());
      }
    }
    else if ( (obj instanceof ExprTermImpl))
    {
      ExprTermImpl ob = (ExprTermImpl) obj;
      if (ob.getTermVar() != null) {
        return ob.getTermVar();
      } else if (ob.getTermSym() != null) {
        return ob.getTermSym();
      } else {
        return "nil";
      }
    }
    else if (obj instanceof ExprSimpleImpl){
      String ret = "(" + ((ExprSimple)obj).getMot();
      if (((ExprSimple)obj).getLexpr() != null)
      {
        ret += prettyPrint(((ExprSimple)obj).getLexpr());
      }
      else
      {
        ret += " " + prettyPrint(((ExprSimple)obj).getExpr());
      }
      return (ret + ")");
    }
    else if (obj instanceof LexprImpl){
      if (((LexprImpl)obj).getExp()!=null)
      {
        String ret = "";
        for (EObject exp : ((LexprImpl)obj).getExp())
          ret += " " + prettyPrint(exp);
        return ret;
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
        return ((CommandImpl)obj).getVarL() + ":=" + prettyPrint(((CommandImpl)obj).getExpL());
      }
      else if (((CommandImpl)obj).getNom() == null) {
        return "nop";
      }
      else if (((CommandImpl)obj).getNom().equals("while"))
      {
        return ((CommandImpl)obj).getNom() + ' ' + prettyPrint(((CommandImpl)obj).getExp()) +
          " do\n" + INDENT + prettyPrint( ((CommandImpl)obj).getC1()) + "od" ;
      }
      else if (((CommandImpl)obj).getNom().equals("for"))
      {
        return ((CommandImpl)obj).getNom() + ' ' + prettyPrint(((CommandImpl)obj).getExp())+
          " do\n" + INDENT+ prettyPrint( ((CommandImpl)obj).getC1()) + "od" ;
      }
      else if (((CommandImpl)obj).getNom().equals("foreach"))
      {
        return ((CommandImpl)obj).getNom() + ' ' + prettyPrint(((CommandImpl)obj).getExp1()) +
          " in " + prettyPrint(((CommandImpl)obj).getExp2()) + " do\n" +
          INDENT + prettyPrint(((CommandImpl)obj).getC1()) + "od";
      }
      else if (((CommandImpl)obj).getNom().equals("if"))
      {
        if  (((CommandImpl)obj).getC2() != null)
          return "if " + prettyPrint(((CommandImpl)obj).getExp())  + " then\n" +
            INDENT + prettyPrint(((CommandImpl)obj).getC1()) + "\nelse\n" +
            INDENT + prettyPrint(((CommandImpl)obj).getC2()) + "fi";
        else
          return "if " + prettyPrint(((CommandImpl)obj).getExp())  + " then\n" +
            INDENT + prettyPrint(((CommandImpl)obj).getC1()) + "fi";
      }
    }

    return "";
  }
}
