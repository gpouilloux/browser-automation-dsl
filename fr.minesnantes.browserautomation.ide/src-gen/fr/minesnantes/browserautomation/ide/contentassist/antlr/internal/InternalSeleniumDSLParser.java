package fr.minesnantes.browserautomation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.minesnantes.browserautomation.services.SeleniumDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENTIFIER", "RULE_COMMA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'link'", "'name'", "'xpath'", "'def'", "'{'", "'}'", "'('", "')'", "'main'", "'click'", "'fill'", "'select'", "'tick'", "'navigate'", "'='", "'read'", "'assert'", "'contains'", "'equals'", "'exists'"
    };
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSeleniumDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSeleniumDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSeleniumDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSeleniumDSL.g"; }


    	private SeleniumDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SeleniumDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSeleniumTest"
    // InternalSeleniumDSL.g:53:1: entryRuleSeleniumTest : ruleSeleniumTest EOF ;
    public final void entryRuleSeleniumTest() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:54:1: ( ruleSeleniumTest EOF )
            // InternalSeleniumDSL.g:55:1: ruleSeleniumTest EOF
            {
             before(grammarAccess.getSeleniumTestRule()); 
            pushFollow(FOLLOW_1);
            ruleSeleniumTest();

            state._fsp--;

             after(grammarAccess.getSeleniumTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeleniumTest"


    // $ANTLR start "ruleSeleniumTest"
    // InternalSeleniumDSL.g:62:1: ruleSeleniumTest : ( ( rule__SeleniumTest__Group__0 ) ) ;
    public final void ruleSeleniumTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:66:2: ( ( ( rule__SeleniumTest__Group__0 ) ) )
            // InternalSeleniumDSL.g:67:2: ( ( rule__SeleniumTest__Group__0 ) )
            {
            // InternalSeleniumDSL.g:67:2: ( ( rule__SeleniumTest__Group__0 ) )
            // InternalSeleniumDSL.g:68:3: ( rule__SeleniumTest__Group__0 )
            {
             before(grammarAccess.getSeleniumTestAccess().getGroup()); 
            // InternalSeleniumDSL.g:69:3: ( rule__SeleniumTest__Group__0 )
            // InternalSeleniumDSL.g:69:4: rule__SeleniumTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SeleniumTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSeleniumTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeleniumTest"


    // $ANTLR start "entryRuleProcedure"
    // InternalSeleniumDSL.g:78:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:79:1: ( ruleProcedure EOF )
            // InternalSeleniumDSL.g:80:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalSeleniumDSL.g:87:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:91:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // InternalSeleniumDSL.g:92:2: ( ( rule__Procedure__Group__0 ) )
            {
            // InternalSeleniumDSL.g:92:2: ( ( rule__Procedure__Group__0 ) )
            // InternalSeleniumDSL.g:93:3: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // InternalSeleniumDSL.g:94:3: ( rule__Procedure__Group__0 )
            // InternalSeleniumDSL.g:94:4: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleMainProcedure"
    // InternalSeleniumDSL.g:103:1: entryRuleMainProcedure : ruleMainProcedure EOF ;
    public final void entryRuleMainProcedure() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:104:1: ( ruleMainProcedure EOF )
            // InternalSeleniumDSL.g:105:1: ruleMainProcedure EOF
            {
             before(grammarAccess.getMainProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleMainProcedure();

            state._fsp--;

             after(grammarAccess.getMainProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainProcedure"


    // $ANTLR start "ruleMainProcedure"
    // InternalSeleniumDSL.g:112:1: ruleMainProcedure : ( ( rule__MainProcedure__Group__0 ) ) ;
    public final void ruleMainProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:116:2: ( ( ( rule__MainProcedure__Group__0 ) ) )
            // InternalSeleniumDSL.g:117:2: ( ( rule__MainProcedure__Group__0 ) )
            {
            // InternalSeleniumDSL.g:117:2: ( ( rule__MainProcedure__Group__0 ) )
            // InternalSeleniumDSL.g:118:3: ( rule__MainProcedure__Group__0 )
            {
             before(grammarAccess.getMainProcedureAccess().getGroup()); 
            // InternalSeleniumDSL.g:119:3: ( rule__MainProcedure__Group__0 )
            // InternalSeleniumDSL.g:119:4: rule__MainProcedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainProcedure"


    // $ANTLR start "entryRuleInstruction"
    // InternalSeleniumDSL.g:128:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:129:1: ( ruleInstruction EOF )
            // InternalSeleniumDSL.g:130:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSeleniumDSL.g:137:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:141:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalSeleniumDSL.g:142:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalSeleniumDSL.g:142:2: ( ( rule__Instruction__Alternatives ) )
            // InternalSeleniumDSL.g:143:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalSeleniumDSL.g:144:3: ( rule__Instruction__Alternatives )
            // InternalSeleniumDSL.g:144:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDSL.g:153:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:154:1: ( ruleClick EOF )
            // InternalSeleniumDSL.g:155:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSeleniumDSL.g:162:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:166:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalSeleniumDSL.g:167:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalSeleniumDSL.g:167:2: ( ( rule__Click__Group__0 ) )
            // InternalSeleniumDSL.g:168:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalSeleniumDSL.g:169:3: ( rule__Click__Group__0 )
            // InternalSeleniumDSL.g:169:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalSeleniumDSL.g:178:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:179:1: ( ruleFill EOF )
            // InternalSeleniumDSL.g:180:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalSeleniumDSL.g:187:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:191:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalSeleniumDSL.g:192:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalSeleniumDSL.g:192:2: ( ( rule__Fill__Group__0 ) )
            // InternalSeleniumDSL.g:193:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalSeleniumDSL.g:194:3: ( rule__Fill__Group__0 )
            // InternalSeleniumDSL.g:194:4: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalSeleniumDSL.g:203:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:204:1: ( ruleSelect EOF )
            // InternalSeleniumDSL.g:205:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSeleniumDSL.g:212:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:216:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSeleniumDSL.g:217:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSeleniumDSL.g:217:2: ( ( rule__Select__Group__0 ) )
            // InternalSeleniumDSL.g:218:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSeleniumDSL.g:219:3: ( rule__Select__Group__0 )
            // InternalSeleniumDSL.g:219:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleTick"
    // InternalSeleniumDSL.g:228:1: entryRuleTick : ruleTick EOF ;
    public final void entryRuleTick() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:229:1: ( ruleTick EOF )
            // InternalSeleniumDSL.g:230:1: ruleTick EOF
            {
             before(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_1);
            ruleTick();

            state._fsp--;

             after(grammarAccess.getTickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTick"


    // $ANTLR start "ruleTick"
    // InternalSeleniumDSL.g:237:1: ruleTick : ( ( rule__Tick__Group__0 ) ) ;
    public final void ruleTick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:241:2: ( ( ( rule__Tick__Group__0 ) ) )
            // InternalSeleniumDSL.g:242:2: ( ( rule__Tick__Group__0 ) )
            {
            // InternalSeleniumDSL.g:242:2: ( ( rule__Tick__Group__0 ) )
            // InternalSeleniumDSL.g:243:3: ( rule__Tick__Group__0 )
            {
             before(grammarAccess.getTickAccess().getGroup()); 
            // InternalSeleniumDSL.g:244:3: ( rule__Tick__Group__0 )
            // InternalSeleniumDSL.g:244:4: rule__Tick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTick"


    // $ANTLR start "entryRuleNavigate"
    // InternalSeleniumDSL.g:253:1: entryRuleNavigate : ruleNavigate EOF ;
    public final void entryRuleNavigate() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:254:1: ( ruleNavigate EOF )
            // InternalSeleniumDSL.g:255:1: ruleNavigate EOF
            {
             before(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigate();

            state._fsp--;

             after(grammarAccess.getNavigateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // InternalSeleniumDSL.g:262:1: ruleNavigate : ( ( rule__Navigate__Group__0 ) ) ;
    public final void ruleNavigate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:266:2: ( ( ( rule__Navigate__Group__0 ) ) )
            // InternalSeleniumDSL.g:267:2: ( ( rule__Navigate__Group__0 ) )
            {
            // InternalSeleniumDSL.g:267:2: ( ( rule__Navigate__Group__0 ) )
            // InternalSeleniumDSL.g:268:3: ( rule__Navigate__Group__0 )
            {
             before(grammarAccess.getNavigateAccess().getGroup()); 
            // InternalSeleniumDSL.g:269:3: ( rule__Navigate__Group__0 )
            // InternalSeleniumDSL.g:269:4: rule__Navigate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleRead"
    // InternalSeleniumDSL.g:278:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:279:1: ( ruleRead EOF )
            // InternalSeleniumDSL.g:280:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalSeleniumDSL.g:287:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:291:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalSeleniumDSL.g:292:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalSeleniumDSL.g:292:2: ( ( rule__Read__Group__0 ) )
            // InternalSeleniumDSL.g:293:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalSeleniumDSL.g:294:3: ( rule__Read__Group__0 )
            // InternalSeleniumDSL.g:294:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleAssert"
    // InternalSeleniumDSL.g:303:1: entryRuleAssert : ruleAssert EOF ;
    public final void entryRuleAssert() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:304:1: ( ruleAssert EOF )
            // InternalSeleniumDSL.g:305:1: ruleAssert EOF
            {
             before(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            ruleAssert();

            state._fsp--;

             after(grammarAccess.getAssertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalSeleniumDSL.g:312:1: ruleAssert : ( ( rule__Assert__Group__0 ) ) ;
    public final void ruleAssert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:316:2: ( ( ( rule__Assert__Group__0 ) ) )
            // InternalSeleniumDSL.g:317:2: ( ( rule__Assert__Group__0 ) )
            {
            // InternalSeleniumDSL.g:317:2: ( ( rule__Assert__Group__0 ) )
            // InternalSeleniumDSL.g:318:3: ( rule__Assert__Group__0 )
            {
             before(grammarAccess.getAssertAccess().getGroup()); 
            // InternalSeleniumDSL.g:319:3: ( rule__Assert__Group__0 )
            // InternalSeleniumDSL.g:319:4: rule__Assert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleCallProcedure"
    // InternalSeleniumDSL.g:328:1: entryRuleCallProcedure : ruleCallProcedure EOF ;
    public final void entryRuleCallProcedure() throws RecognitionException {
        try {
            // InternalSeleniumDSL.g:329:1: ( ruleCallProcedure EOF )
            // InternalSeleniumDSL.g:330:1: ruleCallProcedure EOF
            {
             before(grammarAccess.getCallProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleCallProcedure();

            state._fsp--;

             after(grammarAccess.getCallProcedureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCallProcedure"


    // $ANTLR start "ruleCallProcedure"
    // InternalSeleniumDSL.g:337:1: ruleCallProcedure : ( ( rule__CallProcedure__Group__0 ) ) ;
    public final void ruleCallProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:341:2: ( ( ( rule__CallProcedure__Group__0 ) ) )
            // InternalSeleniumDSL.g:342:2: ( ( rule__CallProcedure__Group__0 ) )
            {
            // InternalSeleniumDSL.g:342:2: ( ( rule__CallProcedure__Group__0 ) )
            // InternalSeleniumDSL.g:343:3: ( rule__CallProcedure__Group__0 )
            {
             before(grammarAccess.getCallProcedureAccess().getGroup()); 
            // InternalSeleniumDSL.g:344:3: ( rule__CallProcedure__Group__0 )
            // InternalSeleniumDSL.g:344:4: rule__CallProcedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallProcedure"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalSeleniumDSL.g:352:1: rule__Instruction__Alternatives : ( ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleTick ) | ( ruleNavigate ) | ( ruleAssert ) | ( ruleRead ) | ( ruleCallProcedure ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:356:1: ( ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleTick ) | ( ruleNavigate ) | ( ruleAssert ) | ( ruleRead ) | ( ruleCallProcedure ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSeleniumDSL.g:357:2: ( ruleClick )
                    {
                    // InternalSeleniumDSL.g:357:2: ( ruleClick )
                    // InternalSeleniumDSL.g:358:3: ruleClick
                    {
                     before(grammarAccess.getInstructionAccess().getClickParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getClickParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:363:2: ( ruleFill )
                    {
                    // InternalSeleniumDSL.g:363:2: ( ruleFill )
                    // InternalSeleniumDSL.g:364:3: ruleFill
                    {
                     before(grammarAccess.getInstructionAccess().getFillParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFillParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:369:2: ( ruleSelect )
                    {
                    // InternalSeleniumDSL.g:369:2: ( ruleSelect )
                    // InternalSeleniumDSL.g:370:3: ruleSelect
                    {
                     before(grammarAccess.getInstructionAccess().getSelectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSelectParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDSL.g:375:2: ( ruleTick )
                    {
                    // InternalSeleniumDSL.g:375:2: ( ruleTick )
                    // InternalSeleniumDSL.g:376:3: ruleTick
                    {
                     before(grammarAccess.getInstructionAccess().getTickParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTick();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getTickParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSeleniumDSL.g:381:2: ( ruleNavigate )
                    {
                    // InternalSeleniumDSL.g:381:2: ( ruleNavigate )
                    // InternalSeleniumDSL.g:382:3: ruleNavigate
                    {
                     before(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigate();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSeleniumDSL.g:387:2: ( ruleAssert )
                    {
                    // InternalSeleniumDSL.g:387:2: ( ruleAssert )
                    // InternalSeleniumDSL.g:388:3: ruleAssert
                    {
                     before(grammarAccess.getInstructionAccess().getAssertParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAssert();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAssertParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSeleniumDSL.g:393:2: ( ruleRead )
                    {
                    // InternalSeleniumDSL.g:393:2: ( ruleRead )
                    // InternalSeleniumDSL.g:394:3: ruleRead
                    {
                     before(grammarAccess.getInstructionAccess().getReadParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getReadParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSeleniumDSL.g:399:2: ( ruleCallProcedure )
                    {
                    // InternalSeleniumDSL.g:399:2: ( ruleCallProcedure )
                    // InternalSeleniumDSL.g:400:3: ruleCallProcedure
                    {
                     before(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCallProcedure();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Click__TypeAlternatives_1_0"
    // InternalSeleniumDSL.g:409:1: rule__Click__TypeAlternatives_1_0 : ( ( 'input' ) | ( 'link' ) | ( 'name' ) | ( 'xpath' ) );
    public final void rule__Click__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:413:1: ( ( 'input' ) | ( 'link' ) | ( 'name' ) | ( 'xpath' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSeleniumDSL.g:414:2: ( 'input' )
                    {
                    // InternalSeleniumDSL.g:414:2: ( 'input' )
                    // InternalSeleniumDSL.g:415:3: 'input'
                    {
                     before(grammarAccess.getClickAccess().getTypeInputKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getTypeInputKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:420:2: ( 'link' )
                    {
                    // InternalSeleniumDSL.g:420:2: ( 'link' )
                    // InternalSeleniumDSL.g:421:3: 'link'
                    {
                     before(grammarAccess.getClickAccess().getTypeLinkKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getTypeLinkKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:426:2: ( 'name' )
                    {
                    // InternalSeleniumDSL.g:426:2: ( 'name' )
                    // InternalSeleniumDSL.g:427:3: 'name'
                    {
                     before(grammarAccess.getClickAccess().getTypeNameKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getTypeNameKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSeleniumDSL.g:432:2: ( 'xpath' )
                    {
                    // InternalSeleniumDSL.g:432:2: ( 'xpath' )
                    // InternalSeleniumDSL.g:433:3: 'xpath'
                    {
                     before(grammarAccess.getClickAccess().getTypeXpathKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getTypeXpathKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__TypeAlternatives_1_0"


    // $ANTLR start "rule__Fill__ValueAlternatives_2_0"
    // InternalSeleniumDSL.g:442:1: rule__Fill__ValueAlternatives_2_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Fill__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:446:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_IDENTIFIER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumDSL.g:447:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:447:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:448:3: RULE_STRING
                    {
                     before(grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:453:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:453:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:454:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ValueAlternatives_2_0"


    // $ANTLR start "rule__Select__ValueAlternatives_2_0"
    // InternalSeleniumDSL.g:463:1: rule__Select__ValueAlternatives_2_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Select__ValueAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:467:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_IDENTIFIER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSeleniumDSL.g:468:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:468:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:469:3: RULE_STRING
                    {
                     before(grammarAccess.getSelectAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSelectAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:474:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:474:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:475:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getSelectAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getSelectAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValueAlternatives_2_0"


    // $ANTLR start "rule__Navigate__UrlAlternatives_1_0"
    // InternalSeleniumDSL.g:484:1: rule__Navigate__UrlAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Navigate__UrlAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:488:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_IDENTIFIER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSeleniumDSL.g:489:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:489:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:490:3: RULE_STRING
                    {
                     before(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:495:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:495:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:496:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getNavigateAccess().getUrlIDENTIFIERTerminalRuleCall_1_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getNavigateAccess().getUrlIDENTIFIERTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__UrlAlternatives_1_0"


    // $ANTLR start "rule__Assert__Alternatives_1"
    // InternalSeleniumDSL.g:505:1: rule__Assert__Alternatives_1 : ( ( ( rule__Assert__Group_1_0__0 ) ) | ( ( rule__Assert__Group_1_1__0 ) ) | ( ( rule__Assert__Group_1_2__0 ) ) );
    public final void rule__Assert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:509:1: ( ( ( rule__Assert__Group_1_0__0 ) ) | ( ( rule__Assert__Group_1_1__0 ) ) | ( ( rule__Assert__Group_1_2__0 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt6=2;
                    }
                    break;
                case 31:
                    {
                    alt6=1;
                    }
                    break;
                case 33:
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSeleniumDSL.g:510:2: ( ( rule__Assert__Group_1_0__0 ) )
                    {
                    // InternalSeleniumDSL.g:510:2: ( ( rule__Assert__Group_1_0__0 ) )
                    // InternalSeleniumDSL.g:511:3: ( rule__Assert__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssertAccess().getGroup_1_0()); 
                    // InternalSeleniumDSL.g:512:3: ( rule__Assert__Group_1_0__0 )
                    // InternalSeleniumDSL.g:512:4: rule__Assert__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assert__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:516:2: ( ( rule__Assert__Group_1_1__0 ) )
                    {
                    // InternalSeleniumDSL.g:516:2: ( ( rule__Assert__Group_1_1__0 ) )
                    // InternalSeleniumDSL.g:517:3: ( rule__Assert__Group_1_1__0 )
                    {
                     before(grammarAccess.getAssertAccess().getGroup_1_1()); 
                    // InternalSeleniumDSL.g:518:3: ( rule__Assert__Group_1_1__0 )
                    // InternalSeleniumDSL.g:518:4: rule__Assert__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assert__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:522:2: ( ( rule__Assert__Group_1_2__0 ) )
                    {
                    // InternalSeleniumDSL.g:522:2: ( ( rule__Assert__Group_1_2__0 ) )
                    // InternalSeleniumDSL.g:523:3: ( rule__Assert__Group_1_2__0 )
                    {
                     before(grammarAccess.getAssertAccess().getGroup_1_2()); 
                    // InternalSeleniumDSL.g:524:3: ( rule__Assert__Group_1_2__0 )
                    // InternalSeleniumDSL.g:524:4: rule__Assert__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assert__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssertAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Alternatives_1"


    // $ANTLR start "rule__Assert__ValueAlternatives_1_0_2_0"
    // InternalSeleniumDSL.g:532:1: rule__Assert__ValueAlternatives_1_0_2_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Assert__ValueAlternatives_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:536:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_IDENTIFIER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDSL.g:537:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:537:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:538:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:543:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:543:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:544:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_0_2_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_0_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__ValueAlternatives_1_0_2_0"


    // $ANTLR start "rule__Assert__ValueAlternatives_1_1_2_0"
    // InternalSeleniumDSL.g:553:1: rule__Assert__ValueAlternatives_1_1_2_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Assert__ValueAlternatives_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:557:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_IDENTIFIER) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDSL.g:558:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:558:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:559:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_1_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:564:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:564:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:565:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_1_2_0_1()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__ValueAlternatives_1_1_2_0"


    // $ANTLR start "rule__CallProcedure__ParametersAlternatives_1_1_0_0"
    // InternalSeleniumDSL.g:574:1: rule__CallProcedure__ParametersAlternatives_1_1_0_0 : ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) );
    public final void rule__CallProcedure__ParametersAlternatives_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:578:1: ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDSL.g:579:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:579:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:580:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:585:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:585:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:586:3: RULE_STRING
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__ParametersAlternatives_1_1_0_0"


    // $ANTLR start "rule__CallProcedure__ParametersAlternatives_1_1_1_1_0"
    // InternalSeleniumDSL.g:595:1: rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 : ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) );
    public final void rule__CallProcedure__ParametersAlternatives_1_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:599:1: ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_IDENTIFIER) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDSL.g:600:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:600:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:601:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:606:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:606:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:607:3: RULE_STRING
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_1_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__ParametersAlternatives_1_1_1_1_0"


    // $ANTLR start "rule__SeleniumTest__Group__0"
    // InternalSeleniumDSL.g:616:1: rule__SeleniumTest__Group__0 : rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1 ;
    public final void rule__SeleniumTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:620:1: ( rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1 )
            // InternalSeleniumDSL.g:621:2: rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SeleniumTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SeleniumTest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__Group__0"


    // $ANTLR start "rule__SeleniumTest__Group__0__Impl"
    // InternalSeleniumDSL.g:628:1: rule__SeleniumTest__Group__0__Impl : ( ( rule__SeleniumTest__ProceduresAssignment_0 )* ) ;
    public final void rule__SeleniumTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:632:1: ( ( ( rule__SeleniumTest__ProceduresAssignment_0 )* ) )
            // InternalSeleniumDSL.g:633:1: ( ( rule__SeleniumTest__ProceduresAssignment_0 )* )
            {
            // InternalSeleniumDSL.g:633:1: ( ( rule__SeleniumTest__ProceduresAssignment_0 )* )
            // InternalSeleniumDSL.g:634:2: ( rule__SeleniumTest__ProceduresAssignment_0 )*
            {
             before(grammarAccess.getSeleniumTestAccess().getProceduresAssignment_0()); 
            // InternalSeleniumDSL.g:635:2: ( rule__SeleniumTest__ProceduresAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_IDENTIFIER) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumDSL.g:635:3: rule__SeleniumTest__ProceduresAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__SeleniumTest__ProceduresAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSeleniumTestAccess().getProceduresAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__Group__0__Impl"


    // $ANTLR start "rule__SeleniumTest__Group__1"
    // InternalSeleniumDSL.g:643:1: rule__SeleniumTest__Group__1 : rule__SeleniumTest__Group__1__Impl ;
    public final void rule__SeleniumTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:647:1: ( rule__SeleniumTest__Group__1__Impl )
            // InternalSeleniumDSL.g:648:2: rule__SeleniumTest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SeleniumTest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__Group__1"


    // $ANTLR start "rule__SeleniumTest__Group__1__Impl"
    // InternalSeleniumDSL.g:654:1: rule__SeleniumTest__Group__1__Impl : ( ( rule__SeleniumTest__MainAssignment_1 ) ) ;
    public final void rule__SeleniumTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:658:1: ( ( ( rule__SeleniumTest__MainAssignment_1 ) ) )
            // InternalSeleniumDSL.g:659:1: ( ( rule__SeleniumTest__MainAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:659:1: ( ( rule__SeleniumTest__MainAssignment_1 ) )
            // InternalSeleniumDSL.g:660:2: ( rule__SeleniumTest__MainAssignment_1 )
            {
             before(grammarAccess.getSeleniumTestAccess().getMainAssignment_1()); 
            // InternalSeleniumDSL.g:661:2: ( rule__SeleniumTest__MainAssignment_1 )
            // InternalSeleniumDSL.g:661:3: rule__SeleniumTest__MainAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SeleniumTest__MainAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSeleniumTestAccess().getMainAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalSeleniumDSL.g:670:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:674:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalSeleniumDSL.g:675:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // InternalSeleniumDSL.g:682:1: rule__Procedure__Group__0__Impl : ( 'def' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:686:1: ( ( 'def' ) )
            // InternalSeleniumDSL.g:687:1: ( 'def' )
            {
            // InternalSeleniumDSL.g:687:1: ( 'def' )
            // InternalSeleniumDSL.g:688:2: 'def'
            {
             before(grammarAccess.getProcedureAccess().getDefKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // InternalSeleniumDSL.g:697:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:701:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalSeleniumDSL.g:702:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // InternalSeleniumDSL.g:709:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:713:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:714:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:714:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:715:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:716:2: ( rule__Procedure__NameAssignment_1 )
            // InternalSeleniumDSL.g:716:3: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // InternalSeleniumDSL.g:724:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:728:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalSeleniumDSL.g:729:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // InternalSeleniumDSL.g:736:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Group_2__0 )? ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:740:1: ( ( ( rule__Procedure__Group_2__0 )? ) )
            // InternalSeleniumDSL.g:741:1: ( ( rule__Procedure__Group_2__0 )? )
            {
            // InternalSeleniumDSL.g:741:1: ( ( rule__Procedure__Group_2__0 )? )
            // InternalSeleniumDSL.g:742:2: ( rule__Procedure__Group_2__0 )?
            {
             before(grammarAccess.getProcedureAccess().getGroup_2()); 
            // InternalSeleniumDSL.g:743:2: ( rule__Procedure__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDSL.g:743:3: rule__Procedure__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // InternalSeleniumDSL.g:751:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:755:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalSeleniumDSL.g:756:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // InternalSeleniumDSL.g:763:1: rule__Procedure__Group__3__Impl : ( '{' ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:767:1: ( ( '{' ) )
            // InternalSeleniumDSL.g:768:1: ( '{' )
            {
            // InternalSeleniumDSL.g:768:1: ( '{' )
            // InternalSeleniumDSL.g:769:2: '{'
            {
             before(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // InternalSeleniumDSL.g:778:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:782:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalSeleniumDSL.g:783:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // InternalSeleniumDSL.g:790:1: rule__Procedure__Group__4__Impl : ( ( rule__Procedure__InstructionsAssignment_4 )* ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:794:1: ( ( ( rule__Procedure__InstructionsAssignment_4 )* ) )
            // InternalSeleniumDSL.g:795:1: ( ( rule__Procedure__InstructionsAssignment_4 )* )
            {
            // InternalSeleniumDSL.g:795:1: ( ( rule__Procedure__InstructionsAssignment_4 )* )
            // InternalSeleniumDSL.g:796:2: ( rule__Procedure__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getProcedureAccess().getInstructionsAssignment_4()); 
            // InternalSeleniumDSL.g:797:2: ( rule__Procedure__InstructionsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_IDENTIFIER||(LA13_0>=23 && LA13_0<=27)||LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeleniumDSL.g:797:3: rule__Procedure__InstructionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Procedure__InstructionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getInstructionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__Procedure__Group__5"
    // InternalSeleniumDSL.g:805:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:809:1: ( rule__Procedure__Group__5__Impl )
            // InternalSeleniumDSL.g:810:2: rule__Procedure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__5"


    // $ANTLR start "rule__Procedure__Group__5__Impl"
    // InternalSeleniumDSL.g:816:1: rule__Procedure__Group__5__Impl : ( '}' ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:820:1: ( ( '}' ) )
            // InternalSeleniumDSL.g:821:1: ( '}' )
            {
            // InternalSeleniumDSL.g:821:1: ( '}' )
            // InternalSeleniumDSL.g:822:2: '}'
            {
             before(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__5__Impl"


    // $ANTLR start "rule__Procedure__Group_2__0"
    // InternalSeleniumDSL.g:832:1: rule__Procedure__Group_2__0 : rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1 ;
    public final void rule__Procedure__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:836:1: ( rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1 )
            // InternalSeleniumDSL.g:837:2: rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__0"


    // $ANTLR start "rule__Procedure__Group_2__0__Impl"
    // InternalSeleniumDSL.g:844:1: rule__Procedure__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Procedure__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:848:1: ( ( '(' ) )
            // InternalSeleniumDSL.g:849:1: ( '(' )
            {
            // InternalSeleniumDSL.g:849:1: ( '(' )
            // InternalSeleniumDSL.g:850:2: '('
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2__1"
    // InternalSeleniumDSL.g:859:1: rule__Procedure__Group_2__1 : rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2 ;
    public final void rule__Procedure__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:863:1: ( rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2 )
            // InternalSeleniumDSL.g:864:2: rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__1"


    // $ANTLR start "rule__Procedure__Group_2__1__Impl"
    // InternalSeleniumDSL.g:871:1: rule__Procedure__Group_2__1__Impl : ( ( rule__Procedure__Group_2_1__0 ) ) ;
    public final void rule__Procedure__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:875:1: ( ( ( rule__Procedure__Group_2_1__0 ) ) )
            // InternalSeleniumDSL.g:876:1: ( ( rule__Procedure__Group_2_1__0 ) )
            {
            // InternalSeleniumDSL.g:876:1: ( ( rule__Procedure__Group_2_1__0 ) )
            // InternalSeleniumDSL.g:877:2: ( rule__Procedure__Group_2_1__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup_2_1()); 
            // InternalSeleniumDSL.g:878:2: ( rule__Procedure__Group_2_1__0 )
            // InternalSeleniumDSL.g:878:3: rule__Procedure__Group_2_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__1__Impl"


    // $ANTLR start "rule__Procedure__Group_2__2"
    // InternalSeleniumDSL.g:886:1: rule__Procedure__Group_2__2 : rule__Procedure__Group_2__2__Impl ;
    public final void rule__Procedure__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:890:1: ( rule__Procedure__Group_2__2__Impl )
            // InternalSeleniumDSL.g:891:2: rule__Procedure__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__2"


    // $ANTLR start "rule__Procedure__Group_2__2__Impl"
    // InternalSeleniumDSL.g:897:1: rule__Procedure__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Procedure__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:901:1: ( ( ')' ) )
            // InternalSeleniumDSL.g:902:1: ( ')' )
            {
            // InternalSeleniumDSL.g:902:1: ( ')' )
            // InternalSeleniumDSL.g:903:2: ')'
            {
             before(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2__2__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1__0"
    // InternalSeleniumDSL.g:913:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:917:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // InternalSeleniumDSL.g:918:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__0"


    // $ANTLR start "rule__Procedure__Group_2_1__0__Impl"
    // InternalSeleniumDSL.g:925:1: rule__Procedure__Group_2_1__0__Impl : ( ( rule__Procedure__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:929:1: ( ( ( rule__Procedure__ParametersAssignment_2_1_0 ) ) )
            // InternalSeleniumDSL.g:930:1: ( ( rule__Procedure__ParametersAssignment_2_1_0 ) )
            {
            // InternalSeleniumDSL.g:930:1: ( ( rule__Procedure__ParametersAssignment_2_1_0 ) )
            // InternalSeleniumDSL.g:931:2: ( rule__Procedure__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_0()); 
            // InternalSeleniumDSL.g:932:2: ( rule__Procedure__ParametersAssignment_2_1_0 )
            // InternalSeleniumDSL.g:932:3: rule__Procedure__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1__1"
    // InternalSeleniumDSL.g:940:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:944:1: ( rule__Procedure__Group_2_1__1__Impl )
            // InternalSeleniumDSL.g:945:2: rule__Procedure__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__1"


    // $ANTLR start "rule__Procedure__Group_2_1__1__Impl"
    // InternalSeleniumDSL.g:951:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__Group_2_1_1__0 )* ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:955:1: ( ( ( rule__Procedure__Group_2_1_1__0 )* ) )
            // InternalSeleniumDSL.g:956:1: ( ( rule__Procedure__Group_2_1_1__0 )* )
            {
            // InternalSeleniumDSL.g:956:1: ( ( rule__Procedure__Group_2_1_1__0 )* )
            // InternalSeleniumDSL.g:957:2: ( rule__Procedure__Group_2_1_1__0 )*
            {
             before(grammarAccess.getProcedureAccess().getGroup_2_1_1()); 
            // InternalSeleniumDSL.g:958:2: ( rule__Procedure__Group_2_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeleniumDSL.g:958:3: rule__Procedure__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Procedure__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1__1__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1_1__0"
    // InternalSeleniumDSL.g:967:1: rule__Procedure__Group_2_1_1__0 : rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1 ;
    public final void rule__Procedure__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:971:1: ( rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1 )
            // InternalSeleniumDSL.g:972:2: rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1_1__0"


    // $ANTLR start "rule__Procedure__Group_2_1_1__0__Impl"
    // InternalSeleniumDSL.g:979:1: rule__Procedure__Group_2_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Procedure__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:983:1: ( ( RULE_COMMA ) )
            // InternalSeleniumDSL.g:984:1: ( RULE_COMMA )
            {
            // InternalSeleniumDSL.g:984:1: ( RULE_COMMA )
            // InternalSeleniumDSL.g:985:2: RULE_COMMA
            {
             before(grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_2_1_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Procedure__Group_2_1_1__1"
    // InternalSeleniumDSL.g:994:1: rule__Procedure__Group_2_1_1__1 : rule__Procedure__Group_2_1_1__1__Impl ;
    public final void rule__Procedure__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:998:1: ( rule__Procedure__Group_2_1_1__1__Impl )
            // InternalSeleniumDSL.g:999:2: rule__Procedure__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1_1__1"


    // $ANTLR start "rule__Procedure__Group_2_1_1__1__Impl"
    // InternalSeleniumDSL.g:1005:1: rule__Procedure__Group_2_1_1__1__Impl : ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1009:1: ( ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) ) )
            // InternalSeleniumDSL.g:1010:1: ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalSeleniumDSL.g:1010:1: ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) )
            // InternalSeleniumDSL.g:1011:2: ( rule__Procedure__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_1_1()); 
            // InternalSeleniumDSL.g:1012:2: ( rule__Procedure__ParametersAssignment_2_1_1_1 )
            // InternalSeleniumDSL.g:1012:3: rule__Procedure__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__MainProcedure__Group__0"
    // InternalSeleniumDSL.g:1021:1: rule__MainProcedure__Group__0 : rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1 ;
    public final void rule__MainProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1025:1: ( rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1 )
            // InternalSeleniumDSL.g:1026:2: rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MainProcedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__0"


    // $ANTLR start "rule__MainProcedure__Group__0__Impl"
    // InternalSeleniumDSL.g:1033:1: rule__MainProcedure__Group__0__Impl : ( () ) ;
    public final void rule__MainProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1037:1: ( ( () ) )
            // InternalSeleniumDSL.g:1038:1: ( () )
            {
            // InternalSeleniumDSL.g:1038:1: ( () )
            // InternalSeleniumDSL.g:1039:2: ()
            {
             before(grammarAccess.getMainProcedureAccess().getMainProcedureAction_0()); 
            // InternalSeleniumDSL.g:1040:2: ()
            // InternalSeleniumDSL.g:1040:3: 
            {
            }

             after(grammarAccess.getMainProcedureAccess().getMainProcedureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__0__Impl"


    // $ANTLR start "rule__MainProcedure__Group__1"
    // InternalSeleniumDSL.g:1048:1: rule__MainProcedure__Group__1 : rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2 ;
    public final void rule__MainProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1052:1: ( rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2 )
            // InternalSeleniumDSL.g:1053:2: rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MainProcedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__1"


    // $ANTLR start "rule__MainProcedure__Group__1__Impl"
    // InternalSeleniumDSL.g:1060:1: rule__MainProcedure__Group__1__Impl : ( ( ( 'def' ) ) ( ( 'def' )* ) ) ;
    public final void rule__MainProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1064:1: ( ( ( ( 'def' ) ) ( ( 'def' )* ) ) )
            // InternalSeleniumDSL.g:1065:1: ( ( ( 'def' ) ) ( ( 'def' )* ) )
            {
            // InternalSeleniumDSL.g:1065:1: ( ( ( 'def' ) ) ( ( 'def' )* ) )
            // InternalSeleniumDSL.g:1066:2: ( ( 'def' ) ) ( ( 'def' )* )
            {
            // InternalSeleniumDSL.g:1066:2: ( ( 'def' ) )
            // InternalSeleniumDSL.g:1067:3: ( 'def' )
            {
             before(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 
            // InternalSeleniumDSL.g:1068:3: ( 'def' )
            // InternalSeleniumDSL.g:1068:4: 'def'
            {
            match(input,17,FOLLOW_4); 

            }

             after(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 

            }

            // InternalSeleniumDSL.g:1071:2: ( ( 'def' )* )
            // InternalSeleniumDSL.g:1072:3: ( 'def' )*
            {
             before(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 
            // InternalSeleniumDSL.g:1073:3: ( 'def' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1073:4: 'def'
            	    {
            	    match(input,17,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__1__Impl"


    // $ANTLR start "rule__MainProcedure__Group__2"
    // InternalSeleniumDSL.g:1082:1: rule__MainProcedure__Group__2 : rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3 ;
    public final void rule__MainProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1086:1: ( rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3 )
            // InternalSeleniumDSL.g:1087:2: rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MainProcedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__2"


    // $ANTLR start "rule__MainProcedure__Group__2__Impl"
    // InternalSeleniumDSL.g:1094:1: rule__MainProcedure__Group__2__Impl : ( ( ( 'main' ) ) ( ( 'main' )* ) ) ;
    public final void rule__MainProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1098:1: ( ( ( ( 'main' ) ) ( ( 'main' )* ) ) )
            // InternalSeleniumDSL.g:1099:1: ( ( ( 'main' ) ) ( ( 'main' )* ) )
            {
            // InternalSeleniumDSL.g:1099:1: ( ( ( 'main' ) ) ( ( 'main' )* ) )
            // InternalSeleniumDSL.g:1100:2: ( ( 'main' ) ) ( ( 'main' )* )
            {
            // InternalSeleniumDSL.g:1100:2: ( ( 'main' ) )
            // InternalSeleniumDSL.g:1101:3: ( 'main' )
            {
             before(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 
            // InternalSeleniumDSL.g:1102:3: ( 'main' )
            // InternalSeleniumDSL.g:1102:4: 'main'
            {
            match(input,22,FOLLOW_14); 

            }

             after(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 

            }

            // InternalSeleniumDSL.g:1105:2: ( ( 'main' )* )
            // InternalSeleniumDSL.g:1106:3: ( 'main' )*
            {
             before(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 
            // InternalSeleniumDSL.g:1107:3: ( 'main' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1107:4: 'main'
            	    {
            	    match(input,22,FOLLOW_14); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__2__Impl"


    // $ANTLR start "rule__MainProcedure__Group__3"
    // InternalSeleniumDSL.g:1116:1: rule__MainProcedure__Group__3 : rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4 ;
    public final void rule__MainProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1120:1: ( rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4 )
            // InternalSeleniumDSL.g:1121:2: rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MainProcedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__3"


    // $ANTLR start "rule__MainProcedure__Group__3__Impl"
    // InternalSeleniumDSL.g:1128:1: rule__MainProcedure__Group__3__Impl : ( '{' ) ;
    public final void rule__MainProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1132:1: ( ( '{' ) )
            // InternalSeleniumDSL.g:1133:1: ( '{' )
            {
            // InternalSeleniumDSL.g:1133:1: ( '{' )
            // InternalSeleniumDSL.g:1134:2: '{'
            {
             before(grammarAccess.getMainProcedureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMainProcedureAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__3__Impl"


    // $ANTLR start "rule__MainProcedure__Group__4"
    // InternalSeleniumDSL.g:1143:1: rule__MainProcedure__Group__4 : rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5 ;
    public final void rule__MainProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1147:1: ( rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5 )
            // InternalSeleniumDSL.g:1148:2: rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MainProcedure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__4"


    // $ANTLR start "rule__MainProcedure__Group__4__Impl"
    // InternalSeleniumDSL.g:1155:1: rule__MainProcedure__Group__4__Impl : ( ( rule__MainProcedure__InstructionsAssignment_4 )* ) ;
    public final void rule__MainProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1159:1: ( ( ( rule__MainProcedure__InstructionsAssignment_4 )* ) )
            // InternalSeleniumDSL.g:1160:1: ( ( rule__MainProcedure__InstructionsAssignment_4 )* )
            {
            // InternalSeleniumDSL.g:1160:1: ( ( rule__MainProcedure__InstructionsAssignment_4 )* )
            // InternalSeleniumDSL.g:1161:2: ( rule__MainProcedure__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getMainProcedureAccess().getInstructionsAssignment_4()); 
            // InternalSeleniumDSL.g:1162:2: ( rule__MainProcedure__InstructionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_IDENTIFIER||(LA17_0>=23 && LA17_0<=27)||LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1162:3: rule__MainProcedure__InstructionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MainProcedure__InstructionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMainProcedureAccess().getInstructionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__4__Impl"


    // $ANTLR start "rule__MainProcedure__Group__5"
    // InternalSeleniumDSL.g:1170:1: rule__MainProcedure__Group__5 : rule__MainProcedure__Group__5__Impl ;
    public final void rule__MainProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1174:1: ( rule__MainProcedure__Group__5__Impl )
            // InternalSeleniumDSL.g:1175:2: rule__MainProcedure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainProcedure__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__5"


    // $ANTLR start "rule__MainProcedure__Group__5__Impl"
    // InternalSeleniumDSL.g:1181:1: rule__MainProcedure__Group__5__Impl : ( '}' ) ;
    public final void rule__MainProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1185:1: ( ( '}' ) )
            // InternalSeleniumDSL.g:1186:1: ( '}' )
            {
            // InternalSeleniumDSL.g:1186:1: ( '}' )
            // InternalSeleniumDSL.g:1187:2: '}'
            {
             before(grammarAccess.getMainProcedureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMainProcedureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__Group__5__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalSeleniumDSL.g:1197:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1201:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDSL.g:1202:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalSeleniumDSL.g:1209:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1213:1: ( ( 'click' ) )
            // InternalSeleniumDSL.g:1214:1: ( 'click' )
            {
            // InternalSeleniumDSL.g:1214:1: ( 'click' )
            // InternalSeleniumDSL.g:1215:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalSeleniumDSL.g:1224:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1228:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDSL.g:1229:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalSeleniumDSL.g:1236:1: rule__Click__Group__1__Impl : ( ( rule__Click__TypeAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1240:1: ( ( ( rule__Click__TypeAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1241:1: ( ( rule__Click__TypeAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1241:1: ( ( rule__Click__TypeAssignment_1 ) )
            // InternalSeleniumDSL.g:1242:2: ( rule__Click__TypeAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getTypeAssignment_1()); 
            // InternalSeleniumDSL.g:1243:2: ( rule__Click__TypeAssignment_1 )
            // InternalSeleniumDSL.g:1243:3: rule__Click__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalSeleniumDSL.g:1251:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1255:1: ( rule__Click__Group__2__Impl )
            // InternalSeleniumDSL.g:1256:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalSeleniumDSL.g:1262:1: rule__Click__Group__2__Impl : ( ( rule__Click__ValueAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1266:1: ( ( ( rule__Click__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1267:1: ( ( rule__Click__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1267:1: ( ( rule__Click__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1268:2: ( rule__Click__ValueAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1269:2: ( rule__Click__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1269:3: rule__Click__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // InternalSeleniumDSL.g:1278:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1282:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalSeleniumDSL.g:1283:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // InternalSeleniumDSL.g:1290:1: rule__Fill__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1294:1: ( ( 'fill' ) )
            // InternalSeleniumDSL.g:1295:1: ( 'fill' )
            {
            // InternalSeleniumDSL.g:1295:1: ( 'fill' )
            // InternalSeleniumDSL.g:1296:2: 'fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // InternalSeleniumDSL.g:1305:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1309:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalSeleniumDSL.g:1310:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // InternalSeleniumDSL.g:1317:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__NameAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1321:1: ( ( ( rule__Fill__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1322:1: ( ( rule__Fill__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1322:1: ( ( rule__Fill__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1323:2: ( rule__Fill__NameAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1324:2: ( rule__Fill__NameAssignment_1 )
            // InternalSeleniumDSL.g:1324:3: rule__Fill__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fill__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // InternalSeleniumDSL.g:1332:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1336:1: ( rule__Fill__Group__2__Impl )
            // InternalSeleniumDSL.g:1337:2: rule__Fill__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // InternalSeleniumDSL.g:1343:1: rule__Fill__Group__2__Impl : ( ( rule__Fill__ValueAssignment_2 ) ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1347:1: ( ( ( rule__Fill__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1348:1: ( ( rule__Fill__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1348:1: ( ( rule__Fill__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1349:2: ( rule__Fill__ValueAssignment_2 )
            {
             before(grammarAccess.getFillAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1350:2: ( rule__Fill__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1350:3: rule__Fill__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalSeleniumDSL.g:1359:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1363:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSeleniumDSL.g:1364:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalSeleniumDSL.g:1371:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1375:1: ( ( 'select' ) )
            // InternalSeleniumDSL.g:1376:1: ( 'select' )
            {
            // InternalSeleniumDSL.g:1376:1: ( 'select' )
            // InternalSeleniumDSL.g:1377:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalSeleniumDSL.g:1386:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1390:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSeleniumDSL.g:1391:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalSeleniumDSL.g:1398:1: rule__Select__Group__1__Impl : ( ( rule__Select__NameAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1402:1: ( ( ( rule__Select__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1403:1: ( ( rule__Select__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1403:1: ( ( rule__Select__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1404:2: ( rule__Select__NameAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1405:2: ( rule__Select__NameAssignment_1 )
            // InternalSeleniumDSL.g:1405:3: rule__Select__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalSeleniumDSL.g:1413:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1417:1: ( rule__Select__Group__2__Impl )
            // InternalSeleniumDSL.g:1418:2: rule__Select__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalSeleniumDSL.g:1424:1: rule__Select__Group__2__Impl : ( ( rule__Select__ValueAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1428:1: ( ( ( rule__Select__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1429:1: ( ( rule__Select__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1429:1: ( ( rule__Select__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1430:2: ( rule__Select__ValueAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1431:2: ( rule__Select__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1431:3: rule__Select__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Tick__Group__0"
    // InternalSeleniumDSL.g:1440:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1444:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // InternalSeleniumDSL.g:1445:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Tick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tick__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__0"


    // $ANTLR start "rule__Tick__Group__0__Impl"
    // InternalSeleniumDSL.g:1452:1: rule__Tick__Group__0__Impl : ( 'tick' ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1456:1: ( ( 'tick' ) )
            // InternalSeleniumDSL.g:1457:1: ( 'tick' )
            {
            // InternalSeleniumDSL.g:1457:1: ( 'tick' )
            // InternalSeleniumDSL.g:1458:2: 'tick'
            {
             before(grammarAccess.getTickAccess().getTickKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTickAccess().getTickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__0__Impl"


    // $ANTLR start "rule__Tick__Group__1"
    // InternalSeleniumDSL.g:1467:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1471:1: ( rule__Tick__Group__1__Impl )
            // InternalSeleniumDSL.g:1472:2: rule__Tick__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tick__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__1"


    // $ANTLR start "rule__Tick__Group__1__Impl"
    // InternalSeleniumDSL.g:1478:1: rule__Tick__Group__1__Impl : ( ( rule__Tick__NameAssignment_1 ) ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1482:1: ( ( ( rule__Tick__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1483:1: ( ( rule__Tick__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1483:1: ( ( rule__Tick__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1484:2: ( rule__Tick__NameAssignment_1 )
            {
             before(grammarAccess.getTickAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1485:2: ( rule__Tick__NameAssignment_1 )
            // InternalSeleniumDSL.g:1485:3: rule__Tick__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tick__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTickAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__Group__1__Impl"


    // $ANTLR start "rule__Navigate__Group__0"
    // InternalSeleniumDSL.g:1494:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1498:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalSeleniumDSL.g:1499:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Navigate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navigate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__0"


    // $ANTLR start "rule__Navigate__Group__0__Impl"
    // InternalSeleniumDSL.g:1506:1: rule__Navigate__Group__0__Impl : ( 'navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1510:1: ( ( 'navigate' ) )
            // InternalSeleniumDSL.g:1511:1: ( 'navigate' )
            {
            // InternalSeleniumDSL.g:1511:1: ( 'navigate' )
            // InternalSeleniumDSL.g:1512:2: 'navigate'
            {
             before(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__0__Impl"


    // $ANTLR start "rule__Navigate__Group__1"
    // InternalSeleniumDSL.g:1521:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1525:1: ( rule__Navigate__Group__1__Impl )
            // InternalSeleniumDSL.g:1526:2: rule__Navigate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__1"


    // $ANTLR start "rule__Navigate__Group__1__Impl"
    // InternalSeleniumDSL.g:1532:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1536:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1537:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1537:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalSeleniumDSL.g:1538:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalSeleniumDSL.g:1539:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalSeleniumDSL.g:1539:3: rule__Navigate__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalSeleniumDSL.g:1548:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1552:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalSeleniumDSL.g:1553:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalSeleniumDSL.g:1560:1: rule__Read__Group__0__Impl : ( ( rule__Read__VariableAssignment_0 ) ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1564:1: ( ( ( rule__Read__VariableAssignment_0 ) ) )
            // InternalSeleniumDSL.g:1565:1: ( ( rule__Read__VariableAssignment_0 ) )
            {
            // InternalSeleniumDSL.g:1565:1: ( ( rule__Read__VariableAssignment_0 ) )
            // InternalSeleniumDSL.g:1566:2: ( rule__Read__VariableAssignment_0 )
            {
             before(grammarAccess.getReadAccess().getVariableAssignment_0()); 
            // InternalSeleniumDSL.g:1567:2: ( rule__Read__VariableAssignment_0 )
            // InternalSeleniumDSL.g:1567:3: rule__Read__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Read__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalSeleniumDSL.g:1575:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1579:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalSeleniumDSL.g:1580:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalSeleniumDSL.g:1587:1: rule__Read__Group__1__Impl : ( '=' ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1591:1: ( ( '=' ) )
            // InternalSeleniumDSL.g:1592:1: ( '=' )
            {
            // InternalSeleniumDSL.g:1592:1: ( '=' )
            // InternalSeleniumDSL.g:1593:2: '='
            {
             before(grammarAccess.getReadAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalSeleniumDSL.g:1602:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1606:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalSeleniumDSL.g:1607:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Read__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalSeleniumDSL.g:1614:1: rule__Read__Group__2__Impl : ( 'read' ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1618:1: ( ( 'read' ) )
            // InternalSeleniumDSL.g:1619:1: ( 'read' )
            {
            // InternalSeleniumDSL.g:1619:1: ( 'read' )
            // InternalSeleniumDSL.g:1620:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__3"
    // InternalSeleniumDSL.g:1629:1: rule__Read__Group__3 : rule__Read__Group__3__Impl ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1633:1: ( rule__Read__Group__3__Impl )
            // InternalSeleniumDSL.g:1634:2: rule__Read__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3"


    // $ANTLR start "rule__Read__Group__3__Impl"
    // InternalSeleniumDSL.g:1640:1: rule__Read__Group__3__Impl : ( ( rule__Read__NameAssignment_3 ) ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1644:1: ( ( ( rule__Read__NameAssignment_3 ) ) )
            // InternalSeleniumDSL.g:1645:1: ( ( rule__Read__NameAssignment_3 ) )
            {
            // InternalSeleniumDSL.g:1645:1: ( ( rule__Read__NameAssignment_3 ) )
            // InternalSeleniumDSL.g:1646:2: ( rule__Read__NameAssignment_3 )
            {
             before(grammarAccess.getReadAccess().getNameAssignment_3()); 
            // InternalSeleniumDSL.g:1647:2: ( rule__Read__NameAssignment_3 )
            // InternalSeleniumDSL.g:1647:3: rule__Read__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Read__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3__Impl"


    // $ANTLR start "rule__Assert__Group__0"
    // InternalSeleniumDSL.g:1656:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1660:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // InternalSeleniumDSL.g:1661:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Assert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__0"


    // $ANTLR start "rule__Assert__Group__0__Impl"
    // InternalSeleniumDSL.g:1668:1: rule__Assert__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1672:1: ( ( 'assert' ) )
            // InternalSeleniumDSL.g:1673:1: ( 'assert' )
            {
            // InternalSeleniumDSL.g:1673:1: ( 'assert' )
            // InternalSeleniumDSL.g:1674:2: 'assert'
            {
             before(grammarAccess.getAssertAccess().getAssertKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getAssertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__0__Impl"


    // $ANTLR start "rule__Assert__Group__1"
    // InternalSeleniumDSL.g:1683:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1687:1: ( rule__Assert__Group__1__Impl )
            // InternalSeleniumDSL.g:1688:2: rule__Assert__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__1"


    // $ANTLR start "rule__Assert__Group__1__Impl"
    // InternalSeleniumDSL.g:1694:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__Alternatives_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1698:1: ( ( ( rule__Assert__Alternatives_1 ) ) )
            // InternalSeleniumDSL.g:1699:1: ( ( rule__Assert__Alternatives_1 ) )
            {
            // InternalSeleniumDSL.g:1699:1: ( ( rule__Assert__Alternatives_1 ) )
            // InternalSeleniumDSL.g:1700:2: ( rule__Assert__Alternatives_1 )
            {
             before(grammarAccess.getAssertAccess().getAlternatives_1()); 
            // InternalSeleniumDSL.g:1701:2: ( rule__Assert__Alternatives_1 )
            // InternalSeleniumDSL.g:1701:3: rule__Assert__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group__1__Impl"


    // $ANTLR start "rule__Assert__Group_1_0__0"
    // InternalSeleniumDSL.g:1710:1: rule__Assert__Group_1_0__0 : rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1 ;
    public final void rule__Assert__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1714:1: ( rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1 )
            // InternalSeleniumDSL.g:1715:2: rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Assert__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__0"


    // $ANTLR start "rule__Assert__Group_1_0__0__Impl"
    // InternalSeleniumDSL.g:1722:1: rule__Assert__Group_1_0__0__Impl : ( ( rule__Assert__SearchAssignment_1_0_0 ) ) ;
    public final void rule__Assert__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1726:1: ( ( ( rule__Assert__SearchAssignment_1_0_0 ) ) )
            // InternalSeleniumDSL.g:1727:1: ( ( rule__Assert__SearchAssignment_1_0_0 ) )
            {
            // InternalSeleniumDSL.g:1727:1: ( ( rule__Assert__SearchAssignment_1_0_0 ) )
            // InternalSeleniumDSL.g:1728:2: ( rule__Assert__SearchAssignment_1_0_0 )
            {
             before(grammarAccess.getAssertAccess().getSearchAssignment_1_0_0()); 
            // InternalSeleniumDSL.g:1729:2: ( rule__Assert__SearchAssignment_1_0_0 )
            // InternalSeleniumDSL.g:1729:3: rule__Assert__SearchAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__SearchAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getSearchAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__0__Impl"


    // $ANTLR start "rule__Assert__Group_1_0__1"
    // InternalSeleniumDSL.g:1737:1: rule__Assert__Group_1_0__1 : rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2 ;
    public final void rule__Assert__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1741:1: ( rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2 )
            // InternalSeleniumDSL.g:1742:2: rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Assert__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__1"


    // $ANTLR start "rule__Assert__Group_1_0__1__Impl"
    // InternalSeleniumDSL.g:1749:1: rule__Assert__Group_1_0__1__Impl : ( 'contains' ) ;
    public final void rule__Assert__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1753:1: ( ( 'contains' ) )
            // InternalSeleniumDSL.g:1754:1: ( 'contains' )
            {
            // InternalSeleniumDSL.g:1754:1: ( 'contains' )
            // InternalSeleniumDSL.g:1755:2: 'contains'
            {
             before(grammarAccess.getAssertAccess().getContainsKeyword_1_0_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getContainsKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__1__Impl"


    // $ANTLR start "rule__Assert__Group_1_0__2"
    // InternalSeleniumDSL.g:1764:1: rule__Assert__Group_1_0__2 : rule__Assert__Group_1_0__2__Impl ;
    public final void rule__Assert__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1768:1: ( rule__Assert__Group_1_0__2__Impl )
            // InternalSeleniumDSL.g:1769:2: rule__Assert__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__2"


    // $ANTLR start "rule__Assert__Group_1_0__2__Impl"
    // InternalSeleniumDSL.g:1775:1: rule__Assert__Group_1_0__2__Impl : ( ( rule__Assert__ValueAssignment_1_0_2 ) ) ;
    public final void rule__Assert__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1779:1: ( ( ( rule__Assert__ValueAssignment_1_0_2 ) ) )
            // InternalSeleniumDSL.g:1780:1: ( ( rule__Assert__ValueAssignment_1_0_2 ) )
            {
            // InternalSeleniumDSL.g:1780:1: ( ( rule__Assert__ValueAssignment_1_0_2 ) )
            // InternalSeleniumDSL.g:1781:2: ( rule__Assert__ValueAssignment_1_0_2 )
            {
             before(grammarAccess.getAssertAccess().getValueAssignment_1_0_2()); 
            // InternalSeleniumDSL.g:1782:2: ( rule__Assert__ValueAssignment_1_0_2 )
            // InternalSeleniumDSL.g:1782:3: rule__Assert__ValueAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Assert__ValueAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getValueAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_0__2__Impl"


    // $ANTLR start "rule__Assert__Group_1_1__0"
    // InternalSeleniumDSL.g:1791:1: rule__Assert__Group_1_1__0 : rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1 ;
    public final void rule__Assert__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1795:1: ( rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1 )
            // InternalSeleniumDSL.g:1796:2: rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Assert__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__0"


    // $ANTLR start "rule__Assert__Group_1_1__0__Impl"
    // InternalSeleniumDSL.g:1803:1: rule__Assert__Group_1_1__0__Impl : ( ( rule__Assert__NameAssignment_1_1_0 ) ) ;
    public final void rule__Assert__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1807:1: ( ( ( rule__Assert__NameAssignment_1_1_0 ) ) )
            // InternalSeleniumDSL.g:1808:1: ( ( rule__Assert__NameAssignment_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:1808:1: ( ( rule__Assert__NameAssignment_1_1_0 ) )
            // InternalSeleniumDSL.g:1809:2: ( rule__Assert__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getAssertAccess().getNameAssignment_1_1_0()); 
            // InternalSeleniumDSL.g:1810:2: ( rule__Assert__NameAssignment_1_1_0 )
            // InternalSeleniumDSL.g:1810:3: rule__Assert__NameAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__NameAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getNameAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__0__Impl"


    // $ANTLR start "rule__Assert__Group_1_1__1"
    // InternalSeleniumDSL.g:1818:1: rule__Assert__Group_1_1__1 : rule__Assert__Group_1_1__1__Impl rule__Assert__Group_1_1__2 ;
    public final void rule__Assert__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1822:1: ( rule__Assert__Group_1_1__1__Impl rule__Assert__Group_1_1__2 )
            // InternalSeleniumDSL.g:1823:2: rule__Assert__Group_1_1__1__Impl rule__Assert__Group_1_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Assert__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__1"


    // $ANTLR start "rule__Assert__Group_1_1__1__Impl"
    // InternalSeleniumDSL.g:1830:1: rule__Assert__Group_1_1__1__Impl : ( 'equals' ) ;
    public final void rule__Assert__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1834:1: ( ( 'equals' ) )
            // InternalSeleniumDSL.g:1835:1: ( 'equals' )
            {
            // InternalSeleniumDSL.g:1835:1: ( 'equals' )
            // InternalSeleniumDSL.g:1836:2: 'equals'
            {
             before(grammarAccess.getAssertAccess().getEqualsKeyword_1_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getEqualsKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__1__Impl"


    // $ANTLR start "rule__Assert__Group_1_1__2"
    // InternalSeleniumDSL.g:1845:1: rule__Assert__Group_1_1__2 : rule__Assert__Group_1_1__2__Impl ;
    public final void rule__Assert__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1849:1: ( rule__Assert__Group_1_1__2__Impl )
            // InternalSeleniumDSL.g:1850:2: rule__Assert__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__2"


    // $ANTLR start "rule__Assert__Group_1_1__2__Impl"
    // InternalSeleniumDSL.g:1856:1: rule__Assert__Group_1_1__2__Impl : ( ( rule__Assert__ValueAssignment_1_1_2 ) ) ;
    public final void rule__Assert__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1860:1: ( ( ( rule__Assert__ValueAssignment_1_1_2 ) ) )
            // InternalSeleniumDSL.g:1861:1: ( ( rule__Assert__ValueAssignment_1_1_2 ) )
            {
            // InternalSeleniumDSL.g:1861:1: ( ( rule__Assert__ValueAssignment_1_1_2 ) )
            // InternalSeleniumDSL.g:1862:2: ( rule__Assert__ValueAssignment_1_1_2 )
            {
             before(grammarAccess.getAssertAccess().getValueAssignment_1_1_2()); 
            // InternalSeleniumDSL.g:1863:2: ( rule__Assert__ValueAssignment_1_1_2 )
            // InternalSeleniumDSL.g:1863:3: rule__Assert__ValueAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Assert__ValueAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getValueAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_1__2__Impl"


    // $ANTLR start "rule__Assert__Group_1_2__0"
    // InternalSeleniumDSL.g:1872:1: rule__Assert__Group_1_2__0 : rule__Assert__Group_1_2__0__Impl rule__Assert__Group_1_2__1 ;
    public final void rule__Assert__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1876:1: ( rule__Assert__Group_1_2__0__Impl rule__Assert__Group_1_2__1 )
            // InternalSeleniumDSL.g:1877:2: rule__Assert__Group_1_2__0__Impl rule__Assert__Group_1_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Assert__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_2__0"


    // $ANTLR start "rule__Assert__Group_1_2__0__Impl"
    // InternalSeleniumDSL.g:1884:1: rule__Assert__Group_1_2__0__Impl : ( ( rule__Assert__NameAssignment_1_2_0 ) ) ;
    public final void rule__Assert__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1888:1: ( ( ( rule__Assert__NameAssignment_1_2_0 ) ) )
            // InternalSeleniumDSL.g:1889:1: ( ( rule__Assert__NameAssignment_1_2_0 ) )
            {
            // InternalSeleniumDSL.g:1889:1: ( ( rule__Assert__NameAssignment_1_2_0 ) )
            // InternalSeleniumDSL.g:1890:2: ( rule__Assert__NameAssignment_1_2_0 )
            {
             before(grammarAccess.getAssertAccess().getNameAssignment_1_2_0()); 
            // InternalSeleniumDSL.g:1891:2: ( rule__Assert__NameAssignment_1_2_0 )
            // InternalSeleniumDSL.g:1891:3: rule__Assert__NameAssignment_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__NameAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getNameAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_2__0__Impl"


    // $ANTLR start "rule__Assert__Group_1_2__1"
    // InternalSeleniumDSL.g:1899:1: rule__Assert__Group_1_2__1 : rule__Assert__Group_1_2__1__Impl ;
    public final void rule__Assert__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1903:1: ( rule__Assert__Group_1_2__1__Impl )
            // InternalSeleniumDSL.g:1904:2: rule__Assert__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_2__1"


    // $ANTLR start "rule__Assert__Group_1_2__1__Impl"
    // InternalSeleniumDSL.g:1910:1: rule__Assert__Group_1_2__1__Impl : ( 'exists' ) ;
    public final void rule__Assert__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1914:1: ( ( 'exists' ) )
            // InternalSeleniumDSL.g:1915:1: ( 'exists' )
            {
            // InternalSeleniumDSL.g:1915:1: ( 'exists' )
            // InternalSeleniumDSL.g:1916:2: 'exists'
            {
             before(grammarAccess.getAssertAccess().getExistsKeyword_1_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getExistsKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__Group_1_2__1__Impl"


    // $ANTLR start "rule__CallProcedure__Group__0"
    // InternalSeleniumDSL.g:1926:1: rule__CallProcedure__Group__0 : rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 ;
    public final void rule__CallProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1930:1: ( rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 )
            // InternalSeleniumDSL.g:1931:2: rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CallProcedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group__0"


    // $ANTLR start "rule__CallProcedure__Group__0__Impl"
    // InternalSeleniumDSL.g:1938:1: rule__CallProcedure__Group__0__Impl : ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) ) ;
    public final void rule__CallProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1942:1: ( ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) ) )
            // InternalSeleniumDSL.g:1943:1: ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) )
            {
            // InternalSeleniumDSL.g:1943:1: ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) )
            // InternalSeleniumDSL.g:1944:2: ( rule__CallProcedure__ProcedureNameAssignment_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getProcedureNameAssignment_0()); 
            // InternalSeleniumDSL.g:1945:2: ( rule__CallProcedure__ProcedureNameAssignment_0 )
            // InternalSeleniumDSL.g:1945:3: rule__CallProcedure__ProcedureNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ProcedureNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getProcedureNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group__0__Impl"


    // $ANTLR start "rule__CallProcedure__Group__1"
    // InternalSeleniumDSL.g:1953:1: rule__CallProcedure__Group__1 : rule__CallProcedure__Group__1__Impl ;
    public final void rule__CallProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1957:1: ( rule__CallProcedure__Group__1__Impl )
            // InternalSeleniumDSL.g:1958:2: rule__CallProcedure__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group__1"


    // $ANTLR start "rule__CallProcedure__Group__1__Impl"
    // InternalSeleniumDSL.g:1964:1: rule__CallProcedure__Group__1__Impl : ( ( rule__CallProcedure__Group_1__0 )? ) ;
    public final void rule__CallProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1968:1: ( ( ( rule__CallProcedure__Group_1__0 )? ) )
            // InternalSeleniumDSL.g:1969:1: ( ( rule__CallProcedure__Group_1__0 )? )
            {
            // InternalSeleniumDSL.g:1969:1: ( ( rule__CallProcedure__Group_1__0 )? )
            // InternalSeleniumDSL.g:1970:2: ( rule__CallProcedure__Group_1__0 )?
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1()); 
            // InternalSeleniumDSL.g:1971:2: ( rule__CallProcedure__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSeleniumDSL.g:1971:3: rule__CallProcedure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallProcedure__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallProcedureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group__1__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1__0"
    // InternalSeleniumDSL.g:1980:1: rule__CallProcedure__Group_1__0 : rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1 ;
    public final void rule__CallProcedure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1984:1: ( rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1 )
            // InternalSeleniumDSL.g:1985:2: rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__CallProcedure__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__0"


    // $ANTLR start "rule__CallProcedure__Group_1__0__Impl"
    // InternalSeleniumDSL.g:1992:1: rule__CallProcedure__Group_1__0__Impl : ( '(' ) ;
    public final void rule__CallProcedure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1996:1: ( ( '(' ) )
            // InternalSeleniumDSL.g:1997:1: ( '(' )
            {
            // InternalSeleniumDSL.g:1997:1: ( '(' )
            // InternalSeleniumDSL.g:1998:2: '('
            {
             before(grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__0__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1__1"
    // InternalSeleniumDSL.g:2007:1: rule__CallProcedure__Group_1__1 : rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2 ;
    public final void rule__CallProcedure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2011:1: ( rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2 )
            // InternalSeleniumDSL.g:2012:2: rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__CallProcedure__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__1"


    // $ANTLR start "rule__CallProcedure__Group_1__1__Impl"
    // InternalSeleniumDSL.g:2019:1: rule__CallProcedure__Group_1__1__Impl : ( ( rule__CallProcedure__Group_1_1__0 ) ) ;
    public final void rule__CallProcedure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2023:1: ( ( ( rule__CallProcedure__Group_1_1__0 ) ) )
            // InternalSeleniumDSL.g:2024:1: ( ( rule__CallProcedure__Group_1_1__0 ) )
            {
            // InternalSeleniumDSL.g:2024:1: ( ( rule__CallProcedure__Group_1_1__0 ) )
            // InternalSeleniumDSL.g:2025:2: ( rule__CallProcedure__Group_1_1__0 )
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1_1()); 
            // InternalSeleniumDSL.g:2026:2: ( rule__CallProcedure__Group_1_1__0 )
            // InternalSeleniumDSL.g:2026:3: rule__CallProcedure__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__1__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1__2"
    // InternalSeleniumDSL.g:2034:1: rule__CallProcedure__Group_1__2 : rule__CallProcedure__Group_1__2__Impl ;
    public final void rule__CallProcedure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2038:1: ( rule__CallProcedure__Group_1__2__Impl )
            // InternalSeleniumDSL.g:2039:2: rule__CallProcedure__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__2"


    // $ANTLR start "rule__CallProcedure__Group_1__2__Impl"
    // InternalSeleniumDSL.g:2045:1: rule__CallProcedure__Group_1__2__Impl : ( ')' ) ;
    public final void rule__CallProcedure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2049:1: ( ( ')' ) )
            // InternalSeleniumDSL.g:2050:1: ( ')' )
            {
            // InternalSeleniumDSL.g:2050:1: ( ')' )
            // InternalSeleniumDSL.g:2051:2: ')'
            {
             before(grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1__2__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1_1__0"
    // InternalSeleniumDSL.g:2061:1: rule__CallProcedure__Group_1_1__0 : rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1 ;
    public final void rule__CallProcedure__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2065:1: ( rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1 )
            // InternalSeleniumDSL.g:2066:2: rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1
            {
            pushFollow(FOLLOW_10);
            rule__CallProcedure__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1__0"


    // $ANTLR start "rule__CallProcedure__Group_1_1__0__Impl"
    // InternalSeleniumDSL.g:2073:1: rule__CallProcedure__Group_1_1__0__Impl : ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) ) ;
    public final void rule__CallProcedure__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2077:1: ( ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) ) )
            // InternalSeleniumDSL.g:2078:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:2078:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) )
            // InternalSeleniumDSL.g:2079:2: ( rule__CallProcedure__ParametersAssignment_1_1_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_0()); 
            // InternalSeleniumDSL.g:2080:2: ( rule__CallProcedure__ParametersAssignment_1_1_0 )
            // InternalSeleniumDSL.g:2080:3: rule__CallProcedure__ParametersAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ParametersAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1__0__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1_1__1"
    // InternalSeleniumDSL.g:2088:1: rule__CallProcedure__Group_1_1__1 : rule__CallProcedure__Group_1_1__1__Impl ;
    public final void rule__CallProcedure__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2092:1: ( rule__CallProcedure__Group_1_1__1__Impl )
            // InternalSeleniumDSL.g:2093:2: rule__CallProcedure__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1__1"


    // $ANTLR start "rule__CallProcedure__Group_1_1__1__Impl"
    // InternalSeleniumDSL.g:2099:1: rule__CallProcedure__Group_1_1__1__Impl : ( ( rule__CallProcedure__Group_1_1_1__0 )* ) ;
    public final void rule__CallProcedure__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2103:1: ( ( ( rule__CallProcedure__Group_1_1_1__0 )* ) )
            // InternalSeleniumDSL.g:2104:1: ( ( rule__CallProcedure__Group_1_1_1__0 )* )
            {
            // InternalSeleniumDSL.g:2104:1: ( ( rule__CallProcedure__Group_1_1_1__0 )* )
            // InternalSeleniumDSL.g:2105:2: ( rule__CallProcedure__Group_1_1_1__0 )*
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1_1_1()); 
            // InternalSeleniumDSL.g:2106:2: ( rule__CallProcedure__Group_1_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSeleniumDSL.g:2106:3: rule__CallProcedure__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CallProcedure__Group_1_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCallProcedureAccess().getGroup_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1__1__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1_1_1__0"
    // InternalSeleniumDSL.g:2115:1: rule__CallProcedure__Group_1_1_1__0 : rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1 ;
    public final void rule__CallProcedure__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2119:1: ( rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1 )
            // InternalSeleniumDSL.g:2120:2: rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__CallProcedure__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1_1__0"


    // $ANTLR start "rule__CallProcedure__Group_1_1_1__0__Impl"
    // InternalSeleniumDSL.g:2127:1: rule__CallProcedure__Group_1_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CallProcedure__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2131:1: ( ( RULE_COMMA ) )
            // InternalSeleniumDSL.g:2132:1: ( RULE_COMMA )
            {
            // InternalSeleniumDSL.g:2132:1: ( RULE_COMMA )
            // InternalSeleniumDSL.g:2133:2: RULE_COMMA
            {
             before(grammarAccess.getCallProcedureAccess().getCOMMATerminalRuleCall_1_1_1_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getCOMMATerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__CallProcedure__Group_1_1_1__1"
    // InternalSeleniumDSL.g:2142:1: rule__CallProcedure__Group_1_1_1__1 : rule__CallProcedure__Group_1_1_1__1__Impl ;
    public final void rule__CallProcedure__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2146:1: ( rule__CallProcedure__Group_1_1_1__1__Impl )
            // InternalSeleniumDSL.g:2147:2: rule__CallProcedure__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__Group_1_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1_1__1"


    // $ANTLR start "rule__CallProcedure__Group_1_1_1__1__Impl"
    // InternalSeleniumDSL.g:2153:1: rule__CallProcedure__Group_1_1_1__1__Impl : ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) ) ;
    public final void rule__CallProcedure__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2157:1: ( ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) ) )
            // InternalSeleniumDSL.g:2158:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) )
            {
            // InternalSeleniumDSL.g:2158:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) )
            // InternalSeleniumDSL.g:2159:2: ( rule__CallProcedure__ParametersAssignment_1_1_1_1 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_1_1()); 
            // InternalSeleniumDSL.g:2160:2: ( rule__CallProcedure__ParametersAssignment_1_1_1_1 )
            // InternalSeleniumDSL.g:2160:3: rule__CallProcedure__ParametersAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ParametersAssignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__SeleniumTest__ProceduresAssignment_0"
    // InternalSeleniumDSL.g:2169:1: rule__SeleniumTest__ProceduresAssignment_0 : ( ruleProcedure ) ;
    public final void rule__SeleniumTest__ProceduresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2173:1: ( ( ruleProcedure ) )
            // InternalSeleniumDSL.g:2174:2: ( ruleProcedure )
            {
            // InternalSeleniumDSL.g:2174:2: ( ruleProcedure )
            // InternalSeleniumDSL.g:2175:3: ruleProcedure
            {
             before(grammarAccess.getSeleniumTestAccess().getProceduresProcedureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getSeleniumTestAccess().getProceduresProcedureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__ProceduresAssignment_0"


    // $ANTLR start "rule__SeleniumTest__MainAssignment_1"
    // InternalSeleniumDSL.g:2184:1: rule__SeleniumTest__MainAssignment_1 : ( ruleMainProcedure ) ;
    public final void rule__SeleniumTest__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2188:1: ( ( ruleMainProcedure ) )
            // InternalSeleniumDSL.g:2189:2: ( ruleMainProcedure )
            {
            // InternalSeleniumDSL.g:2189:2: ( ruleMainProcedure )
            // InternalSeleniumDSL.g:2190:3: ruleMainProcedure
            {
             before(grammarAccess.getSeleniumTestAccess().getMainMainProcedureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMainProcedure();

            state._fsp--;

             after(grammarAccess.getSeleniumTestAccess().getMainMainProcedureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeleniumTest__MainAssignment_1"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // InternalSeleniumDSL.g:2199:1: rule__Procedure__NameAssignment_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2203:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2204:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2204:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2205:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getProcedureAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__ParametersAssignment_2_1_0"
    // InternalSeleniumDSL.g:2214:1: rule__Procedure__ParametersAssignment_2_1_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2218:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2219:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2219:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2220:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Procedure__ParametersAssignment_2_1_1_1"
    // InternalSeleniumDSL.g:2229:1: rule__Procedure__ParametersAssignment_2_1_1_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2233:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2234:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2234:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2235:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Procedure__InstructionsAssignment_4"
    // InternalSeleniumDSL.g:2244:1: rule__Procedure__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Procedure__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2248:1: ( ( ruleInstruction ) )
            // InternalSeleniumDSL.g:2249:2: ( ruleInstruction )
            {
            // InternalSeleniumDSL.g:2249:2: ( ruleInstruction )
            // InternalSeleniumDSL.g:2250:3: ruleInstruction
            {
             before(grammarAccess.getProcedureAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getInstructionsInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__InstructionsAssignment_4"


    // $ANTLR start "rule__MainProcedure__InstructionsAssignment_4"
    // InternalSeleniumDSL.g:2259:1: rule__MainProcedure__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__MainProcedure__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2263:1: ( ( ruleInstruction ) )
            // InternalSeleniumDSL.g:2264:2: ( ruleInstruction )
            {
            // InternalSeleniumDSL.g:2264:2: ( ruleInstruction )
            // InternalSeleniumDSL.g:2265:3: ruleInstruction
            {
             before(grammarAccess.getMainProcedureAccess().getInstructionsInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getMainProcedureAccess().getInstructionsInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainProcedure__InstructionsAssignment_4"


    // $ANTLR start "rule__Click__TypeAssignment_1"
    // InternalSeleniumDSL.g:2274:1: rule__Click__TypeAssignment_1 : ( ( rule__Click__TypeAlternatives_1_0 ) ) ;
    public final void rule__Click__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2278:1: ( ( ( rule__Click__TypeAlternatives_1_0 ) ) )
            // InternalSeleniumDSL.g:2279:2: ( ( rule__Click__TypeAlternatives_1_0 ) )
            {
            // InternalSeleniumDSL.g:2279:2: ( ( rule__Click__TypeAlternatives_1_0 ) )
            // InternalSeleniumDSL.g:2280:3: ( rule__Click__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getClickAccess().getTypeAlternatives_1_0()); 
            // InternalSeleniumDSL.g:2281:3: ( rule__Click__TypeAlternatives_1_0 )
            // InternalSeleniumDSL.g:2281:4: rule__Click__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Click__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__TypeAssignment_1"


    // $ANTLR start "rule__Click__ValueAssignment_2"
    // InternalSeleniumDSL.g:2289:1: rule__Click__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Click__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2293:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2294:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2294:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2295:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ValueAssignment_2"


    // $ANTLR start "rule__Fill__NameAssignment_1"
    // InternalSeleniumDSL.g:2304:1: rule__Fill__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2308:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2309:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2309:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2310:3: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__NameAssignment_1"


    // $ANTLR start "rule__Fill__ValueAssignment_2"
    // InternalSeleniumDSL.g:2319:1: rule__Fill__ValueAssignment_2 : ( ( rule__Fill__ValueAlternatives_2_0 ) ) ;
    public final void rule__Fill__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2323:1: ( ( ( rule__Fill__ValueAlternatives_2_0 ) ) )
            // InternalSeleniumDSL.g:2324:2: ( ( rule__Fill__ValueAlternatives_2_0 ) )
            {
            // InternalSeleniumDSL.g:2324:2: ( ( rule__Fill__ValueAlternatives_2_0 ) )
            // InternalSeleniumDSL.g:2325:3: ( rule__Fill__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getFillAccess().getValueAlternatives_2_0()); 
            // InternalSeleniumDSL.g:2326:3: ( rule__Fill__ValueAlternatives_2_0 )
            // InternalSeleniumDSL.g:2326:4: rule__Fill__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ValueAssignment_2"


    // $ANTLR start "rule__Select__NameAssignment_1"
    // InternalSeleniumDSL.g:2334:1: rule__Select__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Select__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2338:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2339:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2339:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2340:3: RULE_STRING
            {
             before(grammarAccess.getSelectAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__NameAssignment_1"


    // $ANTLR start "rule__Select__ValueAssignment_2"
    // InternalSeleniumDSL.g:2349:1: rule__Select__ValueAssignment_2 : ( ( rule__Select__ValueAlternatives_2_0 ) ) ;
    public final void rule__Select__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2353:1: ( ( ( rule__Select__ValueAlternatives_2_0 ) ) )
            // InternalSeleniumDSL.g:2354:2: ( ( rule__Select__ValueAlternatives_2_0 ) )
            {
            // InternalSeleniumDSL.g:2354:2: ( ( rule__Select__ValueAlternatives_2_0 ) )
            // InternalSeleniumDSL.g:2355:3: ( rule__Select__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getSelectAccess().getValueAlternatives_2_0()); 
            // InternalSeleniumDSL.g:2356:3: ( rule__Select__ValueAlternatives_2_0 )
            // InternalSeleniumDSL.g:2356:4: rule__Select__ValueAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Select__ValueAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getValueAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ValueAssignment_2"


    // $ANTLR start "rule__Tick__NameAssignment_1"
    // InternalSeleniumDSL.g:2364:1: rule__Tick__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2368:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2369:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2369:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2370:3: RULE_STRING
            {
             before(grammarAccess.getTickAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTickAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tick__NameAssignment_1"


    // $ANTLR start "rule__Navigate__UrlAssignment_1"
    // InternalSeleniumDSL.g:2379:1: rule__Navigate__UrlAssignment_1 : ( ( rule__Navigate__UrlAlternatives_1_0 ) ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2383:1: ( ( ( rule__Navigate__UrlAlternatives_1_0 ) ) )
            // InternalSeleniumDSL.g:2384:2: ( ( rule__Navigate__UrlAlternatives_1_0 ) )
            {
            // InternalSeleniumDSL.g:2384:2: ( ( rule__Navigate__UrlAlternatives_1_0 ) )
            // InternalSeleniumDSL.g:2385:3: ( rule__Navigate__UrlAlternatives_1_0 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAlternatives_1_0()); 
            // InternalSeleniumDSL.g:2386:3: ( rule__Navigate__UrlAlternatives_1_0 )
            // InternalSeleniumDSL.g:2386:4: rule__Navigate__UrlAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Navigate__UrlAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNavigateAccess().getUrlAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navigate__UrlAssignment_1"


    // $ANTLR start "rule__Read__VariableAssignment_0"
    // InternalSeleniumDSL.g:2394:1: rule__Read__VariableAssignment_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__Read__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2398:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2399:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2399:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2400:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__VariableAssignment_0"


    // $ANTLR start "rule__Read__NameAssignment_3"
    // InternalSeleniumDSL.g:2409:1: rule__Read__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Read__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2413:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2414:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2414:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2415:3: RULE_STRING
            {
             before(grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__NameAssignment_3"


    // $ANTLR start "rule__Assert__SearchAssignment_1_0_0"
    // InternalSeleniumDSL.g:2424:1: rule__Assert__SearchAssignment_1_0_0 : ( RULE_STRING ) ;
    public final void rule__Assert__SearchAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2428:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2429:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2429:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2430:3: RULE_STRING
            {
             before(grammarAccess.getAssertAccess().getSearchSTRINGTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getSearchSTRINGTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__SearchAssignment_1_0_0"


    // $ANTLR start "rule__Assert__ValueAssignment_1_0_2"
    // InternalSeleniumDSL.g:2439:1: rule__Assert__ValueAssignment_1_0_2 : ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) ) ;
    public final void rule__Assert__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2443:1: ( ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) ) )
            // InternalSeleniumDSL.g:2444:2: ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) )
            {
            // InternalSeleniumDSL.g:2444:2: ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) )
            // InternalSeleniumDSL.g:2445:3: ( rule__Assert__ValueAlternatives_1_0_2_0 )
            {
             before(grammarAccess.getAssertAccess().getValueAlternatives_1_0_2_0()); 
            // InternalSeleniumDSL.g:2446:3: ( rule__Assert__ValueAlternatives_1_0_2_0 )
            // InternalSeleniumDSL.g:2446:4: rule__Assert__ValueAlternatives_1_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__ValueAlternatives_1_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getValueAlternatives_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__ValueAssignment_1_0_2"


    // $ANTLR start "rule__Assert__NameAssignment_1_1_0"
    // InternalSeleniumDSL.g:2454:1: rule__Assert__NameAssignment_1_1_0 : ( RULE_STRING ) ;
    public final void rule__Assert__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2458:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2459:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2459:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2460:3: RULE_STRING
            {
             before(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__NameAssignment_1_1_0"


    // $ANTLR start "rule__Assert__ValueAssignment_1_1_2"
    // InternalSeleniumDSL.g:2469:1: rule__Assert__ValueAssignment_1_1_2 : ( ( rule__Assert__ValueAlternatives_1_1_2_0 ) ) ;
    public final void rule__Assert__ValueAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2473:1: ( ( ( rule__Assert__ValueAlternatives_1_1_2_0 ) ) )
            // InternalSeleniumDSL.g:2474:2: ( ( rule__Assert__ValueAlternatives_1_1_2_0 ) )
            {
            // InternalSeleniumDSL.g:2474:2: ( ( rule__Assert__ValueAlternatives_1_1_2_0 ) )
            // InternalSeleniumDSL.g:2475:3: ( rule__Assert__ValueAlternatives_1_1_2_0 )
            {
             before(grammarAccess.getAssertAccess().getValueAlternatives_1_1_2_0()); 
            // InternalSeleniumDSL.g:2476:3: ( rule__Assert__ValueAlternatives_1_1_2_0 )
            // InternalSeleniumDSL.g:2476:4: rule__Assert__ValueAlternatives_1_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__ValueAlternatives_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getValueAlternatives_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__ValueAssignment_1_1_2"


    // $ANTLR start "rule__Assert__NameAssignment_1_2_0"
    // InternalSeleniumDSL.g:2484:1: rule__Assert__NameAssignment_1_2_0 : ( RULE_STRING ) ;
    public final void rule__Assert__NameAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2488:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2489:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2489:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2490:3: RULE_STRING
            {
             before(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assert__NameAssignment_1_2_0"


    // $ANTLR start "rule__CallProcedure__ProcedureNameAssignment_0"
    // InternalSeleniumDSL.g:2499:1: rule__CallProcedure__ProcedureNameAssignment_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__CallProcedure__ProcedureNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2503:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2504:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2504:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2505:3: RULE_IDENTIFIER
            {
             before(grammarAccess.getCallProcedureAccess().getProcedureNameIDENTIFIERTerminalRuleCall_0_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_2); 
             after(grammarAccess.getCallProcedureAccess().getProcedureNameIDENTIFIERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__ProcedureNameAssignment_0"


    // $ANTLR start "rule__CallProcedure__ParametersAssignment_1_1_0"
    // InternalSeleniumDSL.g:2514:1: rule__CallProcedure__ParametersAssignment_1_1_0 : ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) ) ;
    public final void rule__CallProcedure__ParametersAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2518:1: ( ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) ) )
            // InternalSeleniumDSL.g:2519:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) )
            {
            // InternalSeleniumDSL.g:2519:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) )
            // InternalSeleniumDSL.g:2520:3: ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_0_0()); 
            // InternalSeleniumDSL.g:2521:3: ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 )
            // InternalSeleniumDSL.g:2521:4: rule__CallProcedure__ParametersAlternatives_1_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ParametersAlternatives_1_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__ParametersAssignment_1_1_0"


    // $ANTLR start "rule__CallProcedure__ParametersAssignment_1_1_1_1"
    // InternalSeleniumDSL.g:2529:1: rule__CallProcedure__ParametersAssignment_1_1_1_1 : ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) ) ;
    public final void rule__CallProcedure__ParametersAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2533:1: ( ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) ) )
            // InternalSeleniumDSL.g:2534:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:2534:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) )
            // InternalSeleniumDSL.g:2535:3: ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_1_1_0()); 
            // InternalSeleniumDSL.g:2536:3: ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 )
            // InternalSeleniumDSL.g:2536:4: rule__CallProcedure__ParametersAlternatives_1_1_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CallProcedure__ParametersAlternatives_1_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallProcedure__ParametersAssignment_1_1_1_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\uffff\1\10\2\uffff";
    static final String dfa_3s = "\1\5\6\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\36\6\uffff\1\36\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\21\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\10\15\uffff\2\10\2\uffff\5\10\1\11\1\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "352:1: rule__Instruction__Alternatives : ( ( ruleClick ) | ( ruleFill ) | ( ruleSelect ) | ( ruleTick ) | ( ruleNavigate ) | ( ruleAssert ) | ( ruleRead ) | ( ruleCallProcedure ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000004F880020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000004F800022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});

}