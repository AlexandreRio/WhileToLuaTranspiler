package org.xtext.tl.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Command_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Command_LCTerminalRuleCall_1_3_q;
	protected AbstractElementAlias match_Commands_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Eq_LCTerminalRuleCall_0_1_q;
	protected AbstractElementAlias match_Eq_LCTerminalRuleCall_0_3_q;
	protected AbstractElementAlias match_Exprs_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Input_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Model_LCTerminalRuleCall_1_q;
	protected AbstractElementAlias match_Output_LCTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Vars_LCTerminalRuleCall_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_Command_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1());
		match_Command_LCTerminalRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3());
		match_Commands_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1());
		match_Eq_LCTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1());
		match_Eq_LCTerminalRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3());
		match_Exprs_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getExprsAccess().getLCTerminalRuleCall_1_1());
		match_Input_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1());
		match_Model_LCTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getModelAccess().getLCTerminalRuleCall_1());
		match_Output_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1());
		match_Vars_LCTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getVarsAccess().getLCTerminalRuleCall_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getLCRule())
			return getLCToken(semanticObject, ruleCall, node);
		return "";
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
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Command_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Command_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Command_LCTerminalRuleCall_1_3_q.equals(syntax))
				emit_Command_LCTerminalRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Commands_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Commands_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Eq_LCTerminalRuleCall_0_1_q.equals(syntax))
				emit_Eq_LCTerminalRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Eq_LCTerminalRuleCall_0_3_q.equals(syntax))
				emit_Eq_LCTerminalRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Exprs_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Exprs_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Input_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Input_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Model_LCTerminalRuleCall_1_q.equals(syntax))
				emit_Model_LCTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Output_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Output_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Vars_LCTerminalRuleCall_1_1_q.equals(syntax))
				emit_Vars_LCTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Command_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Command_LCTerminalRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Eq_LCTerminalRuleCall_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Eq_LCTerminalRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Exprs_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Input_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Model_LCTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Output_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LC?
	 */
	protected void emit_Vars_LCTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
