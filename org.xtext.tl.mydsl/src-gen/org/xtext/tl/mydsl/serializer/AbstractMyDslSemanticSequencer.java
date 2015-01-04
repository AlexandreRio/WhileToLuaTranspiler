package org.xtext.tl.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.tl.mydsl.myDsl.And;
import org.xtext.tl.mydsl.myDsl.Command;
import org.xtext.tl.mydsl.myDsl.Commands;
import org.xtext.tl.mydsl.myDsl.Definiton;
import org.xtext.tl.mydsl.myDsl.Eq;
import org.xtext.tl.mydsl.myDsl.Expr;
import org.xtext.tl.mydsl.myDsl.ExprSimple;
import org.xtext.tl.mydsl.myDsl.ExprTerm;
import org.xtext.tl.mydsl.myDsl.Exprs;
import org.xtext.tl.mydsl.myDsl.Function;
import org.xtext.tl.mydsl.myDsl.Input;
import org.xtext.tl.mydsl.myDsl.Lexpr;
import org.xtext.tl.mydsl.myDsl.Model;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.Not;
import org.xtext.tl.mydsl.myDsl.Or;
import org.xtext.tl.mydsl.myDsl.Output;
import org.xtext.tl.mydsl.myDsl.Vars;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.AND:
				if(context == grammarAccess.getAndRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.COMMAND:
				if(context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.COMMANDS:
				if(context == grammarAccess.getCommandsRule()) {
					sequence_Commands(context, (Commands) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.DEFINITON:
				if(context == grammarAccess.getDefinitonRule()) {
					sequence_Definiton(context, (Definiton) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EQ:
				if(context == grammarAccess.getEqRule()) {
					sequence_Eq(context, (Eq) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXPR_SIMPLE:
				if(context == grammarAccess.getExprSimpleRule()) {
					sequence_ExprSimple(context, (ExprSimple) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXPR_TERM:
				if(context == grammarAccess.getExprTermRule()) {
					sequence_ExprTerm(context, (ExprTerm) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.EXPRS:
				if(context == grammarAccess.getExprsRule()) {
					sequence_Exprs(context, (Exprs) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.LEXPR:
				if(context == grammarAccess.getLexprRule()) {
					sequence_Lexpr(context, (Lexpr) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.NOT:
				if(context == grammarAccess.getNotRule()) {
					sequence_Not(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.OR:
				if(context == grammarAccess.getOrRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.OUTPUT:
				if(context == grammarAccess.getOutputRule()) {
					sequence_Output(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.VARS:
				if(context == grammarAccess.getVarsRule()) {
					sequence_Vars(context, (Vars) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (expOu=Or expOu2+=Or*)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Command}
	 */
	protected void sequence_Command(EObject context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (c+=Command c+=Command*)
	 */
	protected void sequence_Commands(EObject context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inputVars=Input commandList=Commands outputVars=Output)
	 */
	protected void sequence_Definiton(EObject context, Definiton semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEFINITON__INPUT_VARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEFINITON__INPUT_VARS));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEFINITON__COMMAND_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEFINITON__COMMAND_LIST));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEFINITON__OUTPUT_VARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEFINITON__OUTPUT_VARS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0(), semanticObject.getInputVars());
		feeder.accept(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0(), semanticObject.getCommandList());
		feeder.accept(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0(), semanticObject.getOutputVars());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((exprEq1=ExprSimple | exprEq1=ExprTerm) (exprEq2=ExprSimple | exprEq2=ExprTerm)) | exp=ExprTerm | exp=ExprSimple)
	 */
	protected void sequence_Eq(EObject context, Eq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((mot='cons' | mot='list') lexpr=Lexpr) | ((mot='hd' | mot='tl') expr=Expr))
	 */
	protected void sequence_ExprSimple(EObject context, ExprSimple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ExprTerm}
	 */
	protected void sequence_ExprTerm(EObject context, ExprTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exprSimple=ExprSimple | expEt=And | expTerminale=ExprTerm)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=Expr expL=Exprs?)
	 */
	protected void sequence_Exprs(EObject context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (funName=SYMBOLES def=Definiton)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FUNCTION__FUN_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FUNCTION__FUN_NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FUNCTION__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FUNCTION__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0(), semanticObject.getFunName());
		feeder.accept(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (v=VARIABLE v2+=VARIABLE*)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp+=Expr+
	 */
	protected void sequence_Lexpr(EObject context, Lexpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     model+=Function*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (non+='not'* expEq=Eq)
	 */
	protected void sequence_Not(EObject context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expNon=Not expNon2+=Not*)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v=VARIABLE v2+=VARIABLE*)
	 */
	protected void sequence_Output(EObject context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (v1=VARIABLE v2=Vars?)
	 */
	protected void sequence_Vars(EObject context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
