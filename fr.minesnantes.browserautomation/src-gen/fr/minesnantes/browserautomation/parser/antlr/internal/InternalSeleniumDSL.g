/*
 * generated by Xtext 2.10.0
 */
grammar InternalSeleniumDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.minesnantes.browserautomation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.minesnantes.browserautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.minesnantes.browserautomation.services.SeleniumDSLGrammarAccess;

}

@parser::members {

 	private SeleniumDSLGrammarAccess grammarAccess;

    public InternalSeleniumDSLParser(TokenStream input, SeleniumDSLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SeleniumTest";
   	}

   	@Override
   	protected SeleniumDSLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSeleniumTest
entryRuleSeleniumTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSeleniumTestRule()); }
	iv_ruleSeleniumTest=ruleSeleniumTest
	{ $current=$iv_ruleSeleniumTest.current; }
	EOF;

// Rule SeleniumTest
ruleSeleniumTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSeleniumTestAccess().getProceduresProcedureParserRuleCall_0_0());
				}
				lv_procedures_0_0=ruleProcedure
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSeleniumTestRule());
					}
					add(
						$current,
						"procedures",
						lv_procedures_0_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.Procedure");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getSeleniumTestAccess().getMainMainProcedureParserRuleCall_1_0());
				}
				lv_main_1_0=ruleMainProcedure
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSeleniumTestRule());
					}
					set(
						$current,
						"main",
						lv_main_1_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.MainProcedure");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProcedure
entryRuleProcedure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcedureRule()); }
	iv_ruleProcedure=ruleProcedure
	{ $current=$iv_ruleProcedure.current; }
	EOF;

// Rule Procedure
ruleProcedure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='def'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getDefKeyword_0());
		}
		(
			(
				lv_Name_1_0=RULE_IDENTIFIER
				{
					newLeafNode(lv_Name_1_0, grammarAccess.getProcedureAccess().getNameIDENTIFIERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcedureRule());
					}
					setWithLastConsumed(
						$current,
						"Name",
						lv_Name_1_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
				}
			)
		)
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					(
						lv_Parameters_3_0=RULE_IDENTIFIER
						{
							newLeafNode(lv_Parameters_3_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProcedureRule());
							}
							addWithLastConsumed(
								$current,
								"Parameters",
								lv_Parameters_3_0,
								"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
						}
					)
				)
				(
					this_COMMA_4=RULE_COMMA
					{
						newLeafNode(this_COMMA_4, grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_2_1_1_0());
					}
					(
						(
							lv_Parameters_5_0=RULE_IDENTIFIER
							{
								newLeafNode(lv_Parameters_5_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProcedureRule());
								}
								addWithLastConsumed(
									$current,
									"Parameters",
									lv_Parameters_5_0,
									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
							}
						)
					)
				)*
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_2_2());
			}
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureAccess().getInstructionsInstructionParserRuleCall_4_0());
				}
				lv_instructions_8_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_8_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleMainProcedure
entryRuleMainProcedure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainProcedureRule()); }
	iv_ruleMainProcedure=ruleMainProcedure
	{ $current=$iv_ruleMainProcedure.current; }
	EOF;

// Rule MainProcedure
ruleMainProcedure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMainProcedureAccess().getMainProcedureAction_0(),
					$current);
			}
		)
		(
			otherlv_1='def'
			{
				newLeafNode(otherlv_1, grammarAccess.getMainProcedureAccess().getDefKeyword_1());
			}
		)+
		(
			otherlv_2='main'
			{
				newLeafNode(otherlv_2, grammarAccess.getMainProcedureAccess().getMainKeyword_2());
			}
		)+
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMainProcedureAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMainProcedureAccess().getInstructionsInstructionParserRuleCall_4_0());
				}
				lv_instructions_4_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainProcedureRule());
					}
					add(
						$current,
						"instructions",
						lv_instructions_4_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getMainProcedureAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_0());
		}
		this_Click_0=ruleClick
		{
			$current = $this_Click_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getFillParserRuleCall_1());
		}
		this_Fill_1=ruleFill
		{
			$current = $this_Fill_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_2());
		}
		this_Select_2=ruleSelect
		{
			$current = $this_Select_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_3());
		}
		this_Navigate_3=ruleNavigate
		{
			$current = $this_Navigate_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getAssertParserRuleCall_4());
		}
		this_Assert_4=ruleAssert
		{
			$current = $this_Assert_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getReadParserRuleCall_5());
		}
		this_Read_5=ruleRead
		{
			$current = $this_Read_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_6());
		}
		this_CallProcedure_6=ruleCallProcedure
		{
			$current = $this_CallProcedure_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClick
entryRuleClick returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickRule()); }
	iv_ruleClick=ruleClick
	{ $current=$iv_ruleClick.current; }
	EOF;

// Rule Click
ruleClick returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='click'
		{
			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
		}
		(
			(
				lv_Name_1_0=RULE_STRING
				{
					newLeafNode(lv_Name_1_0, grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClickRule());
					}
					setWithLastConsumed(
						$current,
						"Name",
						lv_Name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleFill
entryRuleFill returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFillRule()); }
	iv_ruleFill=ruleFill
	{ $current=$iv_ruleFill.current; }
	EOF;

// Rule Fill
ruleFill returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fill'
		{
			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
		}
		(
			(
				lv_Name_1_0=RULE_STRING
				{
					newLeafNode(lv_Name_1_0, grammarAccess.getFillAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFillRule());
					}
					setWithLastConsumed(
						$current,
						"Name",
						lv_Name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					lv_value_2_1=RULE_STRING
					{
						newLeafNode(lv_value_2_1, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFillRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_1,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
					    |
					lv_value_2_2=RULE_IDENTIFIER
					{
						newLeafNode(lv_value_2_2, grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFillRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_2,
							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSelect
entryRuleSelect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectRule()); }
	iv_ruleSelect=ruleSelect
	{ $current=$iv_ruleSelect.current; }
	EOF;

// Rule Select
ruleSelect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='select'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
		}
		(
			(
				lv_Name_1_0=RULE_STRING
				{
					newLeafNode(lv_Name_1_0, grammarAccess.getSelectAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectRule());
					}
					setWithLastConsumed(
						$current,
						"Name",
						lv_Name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleNavigate
entryRuleNavigate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNavigateRule()); }
	iv_ruleNavigate=ruleNavigate
	{ $current=$iv_ruleNavigate.current; }
	EOF;

// Rule Navigate
ruleNavigate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='navigate'
		{
			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
		}
		(
			(
				(
					lv_url_1_1=RULE_STRING
					{
						newLeafNode(lv_url_1_1, grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNavigateRule());
						}
						setWithLastConsumed(
							$current,
							"url",
							lv_url_1_1,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
					    |
					lv_url_1_2=RULE_IDENTIFIER
					{
						newLeafNode(lv_url_1_2, grammarAccess.getNavigateAccess().getUrlIDENTIFIERTerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNavigateRule());
						}
						setWithLastConsumed(
							$current,
							"url",
							lv_url_1_2,
							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleRead
entryRuleRead returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReadRule()); }
	iv_ruleRead=ruleRead
	{ $current=$iv_ruleRead.current; }
	EOF;

// Rule Read
ruleRead returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_Variable_0_0=RULE_IDENTIFIER
				{
					newLeafNode(lv_Variable_0_0, grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReadRule());
					}
					setWithLastConsumed(
						$current,
						"Variable",
						lv_Variable_0_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='read'
		{
			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getReadKeyword_2());
		}
		(
			(
				lv_Name_3_0=RULE_STRING
				{
					newLeafNode(lv_Name_3_0, grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReadRule());
					}
					setWithLastConsumed(
						$current,
						"Name",
						lv_Name_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleAssert
entryRuleAssert returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssertRule()); }
	iv_ruleAssert=ruleAssert
	{ $current=$iv_ruleAssert.current; }
	EOF;

// Rule Assert
ruleAssert returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='assert'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getAssertKeyword_0());
		}
		(
			(
				(
					(
						lv_Search_1_0=RULE_STRING
						{
							newLeafNode(lv_Search_1_0, grammarAccess.getAssertAccess().getSearchSTRINGTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAssertRule());
							}
							setWithLastConsumed(
								$current,
								"Search",
								lv_Search_1_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_2='contains'
				{
					newLeafNode(otherlv_2, grammarAccess.getAssertAccess().getContainsKeyword_1_0_1());
				}
				(
					(
						(
							lv_Value_3_1=RULE_STRING
							{
								newLeafNode(lv_Value_3_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAssertRule());
								}
								setWithLastConsumed(
									$current,
									"Value",
									lv_Value_3_1,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
							    |
							lv_Value_3_2=RULE_IDENTIFIER
							{
								newLeafNode(lv_Value_3_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_0_2_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAssertRule());
								}
								setWithLastConsumed(
									$current,
									"Value",
									lv_Value_3_2,
									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
							}
						)
					)
				)
			)
			    |
			(
				(
					(
						lv_Name_4_0=RULE_STRING
						{
							newLeafNode(lv_Name_4_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAssertRule());
							}
							setWithLastConsumed(
								$current,
								"Name",
								lv_Name_4_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_5='equals'
				{
					newLeafNode(otherlv_5, grammarAccess.getAssertAccess().getEqualsKeyword_1_1_1());
				}
				(
					(
						(
							lv_Value_6_1=RULE_STRING
							{
								newLeafNode(lv_Value_6_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_1_2_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAssertRule());
								}
								setWithLastConsumed(
									$current,
									"Value",
									lv_Value_6_1,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
							    |
							lv_Value_6_2=RULE_IDENTIFIER
							{
								newLeafNode(lv_Value_6_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_1_2_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAssertRule());
								}
								setWithLastConsumed(
									$current,
									"Value",
									lv_Value_6_2,
									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
							}
						)
					)
				)
			)
			    |
			(
				(
					(
						lv_Name_7_0=RULE_STRING
						{
							newLeafNode(lv_Name_7_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAssertRule());
							}
							setWithLastConsumed(
								$current,
								"Name",
								lv_Name_7_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				otherlv_8='exists'
				{
					newLeafNode(otherlv_8, grammarAccess.getAssertAccess().getExistsKeyword_1_2_1());
				}
			)
		)
	)
;

// Entry rule entryRuleCallProcedure
entryRuleCallProcedure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallProcedureRule()); }
	iv_ruleCallProcedure=ruleCallProcedure
	{ $current=$iv_ruleCallProcedure.current; }
	EOF;

// Rule CallProcedure
ruleCallProcedure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_ProcedureName_0_0=RULE_IDENTIFIER
				{
					newLeafNode(lv_ProcedureName_0_0, grammarAccess.getCallProcedureAccess().getProcedureNameIDENTIFIERTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCallProcedureRule());
					}
					setWithLastConsumed(
						$current,
						"ProcedureName",
						lv_ProcedureName_0_0,
						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
				}
			)
		)
		(
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					(
						(
							lv_Parameters_2_1=RULE_IDENTIFIER
							{
								newLeafNode(lv_Parameters_2_1, grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getCallProcedureRule());
								}
								addWithLastConsumed(
									$current,
									"Parameters",
									lv_Parameters_2_1,
									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
							}
							    |
							lv_Parameters_2_2=RULE_STRING
							{
								newLeafNode(lv_Parameters_2_2, grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_0_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getCallProcedureRule());
								}
								addWithLastConsumed(
									$current,
									"Parameters",
									lv_Parameters_2_2,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)
				(
					this_COMMA_3=RULE_COMMA
					{
						newLeafNode(this_COMMA_3, grammarAccess.getCallProcedureAccess().getCOMMATerminalRuleCall_1_1_1_0());
					}
					(
						(
							(
								lv_Parameters_4_1=RULE_IDENTIFIER
								{
									newLeafNode(lv_Parameters_4_1, grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getCallProcedureRule());
									}
									addWithLastConsumed(
										$current,
										"Parameters",
										lv_Parameters_4_1,
										"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
								}
								    |
								lv_Parameters_4_2=RULE_STRING
								{
									newLeafNode(lv_Parameters_4_2, grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_1_1_0_1());
								}
								{
									if ($current==null) {
										$current = createModelElement(grammarAccess.getCallProcedureRule());
									}
									addWithLastConsumed(
										$current,
										"Parameters",
										lv_Parameters_4_2,
										"org.eclipse.xtext.common.Terminals.STRING");
								}
							)
						)
					)
				)*
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_1_2());
			}
		)?
	)
;

RULE_IDENTIFIER : '^'? ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*;

RULE_COMMA : ',';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
