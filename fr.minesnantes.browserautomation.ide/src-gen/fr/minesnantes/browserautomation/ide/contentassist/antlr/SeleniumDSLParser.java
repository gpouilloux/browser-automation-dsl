/*
 * generated by Xtext 2.10.0
 */
package fr.minesnantes.browserautomation.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.minesnantes.browserautomation.ide.contentassist.antlr.internal.InternalSeleniumDSLParser;
import fr.minesnantes.browserautomation.services.SeleniumDSLGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SeleniumDSLParser extends AbstractContentAssistParser {

	@Inject
	private SeleniumDSLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSeleniumDSLParser createParser() {
		InternalSeleniumDSLParser result = new InternalSeleniumDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionAccess().getAlternatives_1(), "rule__Instruction__Alternatives_1");
					put(grammarAccess.getFillAccess().getValueAlternatives_4_0(), "rule__Fill__ValueAlternatives_4_0");
					put(grammarAccess.getNavigateAccess().getUrlAlternatives_2_0(), "rule__Navigate__UrlAlternatives_2_0");
					put(grammarAccess.getAssertAccess().getAlternatives_1(), "rule__Assert__Alternatives_1");
					put(grammarAccess.getAssertAccess().getValueAlternatives_1_0_4_0(), "rule__Assert__ValueAlternatives_1_0_4_0");
					put(grammarAccess.getAssertAccess().getValueAlternatives_1_1_4_0(), "rule__Assert__ValueAlternatives_1_1_4_0");
					put(grammarAccess.getCallProcedureAccess().getParametersAlternatives_2_1_0(), "rule__CallProcedure__ParametersAlternatives_2_1_0");
					put(grammarAccess.getSeleniumTestAccess().getGroup(), "rule__SeleniumTest__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup_4(), "rule__Procedure__Group_4__0");
					put(grammarAccess.getProcedureAccess().getGroup_4_1(), "rule__Procedure__Group_4_1__0");
					put(grammarAccess.getMainProcedureAccess().getGroup(), "rule__MainProcedure__Group__0");
					put(grammarAccess.getInstructionAccess().getGroup(), "rule__Instruction__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
					put(grammarAccess.getNavigateAccess().getGroup(), "rule__Navigate__Group__0");
					put(grammarAccess.getReadAccess().getGroup(), "rule__Read__Group__0");
					put(grammarAccess.getAssertAccess().getGroup(), "rule__Assert__Group__0");
					put(grammarAccess.getAssertAccess().getGroup_1_0(), "rule__Assert__Group_1_0__0");
					put(grammarAccess.getAssertAccess().getGroup_1_1(), "rule__Assert__Group_1_1__0");
					put(grammarAccess.getAssertAccess().getGroup_1_2(), "rule__Assert__Group_1_2__0");
					put(grammarAccess.getCallProcedureAccess().getGroup(), "rule__CallProcedure__Group__0");
					put(grammarAccess.getCallProcedureAccess().getGroup_2(), "rule__CallProcedure__Group_2__0");
					put(grammarAccess.getSeleniumTestAccess().getProceduresAssignment_0(), "rule__SeleniumTest__ProceduresAssignment_0");
					put(grammarAccess.getSeleniumTestAccess().getMainAssignment_1(), "rule__SeleniumTest__MainAssignment_1");
					put(grammarAccess.getProcedureAccess().getNameAssignment_2(), "rule__Procedure__NameAssignment_2");
					put(grammarAccess.getProcedureAccess().getParametersAssignment_4_0(), "rule__Procedure__ParametersAssignment_4_0");
					put(grammarAccess.getProcedureAccess().getParametersAssignment_4_1_2(), "rule__Procedure__ParametersAssignment_4_1_2");
					put(grammarAccess.getProcedureAccess().getInstructionsAssignment_7(), "rule__Procedure__InstructionsAssignment_7");
					put(grammarAccess.getMainProcedureAccess().getInstructionsAssignment_5(), "rule__MainProcedure__InstructionsAssignment_5");
					put(grammarAccess.getClickAccess().getNameAssignment_2(), "rule__Click__NameAssignment_2");
					put(grammarAccess.getFillAccess().getNameAssignment_2(), "rule__Fill__NameAssignment_2");
					put(grammarAccess.getFillAccess().getValueAssignment_4(), "rule__Fill__ValueAssignment_4");
					put(grammarAccess.getNavigateAccess().getUrlAssignment_2(), "rule__Navigate__UrlAssignment_2");
					put(grammarAccess.getReadAccess().getVariableAssignment_0(), "rule__Read__VariableAssignment_0");
					put(grammarAccess.getReadAccess().getNameAssignment_6(), "rule__Read__NameAssignment_6");
					put(grammarAccess.getAssertAccess().getSearchAssignment_1_0_0(), "rule__Assert__SearchAssignment_1_0_0");
					put(grammarAccess.getAssertAccess().getValueAssignment_1_0_4(), "rule__Assert__ValueAssignment_1_0_4");
					put(grammarAccess.getAssertAccess().getNameAssignment_1_1_0(), "rule__Assert__NameAssignment_1_1_0");
					put(grammarAccess.getAssertAccess().getValueAssignment_1_1_4(), "rule__Assert__ValueAssignment_1_1_4");
					put(grammarAccess.getAssertAccess().getNameAssignment_1_2_0(), "rule__Assert__NameAssignment_1_2_0");
					put(grammarAccess.getCallProcedureAccess().getProcedureNameAssignment_1(), "rule__CallProcedure__ProcedureNameAssignment_1");
					put(grammarAccess.getCallProcedureAccess().getParametersAssignment_2_1(), "rule__CallProcedure__ParametersAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSeleniumDSLParser typedParser = (InternalSeleniumDSLParser) parser;
			typedParser.entryRuleSeleniumTest();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SeleniumDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SeleniumDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}