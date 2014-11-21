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
import org.xtext.tl.mydsl.myDsl.Command;
import org.xtext.tl.mydsl.myDsl.Commands;
import org.xtext.tl.mydsl.myDsl.Definiton;
import org.xtext.tl.mydsl.myDsl.Model;
import org.xtext.tl.mydsl.myDsl.MyDslPackage;
import org.xtext.tl.mydsl.myDsl.function;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.COMMAND:
				if(context == grammarAccess.getCommandRule()) {
					sequence_Command(context, (Command) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.COMMANDS:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommandsRule()) {
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
			case MyDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MyDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_function(context, (function) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (c=Commands c2=Commands?)?
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
	 *     model+=function*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (funName=SYMBOLES def=Definiton)
	 */
	protected void sequence_function(EObject context, function semanticObject) {
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
}
