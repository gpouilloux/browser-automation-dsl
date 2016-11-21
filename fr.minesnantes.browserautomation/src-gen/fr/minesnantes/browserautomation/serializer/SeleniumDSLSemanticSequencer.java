/*
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.serializer;

import com.google.inject.Inject;
import fr.minesnantes.browserautomation.seleniumDSL.Assert;
import fr.minesnantes.browserautomation.seleniumDSL.CallProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Click;
import fr.minesnantes.browserautomation.seleniumDSL.Fill;
import fr.minesnantes.browserautomation.seleniumDSL.MainProcedure;
import fr.minesnantes.browserautomation.seleniumDSL.Navigate;
import fr.minesnantes.browserautomation.seleniumDSL.Procedure;
import fr.minesnantes.browserautomation.seleniumDSL.Read;
import fr.minesnantes.browserautomation.seleniumDSL.Select;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumDSLPackage;
import fr.minesnantes.browserautomation.seleniumDSL.SeleniumTest;
import fr.minesnantes.browserautomation.seleniumDSL.Tick;
import fr.minesnantes.browserautomation.services.SeleniumDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SeleniumDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SeleniumDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SeleniumDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SeleniumDSLPackage.ASSERT:
				sequence_Assert(context, (Assert) semanticObject); 
				return; 
			case SeleniumDSLPackage.CALL_PROCEDURE:
				sequence_CallProcedure(context, (CallProcedure) semanticObject); 
				return; 
			case SeleniumDSLPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case SeleniumDSLPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case SeleniumDSLPackage.MAIN_PROCEDURE:
				sequence_MainProcedure(context, (MainProcedure) semanticObject); 
				return; 
			case SeleniumDSLPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case SeleniumDSLPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case SeleniumDSLPackage.READ:
				sequence_Read(context, (Read) semanticObject); 
				return; 
			case SeleniumDSLPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case SeleniumDSLPackage.SELENIUM_TEST:
				sequence_SeleniumTest(context, (SeleniumTest) semanticObject); 
				return; 
			case SeleniumDSLPackage.TICK:
				sequence_Tick(context, (Tick) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instruction returns Assert
	 *     Assert returns Assert
	 *
	 * Constraint:
	 *     ((Name=STRING (Type='contains' | Type='equals') (Value=STRING | Value=IDENTIFIER)) | (Name=STRING Type='exists'))
	 */
	protected void sequence_Assert(ISerializationContext context, Assert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns CallProcedure
	 *     CallProcedure returns CallProcedure
	 *
	 * Constraint:
	 *     (
	 *         ProcedureName=IDENTIFIER 
	 *         ((Parameters+=IDENTIFIER | Parameters+=STRING) Parameters+=IDENTIFIER? (Parameters+=STRING? Parameters+=IDENTIFIER?)*)?
	 *     )
	 */
	protected void sequence_CallProcedure(ISerializationContext context, CallProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     ((Type='input' | Type='link' | Type='name' | Type='xpath') Value=STRING)
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (Name=STRING (Value=STRING | Value=IDENTIFIER))
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainProcedure returns MainProcedure
	 *
	 * Constraint:
	 *     instructions+=Instruction*
	 */
	protected void sequence_MainProcedure(ISerializationContext context, MainProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Navigate
	 *     Navigate returns Navigate
	 *
	 * Constraint:
	 *     (url=STRING | url=IDENTIFIER)
	 */
	protected void sequence_Navigate(ISerializationContext context, Navigate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (Name=IDENTIFIER (Parameters+=IDENTIFIER Parameters+=IDENTIFIER*)? instructions+=Instruction*)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Read
	 *     Read returns Read
	 *
	 * Constraint:
	 *     (Variable=IDENTIFIER Name=STRING)
	 */
	protected void sequence_Read(ISerializationContext context, Read semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumDSLPackage.Literals.READ__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumDSLPackage.Literals.READ__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, SeleniumDSLPackage.Literals.READ__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumDSLPackage.Literals.READ__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (Name=STRING (Value=STRING | Value=IDENTIFIER))
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SeleniumTest returns SeleniumTest
	 *
	 * Constraint:
	 *     (procedures+=Procedure* main=MainProcedure)
	 */
	protected void sequence_SeleniumTest(ISerializationContext context, SeleniumTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Tick
	 *     Tick returns Tick
	 *
	 * Constraint:
	 *     Name=STRING
	 */
	protected void sequence_Tick(ISerializationContext context, Tick semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SeleniumDSLPackage.Literals.TICK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SeleniumDSLPackage.Literals.TICK__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTickAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
