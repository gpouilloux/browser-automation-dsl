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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IDENTIFIER", "RULE_COMMA", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'link'", "'name'", "'xpath'", "'contains'", "'equals'", "'def'", "'{'", "'}'", "'('", "')'", "'main'", "'click'", "'fill'", "'select'", "'tick'", "'navigate'", "'='", "'read'", "'assert'", "'exists'"
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
    // InternalSeleniumDSL.g:505:1: rule__Assert__Alternatives_1 : ( ( ( rule__Assert__Group_1_0__0 ) ) | ( ( rule__Assert__Group_1_1__0 ) ) );
    public final void rule__Assert__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:509:1: ( ( ( rule__Assert__Group_1_0__0 ) ) | ( ( rule__Assert__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=17 && LA6_1<=18)) ) {
                    alt6=1;
                }
                else if ( (LA6_1==33) ) {
                    alt6=2;
                }
                else {
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


    // $ANTLR start "rule__Assert__TypeAlternatives_1_0_1_0"
    // InternalSeleniumDSL.g:526:1: rule__Assert__TypeAlternatives_1_0_1_0 : ( ( 'contains' ) | ( 'equals' ) );
    public final void rule__Assert__TypeAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:530:1: ( ( 'contains' ) | ( 'equals' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSeleniumDSL.g:531:2: ( 'contains' )
                    {
                    // InternalSeleniumDSL.g:531:2: ( 'contains' )
                    // InternalSeleniumDSL.g:532:3: 'contains'
                    {
                     before(grammarAccess.getAssertAccess().getTypeContainsKeyword_1_0_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getTypeContainsKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:537:2: ( 'equals' )
                    {
                    // InternalSeleniumDSL.g:537:2: ( 'equals' )
                    // InternalSeleniumDSL.g:538:3: 'equals'
                    {
                     before(grammarAccess.getAssertAccess().getTypeEqualsKeyword_1_0_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getTypeEqualsKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__Assert__TypeAlternatives_1_0_1_0"


    // $ANTLR start "rule__Assert__ValueAlternatives_1_0_2_0"
    // InternalSeleniumDSL.g:547:1: rule__Assert__ValueAlternatives_1_0_2_0 : ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) );
    public final void rule__Assert__ValueAlternatives_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:551:1: ( ( RULE_STRING ) | ( RULE_IDENTIFIER ) )
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
                    // InternalSeleniumDSL.g:552:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:552:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:553:3: RULE_STRING
                    {
                     before(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:558:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:558:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:559:3: RULE_IDENTIFIER
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


    // $ANTLR start "rule__CallProcedure__ParametersAlternatives_1_1_0_0"
    // InternalSeleniumDSL.g:568:1: rule__CallProcedure__ParametersAlternatives_1_1_0_0 : ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) );
    public final void rule__CallProcedure__ParametersAlternatives_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:572:1: ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) )
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
                    // InternalSeleniumDSL.g:573:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:573:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:574:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:579:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:579:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:580:3: RULE_STRING
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
    // InternalSeleniumDSL.g:589:1: rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 : ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) );
    public final void rule__CallProcedure__ParametersAlternatives_1_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:593:1: ( ( RULE_IDENTIFIER ) | ( RULE_STRING ) )
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
                    // InternalSeleniumDSL.g:594:2: ( RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:594:2: ( RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:595:3: RULE_IDENTIFIER
                    {
                     before(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0()); 
                    match(input,RULE_IDENTIFIER,FOLLOW_2); 
                     after(grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:600:2: ( RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:600:2: ( RULE_STRING )
                    // InternalSeleniumDSL.g:601:3: RULE_STRING
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
    // InternalSeleniumDSL.g:610:1: rule__SeleniumTest__Group__0 : rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1 ;
    public final void rule__SeleniumTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:614:1: ( rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1 )
            // InternalSeleniumDSL.g:615:2: rule__SeleniumTest__Group__0__Impl rule__SeleniumTest__Group__1
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
    // InternalSeleniumDSL.g:622:1: rule__SeleniumTest__Group__0__Impl : ( ( rule__SeleniumTest__ProceduresAssignment_0 )* ) ;
    public final void rule__SeleniumTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:626:1: ( ( ( rule__SeleniumTest__ProceduresAssignment_0 )* ) )
            // InternalSeleniumDSL.g:627:1: ( ( rule__SeleniumTest__ProceduresAssignment_0 )* )
            {
            // InternalSeleniumDSL.g:627:1: ( ( rule__SeleniumTest__ProceduresAssignment_0 )* )
            // InternalSeleniumDSL.g:628:2: ( rule__SeleniumTest__ProceduresAssignment_0 )*
            {
             before(grammarAccess.getSeleniumTestAccess().getProceduresAssignment_0()); 
            // InternalSeleniumDSL.g:629:2: ( rule__SeleniumTest__ProceduresAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_IDENTIFIER) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalSeleniumDSL.g:629:3: rule__SeleniumTest__ProceduresAssignment_0
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
    // InternalSeleniumDSL.g:637:1: rule__SeleniumTest__Group__1 : rule__SeleniumTest__Group__1__Impl ;
    public final void rule__SeleniumTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:641:1: ( rule__SeleniumTest__Group__1__Impl )
            // InternalSeleniumDSL.g:642:2: rule__SeleniumTest__Group__1__Impl
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
    // InternalSeleniumDSL.g:648:1: rule__SeleniumTest__Group__1__Impl : ( ( rule__SeleniumTest__MainAssignment_1 ) ) ;
    public final void rule__SeleniumTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:652:1: ( ( ( rule__SeleniumTest__MainAssignment_1 ) ) )
            // InternalSeleniumDSL.g:653:1: ( ( rule__SeleniumTest__MainAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:653:1: ( ( rule__SeleniumTest__MainAssignment_1 ) )
            // InternalSeleniumDSL.g:654:2: ( rule__SeleniumTest__MainAssignment_1 )
            {
             before(grammarAccess.getSeleniumTestAccess().getMainAssignment_1()); 
            // InternalSeleniumDSL.g:655:2: ( rule__SeleniumTest__MainAssignment_1 )
            // InternalSeleniumDSL.g:655:3: rule__SeleniumTest__MainAssignment_1
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
    // InternalSeleniumDSL.g:664:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:668:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalSeleniumDSL.g:669:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
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
    // InternalSeleniumDSL.g:676:1: rule__Procedure__Group__0__Impl : ( 'def' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:680:1: ( ( 'def' ) )
            // InternalSeleniumDSL.g:681:1: ( 'def' )
            {
            // InternalSeleniumDSL.g:681:1: ( 'def' )
            // InternalSeleniumDSL.g:682:2: 'def'
            {
             before(grammarAccess.getProcedureAccess().getDefKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:691:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:695:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalSeleniumDSL.g:696:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
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
    // InternalSeleniumDSL.g:703:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:707:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:708:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:708:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:709:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:710:2: ( rule__Procedure__NameAssignment_1 )
            // InternalSeleniumDSL.g:710:3: rule__Procedure__NameAssignment_1
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
    // InternalSeleniumDSL.g:718:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:722:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalSeleniumDSL.g:723:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
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
    // InternalSeleniumDSL.g:730:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__Group_2__0 )? ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:734:1: ( ( ( rule__Procedure__Group_2__0 )? ) )
            // InternalSeleniumDSL.g:735:1: ( ( rule__Procedure__Group_2__0 )? )
            {
            // InternalSeleniumDSL.g:735:1: ( ( rule__Procedure__Group_2__0 )? )
            // InternalSeleniumDSL.g:736:2: ( rule__Procedure__Group_2__0 )?
            {
             before(grammarAccess.getProcedureAccess().getGroup_2()); 
            // InternalSeleniumDSL.g:737:2: ( rule__Procedure__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDSL.g:737:3: rule__Procedure__Group_2__0
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
    // InternalSeleniumDSL.g:745:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:749:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalSeleniumDSL.g:750:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
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
    // InternalSeleniumDSL.g:757:1: rule__Procedure__Group__3__Impl : ( '{' ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:761:1: ( ( '{' ) )
            // InternalSeleniumDSL.g:762:1: ( '{' )
            {
            // InternalSeleniumDSL.g:762:1: ( '{' )
            // InternalSeleniumDSL.g:763:2: '{'
            {
             before(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:772:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:776:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalSeleniumDSL.g:777:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
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
    // InternalSeleniumDSL.g:784:1: rule__Procedure__Group__4__Impl : ( ( rule__Procedure__InstructionsAssignment_4 )* ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:788:1: ( ( ( rule__Procedure__InstructionsAssignment_4 )* ) )
            // InternalSeleniumDSL.g:789:1: ( ( rule__Procedure__InstructionsAssignment_4 )* )
            {
            // InternalSeleniumDSL.g:789:1: ( ( rule__Procedure__InstructionsAssignment_4 )* )
            // InternalSeleniumDSL.g:790:2: ( rule__Procedure__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getProcedureAccess().getInstructionsAssignment_4()); 
            // InternalSeleniumDSL.g:791:2: ( rule__Procedure__InstructionsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_IDENTIFIER||(LA13_0>=25 && LA13_0<=29)||LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSeleniumDSL.g:791:3: rule__Procedure__InstructionsAssignment_4
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
    // InternalSeleniumDSL.g:799:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:803:1: ( rule__Procedure__Group__5__Impl )
            // InternalSeleniumDSL.g:804:2: rule__Procedure__Group__5__Impl
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
    // InternalSeleniumDSL.g:810:1: rule__Procedure__Group__5__Impl : ( '}' ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:814:1: ( ( '}' ) )
            // InternalSeleniumDSL.g:815:1: ( '}' )
            {
            // InternalSeleniumDSL.g:815:1: ( '}' )
            // InternalSeleniumDSL.g:816:2: '}'
            {
             before(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:826:1: rule__Procedure__Group_2__0 : rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1 ;
    public final void rule__Procedure__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:830:1: ( rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1 )
            // InternalSeleniumDSL.g:831:2: rule__Procedure__Group_2__0__Impl rule__Procedure__Group_2__1
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
    // InternalSeleniumDSL.g:838:1: rule__Procedure__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Procedure__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:842:1: ( ( '(' ) )
            // InternalSeleniumDSL.g:843:1: ( '(' )
            {
            // InternalSeleniumDSL.g:843:1: ( '(' )
            // InternalSeleniumDSL.g:844:2: '('
            {
             before(grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:853:1: rule__Procedure__Group_2__1 : rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2 ;
    public final void rule__Procedure__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:857:1: ( rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2 )
            // InternalSeleniumDSL.g:858:2: rule__Procedure__Group_2__1__Impl rule__Procedure__Group_2__2
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
    // InternalSeleniumDSL.g:865:1: rule__Procedure__Group_2__1__Impl : ( ( rule__Procedure__Group_2_1__0 ) ) ;
    public final void rule__Procedure__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:869:1: ( ( ( rule__Procedure__Group_2_1__0 ) ) )
            // InternalSeleniumDSL.g:870:1: ( ( rule__Procedure__Group_2_1__0 ) )
            {
            // InternalSeleniumDSL.g:870:1: ( ( rule__Procedure__Group_2_1__0 ) )
            // InternalSeleniumDSL.g:871:2: ( rule__Procedure__Group_2_1__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup_2_1()); 
            // InternalSeleniumDSL.g:872:2: ( rule__Procedure__Group_2_1__0 )
            // InternalSeleniumDSL.g:872:3: rule__Procedure__Group_2_1__0
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
    // InternalSeleniumDSL.g:880:1: rule__Procedure__Group_2__2 : rule__Procedure__Group_2__2__Impl ;
    public final void rule__Procedure__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:884:1: ( rule__Procedure__Group_2__2__Impl )
            // InternalSeleniumDSL.g:885:2: rule__Procedure__Group_2__2__Impl
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
    // InternalSeleniumDSL.g:891:1: rule__Procedure__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Procedure__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:895:1: ( ( ')' ) )
            // InternalSeleniumDSL.g:896:1: ( ')' )
            {
            // InternalSeleniumDSL.g:896:1: ( ')' )
            // InternalSeleniumDSL.g:897:2: ')'
            {
             before(grammarAccess.getProcedureAccess().getRightParenthesisKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:907:1: rule__Procedure__Group_2_1__0 : rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 ;
    public final void rule__Procedure__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:911:1: ( rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1 )
            // InternalSeleniumDSL.g:912:2: rule__Procedure__Group_2_1__0__Impl rule__Procedure__Group_2_1__1
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
    // InternalSeleniumDSL.g:919:1: rule__Procedure__Group_2_1__0__Impl : ( ( rule__Procedure__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Procedure__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:923:1: ( ( ( rule__Procedure__ParametersAssignment_2_1_0 ) ) )
            // InternalSeleniumDSL.g:924:1: ( ( rule__Procedure__ParametersAssignment_2_1_0 ) )
            {
            // InternalSeleniumDSL.g:924:1: ( ( rule__Procedure__ParametersAssignment_2_1_0 ) )
            // InternalSeleniumDSL.g:925:2: ( rule__Procedure__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_0()); 
            // InternalSeleniumDSL.g:926:2: ( rule__Procedure__ParametersAssignment_2_1_0 )
            // InternalSeleniumDSL.g:926:3: rule__Procedure__ParametersAssignment_2_1_0
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
    // InternalSeleniumDSL.g:934:1: rule__Procedure__Group_2_1__1 : rule__Procedure__Group_2_1__1__Impl ;
    public final void rule__Procedure__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:938:1: ( rule__Procedure__Group_2_1__1__Impl )
            // InternalSeleniumDSL.g:939:2: rule__Procedure__Group_2_1__1__Impl
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
    // InternalSeleniumDSL.g:945:1: rule__Procedure__Group_2_1__1__Impl : ( ( rule__Procedure__Group_2_1_1__0 )* ) ;
    public final void rule__Procedure__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:949:1: ( ( ( rule__Procedure__Group_2_1_1__0 )* ) )
            // InternalSeleniumDSL.g:950:1: ( ( rule__Procedure__Group_2_1_1__0 )* )
            {
            // InternalSeleniumDSL.g:950:1: ( ( rule__Procedure__Group_2_1_1__0 )* )
            // InternalSeleniumDSL.g:951:2: ( rule__Procedure__Group_2_1_1__0 )*
            {
             before(grammarAccess.getProcedureAccess().getGroup_2_1_1()); 
            // InternalSeleniumDSL.g:952:2: ( rule__Procedure__Group_2_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeleniumDSL.g:952:3: rule__Procedure__Group_2_1_1__0
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
    // InternalSeleniumDSL.g:961:1: rule__Procedure__Group_2_1_1__0 : rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1 ;
    public final void rule__Procedure__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:965:1: ( rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1 )
            // InternalSeleniumDSL.g:966:2: rule__Procedure__Group_2_1_1__0__Impl rule__Procedure__Group_2_1_1__1
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
    // InternalSeleniumDSL.g:973:1: rule__Procedure__Group_2_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Procedure__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:977:1: ( ( RULE_COMMA ) )
            // InternalSeleniumDSL.g:978:1: ( RULE_COMMA )
            {
            // InternalSeleniumDSL.g:978:1: ( RULE_COMMA )
            // InternalSeleniumDSL.g:979:2: RULE_COMMA
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
    // InternalSeleniumDSL.g:988:1: rule__Procedure__Group_2_1_1__1 : rule__Procedure__Group_2_1_1__1__Impl ;
    public final void rule__Procedure__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:992:1: ( rule__Procedure__Group_2_1_1__1__Impl )
            // InternalSeleniumDSL.g:993:2: rule__Procedure__Group_2_1_1__1__Impl
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
    // InternalSeleniumDSL.g:999:1: rule__Procedure__Group_2_1_1__1__Impl : ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Procedure__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1003:1: ( ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) ) )
            // InternalSeleniumDSL.g:1004:1: ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalSeleniumDSL.g:1004:1: ( ( rule__Procedure__ParametersAssignment_2_1_1_1 ) )
            // InternalSeleniumDSL.g:1005:2: ( rule__Procedure__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getProcedureAccess().getParametersAssignment_2_1_1_1()); 
            // InternalSeleniumDSL.g:1006:2: ( rule__Procedure__ParametersAssignment_2_1_1_1 )
            // InternalSeleniumDSL.g:1006:3: rule__Procedure__ParametersAssignment_2_1_1_1
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
    // InternalSeleniumDSL.g:1015:1: rule__MainProcedure__Group__0 : rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1 ;
    public final void rule__MainProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1019:1: ( rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1 )
            // InternalSeleniumDSL.g:1020:2: rule__MainProcedure__Group__0__Impl rule__MainProcedure__Group__1
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
    // InternalSeleniumDSL.g:1027:1: rule__MainProcedure__Group__0__Impl : ( () ) ;
    public final void rule__MainProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1031:1: ( ( () ) )
            // InternalSeleniumDSL.g:1032:1: ( () )
            {
            // InternalSeleniumDSL.g:1032:1: ( () )
            // InternalSeleniumDSL.g:1033:2: ()
            {
             before(grammarAccess.getMainProcedureAccess().getMainProcedureAction_0()); 
            // InternalSeleniumDSL.g:1034:2: ()
            // InternalSeleniumDSL.g:1034:3: 
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
    // InternalSeleniumDSL.g:1042:1: rule__MainProcedure__Group__1 : rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2 ;
    public final void rule__MainProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1046:1: ( rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2 )
            // InternalSeleniumDSL.g:1047:2: rule__MainProcedure__Group__1__Impl rule__MainProcedure__Group__2
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
    // InternalSeleniumDSL.g:1054:1: rule__MainProcedure__Group__1__Impl : ( ( ( 'def' ) ) ( ( 'def' )* ) ) ;
    public final void rule__MainProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1058:1: ( ( ( ( 'def' ) ) ( ( 'def' )* ) ) )
            // InternalSeleniumDSL.g:1059:1: ( ( ( 'def' ) ) ( ( 'def' )* ) )
            {
            // InternalSeleniumDSL.g:1059:1: ( ( ( 'def' ) ) ( ( 'def' )* ) )
            // InternalSeleniumDSL.g:1060:2: ( ( 'def' ) ) ( ( 'def' )* )
            {
            // InternalSeleniumDSL.g:1060:2: ( ( 'def' ) )
            // InternalSeleniumDSL.g:1061:3: ( 'def' )
            {
             before(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 
            // InternalSeleniumDSL.g:1062:3: ( 'def' )
            // InternalSeleniumDSL.g:1062:4: 'def'
            {
            match(input,19,FOLLOW_4); 

            }

             after(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 

            }

            // InternalSeleniumDSL.g:1065:2: ( ( 'def' )* )
            // InternalSeleniumDSL.g:1066:3: ( 'def' )*
            {
             before(grammarAccess.getMainProcedureAccess().getDefKeyword_1()); 
            // InternalSeleniumDSL.g:1067:3: ( 'def' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1067:4: 'def'
            	    {
            	    match(input,19,FOLLOW_4); 

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
    // InternalSeleniumDSL.g:1076:1: rule__MainProcedure__Group__2 : rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3 ;
    public final void rule__MainProcedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1080:1: ( rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3 )
            // InternalSeleniumDSL.g:1081:2: rule__MainProcedure__Group__2__Impl rule__MainProcedure__Group__3
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
    // InternalSeleniumDSL.g:1088:1: rule__MainProcedure__Group__2__Impl : ( ( ( 'main' ) ) ( ( 'main' )* ) ) ;
    public final void rule__MainProcedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1092:1: ( ( ( ( 'main' ) ) ( ( 'main' )* ) ) )
            // InternalSeleniumDSL.g:1093:1: ( ( ( 'main' ) ) ( ( 'main' )* ) )
            {
            // InternalSeleniumDSL.g:1093:1: ( ( ( 'main' ) ) ( ( 'main' )* ) )
            // InternalSeleniumDSL.g:1094:2: ( ( 'main' ) ) ( ( 'main' )* )
            {
            // InternalSeleniumDSL.g:1094:2: ( ( 'main' ) )
            // InternalSeleniumDSL.g:1095:3: ( 'main' )
            {
             before(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 
            // InternalSeleniumDSL.g:1096:3: ( 'main' )
            // InternalSeleniumDSL.g:1096:4: 'main'
            {
            match(input,24,FOLLOW_14); 

            }

             after(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 

            }

            // InternalSeleniumDSL.g:1099:2: ( ( 'main' )* )
            // InternalSeleniumDSL.g:1100:3: ( 'main' )*
            {
             before(grammarAccess.getMainProcedureAccess().getMainKeyword_2()); 
            // InternalSeleniumDSL.g:1101:3: ( 'main' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1101:4: 'main'
            	    {
            	    match(input,24,FOLLOW_14); 

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
    // InternalSeleniumDSL.g:1110:1: rule__MainProcedure__Group__3 : rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4 ;
    public final void rule__MainProcedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1114:1: ( rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4 )
            // InternalSeleniumDSL.g:1115:2: rule__MainProcedure__Group__3__Impl rule__MainProcedure__Group__4
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
    // InternalSeleniumDSL.g:1122:1: rule__MainProcedure__Group__3__Impl : ( '{' ) ;
    public final void rule__MainProcedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1126:1: ( ( '{' ) )
            // InternalSeleniumDSL.g:1127:1: ( '{' )
            {
            // InternalSeleniumDSL.g:1127:1: ( '{' )
            // InternalSeleniumDSL.g:1128:2: '{'
            {
             before(grammarAccess.getMainProcedureAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1137:1: rule__MainProcedure__Group__4 : rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5 ;
    public final void rule__MainProcedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1141:1: ( rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5 )
            // InternalSeleniumDSL.g:1142:2: rule__MainProcedure__Group__4__Impl rule__MainProcedure__Group__5
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
    // InternalSeleniumDSL.g:1149:1: rule__MainProcedure__Group__4__Impl : ( ( rule__MainProcedure__InstructionsAssignment_4 )* ) ;
    public final void rule__MainProcedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1153:1: ( ( ( rule__MainProcedure__InstructionsAssignment_4 )* ) )
            // InternalSeleniumDSL.g:1154:1: ( ( rule__MainProcedure__InstructionsAssignment_4 )* )
            {
            // InternalSeleniumDSL.g:1154:1: ( ( rule__MainProcedure__InstructionsAssignment_4 )* )
            // InternalSeleniumDSL.g:1155:2: ( rule__MainProcedure__InstructionsAssignment_4 )*
            {
             before(grammarAccess.getMainProcedureAccess().getInstructionsAssignment_4()); 
            // InternalSeleniumDSL.g:1156:2: ( rule__MainProcedure__InstructionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_IDENTIFIER||(LA17_0>=25 && LA17_0<=29)||LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSeleniumDSL.g:1156:3: rule__MainProcedure__InstructionsAssignment_4
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
    // InternalSeleniumDSL.g:1164:1: rule__MainProcedure__Group__5 : rule__MainProcedure__Group__5__Impl ;
    public final void rule__MainProcedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1168:1: ( rule__MainProcedure__Group__5__Impl )
            // InternalSeleniumDSL.g:1169:2: rule__MainProcedure__Group__5__Impl
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
    // InternalSeleniumDSL.g:1175:1: rule__MainProcedure__Group__5__Impl : ( '}' ) ;
    public final void rule__MainProcedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1179:1: ( ( '}' ) )
            // InternalSeleniumDSL.g:1180:1: ( '}' )
            {
            // InternalSeleniumDSL.g:1180:1: ( '}' )
            // InternalSeleniumDSL.g:1181:2: '}'
            {
             before(grammarAccess.getMainProcedureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1191:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1195:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalSeleniumDSL.g:1196:2: rule__Click__Group__0__Impl rule__Click__Group__1
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
    // InternalSeleniumDSL.g:1203:1: rule__Click__Group__0__Impl : ( 'click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1207:1: ( ( 'click' ) )
            // InternalSeleniumDSL.g:1208:1: ( 'click' )
            {
            // InternalSeleniumDSL.g:1208:1: ( 'click' )
            // InternalSeleniumDSL.g:1209:2: 'click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1218:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1222:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalSeleniumDSL.g:1223:2: rule__Click__Group__1__Impl rule__Click__Group__2
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
    // InternalSeleniumDSL.g:1230:1: rule__Click__Group__1__Impl : ( ( rule__Click__TypeAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1234:1: ( ( ( rule__Click__TypeAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1235:1: ( ( rule__Click__TypeAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1235:1: ( ( rule__Click__TypeAssignment_1 ) )
            // InternalSeleniumDSL.g:1236:2: ( rule__Click__TypeAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getTypeAssignment_1()); 
            // InternalSeleniumDSL.g:1237:2: ( rule__Click__TypeAssignment_1 )
            // InternalSeleniumDSL.g:1237:3: rule__Click__TypeAssignment_1
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
    // InternalSeleniumDSL.g:1245:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1249:1: ( rule__Click__Group__2__Impl )
            // InternalSeleniumDSL.g:1250:2: rule__Click__Group__2__Impl
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
    // InternalSeleniumDSL.g:1256:1: rule__Click__Group__2__Impl : ( ( rule__Click__ValueAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1260:1: ( ( ( rule__Click__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1261:1: ( ( rule__Click__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1261:1: ( ( rule__Click__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1262:2: ( rule__Click__ValueAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1263:2: ( rule__Click__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1263:3: rule__Click__ValueAssignment_2
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
    // InternalSeleniumDSL.g:1272:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1276:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalSeleniumDSL.g:1277:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
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
    // InternalSeleniumDSL.g:1284:1: rule__Fill__Group__0__Impl : ( 'fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1288:1: ( ( 'fill' ) )
            // InternalSeleniumDSL.g:1289:1: ( 'fill' )
            {
            // InternalSeleniumDSL.g:1289:1: ( 'fill' )
            // InternalSeleniumDSL.g:1290:2: 'fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1299:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1303:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalSeleniumDSL.g:1304:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
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
    // InternalSeleniumDSL.g:1311:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__NameAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1315:1: ( ( ( rule__Fill__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1316:1: ( ( rule__Fill__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1316:1: ( ( rule__Fill__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1317:2: ( rule__Fill__NameAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1318:2: ( rule__Fill__NameAssignment_1 )
            // InternalSeleniumDSL.g:1318:3: rule__Fill__NameAssignment_1
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
    // InternalSeleniumDSL.g:1326:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1330:1: ( rule__Fill__Group__2__Impl )
            // InternalSeleniumDSL.g:1331:2: rule__Fill__Group__2__Impl
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
    // InternalSeleniumDSL.g:1337:1: rule__Fill__Group__2__Impl : ( ( rule__Fill__ValueAssignment_2 ) ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1341:1: ( ( ( rule__Fill__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1342:1: ( ( rule__Fill__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1342:1: ( ( rule__Fill__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1343:2: ( rule__Fill__ValueAssignment_2 )
            {
             before(grammarAccess.getFillAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1344:2: ( rule__Fill__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1344:3: rule__Fill__ValueAssignment_2
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
    // InternalSeleniumDSL.g:1353:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1357:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSeleniumDSL.g:1358:2: rule__Select__Group__0__Impl rule__Select__Group__1
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
    // InternalSeleniumDSL.g:1365:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1369:1: ( ( 'select' ) )
            // InternalSeleniumDSL.g:1370:1: ( 'select' )
            {
            // InternalSeleniumDSL.g:1370:1: ( 'select' )
            // InternalSeleniumDSL.g:1371:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1380:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1384:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSeleniumDSL.g:1385:2: rule__Select__Group__1__Impl rule__Select__Group__2
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
    // InternalSeleniumDSL.g:1392:1: rule__Select__Group__1__Impl : ( ( rule__Select__NameAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1396:1: ( ( ( rule__Select__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1397:1: ( ( rule__Select__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1397:1: ( ( rule__Select__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1398:2: ( rule__Select__NameAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1399:2: ( rule__Select__NameAssignment_1 )
            // InternalSeleniumDSL.g:1399:3: rule__Select__NameAssignment_1
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
    // InternalSeleniumDSL.g:1407:1: rule__Select__Group__2 : rule__Select__Group__2__Impl ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1411:1: ( rule__Select__Group__2__Impl )
            // InternalSeleniumDSL.g:1412:2: rule__Select__Group__2__Impl
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
    // InternalSeleniumDSL.g:1418:1: rule__Select__Group__2__Impl : ( ( rule__Select__ValueAssignment_2 ) ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1422:1: ( ( ( rule__Select__ValueAssignment_2 ) ) )
            // InternalSeleniumDSL.g:1423:1: ( ( rule__Select__ValueAssignment_2 ) )
            {
            // InternalSeleniumDSL.g:1423:1: ( ( rule__Select__ValueAssignment_2 ) )
            // InternalSeleniumDSL.g:1424:2: ( rule__Select__ValueAssignment_2 )
            {
             before(grammarAccess.getSelectAccess().getValueAssignment_2()); 
            // InternalSeleniumDSL.g:1425:2: ( rule__Select__ValueAssignment_2 )
            // InternalSeleniumDSL.g:1425:3: rule__Select__ValueAssignment_2
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
    // InternalSeleniumDSL.g:1434:1: rule__Tick__Group__0 : rule__Tick__Group__0__Impl rule__Tick__Group__1 ;
    public final void rule__Tick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1438:1: ( rule__Tick__Group__0__Impl rule__Tick__Group__1 )
            // InternalSeleniumDSL.g:1439:2: rule__Tick__Group__0__Impl rule__Tick__Group__1
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
    // InternalSeleniumDSL.g:1446:1: rule__Tick__Group__0__Impl : ( 'tick' ) ;
    public final void rule__Tick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1450:1: ( ( 'tick' ) )
            // InternalSeleniumDSL.g:1451:1: ( 'tick' )
            {
            // InternalSeleniumDSL.g:1451:1: ( 'tick' )
            // InternalSeleniumDSL.g:1452:2: 'tick'
            {
             before(grammarAccess.getTickAccess().getTickKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1461:1: rule__Tick__Group__1 : rule__Tick__Group__1__Impl ;
    public final void rule__Tick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1465:1: ( rule__Tick__Group__1__Impl )
            // InternalSeleniumDSL.g:1466:2: rule__Tick__Group__1__Impl
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
    // InternalSeleniumDSL.g:1472:1: rule__Tick__Group__1__Impl : ( ( rule__Tick__NameAssignment_1 ) ) ;
    public final void rule__Tick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1476:1: ( ( ( rule__Tick__NameAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1477:1: ( ( rule__Tick__NameAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1477:1: ( ( rule__Tick__NameAssignment_1 ) )
            // InternalSeleniumDSL.g:1478:2: ( rule__Tick__NameAssignment_1 )
            {
             before(grammarAccess.getTickAccess().getNameAssignment_1()); 
            // InternalSeleniumDSL.g:1479:2: ( rule__Tick__NameAssignment_1 )
            // InternalSeleniumDSL.g:1479:3: rule__Tick__NameAssignment_1
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
    // InternalSeleniumDSL.g:1488:1: rule__Navigate__Group__0 : rule__Navigate__Group__0__Impl rule__Navigate__Group__1 ;
    public final void rule__Navigate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1492:1: ( rule__Navigate__Group__0__Impl rule__Navigate__Group__1 )
            // InternalSeleniumDSL.g:1493:2: rule__Navigate__Group__0__Impl rule__Navigate__Group__1
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
    // InternalSeleniumDSL.g:1500:1: rule__Navigate__Group__0__Impl : ( 'navigate' ) ;
    public final void rule__Navigate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1504:1: ( ( 'navigate' ) )
            // InternalSeleniumDSL.g:1505:1: ( 'navigate' )
            {
            // InternalSeleniumDSL.g:1505:1: ( 'navigate' )
            // InternalSeleniumDSL.g:1506:2: 'navigate'
            {
             before(grammarAccess.getNavigateAccess().getNavigateKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1515:1: rule__Navigate__Group__1 : rule__Navigate__Group__1__Impl ;
    public final void rule__Navigate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1519:1: ( rule__Navigate__Group__1__Impl )
            // InternalSeleniumDSL.g:1520:2: rule__Navigate__Group__1__Impl
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
    // InternalSeleniumDSL.g:1526:1: rule__Navigate__Group__1__Impl : ( ( rule__Navigate__UrlAssignment_1 ) ) ;
    public final void rule__Navigate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1530:1: ( ( ( rule__Navigate__UrlAssignment_1 ) ) )
            // InternalSeleniumDSL.g:1531:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            {
            // InternalSeleniumDSL.g:1531:1: ( ( rule__Navigate__UrlAssignment_1 ) )
            // InternalSeleniumDSL.g:1532:2: ( rule__Navigate__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAssignment_1()); 
            // InternalSeleniumDSL.g:1533:2: ( rule__Navigate__UrlAssignment_1 )
            // InternalSeleniumDSL.g:1533:3: rule__Navigate__UrlAssignment_1
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
    // InternalSeleniumDSL.g:1542:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1546:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalSeleniumDSL.g:1547:2: rule__Read__Group__0__Impl rule__Read__Group__1
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
    // InternalSeleniumDSL.g:1554:1: rule__Read__Group__0__Impl : ( ( rule__Read__VariableAssignment_0 ) ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1558:1: ( ( ( rule__Read__VariableAssignment_0 ) ) )
            // InternalSeleniumDSL.g:1559:1: ( ( rule__Read__VariableAssignment_0 ) )
            {
            // InternalSeleniumDSL.g:1559:1: ( ( rule__Read__VariableAssignment_0 ) )
            // InternalSeleniumDSL.g:1560:2: ( rule__Read__VariableAssignment_0 )
            {
             before(grammarAccess.getReadAccess().getVariableAssignment_0()); 
            // InternalSeleniumDSL.g:1561:2: ( rule__Read__VariableAssignment_0 )
            // InternalSeleniumDSL.g:1561:3: rule__Read__VariableAssignment_0
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
    // InternalSeleniumDSL.g:1569:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1573:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalSeleniumDSL.g:1574:2: rule__Read__Group__1__Impl rule__Read__Group__2
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
    // InternalSeleniumDSL.g:1581:1: rule__Read__Group__1__Impl : ( '=' ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1585:1: ( ( '=' ) )
            // InternalSeleniumDSL.g:1586:1: ( '=' )
            {
            // InternalSeleniumDSL.g:1586:1: ( '=' )
            // InternalSeleniumDSL.g:1587:2: '='
            {
             before(grammarAccess.getReadAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1596:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1600:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalSeleniumDSL.g:1601:2: rule__Read__Group__2__Impl rule__Read__Group__3
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
    // InternalSeleniumDSL.g:1608:1: rule__Read__Group__2__Impl : ( 'read' ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1612:1: ( ( 'read' ) )
            // InternalSeleniumDSL.g:1613:1: ( 'read' )
            {
            // InternalSeleniumDSL.g:1613:1: ( 'read' )
            // InternalSeleniumDSL.g:1614:2: 'read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1623:1: rule__Read__Group__3 : rule__Read__Group__3__Impl ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1627:1: ( rule__Read__Group__3__Impl )
            // InternalSeleniumDSL.g:1628:2: rule__Read__Group__3__Impl
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
    // InternalSeleniumDSL.g:1634:1: rule__Read__Group__3__Impl : ( ( rule__Read__NameAssignment_3 ) ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1638:1: ( ( ( rule__Read__NameAssignment_3 ) ) )
            // InternalSeleniumDSL.g:1639:1: ( ( rule__Read__NameAssignment_3 ) )
            {
            // InternalSeleniumDSL.g:1639:1: ( ( rule__Read__NameAssignment_3 ) )
            // InternalSeleniumDSL.g:1640:2: ( rule__Read__NameAssignment_3 )
            {
             before(grammarAccess.getReadAccess().getNameAssignment_3()); 
            // InternalSeleniumDSL.g:1641:2: ( rule__Read__NameAssignment_3 )
            // InternalSeleniumDSL.g:1641:3: rule__Read__NameAssignment_3
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
    // InternalSeleniumDSL.g:1650:1: rule__Assert__Group__0 : rule__Assert__Group__0__Impl rule__Assert__Group__1 ;
    public final void rule__Assert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1654:1: ( rule__Assert__Group__0__Impl rule__Assert__Group__1 )
            // InternalSeleniumDSL.g:1655:2: rule__Assert__Group__0__Impl rule__Assert__Group__1
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
    // InternalSeleniumDSL.g:1662:1: rule__Assert__Group__0__Impl : ( 'assert' ) ;
    public final void rule__Assert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1666:1: ( ( 'assert' ) )
            // InternalSeleniumDSL.g:1667:1: ( 'assert' )
            {
            // InternalSeleniumDSL.g:1667:1: ( 'assert' )
            // InternalSeleniumDSL.g:1668:2: 'assert'
            {
             before(grammarAccess.getAssertAccess().getAssertKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1677:1: rule__Assert__Group__1 : rule__Assert__Group__1__Impl ;
    public final void rule__Assert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1681:1: ( rule__Assert__Group__1__Impl )
            // InternalSeleniumDSL.g:1682:2: rule__Assert__Group__1__Impl
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
    // InternalSeleniumDSL.g:1688:1: rule__Assert__Group__1__Impl : ( ( rule__Assert__Alternatives_1 ) ) ;
    public final void rule__Assert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1692:1: ( ( ( rule__Assert__Alternatives_1 ) ) )
            // InternalSeleniumDSL.g:1693:1: ( ( rule__Assert__Alternatives_1 ) )
            {
            // InternalSeleniumDSL.g:1693:1: ( ( rule__Assert__Alternatives_1 ) )
            // InternalSeleniumDSL.g:1694:2: ( rule__Assert__Alternatives_1 )
            {
             before(grammarAccess.getAssertAccess().getAlternatives_1()); 
            // InternalSeleniumDSL.g:1695:2: ( rule__Assert__Alternatives_1 )
            // InternalSeleniumDSL.g:1695:3: rule__Assert__Alternatives_1
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
    // InternalSeleniumDSL.g:1704:1: rule__Assert__Group_1_0__0 : rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1 ;
    public final void rule__Assert__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1708:1: ( rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1 )
            // InternalSeleniumDSL.g:1709:2: rule__Assert__Group_1_0__0__Impl rule__Assert__Group_1_0__1
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
    // InternalSeleniumDSL.g:1716:1: rule__Assert__Group_1_0__0__Impl : ( ( rule__Assert__NameAssignment_1_0_0 ) ) ;
    public final void rule__Assert__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1720:1: ( ( ( rule__Assert__NameAssignment_1_0_0 ) ) )
            // InternalSeleniumDSL.g:1721:1: ( ( rule__Assert__NameAssignment_1_0_0 ) )
            {
            // InternalSeleniumDSL.g:1721:1: ( ( rule__Assert__NameAssignment_1_0_0 ) )
            // InternalSeleniumDSL.g:1722:2: ( rule__Assert__NameAssignment_1_0_0 )
            {
             before(grammarAccess.getAssertAccess().getNameAssignment_1_0_0()); 
            // InternalSeleniumDSL.g:1723:2: ( rule__Assert__NameAssignment_1_0_0 )
            // InternalSeleniumDSL.g:1723:3: rule__Assert__NameAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__NameAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getNameAssignment_1_0_0()); 

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
    // InternalSeleniumDSL.g:1731:1: rule__Assert__Group_1_0__1 : rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2 ;
    public final void rule__Assert__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1735:1: ( rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2 )
            // InternalSeleniumDSL.g:1736:2: rule__Assert__Group_1_0__1__Impl rule__Assert__Group_1_0__2
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
    // InternalSeleniumDSL.g:1743:1: rule__Assert__Group_1_0__1__Impl : ( ( rule__Assert__TypeAssignment_1_0_1 ) ) ;
    public final void rule__Assert__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1747:1: ( ( ( rule__Assert__TypeAssignment_1_0_1 ) ) )
            // InternalSeleniumDSL.g:1748:1: ( ( rule__Assert__TypeAssignment_1_0_1 ) )
            {
            // InternalSeleniumDSL.g:1748:1: ( ( rule__Assert__TypeAssignment_1_0_1 ) )
            // InternalSeleniumDSL.g:1749:2: ( rule__Assert__TypeAssignment_1_0_1 )
            {
             before(grammarAccess.getAssertAccess().getTypeAssignment_1_0_1()); 
            // InternalSeleniumDSL.g:1750:2: ( rule__Assert__TypeAssignment_1_0_1 )
            // InternalSeleniumDSL.g:1750:3: rule__Assert__TypeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Assert__TypeAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getTypeAssignment_1_0_1()); 

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
    // InternalSeleniumDSL.g:1758:1: rule__Assert__Group_1_0__2 : rule__Assert__Group_1_0__2__Impl ;
    public final void rule__Assert__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1762:1: ( rule__Assert__Group_1_0__2__Impl )
            // InternalSeleniumDSL.g:1763:2: rule__Assert__Group_1_0__2__Impl
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
    // InternalSeleniumDSL.g:1769:1: rule__Assert__Group_1_0__2__Impl : ( ( rule__Assert__ValueAssignment_1_0_2 ) ) ;
    public final void rule__Assert__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1773:1: ( ( ( rule__Assert__ValueAssignment_1_0_2 ) ) )
            // InternalSeleniumDSL.g:1774:1: ( ( rule__Assert__ValueAssignment_1_0_2 ) )
            {
            // InternalSeleniumDSL.g:1774:1: ( ( rule__Assert__ValueAssignment_1_0_2 ) )
            // InternalSeleniumDSL.g:1775:2: ( rule__Assert__ValueAssignment_1_0_2 )
            {
             before(grammarAccess.getAssertAccess().getValueAssignment_1_0_2()); 
            // InternalSeleniumDSL.g:1776:2: ( rule__Assert__ValueAssignment_1_0_2 )
            // InternalSeleniumDSL.g:1776:3: rule__Assert__ValueAssignment_1_0_2
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
    // InternalSeleniumDSL.g:1785:1: rule__Assert__Group_1_1__0 : rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1 ;
    public final void rule__Assert__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1789:1: ( rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1 )
            // InternalSeleniumDSL.g:1790:2: rule__Assert__Group_1_1__0__Impl rule__Assert__Group_1_1__1
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
    // InternalSeleniumDSL.g:1797:1: rule__Assert__Group_1_1__0__Impl : ( ( rule__Assert__NameAssignment_1_1_0 ) ) ;
    public final void rule__Assert__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1801:1: ( ( ( rule__Assert__NameAssignment_1_1_0 ) ) )
            // InternalSeleniumDSL.g:1802:1: ( ( rule__Assert__NameAssignment_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:1802:1: ( ( rule__Assert__NameAssignment_1_1_0 ) )
            // InternalSeleniumDSL.g:1803:2: ( rule__Assert__NameAssignment_1_1_0 )
            {
             before(grammarAccess.getAssertAccess().getNameAssignment_1_1_0()); 
            // InternalSeleniumDSL.g:1804:2: ( rule__Assert__NameAssignment_1_1_0 )
            // InternalSeleniumDSL.g:1804:3: rule__Assert__NameAssignment_1_1_0
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
    // InternalSeleniumDSL.g:1812:1: rule__Assert__Group_1_1__1 : rule__Assert__Group_1_1__1__Impl ;
    public final void rule__Assert__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1816:1: ( rule__Assert__Group_1_1__1__Impl )
            // InternalSeleniumDSL.g:1817:2: rule__Assert__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assert__Group_1_1__1__Impl();

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
    // InternalSeleniumDSL.g:1823:1: rule__Assert__Group_1_1__1__Impl : ( ( rule__Assert__TypeAssignment_1_1_1 ) ) ;
    public final void rule__Assert__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1827:1: ( ( ( rule__Assert__TypeAssignment_1_1_1 ) ) )
            // InternalSeleniumDSL.g:1828:1: ( ( rule__Assert__TypeAssignment_1_1_1 ) )
            {
            // InternalSeleniumDSL.g:1828:1: ( ( rule__Assert__TypeAssignment_1_1_1 ) )
            // InternalSeleniumDSL.g:1829:2: ( rule__Assert__TypeAssignment_1_1_1 )
            {
             before(grammarAccess.getAssertAccess().getTypeAssignment_1_1_1()); 
            // InternalSeleniumDSL.g:1830:2: ( rule__Assert__TypeAssignment_1_1_1 )
            // InternalSeleniumDSL.g:1830:3: rule__Assert__TypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Assert__TypeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getTypeAssignment_1_1_1()); 

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


    // $ANTLR start "rule__CallProcedure__Group__0"
    // InternalSeleniumDSL.g:1839:1: rule__CallProcedure__Group__0 : rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 ;
    public final void rule__CallProcedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1843:1: ( rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1 )
            // InternalSeleniumDSL.g:1844:2: rule__CallProcedure__Group__0__Impl rule__CallProcedure__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSeleniumDSL.g:1851:1: rule__CallProcedure__Group__0__Impl : ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) ) ;
    public final void rule__CallProcedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1855:1: ( ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) ) )
            // InternalSeleniumDSL.g:1856:1: ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) )
            {
            // InternalSeleniumDSL.g:1856:1: ( ( rule__CallProcedure__ProcedureNameAssignment_0 ) )
            // InternalSeleniumDSL.g:1857:2: ( rule__CallProcedure__ProcedureNameAssignment_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getProcedureNameAssignment_0()); 
            // InternalSeleniumDSL.g:1858:2: ( rule__CallProcedure__ProcedureNameAssignment_0 )
            // InternalSeleniumDSL.g:1858:3: rule__CallProcedure__ProcedureNameAssignment_0
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
    // InternalSeleniumDSL.g:1866:1: rule__CallProcedure__Group__1 : rule__CallProcedure__Group__1__Impl ;
    public final void rule__CallProcedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1870:1: ( rule__CallProcedure__Group__1__Impl )
            // InternalSeleniumDSL.g:1871:2: rule__CallProcedure__Group__1__Impl
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
    // InternalSeleniumDSL.g:1877:1: rule__CallProcedure__Group__1__Impl : ( ( rule__CallProcedure__Group_1__0 )? ) ;
    public final void rule__CallProcedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1881:1: ( ( ( rule__CallProcedure__Group_1__0 )? ) )
            // InternalSeleniumDSL.g:1882:1: ( ( rule__CallProcedure__Group_1__0 )? )
            {
            // InternalSeleniumDSL.g:1882:1: ( ( rule__CallProcedure__Group_1__0 )? )
            // InternalSeleniumDSL.g:1883:2: ( rule__CallProcedure__Group_1__0 )?
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1()); 
            // InternalSeleniumDSL.g:1884:2: ( rule__CallProcedure__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSeleniumDSL.g:1884:3: rule__CallProcedure__Group_1__0
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
    // InternalSeleniumDSL.g:1893:1: rule__CallProcedure__Group_1__0 : rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1 ;
    public final void rule__CallProcedure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1897:1: ( rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1 )
            // InternalSeleniumDSL.g:1898:2: rule__CallProcedure__Group_1__0__Impl rule__CallProcedure__Group_1__1
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
    // InternalSeleniumDSL.g:1905:1: rule__CallProcedure__Group_1__0__Impl : ( '(' ) ;
    public final void rule__CallProcedure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1909:1: ( ( '(' ) )
            // InternalSeleniumDSL.g:1910:1: ( '(' )
            {
            // InternalSeleniumDSL.g:1910:1: ( '(' )
            // InternalSeleniumDSL.g:1911:2: '('
            {
             before(grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1920:1: rule__CallProcedure__Group_1__1 : rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2 ;
    public final void rule__CallProcedure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1924:1: ( rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2 )
            // InternalSeleniumDSL.g:1925:2: rule__CallProcedure__Group_1__1__Impl rule__CallProcedure__Group_1__2
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
    // InternalSeleniumDSL.g:1932:1: rule__CallProcedure__Group_1__1__Impl : ( ( rule__CallProcedure__Group_1_1__0 ) ) ;
    public final void rule__CallProcedure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1936:1: ( ( ( rule__CallProcedure__Group_1_1__0 ) ) )
            // InternalSeleniumDSL.g:1937:1: ( ( rule__CallProcedure__Group_1_1__0 ) )
            {
            // InternalSeleniumDSL.g:1937:1: ( ( rule__CallProcedure__Group_1_1__0 ) )
            // InternalSeleniumDSL.g:1938:2: ( rule__CallProcedure__Group_1_1__0 )
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1_1()); 
            // InternalSeleniumDSL.g:1939:2: ( rule__CallProcedure__Group_1_1__0 )
            // InternalSeleniumDSL.g:1939:3: rule__CallProcedure__Group_1_1__0
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
    // InternalSeleniumDSL.g:1947:1: rule__CallProcedure__Group_1__2 : rule__CallProcedure__Group_1__2__Impl ;
    public final void rule__CallProcedure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1951:1: ( rule__CallProcedure__Group_1__2__Impl )
            // InternalSeleniumDSL.g:1952:2: rule__CallProcedure__Group_1__2__Impl
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
    // InternalSeleniumDSL.g:1958:1: rule__CallProcedure__Group_1__2__Impl : ( ')' ) ;
    public final void rule__CallProcedure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1962:1: ( ( ')' ) )
            // InternalSeleniumDSL.g:1963:1: ( ')' )
            {
            // InternalSeleniumDSL.g:1963:1: ( ')' )
            // InternalSeleniumDSL.g:1964:2: ')'
            {
             before(grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSeleniumDSL.g:1974:1: rule__CallProcedure__Group_1_1__0 : rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1 ;
    public final void rule__CallProcedure__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1978:1: ( rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1 )
            // InternalSeleniumDSL.g:1979:2: rule__CallProcedure__Group_1_1__0__Impl rule__CallProcedure__Group_1_1__1
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
    // InternalSeleniumDSL.g:1986:1: rule__CallProcedure__Group_1_1__0__Impl : ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) ) ;
    public final void rule__CallProcedure__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:1990:1: ( ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) ) )
            // InternalSeleniumDSL.g:1991:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:1991:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_0 ) )
            // InternalSeleniumDSL.g:1992:2: ( rule__CallProcedure__ParametersAssignment_1_1_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_0()); 
            // InternalSeleniumDSL.g:1993:2: ( rule__CallProcedure__ParametersAssignment_1_1_0 )
            // InternalSeleniumDSL.g:1993:3: rule__CallProcedure__ParametersAssignment_1_1_0
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
    // InternalSeleniumDSL.g:2001:1: rule__CallProcedure__Group_1_1__1 : rule__CallProcedure__Group_1_1__1__Impl ;
    public final void rule__CallProcedure__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2005:1: ( rule__CallProcedure__Group_1_1__1__Impl )
            // InternalSeleniumDSL.g:2006:2: rule__CallProcedure__Group_1_1__1__Impl
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
    // InternalSeleniumDSL.g:2012:1: rule__CallProcedure__Group_1_1__1__Impl : ( ( rule__CallProcedure__Group_1_1_1__0 )* ) ;
    public final void rule__CallProcedure__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2016:1: ( ( ( rule__CallProcedure__Group_1_1_1__0 )* ) )
            // InternalSeleniumDSL.g:2017:1: ( ( rule__CallProcedure__Group_1_1_1__0 )* )
            {
            // InternalSeleniumDSL.g:2017:1: ( ( rule__CallProcedure__Group_1_1_1__0 )* )
            // InternalSeleniumDSL.g:2018:2: ( rule__CallProcedure__Group_1_1_1__0 )*
            {
             before(grammarAccess.getCallProcedureAccess().getGroup_1_1_1()); 
            // InternalSeleniumDSL.g:2019:2: ( rule__CallProcedure__Group_1_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSeleniumDSL.g:2019:3: rule__CallProcedure__Group_1_1_1__0
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
    // InternalSeleniumDSL.g:2028:1: rule__CallProcedure__Group_1_1_1__0 : rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1 ;
    public final void rule__CallProcedure__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2032:1: ( rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1 )
            // InternalSeleniumDSL.g:2033:2: rule__CallProcedure__Group_1_1_1__0__Impl rule__CallProcedure__Group_1_1_1__1
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
    // InternalSeleniumDSL.g:2040:1: rule__CallProcedure__Group_1_1_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__CallProcedure__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2044:1: ( ( RULE_COMMA ) )
            // InternalSeleniumDSL.g:2045:1: ( RULE_COMMA )
            {
            // InternalSeleniumDSL.g:2045:1: ( RULE_COMMA )
            // InternalSeleniumDSL.g:2046:2: RULE_COMMA
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
    // InternalSeleniumDSL.g:2055:1: rule__CallProcedure__Group_1_1_1__1 : rule__CallProcedure__Group_1_1_1__1__Impl ;
    public final void rule__CallProcedure__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2059:1: ( rule__CallProcedure__Group_1_1_1__1__Impl )
            // InternalSeleniumDSL.g:2060:2: rule__CallProcedure__Group_1_1_1__1__Impl
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
    // InternalSeleniumDSL.g:2066:1: rule__CallProcedure__Group_1_1_1__1__Impl : ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) ) ;
    public final void rule__CallProcedure__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2070:1: ( ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) ) )
            // InternalSeleniumDSL.g:2071:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) )
            {
            // InternalSeleniumDSL.g:2071:1: ( ( rule__CallProcedure__ParametersAssignment_1_1_1_1 ) )
            // InternalSeleniumDSL.g:2072:2: ( rule__CallProcedure__ParametersAssignment_1_1_1_1 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAssignment_1_1_1_1()); 
            // InternalSeleniumDSL.g:2073:2: ( rule__CallProcedure__ParametersAssignment_1_1_1_1 )
            // InternalSeleniumDSL.g:2073:3: rule__CallProcedure__ParametersAssignment_1_1_1_1
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
    // InternalSeleniumDSL.g:2082:1: rule__SeleniumTest__ProceduresAssignment_0 : ( ruleProcedure ) ;
    public final void rule__SeleniumTest__ProceduresAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2086:1: ( ( ruleProcedure ) )
            // InternalSeleniumDSL.g:2087:2: ( ruleProcedure )
            {
            // InternalSeleniumDSL.g:2087:2: ( ruleProcedure )
            // InternalSeleniumDSL.g:2088:3: ruleProcedure
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
    // InternalSeleniumDSL.g:2097:1: rule__SeleniumTest__MainAssignment_1 : ( ruleMainProcedure ) ;
    public final void rule__SeleniumTest__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2101:1: ( ( ruleMainProcedure ) )
            // InternalSeleniumDSL.g:2102:2: ( ruleMainProcedure )
            {
            // InternalSeleniumDSL.g:2102:2: ( ruleMainProcedure )
            // InternalSeleniumDSL.g:2103:3: ruleMainProcedure
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
    // InternalSeleniumDSL.g:2112:1: rule__Procedure__NameAssignment_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2116:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2117:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2117:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2118:3: RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:2127:1: rule__Procedure__ParametersAssignment_2_1_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2131:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2132:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2132:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2133:3: RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:2142:1: rule__Procedure__ParametersAssignment_2_1_1_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__Procedure__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2146:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2147:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2147:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2148:3: RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:2157:1: rule__Procedure__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Procedure__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2161:1: ( ( ruleInstruction ) )
            // InternalSeleniumDSL.g:2162:2: ( ruleInstruction )
            {
            // InternalSeleniumDSL.g:2162:2: ( ruleInstruction )
            // InternalSeleniumDSL.g:2163:3: ruleInstruction
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
    // InternalSeleniumDSL.g:2172:1: rule__MainProcedure__InstructionsAssignment_4 : ( ruleInstruction ) ;
    public final void rule__MainProcedure__InstructionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2176:1: ( ( ruleInstruction ) )
            // InternalSeleniumDSL.g:2177:2: ( ruleInstruction )
            {
            // InternalSeleniumDSL.g:2177:2: ( ruleInstruction )
            // InternalSeleniumDSL.g:2178:3: ruleInstruction
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
    // InternalSeleniumDSL.g:2187:1: rule__Click__TypeAssignment_1 : ( ( rule__Click__TypeAlternatives_1_0 ) ) ;
    public final void rule__Click__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2191:1: ( ( ( rule__Click__TypeAlternatives_1_0 ) ) )
            // InternalSeleniumDSL.g:2192:2: ( ( rule__Click__TypeAlternatives_1_0 ) )
            {
            // InternalSeleniumDSL.g:2192:2: ( ( rule__Click__TypeAlternatives_1_0 ) )
            // InternalSeleniumDSL.g:2193:3: ( rule__Click__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getClickAccess().getTypeAlternatives_1_0()); 
            // InternalSeleniumDSL.g:2194:3: ( rule__Click__TypeAlternatives_1_0 )
            // InternalSeleniumDSL.g:2194:4: rule__Click__TypeAlternatives_1_0
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
    // InternalSeleniumDSL.g:2202:1: rule__Click__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Click__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2206:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2207:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2207:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2208:3: RULE_STRING
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
    // InternalSeleniumDSL.g:2217:1: rule__Fill__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2221:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2222:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2222:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2223:3: RULE_STRING
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
    // InternalSeleniumDSL.g:2232:1: rule__Fill__ValueAssignment_2 : ( ( rule__Fill__ValueAlternatives_2_0 ) ) ;
    public final void rule__Fill__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2236:1: ( ( ( rule__Fill__ValueAlternatives_2_0 ) ) )
            // InternalSeleniumDSL.g:2237:2: ( ( rule__Fill__ValueAlternatives_2_0 ) )
            {
            // InternalSeleniumDSL.g:2237:2: ( ( rule__Fill__ValueAlternatives_2_0 ) )
            // InternalSeleniumDSL.g:2238:3: ( rule__Fill__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getFillAccess().getValueAlternatives_2_0()); 
            // InternalSeleniumDSL.g:2239:3: ( rule__Fill__ValueAlternatives_2_0 )
            // InternalSeleniumDSL.g:2239:4: rule__Fill__ValueAlternatives_2_0
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
    // InternalSeleniumDSL.g:2247:1: rule__Select__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Select__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2251:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2252:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2252:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2253:3: RULE_STRING
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
    // InternalSeleniumDSL.g:2262:1: rule__Select__ValueAssignment_2 : ( ( rule__Select__ValueAlternatives_2_0 ) ) ;
    public final void rule__Select__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2266:1: ( ( ( rule__Select__ValueAlternatives_2_0 ) ) )
            // InternalSeleniumDSL.g:2267:2: ( ( rule__Select__ValueAlternatives_2_0 ) )
            {
            // InternalSeleniumDSL.g:2267:2: ( ( rule__Select__ValueAlternatives_2_0 ) )
            // InternalSeleniumDSL.g:2268:3: ( rule__Select__ValueAlternatives_2_0 )
            {
             before(grammarAccess.getSelectAccess().getValueAlternatives_2_0()); 
            // InternalSeleniumDSL.g:2269:3: ( rule__Select__ValueAlternatives_2_0 )
            // InternalSeleniumDSL.g:2269:4: rule__Select__ValueAlternatives_2_0
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
    // InternalSeleniumDSL.g:2277:1: rule__Tick__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tick__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2281:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2282:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2282:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2283:3: RULE_STRING
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
    // InternalSeleniumDSL.g:2292:1: rule__Navigate__UrlAssignment_1 : ( ( rule__Navigate__UrlAlternatives_1_0 ) ) ;
    public final void rule__Navigate__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2296:1: ( ( ( rule__Navigate__UrlAlternatives_1_0 ) ) )
            // InternalSeleniumDSL.g:2297:2: ( ( rule__Navigate__UrlAlternatives_1_0 ) )
            {
            // InternalSeleniumDSL.g:2297:2: ( ( rule__Navigate__UrlAlternatives_1_0 ) )
            // InternalSeleniumDSL.g:2298:3: ( rule__Navigate__UrlAlternatives_1_0 )
            {
             before(grammarAccess.getNavigateAccess().getUrlAlternatives_1_0()); 
            // InternalSeleniumDSL.g:2299:3: ( rule__Navigate__UrlAlternatives_1_0 )
            // InternalSeleniumDSL.g:2299:4: rule__Navigate__UrlAlternatives_1_0
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
    // InternalSeleniumDSL.g:2307:1: rule__Read__VariableAssignment_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__Read__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2311:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2312:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2312:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2313:3: RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:2322:1: rule__Read__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Read__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2326:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2327:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2327:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2328:3: RULE_STRING
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


    // $ANTLR start "rule__Assert__NameAssignment_1_0_0"
    // InternalSeleniumDSL.g:2337:1: rule__Assert__NameAssignment_1_0_0 : ( RULE_STRING ) ;
    public final void rule__Assert__NameAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2341:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2342:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2342:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2343:3: RULE_STRING
            {
             before(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_0_0_0()); 

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
    // $ANTLR end "rule__Assert__NameAssignment_1_0_0"


    // $ANTLR start "rule__Assert__TypeAssignment_1_0_1"
    // InternalSeleniumDSL.g:2352:1: rule__Assert__TypeAssignment_1_0_1 : ( ( rule__Assert__TypeAlternatives_1_0_1_0 ) ) ;
    public final void rule__Assert__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2356:1: ( ( ( rule__Assert__TypeAlternatives_1_0_1_0 ) ) )
            // InternalSeleniumDSL.g:2357:2: ( ( rule__Assert__TypeAlternatives_1_0_1_0 ) )
            {
            // InternalSeleniumDSL.g:2357:2: ( ( rule__Assert__TypeAlternatives_1_0_1_0 ) )
            // InternalSeleniumDSL.g:2358:3: ( rule__Assert__TypeAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getAssertAccess().getTypeAlternatives_1_0_1_0()); 
            // InternalSeleniumDSL.g:2359:3: ( rule__Assert__TypeAlternatives_1_0_1_0 )
            // InternalSeleniumDSL.g:2359:4: rule__Assert__TypeAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Assert__TypeAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertAccess().getTypeAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__Assert__TypeAssignment_1_0_1"


    // $ANTLR start "rule__Assert__ValueAssignment_1_0_2"
    // InternalSeleniumDSL.g:2367:1: rule__Assert__ValueAssignment_1_0_2 : ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) ) ;
    public final void rule__Assert__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2371:1: ( ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) ) )
            // InternalSeleniumDSL.g:2372:2: ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) )
            {
            // InternalSeleniumDSL.g:2372:2: ( ( rule__Assert__ValueAlternatives_1_0_2_0 ) )
            // InternalSeleniumDSL.g:2373:3: ( rule__Assert__ValueAlternatives_1_0_2_0 )
            {
             before(grammarAccess.getAssertAccess().getValueAlternatives_1_0_2_0()); 
            // InternalSeleniumDSL.g:2374:3: ( rule__Assert__ValueAlternatives_1_0_2_0 )
            // InternalSeleniumDSL.g:2374:4: rule__Assert__ValueAlternatives_1_0_2_0
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
    // InternalSeleniumDSL.g:2382:1: rule__Assert__NameAssignment_1_1_0 : ( RULE_STRING ) ;
    public final void rule__Assert__NameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2386:1: ( ( RULE_STRING ) )
            // InternalSeleniumDSL.g:2387:2: ( RULE_STRING )
            {
            // InternalSeleniumDSL.g:2387:2: ( RULE_STRING )
            // InternalSeleniumDSL.g:2388:3: RULE_STRING
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


    // $ANTLR start "rule__Assert__TypeAssignment_1_1_1"
    // InternalSeleniumDSL.g:2397:1: rule__Assert__TypeAssignment_1_1_1 : ( ( 'exists' ) ) ;
    public final void rule__Assert__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2401:1: ( ( ( 'exists' ) ) )
            // InternalSeleniumDSL.g:2402:2: ( ( 'exists' ) )
            {
            // InternalSeleniumDSL.g:2402:2: ( ( 'exists' ) )
            // InternalSeleniumDSL.g:2403:3: ( 'exists' )
            {
             before(grammarAccess.getAssertAccess().getTypeExistsKeyword_1_1_1_0()); 
            // InternalSeleniumDSL.g:2404:3: ( 'exists' )
            // InternalSeleniumDSL.g:2405:4: 'exists'
            {
             before(grammarAccess.getAssertAccess().getTypeExistsKeyword_1_1_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAssertAccess().getTypeExistsKeyword_1_1_1_0()); 

            }

             after(grammarAccess.getAssertAccess().getTypeExistsKeyword_1_1_1_0()); 

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
    // $ANTLR end "rule__Assert__TypeAssignment_1_1_1"


    // $ANTLR start "rule__CallProcedure__ProcedureNameAssignment_0"
    // InternalSeleniumDSL.g:2416:1: rule__CallProcedure__ProcedureNameAssignment_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__CallProcedure__ProcedureNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2420:1: ( ( RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:2421:2: ( RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:2421:2: ( RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:2422:3: RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:2431:1: rule__CallProcedure__ParametersAssignment_1_1_0 : ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) ) ;
    public final void rule__CallProcedure__ParametersAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2435:1: ( ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) ) )
            // InternalSeleniumDSL.g:2436:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) )
            {
            // InternalSeleniumDSL.g:2436:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 ) )
            // InternalSeleniumDSL.g:2437:3: ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_0_0()); 
            // InternalSeleniumDSL.g:2438:3: ( rule__CallProcedure__ParametersAlternatives_1_1_0_0 )
            // InternalSeleniumDSL.g:2438:4: rule__CallProcedure__ParametersAlternatives_1_1_0_0
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
    // InternalSeleniumDSL.g:2446:1: rule__CallProcedure__ParametersAssignment_1_1_1_1 : ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) ) ;
    public final void rule__CallProcedure__ParametersAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSeleniumDSL.g:2450:1: ( ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) ) )
            // InternalSeleniumDSL.g:2451:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) )
            {
            // InternalSeleniumDSL.g:2451:2: ( ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 ) )
            // InternalSeleniumDSL.g:2452:3: ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 )
            {
             before(grammarAccess.getCallProcedureAccess().getParametersAlternatives_1_1_1_1_0()); 
            // InternalSeleniumDSL.g:2453:3: ( rule__CallProcedure__ParametersAlternatives_1_1_1_1_0 )
            // InternalSeleniumDSL.g:2453:4: rule__CallProcedure__ParametersAlternatives_1_1_1_1_0
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
    static final String dfa_2s = "\7\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\5\6\uffff\1\5\2\uffff";
    static final String dfa_4s = "\1\40\6\uffff\1\40\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\23\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\17\uffff\2\11\2\uffff\5\11\1\10\1\uffff\1\11",
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000013E200020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000013E000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});

}