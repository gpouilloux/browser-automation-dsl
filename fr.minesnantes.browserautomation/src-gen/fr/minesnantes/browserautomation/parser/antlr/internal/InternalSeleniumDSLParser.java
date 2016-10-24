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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_IDENTIFIER", "RULE_COMMA", "RULE_RETURN_LINE", "RULE_TAB", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'def'", "'('", "'):'", "'main():'", "'click'", "'fill'", "'navigate'", "'='", "'read'", "'assert'", "'contains'", "'equals'", "'exists'", "'^'"
    };
    public static final int RULE_RETURN_LINE=7;
    public static final int RULE_IDENTIFIER=5;
    public static final int RULE_TAB=8;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=10;
    public static final int RULE_WS=4;
    public static final int RULE_COMMA=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
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

                if ( (LA1_0==15) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_WS) ) {
                        int LA1_2 = input.LA(3);

                        if ( (LA1_2==RULE_IDENTIFIER) ) {
                            alt1=1;
                        }


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
    // InternalSeleniumDSL.g:128:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'def' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_IDENTIFIER ) ) (otherlv_3= '(' )? ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* ) otherlv_8= '):' this_RETURN_LINE_9= RULE_RETURN_LINE ( (lv_instructions_10_0= ruleInstruction ) )* ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_Name_2_0=null;
        Token otherlv_3=null;
        Token lv_Parameters_4_0=null;
        Token this_COMMA_5=null;
        Token this_WS_6=null;
        Token lv_Parameters_7_0=null;
        Token otherlv_8=null;
        Token this_RETURN_LINE_9=null;
        EObject lv_instructions_10_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:134:2: ( (otherlv_0= 'def' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_IDENTIFIER ) ) (otherlv_3= '(' )? ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* ) otherlv_8= '):' this_RETURN_LINE_9= RULE_RETURN_LINE ( (lv_instructions_10_0= ruleInstruction ) )* ) )
            // InternalSeleniumDSL.g:135:2: (otherlv_0= 'def' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_IDENTIFIER ) ) (otherlv_3= '(' )? ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* ) otherlv_8= '):' this_RETURN_LINE_9= RULE_RETURN_LINE ( (lv_instructions_10_0= ruleInstruction ) )* )
            {
            // InternalSeleniumDSL.g:135:2: (otherlv_0= 'def' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_IDENTIFIER ) ) (otherlv_3= '(' )? ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* ) otherlv_8= '):' this_RETURN_LINE_9= RULE_RETURN_LINE ( (lv_instructions_10_0= ruleInstruction ) )* )
            // InternalSeleniumDSL.g:136:3: otherlv_0= 'def' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_IDENTIFIER ) ) (otherlv_3= '(' )? ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* ) otherlv_8= '):' this_RETURN_LINE_9= RULE_RETURN_LINE ( (lv_instructions_10_0= ruleInstruction ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getDefKeyword_0());
            		
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_5); 

            			newLeafNode(this_WS_1, grammarAccess.getProcedureAccess().getWSTerminalRuleCall_1());
            		
            // InternalSeleniumDSL.g:144:3: ( (lv_Name_2_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:145:4: (lv_Name_2_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:145:4: (lv_Name_2_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:146:5: lv_Name_2_0= RULE_IDENTIFIER
            {
            lv_Name_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_6); 

            					newLeafNode(lv_Name_2_0, grammarAccess.getProcedureAccess().getNameIDENTIFIERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_2_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            				

            }


            }

            // InternalSeleniumDSL.g:162:3: (otherlv_3= '(' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSeleniumDSL.g:163:4: otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcedureAccess().getLeftParenthesisKeyword_3());
                    			

                    }
                    break;

            }

            // InternalSeleniumDSL.g:168:3: ( ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )* )
            // InternalSeleniumDSL.g:169:4: ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+ (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )*
            {
            // InternalSeleniumDSL.g:169:4: ( (lv_Parameters_4_0= RULE_IDENTIFIER ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IDENTIFIER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSeleniumDSL.g:170:5: (lv_Parameters_4_0= RULE_IDENTIFIER )
            	    {
            	    // InternalSeleniumDSL.g:170:5: (lv_Parameters_4_0= RULE_IDENTIFIER )
            	    // InternalSeleniumDSL.g:171:6: lv_Parameters_4_0= RULE_IDENTIFIER
            	    {
            	    lv_Parameters_4_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_7); 

            	    						newLeafNode(lv_Parameters_4_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_4_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcedureRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"Parameters",
            	    							lv_Parameters_4_0,
            	    							"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalSeleniumDSL.g:187:4: (this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeleniumDSL.g:188:5: this_COMMA_5= RULE_COMMA this_WS_6= RULE_WS ( (lv_Parameters_7_0= RULE_IDENTIFIER ) )
            	    {
            	    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    					newLeafNode(this_COMMA_5, grammarAccess.getProcedureAccess().getCOMMATerminalRuleCall_4_1_0());
            	    				
            	    this_WS_6=(Token)match(input,RULE_WS,FOLLOW_5); 

            	    					newLeafNode(this_WS_6, grammarAccess.getProcedureAccess().getWSTerminalRuleCall_4_1_1());
            	    				
            	    // InternalSeleniumDSL.g:196:5: ( (lv_Parameters_7_0= RULE_IDENTIFIER ) )
            	    // InternalSeleniumDSL.g:197:6: (lv_Parameters_7_0= RULE_IDENTIFIER )
            	    {
            	    // InternalSeleniumDSL.g:197:6: (lv_Parameters_7_0= RULE_IDENTIFIER )
            	    // InternalSeleniumDSL.g:198:7: lv_Parameters_7_0= RULE_IDENTIFIER
            	    {
            	    lv_Parameters_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_8); 

            	    							newLeafNode(lv_Parameters_7_0, grammarAccess.getProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_4_1_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getProcedureRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"Parameters",
            	    								lv_Parameters_7_0,
            	    								"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getProcedureAccess().getRightParenthesisColonKeyword_5());
            		
            this_RETURN_LINE_9=(Token)match(input,RULE_RETURN_LINE,FOLLOW_10); 

            			newLeafNode(this_RETURN_LINE_9, grammarAccess.getProcedureAccess().getRETURN_LINETerminalRuleCall_6());
            		
            // InternalSeleniumDSL.g:224:3: ( (lv_instructions_10_0= ruleInstruction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAB) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeleniumDSL.g:225:4: (lv_instructions_10_0= ruleInstruction )
            	    {
            	    // InternalSeleniumDSL.g:225:4: (lv_instructions_10_0= ruleInstruction )
            	    // InternalSeleniumDSL.g:226:5: lv_instructions_10_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getProcedureAccess().getInstructionsInstructionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_instructions_10_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_10_0,
            	    						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // InternalSeleniumDSL.g:247:1: entryRuleMainProcedure returns [EObject current=null] : iv_ruleMainProcedure= ruleMainProcedure EOF ;
    public final EObject entryRuleMainProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainProcedure = null;


        try {
            // InternalSeleniumDSL.g:247:54: (iv_ruleMainProcedure= ruleMainProcedure EOF )
            // InternalSeleniumDSL.g:248:2: iv_ruleMainProcedure= ruleMainProcedure EOF
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
    // InternalSeleniumDSL.g:254:1: ruleMainProcedure returns [EObject current=null] : ( () otherlv_1= 'def' this_WS_2= RULE_WS otherlv_3= 'main():' this_RETURN_LINE_4= RULE_RETURN_LINE ( (lv_instructions_5_0= ruleInstruction ) )* ) ;
    public final EObject ruleMainProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_RETURN_LINE_4=null;
        EObject lv_instructions_5_0 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:260:2: ( ( () otherlv_1= 'def' this_WS_2= RULE_WS otherlv_3= 'main():' this_RETURN_LINE_4= RULE_RETURN_LINE ( (lv_instructions_5_0= ruleInstruction ) )* ) )
            // InternalSeleniumDSL.g:261:2: ( () otherlv_1= 'def' this_WS_2= RULE_WS otherlv_3= 'main():' this_RETURN_LINE_4= RULE_RETURN_LINE ( (lv_instructions_5_0= ruleInstruction ) )* )
            {
            // InternalSeleniumDSL.g:261:2: ( () otherlv_1= 'def' this_WS_2= RULE_WS otherlv_3= 'main():' this_RETURN_LINE_4= RULE_RETURN_LINE ( (lv_instructions_5_0= ruleInstruction ) )* )
            // InternalSeleniumDSL.g:262:3: () otherlv_1= 'def' this_WS_2= RULE_WS otherlv_3= 'main():' this_RETURN_LINE_4= RULE_RETURN_LINE ( (lv_instructions_5_0= ruleInstruction ) )*
            {
            // InternalSeleniumDSL.g:262:3: ()
            // InternalSeleniumDSL.g:263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainProcedureAccess().getMainProcedureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMainProcedureAccess().getDefKeyword_1());
            		
            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_11); 

            			newLeafNode(this_WS_2, grammarAccess.getMainProcedureAccess().getWSTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getMainProcedureAccess().getMainKeyword_3());
            		
            this_RETURN_LINE_4=(Token)match(input,RULE_RETURN_LINE,FOLLOW_10); 

            			newLeafNode(this_RETURN_LINE_4, grammarAccess.getMainProcedureAccess().getRETURN_LINETerminalRuleCall_4());
            		
            // InternalSeleniumDSL.g:285:3: ( (lv_instructions_5_0= ruleInstruction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_TAB) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSeleniumDSL.g:286:4: (lv_instructions_5_0= ruleInstruction )
            	    {
            	    // InternalSeleniumDSL.g:286:4: (lv_instructions_5_0= ruleInstruction )
            	    // InternalSeleniumDSL.g:287:5: lv_instructions_5_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getMainProcedureAccess().getInstructionsInstructionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_instructions_5_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainProcedureRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_5_0,
            	    						"fr.minesnantes.browserautomation.SeleniumDSL.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // InternalSeleniumDSL.g:315:1: ruleInstruction returns [EObject current=null] : (this_TAB_0= RULE_TAB (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token this_TAB_0=null;
        EObject this_Click_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Navigate_3 = null;

        EObject this_Assert_4 = null;

        EObject this_Read_5 = null;

        EObject this_CallProcedure_6 = null;



        	enterRule();

        try {
            // InternalSeleniumDSL.g:321:2: ( (this_TAB_0= RULE_TAB (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) ) )
            // InternalSeleniumDSL.g:322:2: (this_TAB_0= RULE_TAB (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) )
            {
            // InternalSeleniumDSL.g:322:2: (this_TAB_0= RULE_TAB (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure ) )
            // InternalSeleniumDSL.g:323:3: this_TAB_0= RULE_TAB (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure )
            {
            this_TAB_0=(Token)match(input,RULE_TAB,FOLLOW_12); 

            			newLeafNode(this_TAB_0, grammarAccess.getInstructionAccess().getTABTerminalRuleCall_0());
            		
            // InternalSeleniumDSL.g:327:3: (this_Click_1= ruleClick | this_Fill_2= ruleFill | this_Navigate_3= ruleNavigate | this_Assert_4= ruleAssert | this_Read_5= ruleRead | this_CallProcedure_6= ruleCallProcedure )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSeleniumDSL.g:328:4: this_Click_1= ruleClick
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Click_1=ruleClick();

                    state._fsp--;


                    				current = this_Click_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:337:4: this_Fill_2= ruleFill
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getFillParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Fill_2=ruleFill();

                    state._fsp--;


                    				current = this_Fill_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalSeleniumDSL.g:346:4: this_Navigate_3= ruleNavigate
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getNavigateParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Navigate_3=ruleNavigate();

                    state._fsp--;


                    				current = this_Navigate_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalSeleniumDSL.g:355:4: this_Assert_4= ruleAssert
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getAssertParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_Assert_4=ruleAssert();

                    state._fsp--;


                    				current = this_Assert_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalSeleniumDSL.g:364:4: this_Read_5= ruleRead
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getReadParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_Read_5=ruleRead();

                    state._fsp--;


                    				current = this_Read_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalSeleniumDSL.g:373:4: this_CallProcedure_6= ruleCallProcedure
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getCallProcedureParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_CallProcedure_6=ruleCallProcedure();

                    state._fsp--;


                    				current = this_CallProcedure_6;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleClick"
    // InternalSeleniumDSL.g:386:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalSeleniumDSL.g:386:46: (iv_ruleClick= ruleClick EOF )
            // InternalSeleniumDSL.g:387:2: iv_ruleClick= ruleClick EOF
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
    // InternalSeleniumDSL.g:393:1: ruleClick returns [EObject current=null] : (otherlv_0= 'click' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_Name_2_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:399:2: ( (otherlv_0= 'click' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:400:2: (otherlv_0= 'click' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:400:2: (otherlv_0= 'click' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:401:3: otherlv_0= 'click' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_13); 

            			newLeafNode(this_WS_1, grammarAccess.getClickAccess().getWSTerminalRuleCall_1());
            		
            // InternalSeleniumDSL.g:409:3: ( (lv_Name_2_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:410:4: (lv_Name_2_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:410:4: (lv_Name_2_0= RULE_STRING )
            // InternalSeleniumDSL.g:411:5: lv_Name_2_0= RULE_STRING
            {
            lv_Name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Name_2_0, grammarAccess.getClickAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClickRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_2_0,
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
    // InternalSeleniumDSL.g:431:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalSeleniumDSL.g:431:45: (iv_ruleFill= ruleFill EOF )
            // InternalSeleniumDSL.g:432:2: iv_ruleFill= ruleFill EOF
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
    // InternalSeleniumDSL.g:438:1: ruleFill returns [EObject current=null] : (otherlv_0= 'fill' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) this_WS_3= RULE_WS ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_Name_2_0=null;
        Token this_WS_3=null;
        Token lv_value_4_1=null;
        Token lv_value_4_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:444:2: ( (otherlv_0= 'fill' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) this_WS_3= RULE_WS ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:445:2: (otherlv_0= 'fill' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) this_WS_3= RULE_WS ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:445:2: (otherlv_0= 'fill' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) this_WS_3= RULE_WS ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:446:3: otherlv_0= 'fill' this_WS_1= RULE_WS ( (lv_Name_2_0= RULE_STRING ) ) this_WS_3= RULE_WS ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_13); 

            			newLeafNode(this_WS_1, grammarAccess.getFillAccess().getWSTerminalRuleCall_1());
            		
            // InternalSeleniumDSL.g:454:3: ( (lv_Name_2_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:455:4: (lv_Name_2_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:455:4: (lv_Name_2_0= RULE_STRING )
            // InternalSeleniumDSL.g:456:5: lv_Name_2_0= RULE_STRING
            {
            lv_Name_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_Name_2_0, grammarAccess.getFillAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            this_WS_3=(Token)match(input,RULE_WS,FOLLOW_14); 

            			newLeafNode(this_WS_3, grammarAccess.getFillAccess().getWSTerminalRuleCall_3());
            		
            // InternalSeleniumDSL.g:476:3: ( ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:477:4: ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:477:4: ( (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:478:5: (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:478:5: (lv_value_4_1= RULE_STRING | lv_value_4_2= RULE_IDENTIFIER )
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
                    // InternalSeleniumDSL.g:479:6: lv_value_4_1= RULE_STRING
                    {
                    lv_value_4_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_4_1, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:494:6: lv_value_4_2= RULE_IDENTIFIER
                    {
                    lv_value_4_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_value_4_2, grammarAccess.getFillAccess().getValueIDENTIFIERTerminalRuleCall_4_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_2,
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


    // $ANTLR start "entryRuleNavigate"
    // InternalSeleniumDSL.g:515:1: entryRuleNavigate returns [EObject current=null] : iv_ruleNavigate= ruleNavigate EOF ;
    public final EObject entryRuleNavigate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigate = null;


        try {
            // InternalSeleniumDSL.g:515:49: (iv_ruleNavigate= ruleNavigate EOF )
            // InternalSeleniumDSL.g:516:2: iv_ruleNavigate= ruleNavigate EOF
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
    // InternalSeleniumDSL.g:522:1: ruleNavigate returns [EObject current=null] : (otherlv_0= 'navigate' this_WS_1= RULE_WS ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleNavigate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        Token lv_url_2_1=null;
        Token lv_url_2_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:528:2: ( (otherlv_0= 'navigate' this_WS_1= RULE_WS ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) ) ) )
            // InternalSeleniumDSL.g:529:2: (otherlv_0= 'navigate' this_WS_1= RULE_WS ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) ) )
            {
            // InternalSeleniumDSL.g:529:2: (otherlv_0= 'navigate' this_WS_1= RULE_WS ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) ) )
            // InternalSeleniumDSL.g:530:3: otherlv_0= 'navigate' this_WS_1= RULE_WS ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateAccess().getNavigateKeyword_0());
            		
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_14); 

            			newLeafNode(this_WS_1, grammarAccess.getNavigateAccess().getWSTerminalRuleCall_1());
            		
            // InternalSeleniumDSL.g:538:3: ( ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) ) )
            // InternalSeleniumDSL.g:539:4: ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) )
            {
            // InternalSeleniumDSL.g:539:4: ( (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:540:5: (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:540:5: (lv_url_2_1= RULE_STRING | lv_url_2_2= RULE_IDENTIFIER )
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
                    // InternalSeleniumDSL.g:541:6: lv_url_2_1= RULE_STRING
                    {
                    lv_url_2_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_url_2_1, grammarAccess.getNavigateAccess().getUrlSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_2_1,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:556:6: lv_url_2_2= RULE_IDENTIFIER
                    {
                    lv_url_2_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                    						newLeafNode(lv_url_2_2, grammarAccess.getNavigateAccess().getUrlIDENTIFIERTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNavigateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"url",
                    							lv_url_2_2,
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
    // InternalSeleniumDSL.g:577:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalSeleniumDSL.g:577:45: (iv_ruleRead= ruleRead EOF )
            // InternalSeleniumDSL.g:578:2: iv_ruleRead= ruleRead EOF
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
    // InternalSeleniumDSL.g:584:1: ruleRead returns [EObject current=null] : ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) this_WS_1= RULE_WS otherlv_2= '=' this_WS_3= RULE_WS otherlv_4= 'read' this_WS_5= RULE_WS ( (lv_Name_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_Variable_0_0=null;
        Token this_WS_1=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token otherlv_4=null;
        Token this_WS_5=null;
        Token lv_Name_6_0=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:590:2: ( ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) this_WS_1= RULE_WS otherlv_2= '=' this_WS_3= RULE_WS otherlv_4= 'read' this_WS_5= RULE_WS ( (lv_Name_6_0= RULE_STRING ) ) ) )
            // InternalSeleniumDSL.g:591:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) this_WS_1= RULE_WS otherlv_2= '=' this_WS_3= RULE_WS otherlv_4= 'read' this_WS_5= RULE_WS ( (lv_Name_6_0= RULE_STRING ) ) )
            {
            // InternalSeleniumDSL.g:591:2: ( ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) this_WS_1= RULE_WS otherlv_2= '=' this_WS_3= RULE_WS otherlv_4= 'read' this_WS_5= RULE_WS ( (lv_Name_6_0= RULE_STRING ) ) )
            // InternalSeleniumDSL.g:592:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) ) this_WS_1= RULE_WS otherlv_2= '=' this_WS_3= RULE_WS otherlv_4= 'read' this_WS_5= RULE_WS ( (lv_Name_6_0= RULE_STRING ) )
            {
            // InternalSeleniumDSL.g:592:3: ( (lv_Variable_0_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:593:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:593:4: (lv_Variable_0_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:594:5: lv_Variable_0_0= RULE_IDENTIFIER
            {
            lv_Variable_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_4); 

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

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_15); 

            			newLeafNode(this_WS_1, grammarAccess.getReadAccess().getWSTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getEqualsSignKeyword_2());
            		
            this_WS_3=(Token)match(input,RULE_WS,FOLLOW_16); 

            			newLeafNode(this_WS_3, grammarAccess.getReadAccess().getWSTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getReadAccess().getReadKeyword_4());
            		
            this_WS_5=(Token)match(input,RULE_WS,FOLLOW_13); 

            			newLeafNode(this_WS_5, grammarAccess.getReadAccess().getWSTerminalRuleCall_5());
            		
            // InternalSeleniumDSL.g:630:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalSeleniumDSL.g:631:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalSeleniumDSL.g:631:4: (lv_Name_6_0= RULE_STRING )
            // InternalSeleniumDSL.g:632:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Name_6_0, grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_6_0,
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
    // InternalSeleniumDSL.g:652:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // InternalSeleniumDSL.g:652:47: (iv_ruleAssert= ruleAssert EOF )
            // InternalSeleniumDSL.g:653:2: iv_ruleAssert= ruleAssert EOF
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
    // InternalSeleniumDSL.g:659:1: ruleAssert returns [EObject current=null] : (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) ) ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Search_1_0=null;
        Token this_WS_2=null;
        Token otherlv_3=null;
        Token this_WS_4=null;
        Token lv_Value_5_1=null;
        Token lv_Value_5_2=null;
        Token lv_Name_6_0=null;
        Token this_WS_7=null;
        Token otherlv_8=null;
        Token this_WS_9=null;
        Token lv_Value_10_1=null;
        Token lv_Value_10_2=null;
        Token lv_Name_11_0=null;
        Token this_WS_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:665:2: ( (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) ) ) )
            // InternalSeleniumDSL.g:666:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) ) )
            {
            // InternalSeleniumDSL.g:666:2: (otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) ) )
            // InternalSeleniumDSL.g:667:3: otherlv_0= 'assert' ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAssertAccess().getAssertKeyword_0());
            		
            // InternalSeleniumDSL.g:671:3: ( ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) ) | ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_WS) ) {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt12=2;
                        }
                        break;
                    case 27:
                        {
                        alt12=3;
                        }
                        break;
                    case 25:
                        {
                        alt12=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDSL.g:672:4: ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:672:4: ( ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:673:5: ( (lv_Search_1_0= RULE_STRING ) ) this_WS_2= RULE_WS otherlv_3= 'contains' this_WS_4= RULE_WS ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:673:5: ( (lv_Search_1_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:674:6: (lv_Search_1_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:674:6: (lv_Search_1_0= RULE_STRING )
                    // InternalSeleniumDSL.g:675:7: lv_Search_1_0= RULE_STRING
                    {
                    lv_Search_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

                    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_17); 

                    					newLeafNode(this_WS_2, grammarAccess.getAssertAccess().getWSTerminalRuleCall_1_0_1());
                    				
                    otherlv_3=(Token)match(input,25,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getAssertAccess().getContainsKeyword_1_0_2());
                    				
                    this_WS_4=(Token)match(input,RULE_WS,FOLLOW_14); 

                    					newLeafNode(this_WS_4, grammarAccess.getAssertAccess().getWSTerminalRuleCall_1_0_3());
                    				
                    // InternalSeleniumDSL.g:703:5: ( ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:704:6: ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:704:6: ( (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:705:7: (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:705:7: (lv_Value_5_1= RULE_STRING | lv_Value_5_2= RULE_IDENTIFIER )
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
                            // InternalSeleniumDSL.g:706:8: lv_Value_5_1= RULE_STRING
                            {
                            lv_Value_5_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_Value_5_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_0_4_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_5_1,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }
                            break;
                        case 2 :
                            // InternalSeleniumDSL.g:721:8: lv_Value_5_2= RULE_IDENTIFIER
                            {
                            lv_Value_5_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                            								newLeafNode(lv_Value_5_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_0_4_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_5_2,
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
                    // InternalSeleniumDSL.g:740:4: ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) )
                    {
                    // InternalSeleniumDSL.g:740:4: ( ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) ) )
                    // InternalSeleniumDSL.g:741:5: ( (lv_Name_6_0= RULE_STRING ) ) this_WS_7= RULE_WS otherlv_8= 'equals' this_WS_9= RULE_WS ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) )
                    {
                    // InternalSeleniumDSL.g:741:5: ( (lv_Name_6_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:742:6: (lv_Name_6_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:742:6: (lv_Name_6_0= RULE_STRING )
                    // InternalSeleniumDSL.g:743:7: lv_Name_6_0= RULE_STRING
                    {
                    lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_Name_6_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"Name",
                    								lv_Name_6_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    this_WS_7=(Token)match(input,RULE_WS,FOLLOW_18); 

                    					newLeafNode(this_WS_7, grammarAccess.getAssertAccess().getWSTerminalRuleCall_1_1_1());
                    				
                    otherlv_8=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(otherlv_8, grammarAccess.getAssertAccess().getEqualsKeyword_1_1_2());
                    				
                    this_WS_9=(Token)match(input,RULE_WS,FOLLOW_14); 

                    					newLeafNode(this_WS_9, grammarAccess.getAssertAccess().getWSTerminalRuleCall_1_1_3());
                    				
                    // InternalSeleniumDSL.g:771:5: ( ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) ) )
                    // InternalSeleniumDSL.g:772:6: ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) )
                    {
                    // InternalSeleniumDSL.g:772:6: ( (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER ) )
                    // InternalSeleniumDSL.g:773:7: (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER )
                    {
                    // InternalSeleniumDSL.g:773:7: (lv_Value_10_1= RULE_STRING | lv_Value_10_2= RULE_IDENTIFIER )
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
                            // InternalSeleniumDSL.g:774:8: lv_Value_10_1= RULE_STRING
                            {
                            lv_Value_10_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_Value_10_1, grammarAccess.getAssertAccess().getValueSTRINGTerminalRuleCall_1_1_4_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_10_1,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }
                            break;
                        case 2 :
                            // InternalSeleniumDSL.g:789:8: lv_Value_10_2= RULE_IDENTIFIER
                            {
                            lv_Value_10_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_2); 

                            								newLeafNode(lv_Value_10_2, grammarAccess.getAssertAccess().getValueIDENTIFIERTerminalRuleCall_1_1_4_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAssertRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"Value",
                            									lv_Value_10_2,
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
                    // InternalSeleniumDSL.g:808:4: ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' )
                    {
                    // InternalSeleniumDSL.g:808:4: ( ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists' )
                    // InternalSeleniumDSL.g:809:5: ( (lv_Name_11_0= RULE_STRING ) ) this_WS_12= RULE_WS otherlv_13= 'exists'
                    {
                    // InternalSeleniumDSL.g:809:5: ( (lv_Name_11_0= RULE_STRING ) )
                    // InternalSeleniumDSL.g:810:6: (lv_Name_11_0= RULE_STRING )
                    {
                    // InternalSeleniumDSL.g:810:6: (lv_Name_11_0= RULE_STRING )
                    // InternalSeleniumDSL.g:811:7: lv_Name_11_0= RULE_STRING
                    {
                    lv_Name_11_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_Name_11_0, grammarAccess.getAssertAccess().getNameSTRINGTerminalRuleCall_1_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAssertRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"Name",
                    								lv_Name_11_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    this_WS_12=(Token)match(input,RULE_WS,FOLLOW_19); 

                    					newLeafNode(this_WS_12, grammarAccess.getAssertAccess().getWSTerminalRuleCall_1_2_1());
                    				
                    otherlv_13=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(otherlv_13, grammarAccess.getAssertAccess().getExistsKeyword_1_2_2());
                    				

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
    // InternalSeleniumDSL.g:841:1: entryRuleCallProcedure returns [EObject current=null] : iv_ruleCallProcedure= ruleCallProcedure EOF ;
    public final EObject entryRuleCallProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallProcedure = null;


        try {
            // InternalSeleniumDSL.g:841:54: (iv_ruleCallProcedure= ruleCallProcedure EOF )
            // InternalSeleniumDSL.g:842:2: iv_ruleCallProcedure= ruleCallProcedure EOF
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
    // InternalSeleniumDSL.g:848:1: ruleCallProcedure returns [EObject current=null] : (otherlv_0= '^' ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) ) (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )* ) ;
    public final EObject ruleCallProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ProcedureName_1_0=null;
        Token this_WS_2=null;
        Token lv_Parameters_3_1=null;
        Token lv_Parameters_3_2=null;


        	enterRule();

        try {
            // InternalSeleniumDSL.g:854:2: ( (otherlv_0= '^' ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) ) (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )* ) )
            // InternalSeleniumDSL.g:855:2: (otherlv_0= '^' ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) ) (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )* )
            {
            // InternalSeleniumDSL.g:855:2: (otherlv_0= '^' ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) ) (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )* )
            // InternalSeleniumDSL.g:856:3: otherlv_0= '^' ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) ) (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCallProcedureAccess().getCircumflexAccentKeyword_0());
            		
            // InternalSeleniumDSL.g:860:3: ( (lv_ProcedureName_1_0= RULE_IDENTIFIER ) )
            // InternalSeleniumDSL.g:861:4: (lv_ProcedureName_1_0= RULE_IDENTIFIER )
            {
            // InternalSeleniumDSL.g:861:4: (lv_ProcedureName_1_0= RULE_IDENTIFIER )
            // InternalSeleniumDSL.g:862:5: lv_ProcedureName_1_0= RULE_IDENTIFIER
            {
            lv_ProcedureName_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_20); 

            					newLeafNode(lv_ProcedureName_1_0, grammarAccess.getCallProcedureAccess().getProcedureNameIDENTIFIERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ProcedureName",
            						lv_ProcedureName_1_0,
            						"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            				

            }


            }

            // InternalSeleniumDSL.g:878:3: (this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSeleniumDSL.g:879:4: this_WS_2= RULE_WS ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) )
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_14); 

            	    				newLeafNode(this_WS_2, grammarAccess.getCallProcedureAccess().getWSTerminalRuleCall_2_0());
            	    			
            	    // InternalSeleniumDSL.g:883:4: ( ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) ) )
            	    // InternalSeleniumDSL.g:884:5: ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) )
            	    {
            	    // InternalSeleniumDSL.g:884:5: ( (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER ) )
            	    // InternalSeleniumDSL.g:885:6: (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER )
            	    {
            	    // InternalSeleniumDSL.g:885:6: (lv_Parameters_3_1= RULE_STRING | lv_Parameters_3_2= RULE_IDENTIFIER )
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
            	            // InternalSeleniumDSL.g:886:7: lv_Parameters_3_1= RULE_STRING
            	            {
            	            lv_Parameters_3_1=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	            							newLeafNode(lv_Parameters_3_1, grammarAccess.getCallProcedureAccess().getParametersSTRINGTerminalRuleCall_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCallProcedureRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"Parameters",
            	            								lv_Parameters_3_1,
            	            								"org.eclipse.xtext.common.Terminals.STRING");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSeleniumDSL.g:901:7: lv_Parameters_3_2= RULE_IDENTIFIER
            	            {
            	            lv_Parameters_3_2=(Token)match(input,RULE_IDENTIFIER,FOLLOW_20); 

            	            							newLeafNode(lv_Parameters_3_2, grammarAccess.getCallProcedureAccess().getParametersIDENTIFIERTerminalRuleCall_2_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCallProcedureRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"Parameters",
            	            								lv_Parameters_3_2,
            	            								"fr.minesnantes.browserautomation.SeleniumDSL.IDENTIFIER");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000011380020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});

}