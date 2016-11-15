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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_COMMA", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'('", "')'", "'{'", "'}'", "'main'", "'click'", "'input'", "'link'", "'name'", "'xpath'", "'fill'", "'select'", "'tick'", "'navigate'", "'='", "'read'", "'assert'", "'contains'", "'equals'", "'exists'"
    };
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=6;
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
    public static final int RULE_COMMA=5;
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




    // $ANTLR start "entryRuleSeleniumTest"
    // InternalSeleniumDSL.g:64:1: entryRuleSeleniumTest returns [EObject current=null] : iv_ruleSeleniumTest= ruleSeleniumTest EOF ;
    public final EObject entryRuleSeleniumTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeleniumTest = null;


        try {
            // InternalSeleniumDSL.g:64:53: (iv_ruleSeleniumTest= ruleSeleniumTest EOF )
            // InternalSeleniumDSL.g:65:2: iv_ruleSeleniumTest= ruleSeleniumTest EOF
            {
             newCompositeNode(grammarAccess.getSeleniumTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeleniumTest=ruleSeleniumTest();

            state._fsp--;

             current =iv_ruleSeleniumTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeleniumTest"


    // $ANTLR start "ruleSeleniumTest"
    // InternalSeleniumDSL.g:71:1: ruleSeleniumTest returns [EObject current=null] : ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_main_1_0= ruleMainProcedure ) ) ) ;
    public final EObject ruleSeleniumTest() throws RecognitionException {
        EObject current = null;

        EObject lv_procedures_0_0 = null;

        EObject lv_main_1_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:77:2: ( ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_main_1_0= ruleMainProcedure ) ) ) )
            // InternalSeleniumDSL.g:78:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_main_1_0= ruleMainProcedure ) ) )
            {
            // InternalSeleniumDSL.g:78:2: ( ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_main_1_0= ruleMainProcedure ) ) )
            // InternalSeleniumDSL.g:79:3: ( (lv_procedures_0_0= ruleProcedure ) )* ( (lv_main_1_0= ruleMainProcedure ) )
            {
            // InternalSeleniumDSL.g:79:3: ( (lv_procedures_0_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_IDENTIFIER) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalSeleniumDSL.g:80:4: (lv_procedures_0_0= ruleProcedure )
            	    {
            	    // InternalSeleniumDSL.g:80:4: (lv_procedures_0_0= ruleProcedure )
            	    // InternalSeleniumDSL.g:81:5: lv_procedures_0_0= ruleProcedure
            	    {

            	    					newCompositeNode(grammarAccess.getSeleniumTestAccess().getProceduresProcedureParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_procedures_0_0=ruleProcedure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSeleniumTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"procedures",
            	    						lv_procedures_0_0,
            	    						"fr.minesnantes.browserautomation.SeleniumDSL.Procedure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSeleniumDSL.g:98:3: ( (lv_main_1_0= ruleMainProcedure ) )
            // InternalSeleniumDSL.g:99:4: (lv_main_1_0= ruleMainProcedure )
            {
            // InternalSeleniumDSL.g:99:4: (lv_main_1_0= ruleMainProcedure )
            // InternalSeleniumDSL.g:100:5: lv_main_1_0= ruleMainProcedure
            {

            					newCompositeNode(grammarAccess.getSeleniumTestAccess().getMainMainProcedureParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_main_1_0=ruleMainProcedure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeleniumTestRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_1_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.MainProcedure");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeleniumTest"


    // $ANTLR start "entryRuleProcedure"
    // InternalSeleniumDSL.g:121:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalSeleniumDSL.g:121:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalSeleniumDSL.g:122:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalSeleniumDSL.g:128:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'def' ( (lv_Name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )? otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;
        Token otherlv_2=null;
        Token lv_Parameters_3_0=null;
        Token this_COMMA_4=null;
        Token lv_Parameters_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_instructions_8_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:134:2: ( (otherlv_0= 'def' ( (lv_Name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )? otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' ) )
            // InternalSeleniumDSL.g:135:2: (otherlv_0= 'def' ( (lv_Name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )? otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
            {
            // InternalSeleniumDSL.g:135:2: (otherlv_0= 'def' ( (lv_Name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )? otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}' )
            // InternalSeleniumDSL.g:136:3: otherlv_0= 'def' ( (lv_Name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )? otherlv_7= '{' ( (lv_instructions_8_0= ruleInstruction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getDefKeyword_0());
            		
            // InternalSeleniumDSL.g:140:3: ( (lv_Name_1_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:141:4: (lv_Name_1_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:141:4: (lv_Name_1_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:142:5: lv_Name_1_0= RULE_IDENTIFIER
            {
            lv_Name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_5); 

            					newLeafNode(lv_Name_1_0, grammarAccess.getProcedureAccess().getNameIDENTIFIERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_1_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            				

            }


            }

            // InternalSeleniumDSL.g:158:3: (otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumDSL.g:159:4: otherlv_2= '(' ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalSeleniumDSL.g:163:4: ( ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )* )
                    // InternalSeleniumDSL.g:164:5: ( (lv_Parameters_3_0= RULE_IDENTIFIER ) ) (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )*
                    {
                    // InternalSeleniumDSL.g:164:5: ( (lv_Parameters_3_0= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:165:6: (lv_Parameters_3_0= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:165:6: (lv_Parameters_3_0= RULE_IDENTIFIER )
                    // InternalSeleniumDSL.g:166:7: lv_Parameters_3_0= RULE_IDENTIFIER
                    {
                    lv_Parameters_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_6); 

                    							newLeafNode(lv_Parameters_3_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getProcedureRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"Parameters",
                    								lv_Parameters_3_0,
                    								"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    						

                    }


                    }

                    // InternalSeleniumDSL.g:182:5: (this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMA) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSeleniumDSL.g:183:6: this_COMMA_4= RULE_COMMA ( (lv_Parameters_5_0= RULE_IDENTIFIER ) )
                    	    {
                    	    this_COMMA_4=(Token)match(input,RULE_COMMA,FOLLOW_4); 

                    	    						newLeafNode(this_COMMA_4, grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_2_1_1_0());
                    	    					
                    	    // InternalSeleniumDSL.g:187:6: ( (lv_Parameters_5_0= RULE_IDENTIFIER ) )
                    	    // InternalSeleniumDSL.g:188:7: (lv_Parameters_5_0= RULE_IDENTIFIER )
                    	    {
                    	    // InternalSeleniumDSL.g:188:7: (lv_Parameters_5_0= RULE_IDENTIFIER )
                    	    // InternalSeleniumDSL.g:189:8: lv_Parameters_5_0= RULE_IDENTIFIER
                    	    {
                    	    lv_Parameters_5_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_6); 

                    	    								newLeafNode(lv_Parameters_5_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getProcedureRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"Parameters",
                    	    									lv_Parameters_5_0,
                    	    									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getProcedureAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSeleniumDSL.g:216:3: ( (lv_instructions_8_0= ruleInstruction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_IDENTIFIER||LA4_0==19||(LA4_0>=24 && LA4_0<=27)||LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeleniumDSL.g:217:4: (lv_instructions_8_0= ruleInstruction )
            	    {
            	    // InternalSeleniumDSL.g:217:4: (lv_instructions_8_0= ruleInstruction )
            	    // InternalSeleniumDSL.g:218:5: lv_instructions_8_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getInstructionsInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_instructions_8_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_8_0,
            	    						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleMainProcedure"
    // InternalSeleniumDSL.g:243:1: entryRuleMainProcedure returns [EObject current=null] : iv_ruleMainProcedure= ruleMainProcedure EOF ;
    public final EObject entryRuleMainProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProcedure = null;


        try {
            // InternalSeleniumDSL.g:243:54: (iv_ruleMainProcedure= ruleMainProcedure EOF )
            // InternalSeleniumDSL.g:244:2: iv_ruleMainProcedure= ruleMainProcedure EOF
            {
             newCompositeNode(grammarAccess.getMainProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainProcedure=ruleMainProcedure();

            state._fsp--;

             current =iv_ruleMainProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainProcedure"


    // $ANTLR start "ruleMainProcedure"
    // InternalSeleniumDSL.g:250:1: ruleMainProcedure returns [EObject current=null] : ( () (otherlv_1= 'def' )+ (otherlv_2= 'main' )+ otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleMainProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_instructions_4_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:256:2: ( ( () (otherlv_1= 'def' )+ (otherlv_2= 'main' )+ otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // InternalSeleniumDSL.g:257:2: ( () (otherlv_1= 'def' )+ (otherlv_2= 'main' )+ otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // InternalSeleniumDSL.g:257:2: ( () (otherlv_1= 'def' )+ (otherlv_2= 'main' )+ otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // InternalSeleniumDSL.g:258:3: () (otherlv_1= 'def' )+ (otherlv_2= 'main' )+ otherlv_3= '{' ( (lv_instructions_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            // InternalSeleniumDSL.g:258:3: ()
            // InternalSeleniumDSL.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainProcedureAccess().getMainProcedureAction_0(),
            					current);
            			

            }

            // InternalSeleniumDSL.g:265:3: (otherlv_1= 'def' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeleniumDSL.g:266:4: otherlv_1= 'def'
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMainProcedureAccess().getDefKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalSeleniumDSL.g:271:3: (otherlv_2= 'main' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeleniumDSL.g:272:4: otherlv_2= 'main'
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMainProcedureAccess().getMainKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMainProcedureAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSeleniumDSL.g:281:3: ( (lv_instructions_4_0= ruleInstruction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_IDENTIFIER||LA7_0==19||(LA7_0>=24 && LA7_0<=27)||LA7_0==30) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSeleniumDSL.g:282:4: (lv_instructions_4_0= ruleInstruction )
            	    {
            	    // InternalSeleniumDSL.g:282:4: (lv_instructions_4_0= ruleInstruction )
            	    // InternalSeleniumDSL.g:283:5: lv_instructions_4_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getMainProcedureAccess().getInstructionsInstructionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_instructions_4_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_4_0,
            	    						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMainProcedureAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainProcedure"


    // $ANTLR start "entryRuleInstruction"
    // InternalSeleniumDSL.g:308:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalSeleniumDSL.g:308:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalSeleniumDSL.g:309:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalSeleniumDSL.g:315:1: ruleInstruction returns [EObject current=null] : (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Tick_3= ruleTick | this_Navigate_4= ruleNavigate | this_Assert_5= ruleAssert | this_Read_6= ruleRead | this_CallProcedure_7= ruleCallProcedure ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Fill_1 = null;

        EObject this_Select_2 = null;

        EObject this_Tick_3 = null;

        EObject this_Navigate_4 = null;

        EObject this_Assert_5 = null;

        EObject this_Read_6 = null;

        EObject this_CallProcedure_7 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:321:2: ( (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Tick_3= ruleTick | this_Navigate_4= ruleNavigate | this_Assert_5= ruleAssert | this_Read_6= ruleRead | this_CallProcedure_7= ruleCallProcedure ) )
            // InternalSeleniumDSL.g:322:2: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Tick_3= ruleTick | this_Navigate_4= ruleNavigate | this_Assert_5= ruleAssert | this_Read_6= ruleRead | this_CallProcedure_7= ruleCallProcedure )
            {
            // InternalSeleniumDSL.g:322:2: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Tick_3= ruleTick | this_Navigate_4= ruleNavigate | this_Assert_5= ruleAssert | this_Read_6= ruleRead | this_CallProcedure_7= ruleCallProcedure )
            int alt8=8;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDSL.g:323:3: this_Click_0= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    			current = this_Click_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:332:3: this_Fill_1= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFillParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_1=ruleFill();

                    state._fsp--;


                    			current = this_Fill_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:341:3: this_Select_2= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_2=ruleSelect();

                    state._fsp--;


                    			current = this_Select_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSeleniumDSL.g:350:3: this_Tick_3= ruleTick
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getTickParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tick_3=ruleTick();

                    state._fsp--;


                    			current = this_Tick_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDSL.g:359:3: this_Navigate_4= ruleNavigate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navigate_4=ruleNavigate();

                    state._fsp--;


                    			current = this_Navigate_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleniumDSL.g:368:3: this_Assert_5= ruleAssert
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAssertParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assert_5=ruleAssert();

                    state._fsp--;


                    			current = this_Assert_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleniumDSL.g:377:3: this_Read_6= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReadParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_6=ruleRead();

                    state._fsp--;


                    			current = this_Read_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSeleniumDSL.g:386:3: this_CallProcedure_7= ruleCallProcedure
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcedure_7=ruleCallProcedure();

                    state._fsp--;


                    			current = this_CallProcedure_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDSL.g:398:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDSL.g:398:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDSL.g:399:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalSeleniumDSL.g:405:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) ) ( (lv_Value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Type_1_1=null;
        Token lv_Type_1_2=null;
        Token lv_Type_1_3=null;
        Token lv_Type_1_4=null;
        Token lv_Value_2_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:411:2: ( (otherlv_0= 'click' ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) ) ( (lv_Value_2_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:412:2: (otherlv_0= 'click' ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) ) ( (lv_Value_2_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:412:2: (otherlv_0= 'click' ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) ) ( (lv_Value_2_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:413:3: otherlv_0= 'click' ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) ) ( (lv_Value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalSeleniumDSL.g:417:3: ( ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) ) )
            // InternalSeleniumDSL.g:418:4: ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) )
            {
            // InternalSeleniumDSL.g:418:4: ( (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' ) )
            // InternalSeleniumDSL.g:419:5: (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' )
            {
            // InternalSeleniumDSL.g:419:5: (lv_Type_1_1= 'input' | lv_Type_1_2= 'link' | lv_Type_1_3= 'name' | lv_Type_1_4= 'xpath' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSeleniumDSL.g:420:6: lv_Type_1_1= 'input'
                    {
                    lv_Type_1_1=(Token)match(input,20,FOLLOW_12); 

                    						newLeafNode(lv_Type_1_1, grammarAccess.getClickAccess().getTypeInputKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:431:6: lv_Type_1_2= 'link'
                    {
                    lv_Type_1_2=(Token)match(input,21,FOLLOW_12); 

                    						newLeafNode(lv_Type_1_2, grammarAccess.getClickAccess().getTypeLinkKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:442:6: lv_Type_1_3= 'name'
                    {
                    lv_Type_1_3=(Token)match(input,22,FOLLOW_12); 

                    						newLeafNode(lv_Type_1_3, grammarAccess.getClickAccess().getTypeNameKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSeleniumDSL.g:453:6: lv_Type_1_4= 'xpath'
                    {
                    lv_Type_1_4=(Token)match(input,23,FOLLOW_12); 

                    						newLeafNode(lv_Type_1_4, grammarAccess.getClickAccess().getTypeXpathKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickRule());
                    						}
                    						setWithLastConsumed(current, "Type", lv_Type_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSeleniumDSL.g:466:3: ( (lv_Value_2_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:467:4: (lv_Value_2_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:467:4: (lv_Value_2_0= RULE_STRING )
            // InternalSeleniumDSL.g:468:5: lv_Value_2_0= RULE_STRING
            {
            lv_Value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Value_2_0, grammarAccess.getClickAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Value",
            						lv_Value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalSeleniumDSL.g:488:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalSeleniumDSL.g:488:45: (iv_ruleFill= ruleFill EOF )
            // InternalSeleniumDSL.g:489:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalSeleniumDSL.g:495:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;
        Token lv_Value_2_1=null;
        Token lv_Value_2_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:501:2: ( (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:502:2: (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:502:2: (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:503:3: otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalSeleniumDSL.g:507:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:508:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:508:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:509:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_Name_1_0, grammarAccess.getFillAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSeleniumDSL.g:525:3: ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:526:4: ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:526:4: ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:527:5: (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:527:5: (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_IDENTIFIER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSeleniumDSL.g:528:6: lv_Value_2_1= RULE_STRING
                    {
                    lv_Value_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_Value_2_1, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Value",
                    							lv_Value_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:543:6: lv_Value_2_2= RULE_IDENTIFIER
                    {
                    lv_Value_2_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_Value_2_2, grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Value",
                    							lv_Value_2_2,
                    							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalSeleniumDSL.g:564:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSeleniumDSL.g:564:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSeleniumDSL.g:565:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalSeleniumDSL.g:571:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;
        Token lv_Value_2_1=null;
        Token lv_Value_2_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:577:2: ( (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:578:2: (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:578:2: (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:579:3: otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalSeleniumDSL.g:583:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:584:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:584:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:585:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_Name_1_0, grammarAccess.getSelectAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSeleniumDSL.g:601:3: ( ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:602:4: ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:602:4: ( (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:603:5: (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:603:5: (lv_Value_2_1= RULE_STRING | lv_Value_2_2= RULE_IDENTIFIER )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_IDENTIFIER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSeleniumDSL.g:604:6: lv_Value_2_1= RULE_STRING
                    {
                    lv_Value_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_Value_2_1, grammarAccess.getSelectAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Value",
                    							lv_Value_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:619:6: lv_Value_2_2= RULE_IDENTIFIER
                    {
                    lv_Value_2_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_Value_2_2, grammarAccess.getSelectAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Value",
                    							lv_Value_2_2,
                    							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleTick"
    // InternalSeleniumDSL.g:640:1: entryRuleTick returns [EObject current=null] : iv_ruleTick= ruleTick EOF ;
    public final EObject entryRuleTick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTick = null;


        try {
            // InternalSeleniumDSL.g:640:45: (iv_ruleTick= ruleTick EOF )
            // InternalSeleniumDSL.g:641:2: iv_ruleTick= ruleTick EOF
            {
             newCompositeNode(grammarAccess.getTickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTick=ruleTick();

            state._fsp--;

             current =iv_ruleTick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTick"


    // $ANTLR start "ruleTick"
    // InternalSeleniumDSL.g:647:1: ruleTick returns [EObject current=null] : (otherlv_0= 'tick' ( (lv_Name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:653:2: ( (otherlv_0= 'tick' ( (lv_Name_1_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:654:2: (otherlv_0= 'tick' ( (lv_Name_1_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:654:2: (otherlv_0= 'tick' ( (lv_Name_1_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:655:3: otherlv_0= 'tick' ( (lv_Name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTickAccess().getTickKeyword_0());
            		
            // InternalSeleniumDSL.g:659:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:660:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:660:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:661:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Name_1_0, grammarAccess.getTickAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTick"


    // $ANTLR start "entryRuleNavigate"
    // InternalSeleniumDSL.g:681:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalSeleniumDSL.g:681:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalSeleniumDSL.g:682:2: iv_ruleNavigate= ruleNavigate EOF
            {
             newCompositeNode(grammarAccess.getNavigateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigate=ruleNavigate();

            state._fsp--;

             current =iv_ruleNavigate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigate"


    // $ANTLR start "ruleNavigate"
    // InternalSeleniumDSL.g:688:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_1=null;
        Token lv_url_1_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:694:2: ( (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:695:2: (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:695:2: (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:696:3: otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalSeleniumDSL.g:700:3: ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:701:4: ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:701:4: ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:702:5: (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:702:5: (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_IDENTIFIER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDSL.g:703:6: lv_url_1_1= RULE_STRING
                    {
                    lv_url_1_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_url_1_1, grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_1_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:718:6: lv_url_1_2= RULE_IDENTIFIER
                    {
                    lv_url_1_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_url_1_2, grammarAccess.getNavigateAccess().getUrlIDENTIFIERTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_1_2,
                    							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigate"


    // $ANTLR start "entryRuleRead"
    // InternalSeleniumDSL.g:739:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalSeleniumDSL.g:739:45: (iv_ruleRead= ruleRead EOF )
            // InternalSeleniumDSL.g:740:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalSeleniumDSL.g:746:1: ruleRead returns [EObject current=null] : ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_Variable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_Name_3_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:752:2: ( ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:753:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:753:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:754:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) )
            {
            // InternalSeleniumDSL.g:754:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:755:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:755:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:756:5: lv_Variable_0_0= RULE_IDENTIFIER
            {
            lv_Variable_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_14); 

            					newLeafNode(lv_Variable_0_0, grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Variable",
            						lv_Variable_0_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getReadKeyword_2());
            		
            // InternalSeleniumDSL.g:780:3: ( (lv_Name_3_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:781:4: (lv_Name_3_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:781:4: (lv_Name_3_0= RULE_STRING )
            // InternalSeleniumDSL.g:782:5: lv_Name_3_0= RULE_STRING
            {
            lv_Name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Name_3_0, grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleAssert"
    // InternalSeleniumDSL.g:802:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalSeleniumDSL.g:802:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalSeleniumDSL.g:803:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // InternalSeleniumDSL.g:809:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Search_1_0=null;
        Token otherlv_2=null;
        Token lv_Value_3_1=null;
        Token lv_Value_3_2=null;
        Token lv_Name_4_0=null;
        Token otherlv_5=null;
        Token lv_Value_6_1=null;
        Token lv_Value_6_2=null;
        Token lv_Name_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:815:2: ( (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) ) )
            // InternalSeleniumDSL.g:816:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) )
            {
            // InternalSeleniumDSL.g:816:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) )
            // InternalSeleniumDSL.g:817:3: otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getAssertKeyword_0());
            		
            // InternalSeleniumDSL.g:821:3: ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt15=3;
                    }
                    break;
                case 32:
                    {
                    alt15=2;
                    }
                    break;
                case 31:
                    {
                    alt15=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalSeleniumDSL.g:822:4: ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:822:4: ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:823:5: ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:823:5: ( (lv_Search_1_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:824:6: (lv_Search_1_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:824:6: (lv_Search_1_0= RULE_STRING )
                    // InternalSeleniumDSL.g:825:7: lv_Search_1_0= RULE_STRING
                    {
                    lv_Search_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    							newLeafNode(lv_Search_1_0, grammarAccess.getAssertAccess().getSearchSTRINGTerminalRuleCall_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"Search",
                    								lv_Search_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_13); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssertAccess().getContainsKeyword_1_0_1());
                    				
                    // InternalSeleniumDSL.g:845:5: ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:846:6: ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:846:6: ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:847:7: (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:847:7: (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_STRING) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_IDENTIFIER) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalSeleniumDSL.g:848:8: lv_Value_3_1= RULE_STRING
                            {
                            lv_Value_3_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_Value_3_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_3_1,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }
                            break;
                        case 2 :
                            // InternalSeleniumDSL.g:863:8: lv_Value_3_2= RULE_IDENTIFIER
                            {
                            lv_Value_3_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                            								newLeafNode(lv_Value_3_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_0_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_3_2,
                            									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                            							

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:882:4: ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:882:4: ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:883:5: ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:883:5: ( (lv_Name_4_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:884:6: (lv_Name_4_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:884:6: (lv_Name_4_0= RULE_STRING )
                    // InternalSeleniumDSL.g:885:7: lv_Name_4_0= RULE_STRING
                    {
                    lv_Name_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    							newLeafNode(lv_Name_4_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"Name",
                    								lv_Name_4_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_13); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertAccess().getEqualsKeyword_1_1_1());
                    				
                    // InternalSeleniumDSL.g:905:5: ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:906:6: ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:906:6: ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:907:7: (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:907:7: (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_IDENTIFIER) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSeleniumDSL.g:908:8: lv_Value_6_1= RULE_STRING
                            {
                            lv_Value_6_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_Value_6_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_6_1,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }
                            break;
                        case 2 :
                            // InternalSeleniumDSL.g:923:8: lv_Value_6_2= RULE_IDENTIFIER
                            {
                            lv_Value_6_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                            								newLeafNode(lv_Value_6_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_1_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_6_2,
                            									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                            							

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:942:4: ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' )
                    {
                    // InternalSeleniumDSL.g:942:4: ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' )
                    // InternalSeleniumDSL.g:943:5: ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists'
                    {
                    // InternalSeleniumDSL.g:943:5: ( (lv_Name_7_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:944:6: (lv_Name_7_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:944:6: (lv_Name_7_0= RULE_STRING )
                    // InternalSeleniumDSL.g:945:7: lv_Name_7_0= RULE_STRING
                    {
                    lv_Name_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    							newLeafNode(lv_Name_7_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"Name",
                    								lv_Name_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssertAccess().getExistsKeyword_1_2_1());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleCallProcedure"
    // InternalSeleniumDSL.g:971:1: entryRuleCallProcedure returns [EObject current=null] : iv_ruleCallProcedure= ruleCallProcedure EOF ;
    public final EObject entryRuleCallProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedure = null;


        try {
            // InternalSeleniumDSL.g:971:54: (iv_ruleCallProcedure= ruleCallProcedure EOF )
            // InternalSeleniumDSL.g:972:2: iv_ruleCallProcedure= ruleCallProcedure EOF
            {
             newCompositeNode(grammarAccess.getCallProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallProcedure=ruleCallProcedure();

            state._fsp--;

             current =iv_ruleCallProcedure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallProcedure"


    // $ANTLR start "ruleCallProcedure"
    // InternalSeleniumDSL.g:978:1: ruleCallProcedure returns [EObject current=null] : ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? ) ;
    public final EObject ruleCallProcedure() throws RecognitionException {
        EObject current = null;

        Token lv_ProcedureName_0_0=null;
        Token otherlv_1=null;
        Token lv_Parameters_2_1=null;
        Token lv_Parameters_2_2=null;
        Token this_COMMA_3=null;
        Token lv_Parameters_4_1=null;
        Token lv_Parameters_4_2=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:984:2: ( ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? ) )
            // InternalSeleniumDSL.g:985:2: ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? )
            {
            // InternalSeleniumDSL.g:985:2: ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? )
            // InternalSeleniumDSL.g:986:3: ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )?
            {
            // InternalSeleniumDSL.g:986:3: ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:987:4: (lv_ProcedureName_0_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:987:4: (lv_ProcedureName_0_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:988:5: lv_ProcedureName_0_0= RULE_IDENTIFIER
            {
            lv_ProcedureName_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_19); 

            					newLeafNode(lv_ProcedureName_0_0, grammarAccess.getCallProcedureAccess().getProcedureNameIDENTIFIERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ProcedureName",
            						lv_ProcedureName_0_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            				

            }


            }

            // InternalSeleniumDSL.g:1004:3: (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSeleniumDSL.g:1005:4: otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSeleniumDSL.g:1009:4: ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* )
                    // InternalSeleniumDSL.g:1010:5: ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )*
                    {
                    // InternalSeleniumDSL.g:1010:5: ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) )
                    // InternalSeleniumDSL.g:1011:6: ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) )
                    {
                    // InternalSeleniumDSL.g:1011:6: ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) )
                    // InternalSeleniumDSL.g:1012:7: (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:1012:7: (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_IDENTIFIER) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_STRING) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSeleniumDSL.g:1013:8: lv_Parameters_2_1= RULE_IDENTIFIER
                            {
                            lv_Parameters_2_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_6); 

                            								newLeafNode(lv_Parameters_2_1, grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCallProcedureRule());
                            								}
                            								addWithLastConsumed(
                            									current,
                            									"Parameters",
                            									lv_Parameters_2_1,
                            									"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                            							

                            }
                            break;
                        case 2 :
                            // InternalSeleniumDSL.g:1028:8: lv_Parameters_2_2= RULE_STRING
                            {
                            lv_Parameters_2_2=(Token)match(input,RULE_STRING,FOLLOW_6); 

                            								newLeafNode(lv_Parameters_2_2, grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_0_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getCallProcedureRule());
                            								}
                            								addWithLastConsumed(
                            									current,
                            									"Parameters",
                            									lv_Parameters_2_2,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalSeleniumDSL.g:1045:5: (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==RULE_COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSeleniumDSL.g:1046:6: this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_13); 

                    	    						newLeafNode(this_COMMA_3, grammarAccess.getCallProcedureAccess().getCOMMATerminalRuleCall_1_1_1_0());
                    	    					
                    	    // InternalSeleniumDSL.g:1050:6: ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) )
                    	    // InternalSeleniumDSL.g:1051:7: ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) )
                    	    {
                    	    // InternalSeleniumDSL.g:1051:7: ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) )
                    	    // InternalSeleniumDSL.g:1052:8: (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING )
                    	    {
                    	    // InternalSeleniumDSL.g:1052:8: (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==RULE_IDENTIFIER) ) {
                    	        alt17=1;
                    	    }
                    	    else if ( (LA17_0==RULE_STRING) ) {
                    	        alt17=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // InternalSeleniumDSL.g:1053:9: lv_Parameters_4_1= RULE_IDENTIFIER
                    	            {
                    	            lv_Parameters_4_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_6); 

                    	            									newLeafNode(lv_Parameters_4_1, grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getCallProcedureRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"Parameters",
                    	            										lv_Parameters_4_1,
                    	            										"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
                    	            								

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalSeleniumDSL.g:1068:9: lv_Parameters_4_2= RULE_STRING
                    	            {
                    	            lv_Parameters_4_2=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    	            									newLeafNode(lv_Parameters_4_2, grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_1_1_1_1_0_1());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getCallProcedureRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"Parameters",
                    	            										lv_Parameters_4_2,
                    	            										"org.eclipse.xtext.common.Terminals.STRING");
                    	            								

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCallProcedureAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallProcedure"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\uffff\1\11\2\uffff";
    static final String dfa_3s = "\1\4\6\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\36\6\uffff\1\36\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\16\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\11\uffff\1\11\2\uffff\1\11\1\uffff\1\11\4\uffff\4\11\1\10\1\uffff\1\11",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "322:2: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Tick_3= ruleTick | this_Navigate_4= ruleNavigate | this_Assert_5= ruleAssert | this_Read_6= ruleRead | this_CallProcedure_7= ruleCallProcedure )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000004F0A0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004002L});

}