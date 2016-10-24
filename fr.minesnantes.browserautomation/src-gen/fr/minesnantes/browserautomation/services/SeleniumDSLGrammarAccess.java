/*
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SeleniumDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SeleniumTestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.SeleniumTest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProceduresAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProceduresProcedureParserRuleCall_0_0 = (RuleCall)cProceduresAssignment_0.eContents().get(0);
		private final Assignment cMainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMainMainProcedureParserRuleCall_1_0 = (RuleCall)cMainAssignment_1.eContents().get(0);
		
		//SeleniumTest:
		//	procedures+=Procedure*
		//	main=MainProcedure;
		@Override public ParserRule getRule() { return rule; }
		
		//procedures+=Procedure* main=MainProcedure
		public Group getGroup() { return cGroup; }
		
		//procedures+=Procedure*
		public Assignment getProceduresAssignment_0() { return cProceduresAssignment_0; }
		
		//Procedure
		public RuleCall getProceduresProcedureParserRuleCall_0_0() { return cProceduresProcedureParserRuleCall_0_0; }
		
		//main=MainProcedure
		public Assignment getMainAssignment_1() { return cMainAssignment_1; }
		
		//MainProcedure
		public RuleCall getMainMainProcedureParserRuleCall_1_0() { return cMainMainProcedureParserRuleCall_1_0; }
	}
	public class ProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Procedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDENTIFIERTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cParametersAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_4_0_0 = (RuleCall)cParametersAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_4_1_0 = (RuleCall)cGroup_4_1.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_4_1_1 = (RuleCall)cGroup_4_1.eContents().get(1);
		private final Assignment cParametersAssignment_4_1_2 = (Assignment)cGroup_4_1.eContents().get(2);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_4_1_2_0 = (RuleCall)cParametersAssignment_4_1_2.eContents().get(0);
		private final Keyword cRightParenthesisColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cRETURN_LINETerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cInstructionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cInstructionsInstructionParserRuleCall_7_0 = (RuleCall)cInstructionsAssignment_7.eContents().get(0);
		
		//Procedure:
		//	'def' WS Name=IDENTIFIER '('? (Parameters+=IDENTIFIER+ (COMMA WS Parameters+=IDENTIFIER)*) '):' RETURN_LINE
		//	instructions+=Instruction*;
		@Override public ParserRule getRule() { return rule; }
		
		//'def' WS Name=IDENTIFIER '('? (Parameters+=IDENTIFIER+ (COMMA WS Parameters+=IDENTIFIER)*) '):' RETURN_LINE
		//instructions+=Instruction*
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//Name=IDENTIFIER
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//IDENTIFIER
		public RuleCall getNameIDENTIFIERTerminalRuleCall_2_0() { return cNameIDENTIFIERTerminalRuleCall_2_0; }
		
		//'('?
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//(Parameters+=IDENTIFIER+ (COMMA WS Parameters+=IDENTIFIER)*)
		public Group getGroup_4() { return cGroup_4; }
		
		//Parameters+=IDENTIFIER+
		public Assignment getParametersAssignment_4_0() { return cParametersAssignment_4_0; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_4_0_0() { return cParametersIDENTIFIERTerminalRuleCall_4_0_0; }
		
		//(COMMA WS Parameters+=IDENTIFIER)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_4_1_0() { return cCOMMATerminalRuleCall_4_1_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_4_1_1() { return cWSTerminalRuleCall_4_1_1; }
		
		//Parameters+=IDENTIFIER
		public Assignment getParametersAssignment_4_1_2() { return cParametersAssignment_4_1_2; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_4_1_2_0() { return cParametersIDENTIFIERTerminalRuleCall_4_1_2_0; }
		
		//'):'
		public Keyword getRightParenthesisColonKeyword_5() { return cRightParenthesisColonKeyword_5; }
		
		//RETURN_LINE
		public RuleCall getRETURN_LINETerminalRuleCall_6() { return cRETURN_LINETerminalRuleCall_6; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_7() { return cInstructionsAssignment_7; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_7_0() { return cInstructionsInstructionParserRuleCall_7_0; }
	}
	public class MainProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.MainProcedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMainProcedureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cMainKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cRETURN_LINETerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cInstructionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInstructionsInstructionParserRuleCall_5_0 = (RuleCall)cInstructionsAssignment_5.eContents().get(0);
		
		//MainProcedure:
		//	{MainProcedure} 'def' WS 'main():' RETURN_LINE
		//	instructions+=Instruction*;
		@Override public ParserRule getRule() { return rule; }
		
		//{MainProcedure} 'def' WS 'main():' RETURN_LINE instructions+=Instruction*
		public Group getGroup() { return cGroup; }
		
		//{MainProcedure}
		public Action getMainProcedureAction_0() { return cMainProcedureAction_0; }
		
		//'def'
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_2() { return cWSTerminalRuleCall_2; }
		
		//'main():'
		public Keyword getMainKeyword_3() { return cMainKeyword_3; }
		
		//RETURN_LINE
		public RuleCall getRETURN_LINETerminalRuleCall_4() { return cRETURN_LINETerminalRuleCall_4; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_5() { return cInstructionsAssignment_5; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_5_0() { return cInstructionsInstructionParserRuleCall_5_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTABTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cClickParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cFillParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cNavigateParserRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cAssertParserRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		private final RuleCall cReadParserRuleCall_1_4 = (RuleCall)cAlternatives_1.eContents().get(4);
		private final RuleCall cCallProcedureParserRuleCall_1_5 = (RuleCall)cAlternatives_1.eContents().get(5);
		
		////Instruction is abstract
		//Instruction:
		//	TAB (Click | Fill | Navigate | Assert | Read | CallProcedure);
		@Override public ParserRule getRule() { return rule; }
		
		//TAB (Click | Fill | Navigate | Assert | Read | CallProcedure)
		public Group getGroup() { return cGroup; }
		
		//TAB
		public RuleCall getTABTerminalRuleCall_0() { return cTABTerminalRuleCall_0; }
		
		//(Click | Fill | Navigate | Assert | Read | CallProcedure)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Click
		public RuleCall getClickParserRuleCall_1_0() { return cClickParserRuleCall_1_0; }
		
		//Fill
		public RuleCall getFillParserRuleCall_1_1() { return cFillParserRuleCall_1_1; }
		
		//Navigate
		public RuleCall getNavigateParserRuleCall_1_2() { return cNavigateParserRuleCall_1_2; }
		
		//Assert
		public RuleCall getAssertParserRuleCall_1_3() { return cAssertParserRuleCall_1_3; }
		
		//Read
		public RuleCall getReadParserRuleCall_1_4() { return cReadParserRuleCall_1_4; }
		
		//CallProcedure
		public RuleCall getCallProcedureParserRuleCall_1_5() { return cCallProcedureParserRuleCall_1_5; }
	}
	public class ClickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Click");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Click:
		//	'click' WS Name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'click' WS Name=STRING
		public Group getGroup() { return cGroup; }
		
		//'click'
		public Keyword getClickKeyword_0() { return cClickKeyword_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//Name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}
	public class FillElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Fill");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFillKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cValueAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cValueAlternatives_4_0 = (Alternatives)cValueAssignment_4.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_4_0_0 = (RuleCall)cValueAlternatives_4_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_4_0_1 = (RuleCall)cValueAlternatives_4_0.eContents().get(1);
		
		//Fill:
		//	'fill' WS Name=STRING WS value=(STRING | IDENTIFIER);
		@Override public ParserRule getRule() { return rule; }
		
		//'fill' WS Name=STRING WS value=(STRING | IDENTIFIER)
		public Group getGroup() { return cGroup; }
		
		//'fill'
		public Keyword getFillKeyword_0() { return cFillKeyword_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//Name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_3() { return cWSTerminalRuleCall_3; }
		
		//value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_4() { return cValueAssignment_4; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_4_0() { return cValueAlternatives_4_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_4_0_0() { return cValueSTRINGTerminalRuleCall_4_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_4_0_1() { return cValueIDENTIFIERTerminalRuleCall_4_0_1; }
	}
	public class NavigateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Navigate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavigateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cUrlAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cUrlAlternatives_2_0 = (Alternatives)cUrlAssignment_2.eContents().get(0);
		private final RuleCall cUrlSTRINGTerminalRuleCall_2_0_0 = (RuleCall)cUrlAlternatives_2_0.eContents().get(0);
		private final RuleCall cUrlIDENTIFIERTerminalRuleCall_2_0_1 = (RuleCall)cUrlAlternatives_2_0.eContents().get(1);
		
		//Navigate:
		//	'navigate' WS url=(STRING | IDENTIFIER);
		@Override public ParserRule getRule() { return rule; }
		
		//'navigate' WS url=(STRING | IDENTIFIER)
		public Group getGroup() { return cGroup; }
		
		//'navigate'
		public Keyword getNavigateKeyword_0() { return cNavigateKeyword_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//url=(STRING | IDENTIFIER)
		public Assignment getUrlAssignment_2() { return cUrlAssignment_2; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getUrlAlternatives_2_0() { return cUrlAlternatives_2_0; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_2_0_0() { return cUrlSTRINGTerminalRuleCall_2_0_0; }
		
		//IDENTIFIER
		public RuleCall getUrlIDENTIFIERTerminalRuleCall_2_0_1() { return cUrlIDENTIFIERTerminalRuleCall_2_0_1; }
	}
	public class ReadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Read");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVariableAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVariableIDENTIFIERTerminalRuleCall_0_0 = (RuleCall)cVariableAssignment_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cReadKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cWSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cNameAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cNameSTRINGTerminalRuleCall_6_0 = (RuleCall)cNameAssignment_6.eContents().get(0);
		
		//Read:
		//	Variable=IDENTIFIER WS '=' WS 'read' WS Name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//Variable=IDENTIFIER WS '=' WS 'read' WS Name=STRING
		public Group getGroup() { return cGroup; }
		
		//Variable=IDENTIFIER
		public Assignment getVariableAssignment_0() { return cVariableAssignment_0; }
		
		//IDENTIFIER
		public RuleCall getVariableIDENTIFIERTerminalRuleCall_0_0() { return cVariableIDENTIFIERTerminalRuleCall_0_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_3() { return cWSTerminalRuleCall_3; }
		
		//'read'
		public Keyword getReadKeyword_4() { return cReadKeyword_4; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_5() { return cWSTerminalRuleCall_5; }
		
		//Name=STRING
		public Assignment getNameAssignment_6() { return cNameAssignment_6; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_6_0() { return cNameSTRINGTerminalRuleCall_6_0; }
	}
	public class AssertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.Assert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cSearchAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cSearchSTRINGTerminalRuleCall_1_0_0_0 = (RuleCall)cSearchAssignment_1_0_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_0_1 = (RuleCall)cGroup_1_0.eContents().get(1);
		private final Keyword cContainsKeyword_1_0_2 = (Keyword)cGroup_1_0.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_1_0_3 = (RuleCall)cGroup_1_0.eContents().get(3);
		private final Assignment cValueAssignment_1_0_4 = (Assignment)cGroup_1_0.eContents().get(4);
		private final Alternatives cValueAlternatives_1_0_4_0 = (Alternatives)cValueAssignment_1_0_4.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0_4_0_0 = (RuleCall)cValueAlternatives_1_0_4_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_1_0_4_0_1 = (RuleCall)cValueAlternatives_1_0_4_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cNameAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_0_0 = (RuleCall)cNameAssignment_1_1_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_1_1 = (RuleCall)cGroup_1_1.eContents().get(1);
		private final Keyword cEqualsKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_1_1_3 = (RuleCall)cGroup_1_1.eContents().get(3);
		private final Assignment cValueAssignment_1_1_4 = (Assignment)cGroup_1_1.eContents().get(4);
		private final Alternatives cValueAlternatives_1_1_4_0 = (Alternatives)cValueAssignment_1_1_4.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_4_0_0 = (RuleCall)cValueAlternatives_1_1_4_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_1_1_4_0_1 = (RuleCall)cValueAlternatives_1_1_4_0.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Assignment cNameAssignment_1_2_0 = (Assignment)cGroup_1_2.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_2_0_0 = (RuleCall)cNameAssignment_1_2_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_2_1 = (RuleCall)cGroup_1_2.eContents().get(1);
		private final Keyword cExistsKeyword_1_2_2 = (Keyword)cGroup_1_2.eContents().get(2);
		
		//Assert:
		//	'assert' (Search=STRING WS 'contains' WS Value=(STRING | IDENTIFIER) | Name=STRING WS 'equals' WS Value=(STRING |
		//	IDENTIFIER) | Name=STRING WS 'exists');
		@Override public ParserRule getRule() { return rule; }
		
		//'assert' (Search=STRING WS 'contains' WS Value=(STRING | IDENTIFIER) | Name=STRING WS 'equals' WS Value=(STRING |
		//IDENTIFIER) | Name=STRING WS 'exists')
		public Group getGroup() { return cGroup; }
		
		//'assert'
		public Keyword getAssertKeyword_0() { return cAssertKeyword_0; }
		
		//(Search=STRING WS 'contains' WS Value=(STRING | IDENTIFIER) | Name=STRING WS 'equals' WS Value=(STRING | IDENTIFIER) |
		//Name=STRING WS 'exists')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Search=STRING WS 'contains' WS Value=(STRING | IDENTIFIER)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//Search=STRING
		public Assignment getSearchAssignment_1_0_0() { return cSearchAssignment_1_0_0; }
		
		//STRING
		public RuleCall getSearchSTRINGTerminalRuleCall_1_0_0_0() { return cSearchSTRINGTerminalRuleCall_1_0_0_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_0_1() { return cWSTerminalRuleCall_1_0_1; }
		
		//'contains'
		public Keyword getContainsKeyword_1_0_2() { return cContainsKeyword_1_0_2; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_0_3() { return cWSTerminalRuleCall_1_0_3; }
		
		//Value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_1_0_4() { return cValueAssignment_1_0_4; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_1_0_4_0() { return cValueAlternatives_1_0_4_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0_4_0_0() { return cValueSTRINGTerminalRuleCall_1_0_4_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_1_0_4_0_1() { return cValueIDENTIFIERTerminalRuleCall_1_0_4_0_1; }
		
		//Name=STRING WS 'equals' WS Value=(STRING | IDENTIFIER)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//Name=STRING
		public Assignment getNameAssignment_1_1_0() { return cNameAssignment_1_1_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_0_0() { return cNameSTRINGTerminalRuleCall_1_1_0_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_1_1() { return cWSTerminalRuleCall_1_1_1; }
		
		//'equals'
		public Keyword getEqualsKeyword_1_1_2() { return cEqualsKeyword_1_1_2; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_1_3() { return cWSTerminalRuleCall_1_1_3; }
		
		//Value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_1_1_4() { return cValueAssignment_1_1_4; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_1_1_4_0() { return cValueAlternatives_1_1_4_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_4_0_0() { return cValueSTRINGTerminalRuleCall_1_1_4_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_1_1_4_0_1() { return cValueIDENTIFIERTerminalRuleCall_1_1_4_0_1; }
		
		//Name=STRING WS 'exists'
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//Name=STRING
		public Assignment getNameAssignment_1_2_0() { return cNameAssignment_1_2_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_2_0_0() { return cNameSTRINGTerminalRuleCall_1_2_0_0; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_1_2_1() { return cWSTerminalRuleCall_1_2_1; }
		
		//'exists'
		public Keyword getExistsKeyword_1_2_2() { return cExistsKeyword_1_2_2; }
	}
	public class CallProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.CallProcedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCircumflexAccentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cProcedureNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProcedureNameIDENTIFIERTerminalRuleCall_1_0 = (RuleCall)cProcedureNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cParametersAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cParametersAlternatives_2_1_0 = (Alternatives)cParametersAssignment_2_1.eContents().get(0);
		private final RuleCall cParametersSTRINGTerminalRuleCall_2_1_0_0 = (RuleCall)cParametersAlternatives_2_1_0.eContents().get(0);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_2_1_0_1 = (RuleCall)cParametersAlternatives_2_1_0.eContents().get(1);
		
		//CallProcedure:
		//	'^' ProcedureName=IDENTIFIER (WS Parameters+=(STRING | IDENTIFIER))*;
		@Override public ParserRule getRule() { return rule; }
		
		//'^' ProcedureName=IDENTIFIER (WS Parameters+=(STRING | IDENTIFIER))*
		public Group getGroup() { return cGroup; }
		
		//'^'
		public Keyword getCircumflexAccentKeyword_0() { return cCircumflexAccentKeyword_0; }
		
		//ProcedureName=IDENTIFIER
		public Assignment getProcedureNameAssignment_1() { return cProcedureNameAssignment_1; }
		
		//IDENTIFIER
		public RuleCall getProcedureNameIDENTIFIERTerminalRuleCall_1_0() { return cProcedureNameIDENTIFIERTerminalRuleCall_1_0; }
		
		//(WS Parameters+=(STRING | IDENTIFIER))*
		public Group getGroup_2() { return cGroup_2; }
		
		//WS
		public RuleCall getWSTerminalRuleCall_2_0() { return cWSTerminalRuleCall_2_0; }
		
		//Parameters+=(STRING | IDENTIFIER)
		public Assignment getParametersAssignment_2_1() { return cParametersAssignment_2_1; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getParametersAlternatives_2_1_0() { return cParametersAlternatives_2_1_0; }
		
		//STRING
		public RuleCall getParametersSTRINGTerminalRuleCall_2_1_0_0() { return cParametersSTRINGTerminalRuleCall_2_1_0_0; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_2_1_0_1() { return cParametersIDENTIFIERTerminalRuleCall_2_1_0_1; }
	}
	
	
	private final SeleniumTestElements pSeleniumTest;
	private final ProcedureElements pProcedure;
	private final MainProcedureElements pMainProcedure;
	private final InstructionElements pInstruction;
	private final ClickElements pClick;
	private final FillElements pFill;
	private final NavigateElements pNavigate;
	private final ReadElements pRead;
	private final AssertElements pAssert;
	private final CallProcedureElements pCallProcedure;
	private final TerminalRule tIDENTIFIER;
	private final TerminalRule tWS;
	private final TerminalRule tCOMMA;
	private final TerminalRule tTAB;
	private final TerminalRule tRETURN_LINE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SeleniumDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSeleniumTest = new SeleniumTestElements();
		this.pProcedure = new ProcedureElements();
		this.pMainProcedure = new MainProcedureElements();
		this.pInstruction = new InstructionElements();
		this.pClick = new ClickElements();
		this.pFill = new FillElements();
		this.pNavigate = new NavigateElements();
		this.pRead = new ReadElements();
		this.pAssert = new AssertElements();
		this.pCallProcedure = new CallProcedureElements();
		this.tIDENTIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.WS");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.COMMA");
		this.tTAB = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.TAB");
		this.tRETURN_LINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "fr.minesnantes.browserautomation.SeleniumDSL.RETURN_LINE");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.minesnantes.browserautomation.SeleniumDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SeleniumTest:
	//	procedures+=Procedure*
	//	main=MainProcedure;
	public SeleniumTestElements getSeleniumTestAccess() {
		return pSeleniumTest;
	}
	
	public ParserRule getSeleniumTestRule() {
		return getSeleniumTestAccess().getRule();
	}
	
	//Procedure:
	//	'def' WS Name=IDENTIFIER '('? (Parameters+=IDENTIFIER+ (COMMA WS Parameters+=IDENTIFIER)*) '):' RETURN_LINE
	//	instructions+=Instruction*;
	public ProcedureElements getProcedureAccess() {
		return pProcedure;
	}
	
	public ParserRule getProcedureRule() {
		return getProcedureAccess().getRule();
	}
	
	//MainProcedure:
	//	{MainProcedure} 'def' WS 'main():' RETURN_LINE
	//	instructions+=Instruction*;
	public MainProcedureElements getMainProcedureAccess() {
		return pMainProcedure;
	}
	
	public ParserRule getMainProcedureRule() {
		return getMainProcedureAccess().getRule();
	}
	
	////Instruction is abstract
	//Instruction:
	//	TAB (Click | Fill | Navigate | Assert | Read | CallProcedure);
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Click:
	//	'click' WS Name=STRING;
	public ClickElements getClickAccess() {
		return pClick;
	}
	
	public ParserRule getClickRule() {
		return getClickAccess().getRule();
	}
	
	//Fill:
	//	'fill' WS Name=STRING WS value=(STRING | IDENTIFIER);
	public FillElements getFillAccess() {
		return pFill;
	}
	
	public ParserRule getFillRule() {
		return getFillAccess().getRule();
	}
	
	//Navigate:
	//	'navigate' WS url=(STRING | IDENTIFIER);
	public NavigateElements getNavigateAccess() {
		return pNavigate;
	}
	
	public ParserRule getNavigateRule() {
		return getNavigateAccess().getRule();
	}
	
	//Read:
	//	Variable=IDENTIFIER WS '=' WS 'read' WS Name=STRING;
	public ReadElements getReadAccess() {
		return pRead;
	}
	
	public ParserRule getReadRule() {
		return getReadAccess().getRule();
	}
	
	//Assert:
	//	'assert' (Search=STRING WS 'contains' WS Value=(STRING | IDENTIFIER) | Name=STRING WS 'equals' WS Value=(STRING |
	//	IDENTIFIER) | Name=STRING WS 'exists');
	public AssertElements getAssertAccess() {
		return pAssert;
	}
	
	public ParserRule getAssertRule() {
		return getAssertAccess().getRule();
	}
	
	//CallProcedure:
	//	'^' ProcedureName=IDENTIFIER (WS Parameters+=(STRING | IDENTIFIER))*;
	public CallProcedureElements getCallProcedureAccess() {
		return pCallProcedure;
	}
	
	public ParserRule getCallProcedureRule() {
		return getCallProcedureAccess().getRule();
	}
	
	//terminal IDENTIFIER:
	//	'^'? ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
	public TerminalRule getIDENTIFIERRule() {
		return tIDENTIFIER;
	}
	
	//terminal WS:
	//	' ';
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal TAB:
	//	'\t';
	public TerminalRule getTABRule() {
		return tTAB;
	}
	
	//terminal RETURN_LINE:
	//	'\n';
	public TerminalRule getRETURN_LINERule() {
		return tRETURN_LINE;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
