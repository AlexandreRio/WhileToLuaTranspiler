/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
	 k=2;
	
}

@lexer::header {
package org.xtext.tl.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.tl.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 
 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
	    }
		lv_model_0_0=rulefunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"model",
        		lv_model_0_0, 
        		"function");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
    }
)?)*
;





// Entry rule entryRulefunction
entryRulefunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_rulefunction=rulefunction 
	 { $current=$iv_rulefunction.current; } 
	 EOF 
;

// Rule function
rulefunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='function' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
    }
this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
    }
(
(
		lv_funName_2_0=RULE_SYMBOLES
		{
			newLeafNode(lv_funName_2_0, grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"funName",
        		lv_funName_2_0, 
        		"SYMBOLES");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_3());
    }
this_LC_4=RULE_LC
    { 
    newLeafNode(this_LC_4, grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
	    }
		lv_def_5_0=ruleDefiniton		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"def",
        		lv_def_5_0, 
        		"Definiton");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDefiniton
entryRuleDefiniton returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitonRule()); }
	 iv_ruleDefiniton=ruleDefiniton 
	 { $current=$iv_ruleDefiniton.current; } 
	 EOF 
;

// Rule Definiton
ruleDefiniton returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='read' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDefinitonAccess().getReadKeyword_0());
    }
this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
	    }
		lv_inputVars_2_0=ruleInput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitonRule());
	        }
       		set(
       			$current, 
       			"inputVars",
        		lv_inputVars_2_0, 
        		"Input");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_3=RULE_LC
    { 
    newLeafNode(this_LC_3, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
    }
	otherlv_4='%' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDefinitonAccess().getPercentSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
	    }
		lv_commandList_5_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitonRule());
	        }
       		set(
       			$current, 
       			"commandList",
        		lv_commandList_5_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_6=RULE_LC
    { 
    newLeafNode(this_LC_6, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
    }
	otherlv_7='%' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getDefinitonAccess().getPercentSignKeyword_7());
    }
	otherlv_8='write' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDefinitonAccess().getWriteKeyword_8());
    }
this_LC_9=RULE_LC
    { 
    newLeafNode(this_LC_9, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
	    }
		lv_outputVars_10_0=ruleOutput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitonRule());
	        }
       		set(
       			$current, 
       			"outputVars",
        		lv_outputVars_10_0, 
        		"Output");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleInput
entryRuleInput returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); } 
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current.getText(); }  
	 EOF 
;

// Rule Input
ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_VARIABLE_0=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_0);
    }

    { 
    newLeafNode(this_VARIABLE_0, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0()); 
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
    }
(    this_LC_2=RULE_LC    {
		$current.merge(this_LC_2);
    }

    { 
    newLeafNode(this_LC_2, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
    }
)?    this_VARIABLE_3=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_3);
    }

    { 
    newLeafNode(this_VARIABLE_3, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2()); 
    }
)*)
    ;





// Entry rule entryRuleOutput
entryRuleOutput returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getOutputRule()); } 
	 iv_ruleOutput=ruleOutput 
	 { $current=$iv_ruleOutput.current.getText(); }  
	 EOF 
;

// Rule Output
ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_VARIABLE_0=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_0);
    }

    { 
    newLeafNode(this_VARIABLE_0, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0()); 
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
    }
(    this_LC_2=RULE_LC    {
		$current.merge(this_LC_2);
    }

    { 
    newLeafNode(this_LC_2, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
    }
)?    this_VARIABLE_3=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_3);
    }

    { 
    newLeafNode(this_VARIABLE_3, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2()); 
    }
)*)
    ;





// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	 iv_ruleCommands=ruleCommands 
	 { $current=$iv_ruleCommands.current; } 
	 EOF 
;

// Rule Commands
ruleCommands returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
	    }
		lv_c_0_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandsRule());
	        }
       		add(
       			$current, 
       			"c",
        		lv_c_0_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
    }
(this_LC_2=RULE_LC
    { 
    newLeafNode(this_LC_2, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
	    }
		lv_c_3_0=ruleCommand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandsRule());
	        }
       		add(
       			$current, 
       			"c",
        		lv_c_3_0, 
        		"Command");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleVars
entryRuleVars returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarsRule()); } 
	 iv_ruleVars=ruleVars 
	 { $current=$iv_ruleVars.current.getText(); }  
	 EOF 
;

// Rule Vars
ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_VARIABLE_0=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_0);
    }

    { 
    newLeafNode(this_VARIABLE_0, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
    }
    this_Vars_2=ruleVars    {
		$current.merge(this_Vars_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?)
    ;





// Entry rule entryRuleExprs
entryRuleExprs returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprsRule()); } 
	 iv_ruleExprs=ruleExprs 
	 { $current=$iv_ruleExprs.current.getText(); }  
	 EOF 
;

// Rule Exprs
ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
    }
    this_Expr_0=ruleExpr    {
		$current.merge(this_Expr_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1()); 
    }
    this_Exprs_2=ruleExprs    {
		$current.merge(this_Exprs_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?)
    ;





// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	 iv_ruleCommand=ruleCommand 
	 { $current=$iv_ruleCommand.current; } 
	 EOF 
;

// Rule Command
ruleCommand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getCommandAccess().getCommandAction_0_0(),
            $current);
    }
)	otherlv_1='nop' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getNopKeyword_0_1());
    }
)
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
	    }
		lv_varL_2_0=ruleVars		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"varL",
        		lv_varL_2_0, 
        		"Vars");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LC_3=RULE_LC
    { 
    newLeafNode(this_LC_3, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
    }
)?	otherlv_4=':=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2());
    }
(this_LC_5=RULE_LC
    { 
    newLeafNode(this_LC_5, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
	    }
		lv_expL_6_0=ruleExprs		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"expL",
        		lv_expL_6_0, 
        		"Exprs");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
		lv_nom_7_0=	'while' 
    {
        newLeafNode(lv_nom_7_0, grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "nom", lv_nom_7_0, "while");
	    }

)
)this_LC_8=RULE_LC
    { 
    newLeafNode(this_LC_8, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
	    }
		lv_exp_9_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_9_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_10=RULE_LC
    { 
    newLeafNode(this_LC_10, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
    }
	otherlv_11='do' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getDoKeyword_2_4());
    }
this_LC_12=RULE_LC
    { 
    newLeafNode(this_LC_12, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
	    }
		lv_c1_13_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"c1",
        		lv_c1_13_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_14=RULE_LC
    { 
    newLeafNode(this_LC_14, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
    }
	otherlv_15='od' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getCommandAccess().getOdKeyword_2_8());
    }
)
    |((
(
		lv_nom_16_0=	'for' 
    {
        newLeafNode(lv_nom_16_0, grammarAccess.getCommandAccess().getNomForKeyword_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "nom", lv_nom_16_0, "for");
	    }

)
)this_LC_17=RULE_LC
    { 
    newLeafNode(this_LC_17, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
	    }
		lv_exp_18_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_18_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_19=RULE_LC
    { 
    newLeafNode(this_LC_19, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
    }
	otherlv_20='do' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getCommandAccess().getDoKeyword_3_4());
    }
this_LC_21=RULE_LC
    { 
    newLeafNode(this_LC_21, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
	    }
		lv_c1_22_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"c1",
        		lv_c1_22_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_23=RULE_LC
    { 
    newLeafNode(this_LC_23, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
    }
	otherlv_24='od' 
    {
    	newLeafNode(otherlv_24, grammarAccess.getCommandAccess().getOdKeyword_3_8());
    }
)
    |((
(
		lv_nom_25_0=	'foreach' 
    {
        newLeafNode(lv_nom_25_0, grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "nom", lv_nom_25_0, "foreach");
	    }

)
)this_LC_26=RULE_LC
    { 
    newLeafNode(this_LC_26, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
	    }
		lv_exp1_27_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exp1",
        		lv_exp1_27_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_28=RULE_LC
    { 
    newLeafNode(this_LC_28, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
    }
	otherlv_29='in' 
    {
    	newLeafNode(otherlv_29, grammarAccess.getCommandAccess().getInKeyword_4_4());
    }
this_LC_30=RULE_LC
    { 
    newLeafNode(this_LC_30, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
	    }
		lv_exp2_31_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exp2",
        		lv_exp2_31_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_32=RULE_LC
    { 
    newLeafNode(this_LC_32, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
    }
	otherlv_33='do' 
    {
    	newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getDoKeyword_4_8());
    }
this_LC_34=RULE_LC
    { 
    newLeafNode(this_LC_34, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
	    }
		lv_c1_35_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"c1",
        		lv_c1_35_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_36=RULE_LC
    { 
    newLeafNode(this_LC_36, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
    }
	otherlv_37='od' 
    {
    	newLeafNode(otherlv_37, grammarAccess.getCommandAccess().getOdKeyword_4_12());
    }
)
    |((
(
		lv_nom_38_0=	'if' 
    {
        newLeafNode(lv_nom_38_0, grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommandRule());
	        }
       		setWithLastConsumed($current, "nom", lv_nom_38_0, "if");
	    }

)
)this_LC_39=RULE_LC
    { 
    newLeafNode(this_LC_39, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
	    }
		lv_exp_40_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_40_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_41=RULE_LC
    { 
    newLeafNode(this_LC_41, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
    }
	otherlv_42='then' 
    {
    	newLeafNode(otherlv_42, grammarAccess.getCommandAccess().getThenKeyword_5_4());
    }
this_LC_43=RULE_LC
    { 
    newLeafNode(this_LC_43, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
	    }
		lv_c1_44_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"c1",
        		lv_c1_44_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_45=RULE_LC
    { 
    newLeafNode(this_LC_45, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
    }
(	otherlv_46='else' 
    {
    	newLeafNode(otherlv_46, grammarAccess.getCommandAccess().getElseKeyword_5_8_0());
    }
this_LC_47=RULE_LC
    { 
    newLeafNode(this_LC_47, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
	    }
		lv_c2_48_0=ruleCommands		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCommandRule());
	        }
       		set(
       			$current, 
       			"c2",
        		lv_c2_48_0, 
        		"Commands");
	        afterParserOrEnumRuleCall();
	    }

)
)this_LC_49=RULE_LC
    { 
    newLeafNode(this_LC_49, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
    }
)?	otherlv_50='fi' 
    {
    	newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getFiKeyword_5_9());
    }
))
;





// Entry rule entryRuleExpr
entryRuleExpr returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprRule()); } 
	 iv_ruleExpr=ruleExpr 
	 { $current=$iv_ruleExpr.current.getText(); }  
	 EOF 
;

// Rule Expr
ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
    }
    this_ExprSimple_0=ruleExprSimple    {
		$current.merge(this_ExprSimple_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
    }
    this_And_1=ruleAnd    {
		$current.merge(this_And_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExprAccess().getExprTermParserRuleCall_2()); 
    }
    this_ExprTerm_2=ruleExprTerm    {
		$current.merge(this_ExprTerm_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleAnd
entryRuleAnd returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndRule()); } 
	 iv_ruleAnd=ruleAnd 
	 { $current=$iv_ruleAnd.current.getText(); }  
	 EOF 
;

// Rule And
ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
    }
    this_Or_0=ruleOr    {
		$current.merge(this_Or_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(    this_LC_1=RULE_LC    {
		$current.merge(this_LC_1);
    }

    { 
    newLeafNode(this_LC_1, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
    }

	kw='and' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAndAccess().getAndKeyword_1_1()); 
    }
    this_LC_3=RULE_LC    {
		$current.merge(this_LC_3);
    }

    { 
    newLeafNode(this_LC_3, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
    }

    { 
        newCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_1_3()); 
    }
    this_Or_4=ruleOr    {
		$current.merge(this_Or_4);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleOr
entryRuleOr returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrRule()); } 
	 iv_ruleOr=ruleOr 
	 { $current=$iv_ruleOr.current.getText(); }  
	 EOF 
;

// Rule Or
ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOrAccess().getNotParserRuleCall_0()); 
    }
    this_Not_0=ruleNot    {
		$current.merge(this_Not_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(    this_LC_1=RULE_LC    {
		$current.merge(this_LC_1);
    }

    { 
    newLeafNode(this_LC_1, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
    }

	kw='or' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getOrAccess().getOrKeyword_1_1()); 
    }
    this_LC_3=RULE_LC    {
		$current.merge(this_LC_3);
    }

    { 
    newLeafNode(this_LC_3, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
    }

    { 
        newCompositeNode(grammarAccess.getOrAccess().getNotParserRuleCall_1_3()); 
    }
    this_Not_4=ruleNot    {
		$current.merge(this_Not_4);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*)
    ;





// Entry rule entryRuleNot
entryRuleNot returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNotRule()); } 
	 iv_ruleNot=ruleNot 
	 { $current=$iv_ruleNot.current.getText(); }  
	 EOF 
;

// Rule Not
ruleNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='not' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNotAccess().getNotKeyword_0_0()); 
    }
    this_LC_1=RULE_LC    {
		$current.merge(this_LC_1);
    }

    { 
    newLeafNode(this_LC_1, grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
    }
)*
    { 
        newCompositeNode(grammarAccess.getNotAccess().getEqParserRuleCall_1()); 
    }
    this_Eq_2=ruleEq    {
		$current.merge(this_Eq_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleEq
entryRuleEq returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEqRule()); } 
	 iv_ruleEq=ruleEq 
	 { $current=$iv_ruleEq.current.getText(); }  
	 EOF 
;

// Rule Eq
ruleEq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_0_0()); 
    }
    this_ExprSimple_0=ruleExprSimple    {
		$current.merge(this_ExprSimple_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_0_1()); 
    }
    this_ExprTerm_1=ruleExprTerm    {
		$current.merge(this_ExprTerm_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)(    this_LC_2=RULE_LC    {
		$current.merge(this_LC_2);
    }

    { 
    newLeafNode(this_LC_2, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
    }
)?
	kw='=?' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
    }
(    this_LC_4=RULE_LC    {
		$current.merge(this_LC_4);
    }

    { 
    newLeafNode(this_LC_4, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
    }
)?(
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_4_0()); 
    }
    this_ExprSimple_5=ruleExprSimple    {
		$current.merge(this_ExprSimple_5);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_4_1()); 
    }
    this_ExprTerm_6=ruleExprTerm    {
		$current.merge(this_ExprTerm_6);
    }

    { 
        afterParserOrEnumRuleCall();
    }
))
    |(
	kw='(' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_1_1_0()); 
    }
    this_ExprTerm_8=ruleExprTerm    {
		$current.merge(this_ExprTerm_8);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_1_1_1()); 
    }
    this_ExprSimple_9=ruleExprSimple    {
		$current.merge(this_ExprSimple_9);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
	kw=')' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
    }
))
    ;





// Entry rule entryRuleExprTerm
entryRuleExprTerm returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprTermRule()); } 
	 iv_ruleExprTerm=ruleExprTerm 
	 { $current=$iv_ruleExprTerm.current.getText(); }  
	 EOF 
;

// Rule ExprTerm
ruleExprTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='nil' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprTermAccess().getNilKeyword_0()); 
    }

    |    this_VARIABLE_1=RULE_VARIABLE    {
		$current.merge(this_VARIABLE_1);
    }

    { 
    newLeafNode(this_VARIABLE_1, grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
    }

    |    this_SYMBOLES_2=RULE_SYMBOLES    {
		$current.merge(this_SYMBOLES_2);
    }

    { 
    newLeafNode(this_SYMBOLES_2, grammarAccess.getExprTermAccess().getSYMBOLESTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); } 
	 iv_ruleExprSimple=ruleExprSimple 
	 { $current=$iv_ruleExprSimple.current.getText(); }  
	 EOF 
;

// Rule ExprSimple
ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='(' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
    }
(((
	kw='cons' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
    }

    |
	kw='list' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getListKeyword_1_0_0_1()); 
    }
)
    { 
        newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprParserRuleCall_1_0_1()); 
    }
    this_Lexpr_3=ruleLexpr    {
		$current.merge(this_Lexpr_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    |((
	kw='hd' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
    }

    |
	kw='tl' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getTlKeyword_1_1_0_1()); 
    }
)    this_LC_6=RULE_LC    {
		$current.merge(this_LC_6);
    }

    { 
    newLeafNode(this_LC_6, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_1_1_2()); 
    }
    this_Expr_7=ruleExpr    {
		$current.merge(this_Expr_7);
    }

    { 
        afterParserOrEnumRuleCall();
    }
))
	kw=')' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleLexpr
entryRuleLexpr returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLexprRule()); } 
	 iv_ruleLexpr=ruleLexpr 
	 { $current=$iv_ruleLexpr.current.getText(); }  
	 EOF 
;

// Rule Lexpr
ruleLexpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_LC_0=RULE_LC    {
		$current.merge(this_LC_0);
    }

    { 
    newLeafNode(this_LC_0, grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getLexprAccess().getExprParserRuleCall_1()); 
    }
    this_Expr_1=ruleExpr    {
		$current.merge(this_Expr_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)+
    ;





RULE_VARIABLE : 'A'..'Z' ('a'..'z'|'0'..'9'|'A'..'Z')*;

RULE_SYMBOLES : 'a'..'z' ('a'..'z'|'0'..'9'|'A'..'Z')*;

RULE_LC : (' '|'\n'|'\t')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


