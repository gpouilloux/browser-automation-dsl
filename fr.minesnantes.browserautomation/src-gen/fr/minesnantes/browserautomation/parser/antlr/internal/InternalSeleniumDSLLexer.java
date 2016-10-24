package fr.minesnantes.browserautomation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSeleniumDSLLexer extends Lexer {
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

    public InternalSeleniumDSLLexer() {;} 
    public InternalSeleniumDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSeleniumDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSeleniumDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:11:7: ( 'def' )
            // InternalSeleniumDSL.g:11:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:12:7: ( '(' )
            // InternalSeleniumDSL.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:13:7: ( '):' )
            // InternalSeleniumDSL.g:13:9: '):'
            {
            match("):"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:14:7: ( 'main():' )
            // InternalSeleniumDSL.g:14:9: 'main():'
            {
            match("main():"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:15:7: ( 'click' )
            // InternalSeleniumDSL.g:15:9: 'click'
            {
            match("click"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:16:7: ( 'fill' )
            // InternalSeleniumDSL.g:16:9: 'fill'
            {
            match("fill"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:17:7: ( 'navigate' )
            // InternalSeleniumDSL.g:17:9: 'navigate'
            {
            match("navigate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:18:7: ( '=' )
            // InternalSeleniumDSL.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:19:7: ( 'read' )
            // InternalSeleniumDSL.g:19:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:20:7: ( 'assert' )
            // InternalSeleniumDSL.g:20:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:21:7: ( 'contains' )
            // InternalSeleniumDSL.g:21:9: 'contains'
            {
            match("contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:22:7: ( 'equals' )
            // InternalSeleniumDSL.g:22:9: 'equals'
            {
            match("equals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:23:7: ( 'exists' )
            // InternalSeleniumDSL.g:23:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:24:7: ( '^' )
            // InternalSeleniumDSL.g:24:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:922:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // InternalSeleniumDSL.g:922:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            // InternalSeleniumDSL.g:922:19: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSeleniumDSL.g:922:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSeleniumDSL.g:922:44: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSeleniumDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:924:9: ( ' ' )
            // InternalSeleniumDSL.g:924:11: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:926:12: ( ',' )
            // InternalSeleniumDSL.g:926:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_TAB"
    public final void mRULE_TAB() throws RecognitionException {
        try {
            int _type = RULE_TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:928:10: ( '\\t' )
            // InternalSeleniumDSL.g:928:12: '\\t'
            {
            match('\t'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAB"

    // $ANTLR start "RULE_RETURN_LINE"
    public final void mRULE_RETURN_LINE() throws RecognitionException {
        try {
            int _type = RULE_RETURN_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:930:18: ( '\\n' )
            // InternalSeleniumDSL.g:930:20: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN_LINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:932:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSeleniumDSL.g:932:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSeleniumDSL.g:932:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSeleniumDSL.g:932:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSeleniumDSL.g:932:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSeleniumDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:934:10: ( ( '0' .. '9' )+ )
            // InternalSeleniumDSL.g:934:12: ( '0' .. '9' )+
            {
            // InternalSeleniumDSL.g:934:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSeleniumDSL.g:934:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:936:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSeleniumDSL.g:936:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSeleniumDSL.g:936:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSeleniumDSL.g:936:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSeleniumDSL.g:936:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSeleniumDSL.g:936:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeleniumDSL.g:936:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSeleniumDSL.g:936:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSeleniumDSL.g:936:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSeleniumDSL.g:936:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSeleniumDSL.g:936:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:938:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSeleniumDSL.g:938:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSeleniumDSL.g:938:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSeleniumDSL.g:938:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:940:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSeleniumDSL.g:940:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSeleniumDSL.g:940:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSeleniumDSL.g:940:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalSeleniumDSL.g:940:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSeleniumDSL.g:940:41: ( '\\r' )? '\\n'
                    {
                    // InternalSeleniumDSL.g:940:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalSeleniumDSL.g:940:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSeleniumDSL.g:942:16: ( . )
            // InternalSeleniumDSL.g:942:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSeleniumDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_IDENTIFIER | RULE_WS | RULE_COMMA | RULE_TAB | RULE_RETURN_LINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt13=25;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalSeleniumDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalSeleniumDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalSeleniumDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalSeleniumDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalSeleniumDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalSeleniumDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalSeleniumDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalSeleniumDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalSeleniumDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalSeleniumDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalSeleniumDSL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalSeleniumDSL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalSeleniumDSL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalSeleniumDSL.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalSeleniumDSL.g:1:94: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 16 :
                // InternalSeleniumDSL.g:1:110: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalSeleniumDSL.g:1:118: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 18 :
                // InternalSeleniumDSL.g:1:129: RULE_TAB
                {
                mRULE_TAB(); 

                }
                break;
            case 19 :
                // InternalSeleniumDSL.g:1:138: RULE_RETURN_LINE
                {
                mRULE_RETURN_LINE(); 

                }
                break;
            case 20 :
                // InternalSeleniumDSL.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalSeleniumDSL.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalSeleniumDSL.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalSeleniumDSL.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalSeleniumDSL.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalSeleniumDSL.g:1:216: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\31\1\uffff\1\27\4\31\1\uffff\3\31\1\51\1\31\6\uffff\3\27\1\uffff\1\31\1\uffff\1\31\3\uffff\5\31\1\uffff\5\31\11\uffff\1\74\11\31\1\uffff\3\31\1\111\1\31\1\113\3\31\1\uffff\1\117\1\31\1\uffff\1\31\1\uffff\3\31\1\uffff\2\31\1\127\1\130\1\131\2\31\3\uffff\1\134\1\135\2\uffff";
    static final String DFA13_eofS =
        "\136\uffff";
    static final String DFA13_minS =
        "\1\0\1\60\1\uffff\1\72\4\60\1\uffff\3\60\1\101\1\60\6\uffff\2\0\1\52\1\uffff\1\60\1\uffff\1\60\3\uffff\5\60\1\uffff\5\60\11\uffff\12\60\1\uffff\1\50\10\60\1\uffff\2\60\1\uffff\1\60\1\uffff\3\60\1\uffff\7\60\3\uffff\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\1\uffff\1\72\4\172\1\uffff\5\172\6\uffff\2\uffff\1\57\1\uffff\1\172\1\uffff\1\172\3\uffff\5\172\1\uffff\5\172\11\uffff\12\172\1\uffff\11\172\1\uffff\2\172\1\uffff\1\172\1\uffff\3\172\1\uffff\7\172\3\uffff\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\5\uffff\1\10\5\uffff\1\20\1\21\1\22\1\23\1\24\1\25\3\uffff\1\31\1\uffff\1\17\1\uffff\1\24\1\2\1\3\5\uffff\1\10\5\uffff\1\16\1\20\1\21\1\22\1\23\1\25\1\26\1\27\1\30\12\uffff\1\1\11\uffff\1\4\2\uffff\1\6\1\uffff\1\11\3\uffff\1\5\7\uffff\1\12\1\14\1\15\2\uffff\1\13\1\7";
    static final String DFA13_specialS =
        "\1\0\23\uffff\1\1\1\2\110\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\27\1\20\1\21\25\27\1\16\1\27\1\24\4\27\1\25\1\2\1\3\2\27\1\17\2\27\1\26\12\23\3\27\1\10\3\27\32\15\3\27\1\14\1\22\1\27\1\12\1\15\1\5\1\1\1\13\1\6\6\15\1\4\1\7\3\15\1\11\10\15\uff85\27",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\4\32\1\30\25\32",
            "",
            "\1\35",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\36\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\13\32\1\37\2\32\1\40\13\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\41\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\42\31\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\4\32\1\44\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\45\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\20\32\1\46\6\32\1\47\2\32",
            "\32\50\4\uffff\1\33\1\uffff\32\50",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\57",
            "\0\57",
            "\1\60\4\uffff\1\61",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\5\32\1\62\24\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\63\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\64\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\15\32\1\65\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\13\32\1\66\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\25\32\1\67\4\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\70\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\71\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\24\32\1\72\5\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\73\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\15\32\1\75\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\2\32\1\76\27\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\23\32\1\77\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\13\32\1\100\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\101\21\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\3\32\1\102\26\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\4\32\1\103\25\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\104\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\105\7\32",
            "",
            "\1\106\7\uffff\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\12\32\1\107\17\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\110\31\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\6\32\1\112\23\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\21\32\1\114\10\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\13\32\1\115\16\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\23\32\1\116\6\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\10\32\1\120\21\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\1\121\31\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\23\32\1\122\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\123\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\124\7\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\15\32\1\125\14\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\23\32\1\126\6\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\22\32\1\132\7\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\4\32\1\133\25\32",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\33\1\uffff\32\32",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_IDENTIFIER | RULE_WS | RULE_COMMA | RULE_TAB | RULE_RETURN_LINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='d') ) {s = 1;}

                        else if ( (LA13_0=='(') ) {s = 2;}

                        else if ( (LA13_0==')') ) {s = 3;}

                        else if ( (LA13_0=='m') ) {s = 4;}

                        else if ( (LA13_0=='c') ) {s = 5;}

                        else if ( (LA13_0=='f') ) {s = 6;}

                        else if ( (LA13_0=='n') ) {s = 7;}

                        else if ( (LA13_0=='=') ) {s = 8;}

                        else if ( (LA13_0=='r') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='e') ) {s = 11;}

                        else if ( (LA13_0=='^') ) {s = 12;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='b'||(LA13_0>='g' && LA13_0<='l')||(LA13_0>='o' && LA13_0<='q')||(LA13_0>='s' && LA13_0<='z')) ) {s = 13;}

                        else if ( (LA13_0==' ') ) {s = 14;}

                        else if ( (LA13_0==',') ) {s = 15;}

                        else if ( (LA13_0=='\t') ) {s = 16;}

                        else if ( (LA13_0=='\n') ) {s = 17;}

                        else if ( (LA13_0=='_') ) {s = 18;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 19;}

                        else if ( (LA13_0=='\"') ) {s = 20;}

                        else if ( (LA13_0=='\'') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_20 = input.LA(1);

                        s = -1;
                        if ( ((LA13_20>='\u0000' && LA13_20<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_21 = input.LA(1);

                        s = -1;
                        if ( ((LA13_21>='\u0000' && LA13_21<='\uFFFF')) ) {s = 47;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}