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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_COMMA", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'('", "')'", "'{'", "'}'", "'main'", "'click'", "'fill'", "'select'", "'navigate'", "'='", "'read'", "'assert'", "'contains'", "'equals'", "'exists'"
    };
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_COMMA=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
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

                if ( (LA4_0==RULE_IDENTIFIER||(LA4_0>=19 && LA4_0<=22)||LA4_0==25) ) {
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

                if ( (LA7_0==RULE_IDENTIFIER||(LA7_0>=19 && LA7_0<=22)||LA7_0==25) ) {
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
    // InternalSeleniumDSL.g:315:1: ruleInstruction returns [EObject current=null] : (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Fill_1 = null;

        EObject this_Select_2 = null;

        EObject this_Navigate_3 = null;

        EObject this_Assert_4 = null;

        EObject this_Read_5 = null;

        EObject this_CallProcedure_6 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:321:2: ( (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) )
            // InternalSeleniumDSL.g:322:2: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure )
            {
            // InternalSeleniumDSL.g:322:2: (this_Click_0= ruleClick | this_Fill_1= ruleFill | this_Select_2= ruleSelect | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA8_6 = input.LA(2);

                if ( (LA8_6==23) ) {
                    alt8=6;
                }
                else if ( (LA8_6==EOF||LA8_6==RULE_IDENTIFIER||LA8_6==14||LA8_6==17||(LA8_6>=19 && LA8_6<=22)||LA8_6==25) ) {
                    alt8=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

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
                    // InternalSeleniumDSL.g:350:3: this_Navigate_3= ruleNavigate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navigate_3=ruleNavigate();

                    state._fsp--;


                    			current = this_Navigate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSeleniumDSL.g:359:3: this_Assert_4= ruleAssert
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAssertParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assert_4=ruleAssert();

                    state._fsp--;


                    			current = this_Assert_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSeleniumDSL.g:368:3: this_Read_5= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReadParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_5=ruleRead();

                    state._fsp--;


                    			current = this_Read_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSeleniumDSL.g:377:3: this_CallProcedure_6= ruleCallProcedure
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallProcedure_6=ruleCallProcedure();

                    state._fsp--;


                    			current = this_CallProcedure_6;
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
    // InternalSeleniumDSL.g:389:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDSL.g:389:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDSL.g:390:2: iv_ruleClick= ruleClick EOF
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
    // InternalSeleniumDSL.g:396:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' ( (lv_Name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:402:2: ( (otherlv_0= 'click' ( (lv_Name_1_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:403:2: (otherlv_0= 'click' ( (lv_Name_1_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:403:2: (otherlv_0= 'click' ( (lv_Name_1_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:404:3: otherlv_0= 'click' ( (lv_Name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalSeleniumDSL.g:408:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:409:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:409:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:410:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Name_1_0, grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleFill"
    // InternalSeleniumDSL.g:430:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalSeleniumDSL.g:430:45: (iv_ruleFill= ruleFill EOF )
            // InternalSeleniumDSL.g:431:2: iv_ruleFill= ruleFill EOF
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
    // InternalSeleniumDSL.g:437:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:443:2: ( (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:444:2: (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:444:2: (otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:445:3: otherlv_0= 'fill' ( (lv_Name_1_0= RULE_STRING ) ) ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            // InternalSeleniumDSL.g:449:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:450:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:450:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:451:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

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

            // InternalSeleniumDSL.g:467:3: ( ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:468:4: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:468:4: ( (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:469:5: (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:469:5: (lv_value_2_1= RULE_STRING | lv_value_2_2= RULE_IDENTIFIER )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_IDENTIFIER) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSeleniumDSL.g:470:6: lv_value_2_1= RULE_STRING
                    {
                    lv_value_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:485:6: lv_value_2_2= RULE_IDENTIFIER
                    {
                    lv_value_2_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
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
    // InternalSeleniumDSL.g:506:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalSeleniumDSL.g:506:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalSeleniumDSL.g:507:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalSeleniumDSL.g:513:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Name_1_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:519:2: ( (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:520:2: (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:520:2: (otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:521:3: otherlv_0= 'select' ( (lv_Name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalSeleniumDSL.g:525:3: ( (lv_Name_1_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:526:4: (lv_Name_1_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:526:4: (lv_Name_1_0= RULE_STRING )
            // InternalSeleniumDSL.g:527:5: lv_Name_1_0= RULE_STRING
            {
            lv_Name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNavigate"
    // InternalSeleniumDSL.g:547:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalSeleniumDSL.g:547:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalSeleniumDSL.g:548:2: iv_ruleNavigate= ruleNavigate EOF
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
    // InternalSeleniumDSL.g:554:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_1=null;
        Token lv_url_1_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:560:2: ( (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:561:2: (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:561:2: (otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:562:3: otherlv_0= 'navigate' ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            // InternalSeleniumDSL.g:566:3: ( ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:567:4: ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:567:4: ( (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:568:5: (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:568:5: (lv_url_1_1= RULE_STRING | lv_url_1_2= RULE_IDENTIFIER )
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
                    // InternalSeleniumDSL.g:569:6: lv_url_1_1= RULE_STRING
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
                    // InternalSeleniumDSL.g:584:6: lv_url_1_2= RULE_IDENTIFIER
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
    // InternalSeleniumDSL.g:605:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalSeleniumDSL.g:605:45: (iv_ruleRead= ruleRead EOF )
            // InternalSeleniumDSL.g:606:2: iv_ruleRead= ruleRead EOF
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
    // InternalSeleniumDSL.g:612:1: ruleRead returns [EObject current=null] : ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_Variable_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_Name_3_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:618:2: ( ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:619:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:619:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:620:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) otherlv_1= '=' otherlv_2= 'read' ( (lv_Name_3_0= RULE_STRING ) )
            {
            // InternalSeleniumDSL.g:620:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:621:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:621:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:622:5: lv_Variable_0_0= RULE_IDENTIFIER
            {
            lv_Variable_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getReadAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getReadKeyword_2());
            		
            // InternalSeleniumDSL.g:646:3: ( (lv_Name_3_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:647:4: (lv_Name_3_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:647:4: (lv_Name_3_0= RULE_STRING )
            // InternalSeleniumDSL.g:648:5: lv_Name_3_0= RULE_STRING
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
    // InternalSeleniumDSL.g:668:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalSeleniumDSL.g:668:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalSeleniumDSL.g:669:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalSeleniumDSL.g:675:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) ) ;
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
            // InternalSeleniumDSL.g:681:2: ( (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) ) )
            // InternalSeleniumDSL.g:682:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) )
            {
            // InternalSeleniumDSL.g:682:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) ) )
            // InternalSeleniumDSL.g:683:3: otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getAssertKeyword_0());
            		
            // InternalSeleniumDSL.g:687:3: ( ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt13=3;
                    }
                    break;
                case 27:
                    {
                    alt13=2;
                    }
                    break;
                case 26:
                    {
                    alt13=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSeleniumDSL.g:688:4: ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:688:4: ( ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:689:5: ( (lv_Search_1_0= RULE_STRING ) ) otherlv_2= 'contains' ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:689:5: ( (lv_Search_1_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:690:6: (lv_Search_1_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:690:6: (lv_Search_1_0= RULE_STRING )
                    // InternalSeleniumDSL.g:691:7: lv_Search_1_0= RULE_STRING
                    {
                    lv_Search_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

                    otherlv_2=(Token)match(input,26,FOLLOW_12); 

                    					newLeafNode(otherlv_2, grammarAccess.getAssertAccess().getContainsKeyword_1_0_1());
                    				
                    // InternalSeleniumDSL.g:711:5: ( ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:712:6: ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:712:6: ( (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:713:7: (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:713:7: (lv_Value_3_1= RULE_STRING | lv_Value_3_2= RULE_IDENTIFIER )
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
                            // InternalSeleniumDSL.g:714:8: lv_Value_3_1= RULE_STRING
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
                            // InternalSeleniumDSL.g:729:8: lv_Value_3_2= RULE_IDENTIFIER
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
                    // InternalSeleniumDSL.g:748:4: ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:748:4: ( ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:749:5: ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= 'equals' ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:749:5: ( (lv_Name_4_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:750:6: (lv_Name_4_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:750:6: (lv_Name_4_0= RULE_STRING )
                    // InternalSeleniumDSL.g:751:7: lv_Name_4_0= RULE_STRING
                    {
                    lv_Name_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

                    otherlv_5=(Token)match(input,27,FOLLOW_12); 

                    					newLeafNode(otherlv_5, grammarAccess.getAssertAccess().getEqualsKeyword_1_1_1());
                    				
                    // InternalSeleniumDSL.g:771:5: ( ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:772:6: ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:772:6: ( (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:773:7: (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:773:7: (lv_Value_6_1= RULE_STRING | lv_Value_6_2= RULE_IDENTIFIER )
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
                            // InternalSeleniumDSL.g:774:8: lv_Value_6_1= RULE_STRING
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
                            // InternalSeleniumDSL.g:789:8: lv_Value_6_2= RULE_IDENTIFIER
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
                    // InternalSeleniumDSL.g:808:4: ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' )
                    {
                    // InternalSeleniumDSL.g:808:4: ( ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists' )
                    // InternalSeleniumDSL.g:809:5: ( (lv_Name_7_0= RULE_STRING ) ) otherlv_8= 'exists'
                    {
                    // InternalSeleniumDSL.g:809:5: ( (lv_Name_7_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:810:6: (lv_Name_7_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:810:6: (lv_Name_7_0= RULE_STRING )
                    // InternalSeleniumDSL.g:811:7: lv_Name_7_0= RULE_STRING
                    {
                    lv_Name_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

                    otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalSeleniumDSL.g:837:1: entryRuleCallProcedure returns [EObject current=null] : iv_ruleCallProcedure= ruleCallProcedure EOF ;
    public final EObject entryRuleCallProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedure = null;


        try {
            // InternalSeleniumDSL.g:837:54: (iv_ruleCallProcedure= ruleCallProcedure EOF )
            // InternalSeleniumDSL.g:838:2: iv_ruleCallProcedure= ruleCallProcedure EOF
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
    // InternalSeleniumDSL.g:844:1: ruleCallProcedure returns [EObject current=null] : ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? ) ;
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
            // InternalSeleniumDSL.g:850:2: ( ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? ) )
            // InternalSeleniumDSL.g:851:2: ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? )
            {
            // InternalSeleniumDSL.g:851:2: ( ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )? )
            // InternalSeleniumDSL.g:852:3: ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )?
            {
            // InternalSeleniumDSL.g:852:3: ( (lv_ProcedureName_0_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:853:4: (lv_ProcedureName_0_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:853:4: (lv_ProcedureName_0_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:854:5: lv_ProcedureName_0_0= RULE_IDENTIFIER
            {
            lv_ProcedureName_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_18); 

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

            // InternalSeleniumDSL.g:870:3: (otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSeleniumDSL.g:871:4: otherlv_1= '(' ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallProcedureAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSeleniumDSL.g:875:4: ( ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )* )
                    // InternalSeleniumDSL.g:876:5: ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) ) (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )*
                    {
                    // InternalSeleniumDSL.g:876:5: ( ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) ) )
                    // InternalSeleniumDSL.g:877:6: ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) )
                    {
                    // InternalSeleniumDSL.g:877:6: ( (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING ) )
                    // InternalSeleniumDSL.g:878:7: (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:878:7: (lv_Parameters_2_1= RULE_IDENTIFIER | lv_Parameters_2_2= RULE_STRING )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_IDENTIFIER) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_STRING) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalSeleniumDSL.g:879:8: lv_Parameters_2_1= RULE_IDENTIFIER
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
                            // InternalSeleniumDSL.g:894:8: lv_Parameters_2_2= RULE_STRING
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

                    // InternalSeleniumDSL.g:911:5: (this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSeleniumDSL.g:912:6: this_COMMA_3= RULE_COMMA ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_12); 

                    	    						newLeafNode(this_COMMA_3, grammarAccess.getCallProcedureAccess().getCOMMATerminalRuleCall_1_1_1_0());
                    	    					
                    	    // InternalSeleniumDSL.g:916:6: ( ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) ) )
                    	    // InternalSeleniumDSL.g:917:7: ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) )
                    	    {
                    	    // InternalSeleniumDSL.g:917:7: ( (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING ) )
                    	    // InternalSeleniumDSL.g:918:8: (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING )
                    	    {
                    	    // InternalSeleniumDSL.g:918:8: (lv_Parameters_4_1= RULE_IDENTIFIER | lv_Parameters_4_2= RULE_STRING )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==RULE_IDENTIFIER) ) {
                    	        alt15=1;
                    	    }
                    	    else if ( (LA15_0==RULE_STRING) ) {
                    	        alt15=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalSeleniumDSL.g:919:9: lv_Parameters_4_1= RULE_IDENTIFIER
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
                    	            // InternalSeleniumDSL.g:934:9: lv_Parameters_4_2= RULE_STRING
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
                    	    break loop16;
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000027A0010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004002L});

}