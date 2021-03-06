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
		lv_model_0_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"model",
        		lv_model_0_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
    }
)?)*
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
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
entryRuleInput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current; } 
	 EOF 
;

// Rule Input
ruleInput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_v_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_v_0_0, grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"v",
        		lv_v_0_0, 
        		"VARIABLE");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
    }
(this_LC_2=RULE_LC
    { 
    newLeafNode(this_LC_2, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
    }
)?(
(
		lv_v2_3_0=RULE_VARIABLE
		{
			newLeafNode(lv_v2_3_0, grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"v2",
        		lv_v2_3_0, 
        		"VARIABLE");
	    }

)
))*)
;





// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	 iv_ruleOutput=ruleOutput 
	 { $current=$iv_ruleOutput.current; } 
	 EOF 
;

// Rule Output
ruleOutput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_v_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_v_0_0, grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"v",
        		lv_v_0_0, 
        		"VARIABLE");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
    }
(this_LC_2=RULE_LC
    { 
    newLeafNode(this_LC_2, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
    }
)?(
(
		lv_v2_3_0=RULE_VARIABLE
		{
			newLeafNode(lv_v2_3_0, grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOutputRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"v2",
        		lv_v2_3_0, 
        		"VARIABLE");
	    }

)
))*)
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
entryRuleVars returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVarsRule()); }
	 iv_ruleVars=ruleVars 
	 { $current=$iv_ruleVars.current; } 
	 EOF 
;

// Rule Vars
ruleVars returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_v1_0_0=RULE_VARIABLE
		{
			newLeafNode(lv_v1_0_0, grammarAccess.getVarsAccess().getV1VARIABLETerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"v1",
        		lv_v1_0_0, 
        		"VARIABLE");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
    }
(this_LC_2=RULE_LC
    { 
    newLeafNode(this_LC_2, grammarAccess.getVarsAccess().getLCTerminalRuleCall_1_1()); 
    }
)?(
(
		lv_v2_3_0=RULE_VARIABLE
		{
			newLeafNode(lv_v2_3_0, grammarAccess.getVarsAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVarsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"v2",
        		lv_v2_3_0, 
        		"VARIABLE");
	    }

)
))*)
;





// Entry rule entryRuleExprs
entryRuleExprs returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprsRule()); }
	 iv_ruleExprs=ruleExprs 
	 { $current=$iv_ruleExprs.current; } 
	 EOF 
;

// Rule Exprs
ruleExprs returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExprsAccess().getExpExprParserRuleCall_0_0()); 
	    }
		lv_exp_0_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprsRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_0_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
    }
(this_LC_2=RULE_LC
    { 
    newLeafNode(this_LC_2, grammarAccess.getExprsAccess().getLCTerminalRuleCall_1_1()); 
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getExprsAccess().getExpLExprParserRuleCall_1_2_0()); 
	    }
		lv_expL_3_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprsRule());
	        }
       		add(
       			$current, 
       			"expL",
        		lv_expL_3_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
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
entryRuleExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	 iv_ruleExpr=ruleExpr 
	 { $current=$iv_ruleExpr.current; } 
	 EOF 
;

// Rule Expr
ruleExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
	    }
		lv_exprSimple_0_0=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"exprSimple",
        		lv_exprSimple_0_0, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
	    }
		lv_expEt_1_0=ruleAnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"expEt",
        		lv_expEt_1_0, 
        		"And");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
	    }
		lv_expTerminale_2_0=ruleExprTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprRule());
	        }
       		set(
       			$current, 
       			"expTerminale",
        		lv_expTerminale_2_0, 
        		"ExprTerm");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	 iv_ruleAnd=ruleAnd 
	 { $current=$iv_ruleAnd.current; } 
	 EOF 
;

// Rule And
ruleAnd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
	    }
		lv_expOu_0_0=ruleOr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndRule());
	        }
       		set(
       			$current, 
       			"expOu",
        		lv_expOu_0_0, 
        		"Or");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
    }
	otherlv_2='and' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
    }
this_LC_3=RULE_LC
    { 
    newLeafNode(this_LC_3, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
	    }
		lv_expOu2_4_0=ruleOr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndRule());
	        }
       		add(
       			$current, 
       			"expOu2",
        		lv_expOu2_4_0, 
        		"Or");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	 iv_ruleOr=ruleOr 
	 { $current=$iv_ruleOr.current; } 
	 EOF 
;

// Rule Or
ruleOr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
	    }
		lv_expNon_0_0=ruleNot		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		set(
       			$current, 
       			"expNon",
        		lv_expNon_0_0, 
        		"Not");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
    }
	otherlv_2='or' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
    }
this_LC_3=RULE_LC
    { 
    newLeafNode(this_LC_3, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
	    }
		lv_expNon2_4_0=ruleNot		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		add(
       			$current, 
       			"expNon2",
        		lv_expNon2_4_0, 
        		"Not");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleNot
entryRuleNot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNotRule()); }
	 iv_ruleNot=ruleNot 
	 { $current=$iv_ruleNot.current; } 
	 EOF 
;

// Rule Not
ruleNot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
		lv_non_0_0=	'not' 
    {
        newLeafNode(lv_non_0_0, grammarAccess.getNotAccess().getNonNotKeyword_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNotRule());
	        }
       		addWithLastConsumed($current, "non", lv_non_0_0, "not");
	    }

)
)this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
	    }
		lv_expEq_2_0=ruleEq		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNotRule());
	        }
       		set(
       			$current, 
       			"expEq",
        		lv_expEq_2_0, 
        		"Eq");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEq
entryRuleEq returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEqRule()); }
	 iv_ruleEq=ruleEq 
	 { $current=$iv_ruleEq.current; } 
	 EOF 
;

// Rule Eq
ruleEq returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
(
(
		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
	    }
		lv_exprEq1_0_1=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exprEq1",
        		lv_exprEq1_0_1, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
	    }
		lv_exprEq1_0_2=ruleExprTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exprEq1",
        		lv_exprEq1_0_2, 
        		"ExprTerm");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(this_LC_1=RULE_LC
    { 
    newLeafNode(this_LC_1, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
    }
)?	otherlv_2='=?' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2());
    }
(this_LC_3=RULE_LC
    { 
    newLeafNode(this_LC_3, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
    }
)?(
(
(
		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
	    }
		lv_exprEq2_4_1=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exprEq2",
        		lv_exprEq2_4_1, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
	    }
		lv_exprEq2_4_2=ruleExprTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exprEq2",
        		lv_exprEq2_4_2, 
        		"ExprTerm");
	        afterParserOrEnumRuleCall();
	    }

)

)
))
    |(	otherlv_5='(' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
	    }
		lv_exp_6_1=ruleExprTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_6_1, 
        		"ExprTerm");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
	    }
		lv_exp_6_2=ruleExprSimple		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_6_2, 
        		"ExprSimple");
	        afterParserOrEnumRuleCall();
	    }

)

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2());
    }
))
;





// Entry rule entryRuleExprTerm
entryRuleExprTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprTermRule()); }
	 iv_ruleExprTerm=ruleExprTerm 
	 { $current=$iv_ruleExprTerm.current; } 
	 EOF 
;

// Rule ExprTerm
ruleExprTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getExprTermAccess().getExprTermAction_0_0(),
            $current);
    }
)	otherlv_1='nil' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExprTermAccess().getNilKeyword_0_1());
    }
)
    |(
(
		lv_termVar_2_0=RULE_VARIABLE
		{
			newLeafNode(lv_termVar_2_0, grammarAccess.getExprTermAccess().getTermVarVARIABLETerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"termVar",
        		lv_termVar_2_0, 
        		"VARIABLE");
	    }

)
)
    |(
(
		lv_termSym_3_0=RULE_SYMBOLES
		{
			newLeafNode(lv_termSym_3_0, grammarAccess.getExprTermAccess().getTermSymSYMBOLESTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"termSym",
        		lv_termSym_3_0, 
        		"SYMBOLES");
	    }

)
))
;





// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	 iv_ruleExprSimple=ruleExprSimple 
	 { $current=$iv_ruleExprSimple.current; } 
	 EOF 
;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0());
    }
(((
(
(
		lv_mot_1_1=	'cons' 
    {
        newLeafNode(lv_mot_1_1, grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "mot", lv_mot_1_1, null);
	    }

    |		lv_mot_1_2=	'list' 
    {
        newLeafNode(lv_mot_1_2, grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "mot", lv_mot_1_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
	    }
		lv_lexpr_2_0=ruleLexpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"lexpr",
        		lv_lexpr_2_0, 
        		"Lexpr");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
(
		lv_mot_3_1=	'hd' 
    {
        newLeafNode(lv_mot_3_1, grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "mot", lv_mot_3_1, null);
	    }

    |		lv_mot_3_2=	'tl' 
    {
        newLeafNode(lv_mot_3_2, grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExprSimpleRule());
	        }
       		setWithLastConsumed($current, "mot", lv_mot_3_2, null);
	    }

)

)
)this_LC_4=RULE_LC
    { 
    newLeafNode(this_LC_4, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
	    }
		lv_expr_5_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprSimpleRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_5_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
)))	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2());
    }
)
;





// Entry rule entryRuleLexpr
entryRuleLexpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLexprRule()); }
	 iv_ruleLexpr=ruleLexpr 
	 { $current=$iv_ruleLexpr.current; } 
	 EOF 
;

// Rule Lexpr
ruleLexpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_LC_0=RULE_LC
    { 
    newLeafNode(this_LC_0, grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
	    }
		lv_exp_1_0=ruleExpr		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLexprRule());
	        }
       		add(
       			$current, 
       			"exp",
        		lv_exp_1_0, 
        		"Expr");
	        afterParserOrEnumRuleCall();
	    }

)
))+
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


