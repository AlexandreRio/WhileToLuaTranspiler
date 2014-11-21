package org.xtext.tl.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Command_NopKeyword_0_or___VarsParserRuleCall_1_0_LCTerminalRuleCall_1_1_q_ColonEqualsSignKeyword_1_2_LCTerminalRuleCall_1_3_q_ExprsParserRuleCall_1_4__;
	protected AbstractElementAlias match_Command___ForeachKeyword_4_0_LCTerminalRuleCall_4_1_ExprParserRuleCall_4_2_LCTerminalRuleCall_4_3_InKeyword_4_4_LCTerminalRuleCall_4_5_ExprParserRuleCall_4_6_LCTerminalRuleCall_4_7_DoKeyword_4_8_LCTerminalRuleCall_4_9___or_____ForKeyword_3_0_LCTerminalRuleCall_3_1_ExprParserRuleCall_3_2_LCTerminalRuleCall_3_3_DoKeyword_3_4_LCTerminalRuleCall_3_5___or___WhileKeyword_2_0_LCTerminalRuleCall_2_1_ExprParserRuleCall_2_2_LCTerminalRuleCall_2_3_DoKeyword_2_4_LCTerminalRuleCall_2_5____;
	protected AbstractElementAlias match_Commands_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Model_LCTerminalRuleCall_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Command_NopKeyword_0_or___VarsParserRuleCall_1_0_LCTerminalRuleCall_1_1_q_ColonEqualsSignKeyword_1_2_LCTerminalRuleCall_1_3_q_ExprsParserRuleCall_1_4__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0()), new TokenAlias(false, true, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()), new TokenAlias(false, true, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getExprsParserRuleCall_1_4())), new TokenAlias(false, false, grammarAccess.getCommandAccess().getNopKeyword_0()));
		match_Command___ForeachKeyword_4_0_LCTerminalRuleCall_4_1_ExprParserRuleCall_4_2_LCTerminalRuleCall_4_3_InKeyword_4_4_LCTerminalRuleCall_4_5_ExprParserRuleCall_4_6_LCTerminalRuleCall_4_7_DoKeyword_4_8_LCTerminalRuleCall_4_9___or_____ForKeyword_3_0_LCTerminalRuleCall_3_1_ExprParserRuleCall_3_2_LCTerminalRuleCall_3_3_DoKeyword_3_4_LCTerminalRuleCall_3_5___or___WhileKeyword_2_0_LCTerminalRuleCall_2_1_ExprParserRuleCall_2_2_LCTerminalRuleCall_2_3_DoKeyword_2_4_LCTerminalRuleCall_2_5____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommandAccess().getForKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getExprParserRuleCall_3_2()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getDoKeyword_3_4()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommandAccess().getWhileKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getExprParserRuleCall_2_2()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getDoKeyword_2_4()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommandAccess().getForeachKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getExprParserRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getInKeyword_4_4()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getExprParserRuleCall_4_6()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getDoKeyword_4_8()), new TokenAlias(false, false, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9())));
		match_Commands_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1());
		match_Model_LCTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getModelAccess().getLCTerminalRuleCall_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getExprRule())
			return getExprToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getExprsRule())
			return getExprsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLCRule())
			return getLCToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVarsRule())
			return getVarsToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Expr:
	 * 	ExprSimple |
	 * 	And |
	 * 	ExprTerm
	 * ;
	 */
	protected String getExprToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(cons )";
	}
	
	/**
	 * Exprs: Expr (',' Exprs)? ;
	 */
	protected String getExprsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(cons )";
	}
	
	/**
	 * terminal LC:
	 * 	(' '|'\n'|'\t')+
	 * ;
	 */
	protected String getLCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	/**
	 * Vars: VARIABLE (',' Vars)? ;
	 */
	protected String getVarsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Command_NopKeyword_0_or___VarsParserRuleCall_1_0_LCTerminalRuleCall_1_1_q_ColonEqualsSignKeyword_1_2_LCTerminalRuleCall_1_3_q_ExprsParserRuleCall_1_4__.equals(syntax))
				emit_Command_NopKeyword_0_or___VarsParserRuleCall_1_0_LCTerminalRuleCall_1_1_q_ColonEqualsSignKeyword_1_2_LCTerminalRuleCall_1_3_q_ExprsParserRuleCall_1_4__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Command___ForeachKeyword_4_0_LCTerminalRuleCall_4_1_ExprParserRuleCall_4_2_LCTerminalRuleCall_4_3_InKeyword_4_4_LCTerminalRuleCall_4_5_ExprParserRuleCall_4_6_LCTerminalRuleCall_4_7_DoKeyword_4_8_LCTerminalRuleCall_4_9___or_____ForKeyword_3_0_LCTerminalRuleCall_3_1_ExprParserRuleCall_3_2_LCTerminalRuleCall_3_3_DoKeyword_3_4_LCTerminalRuleCall_3_5___or___WhileKeyword_2_0_LCTerminalRuleCall_2_1_ExprParserRuleCall_2_2_LCTerminalRuleCall_2_3_DoKeyword_2_4_LCTerminalRuleCall_2_5____.equals(syntax))
				emit_Command___ForeachKeyword_4_0_LCTerminalRuleCall_4_1_ExprParserRuleCall_4_2_LCTerminalRuleCall_4_3_InKeyword_4_4_LCTerminalRuleCall_4_5_ExprParserRuleCall_4_6_LCTerminalRuleCall_4_7_DoKeyword_4_8_LCTerminalRuleCall_4_9___or_____ForKeyword_3_0_LCTerminalRuleCall_3_1_ExprParserRuleCall_3_2_LCTerminalRuleCall_3_3_DoKeyword_3_4_LCTerminalRuleCall_3_5___or___WhileKeyword_2_0_LCTerminalRuleCall_2_1_ExprParserRuleCall_2_2_LCTerminalRuleCall_2_3_DoKeyword_2_4_LCTerminalRuleCall_2_5____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Commands_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Commands_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Model_LCTerminalRuleCall_1_q.equals(syntax))
				emit_Model_LCTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (Vars LC? ':=' LC? Exprs) | 'nop'
	 */
	protected void emit_Command_NopKeyword_0_or___VarsParserRuleCall_1_0_LCTerminalRuleCall_1_1_q_ColonEqualsSignKeyword_1_2_LCTerminalRuleCall_1_3_q_ExprsParserRuleCall_1_4__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         (
	             'for' 
	             LC 
	             Expr 
	             LC 
	             'do' 
	             LC
	         ) | 
	         (
	             'while' 
	             LC 
	             Expr 
	             LC 
	             'do' 
	             LC
	         )
	     ) | 
	     (
	         'foreach' 
	         LC 
	         Expr 
	         LC 
	         'in' 
	         LC 
	         Expr 
	         LC 
	         'do' 
	         LC
	     )
	 )
	 */
	protected void emit_Command___ForeachKeyword_4_0_LCTerminalRuleCall_4_1_ExprParserRuleCall_4_2_LCTerminalRuleCall_4_3_InKeyword_4_4_LCTerminalRuleCall_4_5_ExprParserRuleCall_4_6_LCTerminalRuleCall_4_7_DoKeyword_4_8_LCTerminalRuleCall_4_9___or_____ForKeyword_3_0_LCTerminalRuleCall_3_1_ExprParserRuleCall_3_2_LCTerminalRuleCall_3_3_DoKeyword_3_4_LCTerminalRuleCall_3_5___or___WhileKeyword_2_0_LCTerminalRuleCall_2_1_ExprParserRuleCall_2_2_LCTerminalRuleCall_2_3_DoKeyword_2_4_LCTerminalRuleCall_2_5____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Commands_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Model_LCTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
