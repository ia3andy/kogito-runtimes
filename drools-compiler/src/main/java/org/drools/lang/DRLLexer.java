// $ANTLR 3.0.1 /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g 2008-08-04 21:40:31

	package org.drools.lang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class DRLLexer extends Lexer {
    public static final int COMMA=94;
    public static final int VT_PATTERN_TYPE=39;
    public static final int VT_ACCUMULATE_ID_CLAUSE=28;
    public static final int VK_DIALECT=54;
    public static final int VK_FUNCTION=65;
    public static final int END=91;
    public static final int HexDigit=123;
    public static final int VK_ATTRIBUTES=57;
    public static final int VT_EXPRESSION_CHAIN=30;
    public static final int VK_ACCUMULATE=81;
    public static final int MISC=119;
    public static final int VT_AND_PREFIX=23;
    public static final int VK_QUERY=63;
    public static final int THEN=116;
    public static final int VK_AUTO_FOCUS=49;
    public static final int DOT=89;
    public static final int VK_IMPORT=60;
    public static final int VT_SLOT=15;
    public static final int VT_PACKAGE_ID=40;
    public static final int LEFT_SQUARE=114;
    public static final int SH_STYLE_SINGLE_LINE_COMMENT=126;
    public static final int VT_DATA_TYPE=38;
    public static final int VK_MATCHES=69;
    public static final int VT_FACT=6;
    public static final int LEFT_CURLY=117;
    public static final int AT=96;
    public static final int LEFT_PAREN=93;
    public static final int DOUBLE_AMPER=102;
    public static final int VT_QUERY_ID=9;
    public static final int VT_ACCESSOR_PATH=36;
    public static final int VT_LABEL=8;
    public static final int VT_ENTRYPOINT_ID=13;
    public static final int VK_SOUNDSLIKE=71;
    public static final int VK_SALIENCE=55;
    public static final int VT_FIELD=35;
    public static final int WS=121;
    public static final int OVER=103;
    public static final int VK_AND=77;
    public static final int STRING=92;
    public static final int VT_ACCESSOR_ELEMENT=37;
    public static final int VT_ACCUMULATE_INIT_CLAUSE=27;
    public static final int VK_GLOBAL=66;
    public static final int VK_REVERSE=84;
    public static final int VT_BEHAVIOR=21;
    public static final int GRAVE_ACCENT=111;
    public static final int VK_DURATION=53;
    public static final int VT_SQUARE_CHUNK=19;
    public static final int VK_FORALL=79;
    public static final int VT_PAREN_CHUNK=20;
    public static final int VT_COMPILATION_UNIT=4;
    public static final int VK_ENABLED=56;
    public static final int EQUALS=98;
    public static final int VK_RESULT=85;
    public static final int UnicodeEscape=124;
    public static final int VK_PACKAGE=61;
    public static final int VT_RULE_ID=12;
    public static final int EQUAL=105;
    public static final int VK_NO_LOOP=48;
    public static final int SEMICOLON=87;
    public static final int VK_TEMPLATE=62;
    public static final int VT_AND_IMPLICIT=22;
    public static final int NULL=113;
    public static final int COLON=97;
    public static final int MULTI_LINE_COMMENT=128;
    public static final int VT_RULE_ATTRIBUTES=16;
    public static final int RIGHT_SQUARE=115;
    public static final int VK_AGENDA_GROUP=51;
    public static final int VT_FACT_OR=33;
    public static final int VK_NOT=74;
    public static final int VK_DATE_EXPIRES=46;
    public static final int ARROW=104;
    public static final int FLOAT=112;
    public static final int VT_SLOT_ID=14;
    public static final int VT_CURLY_CHUNK=18;
    public static final int VT_OR_PREFIX=24;
    public static final int DOUBLE_PIPE=101;
    public static final int LESS=108;
    public static final int VT_TYPE_DECLARE_ID=11;
    public static final int VT_PATTERN=31;
    public static final int VK_DATE_EFFECTIVE=45;
    public static final int EscapeSequence=122;
    public static final int VK_EXISTS=78;
    public static final int INT=100;
    public static final int VT_BIND_FIELD=34;
    public static final int VK_RULE=59;
    public static final int VK_EVAL=67;
    public static final int VK_COLLECT=86;
    public static final int GREATER=106;
    public static final int VT_FACT_BINDING=32;
    public static final int ID=88;
    public static final int NOT_EQUAL=110;
    public static final int RIGHT_CURLY=118;
    public static final int VK_ENTRY_POINT=73;
    public static final int VT_PARAM_LIST=44;
    public static final int VT_AND_INFIX=25;
    public static final int BOOL=99;
    public static final int VT_FROM_SOURCE=29;
    public static final int VK_CONTAINS=68;
    public static final int VK_LOCK_ON_ACTIVE=47;
    public static final int VT_FUNCTION_IMPORT=5;
    public static final int VK_IN=75;
    public static final int VT_RHS_CHUNK=17;
    public static final int VK_MEMBEROF=72;
    public static final int GREATER_EQUAL=107;
    public static final int VT_OR_INFIX=26;
    public static final int DOT_STAR=90;
    public static final int VK_OR=76;
    public static final int VT_GLOBAL_ID=42;
    public static final int LESS_EQUAL=109;
    public static final int VK_WHEN=58;
    public static final int VK_RULEFLOW_GROUP=52;
    public static final int VT_FUNCTION_ID=43;
    public static final int EOF=-1;
    public static final int VT_CONSTRAINTS=7;
    public static final int VT_IMPORT_ID=41;
    public static final int EOL=120;
    public static final int VK_INIT=82;
    public static final int VK_ACTIVATION_GROUP=50;
    public static final int Tokens=129;
    public static final int OctalEscape=125;
    public static final int VK_ACTION=83;
    public static final int VK_FROM=80;
    public static final int VK_EXCLUDES=70;
    public static final int RIGHT_PAREN=95;
    public static final int VT_TEMPLATE_ID=10;
    public static final int VK_DECLARE=64;
    public static final int C_STYLE_SINGLE_LINE_COMMENT=127;

    	/** The standard method called to automatically emit a token at the
    	 *  outermost lexical rule.  The token object should point into the
    	 *  char buffer start..stop.  If there is a text override in 'text',
    	 *  use that to set the token's text.  Override this method to emit
    	 *  custom Token objects.
    	 */
    	public Token emit() {
    		Token t = new DroolsToken(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
    		t.setLine(tokenStartLine);
    		t.setText(text);
    		t.setCharPositionInLine(tokenStartCharPositionInLine);
    		emit(t);
    		return t;
    	}

    public DRLLexer() {;} 
    public DRLLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[44+1];
     }
    public String getGrammarFileName() { return "/Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g"; }

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1105:9: ( ( ' ' | '\\t' | '\\f' | EOL )+ )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1105:17: ( ' ' | '\\t' | '\\f' | EOL )+
            {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1105:17: ( ' ' | '\\t' | '\\f' | EOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt1=1;
                    }
                    break;
                case '\t':
                    {
                    alt1=2;
                    }
                    break;
                case '\f':
                    {
                    alt1=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1105:19: ' '
            	    {
            	    match(' '); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1106:19: '\\t'
            	    {
            	    match('\t'); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1107:19: '\\f'
            	    {
            	    match('\f'); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1108:19: EOL
            	    {
            	    mEOL(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( backtracking==0 ) {
               channel=HIDDEN; 
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start EOL
    public final void mEOL() throws RecognitionException {
        try {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1114:6: ( ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' ) )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1115:6: ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' )
            {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1115:6: ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='\n') && (synpred1())) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else if ( (LA2_0=='\n') ) {
                alt2=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1115:6: ( ( '\\r\\n' )=> '\\r\\n' | '\\r' | '\\n' )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1115:14: ( '\\r\\n' )=> '\\r\\n'
                    {
                    match("\r\n"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1116:25: '\\r'
                    {
                    match('\r'); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1117:25: '\\n'
                    {
                    match('\n'); if (failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end EOL

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:2: ( ( '-' )? ( '0' .. '9' )+ )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:4: ( '-' )? ( '0' .. '9' )+
            {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:4: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:5: '-'
                    {
                    match('-'); if (failed) return ;

                    }
                    break;

            }

            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1122:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:2: ( ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:4: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:4: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:5: '-'
                    {
                    match('-'); if (failed) return ;

                    }
                    break;

            }

            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:10: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); if (failed) return ;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:26: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1126:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:5: ( ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' ) | ( '\\'' ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )* '\\'' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1129:1: STRING : ( ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' ) | ( '\\'' ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )* '\\'' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:8: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:8: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); if (failed) return ;
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:13: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1130:32: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:8: ( '\\'' ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:8: ( '\\'' ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:9: '\\'' ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); if (failed) return ;
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:14: ( EscapeSequence | ~ ( '\\\\' | '\\'' ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFE')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:16: EscapeSequence
                    	    {
                    	    mEscapeSequence(); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1131:33: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); if (failed) return ;

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1135:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1135:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1139:5: ( '\\\\' ( 'b' | 'B' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '.' | 'o' | 'x' | 'a' | 'e' | 'c' | 'd' | 'D' | 's' | 'S' | 'w' | 'W' | 'p' | 'A' | 'G' | 'Z' | 'z' | 'Q' | 'E' | '*' | '[' | ']' | '(' | ')' | '$' | '^' | '{' | '}' | '?' | '+' | '-' | '&' | '|' ) | UnicodeEscape | OctalEscape )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '$':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case '-':
                case '.':
                case '?':
                case 'A':
                case 'B':
                case 'D':
                case 'E':
                case 'G':
                case 'Q':
                case 'S':
                case 'W':
                case 'Z':
                case '[':
                case '\\':
                case ']':
                case '^':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'n':
                case 'o':
                case 'p':
                case 'r':
                case 's':
                case 't':
                case 'w':
                case 'x':
                case 'z':
                case '{':
                case '|':
                case '}':
                    {
                    alt11=1;
                    }
                    break;
                case 'u':
                    {
                    alt11=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt11=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1137:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 'B' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '.' | 'o' | 'x' | 'a' | 'e' | 'c' | 'd' | 'D' | 's' | 'S' | 'w' | 'W' | 'p' | 'A' | 'G' | 'Z' | 'z' | 'Q' | 'E' | '*' | '[' | ']' | '(' | ')' | '$' | '^' | '{' | '}' | '?' | '+' | '-' | '&' | '|' ) | UnicodeEscape | OctalEscape );", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1137:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 'B' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '.' | 'o' | 'x' | 'a' | 'e' | 'c' | 'd' | 'D' | 's' | 'S' | 'w' | 'W' | 'p' | 'A' | 'G' | 'Z' | 'z' | 'Q' | 'E' | '*' | '[' | ']' | '(' | ')' | '$' | '^' | '{' | '}' | '?' | '+' | '-' | '&' | '|' ) | UnicodeEscape | OctalEscape );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1139:9: '\\\\' ( 'b' | 'B' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | '.' | 'o' | 'x' | 'a' | 'e' | 'c' | 'd' | 'D' | 's' | 'S' | 'w' | 'W' | 'p' | 'A' | 'G' | 'Z' | 'z' | 'Q' | 'E' | '*' | '[' | ']' | '(' | ')' | '$' | '^' | '{' | '}' | '?' | '+' | '-' | '&' | '|' )
                    {
                    match('\\'); if (failed) return ;
                    if ( input.LA(1)=='\"'||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='.')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='B')||(input.LA(1)>='D' && input.LA(1)<='E')||input.LA(1)=='G'||input.LA(1)=='Q'||input.LA(1)=='S'||input.LA(1)=='W'||(input.LA(1)>='Z' && input.LA(1)<='^')||(input.LA(1)>='a' && input.LA(1)<='f')||(input.LA(1)>='n' && input.LA(1)<='p')||(input.LA(1)>='r' && input.LA(1)<='t')||(input.LA(1)>='w' && input.LA(1)<='x')||(input.LA(1)>='z' && input.LA(1)<='}') ) {
                        input.consume();
                    failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1143:9: UnicodeEscape
                    {
                    mUnicodeEscape(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1144:9: OctalEscape
                    {
                    mOctalEscape(); if (failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start OctalEscape
    public final void mOctalEscape() throws RecognitionException {
        try {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\\') ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='3')) ) {
                    int LA12_2 = input.LA(3);

                    if ( ((LA12_2>='0' && LA12_2<='7')) ) {
                        int LA12_4 = input.LA(4);

                        if ( ((LA12_4>='0' && LA12_4<='7')) ) {
                            alt12=1;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=3;}
                }
                else if ( ((LA12_1>='4' && LA12_1<='7')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3>='0' && LA12_3<='7')) ) {
                        alt12=2;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1147:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1147:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (failed) return ;
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:14: ( '0' .. '3' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:15: '0' .. '3'
                    {
                    matchRange('0','3'); if (failed) return ;

                    }

                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:25: ( '0' .. '7' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (failed) return ;

                    }

                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:36: ( '0' .. '7' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1149:37: '0' .. '7'
                    {
                    matchRange('0','7'); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1150:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); if (failed) return ;
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1150:14: ( '0' .. '7' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1150:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (failed) return ;

                    }

                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1150:25: ( '0' .. '7' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1150:26: '0' .. '7'
                    {
                    matchRange('0','7'); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1151:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); if (failed) return ;
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1151:14: ( '0' .. '7' )
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1151:15: '0' .. '7'
                    {
                    matchRange('0','7'); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end OctalEscape

    // $ANTLR start UnicodeEscape
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1156:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1156:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); if (failed) return ;
            match('u'); if (failed) return ;
            mHexDigit(); if (failed) return ;
            mHexDigit(); if (failed) return ;
            mHexDigit(); if (failed) return ;
            mHexDigit(); if (failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscape

    // $ANTLR start BOOL
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1160:2: ( ( 'true' | 'false' ) )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1160:4: ( 'true' | 'false' )
            {
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1160:4: ( 'true' | 'false' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='t') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1160:4: ( 'true' | 'false' )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1160:5: 'true'
                    {
                    match("true"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1160:12: 'false'
                    {
                    match("false"); if (failed) return ;


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOOL

    // $ANTLR start NULL
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1163:6: ( 'null' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1163:8: 'null'
            {
            match("null"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NULL

    // $ANTLR start OVER
    public final void mOVER() throws RecognitionException {
        try {
            int _type = OVER;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1166:2: ( 'over' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1166:4: 'over'
            {
            match("over"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OVER

    // $ANTLR start THEN
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1170:2: ( 'then' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1170:4: 'then'
            {
            match("then"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end THEN

    // $ANTLR start END
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1173:5: ( 'end' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1173:7: 'end'
            {
            match("end"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end END

    // $ANTLR start GRAVE_ACCENT
    public final void mGRAVE_ACCENT() throws RecognitionException {
        try {
            int _type = GRAVE_ACCENT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1177:2: ( '`' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1177:4: '`'
            {
            match('`'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GRAVE_ACCENT

    // $ANTLR start AT
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1180:4: ( '@' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1180:6: '@'
            {
            match('@'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AT

    // $ANTLR start EQUALS
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1184:2: ( '=' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1184:4: '='
            {
            match('='); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS

    // $ANTLR start SEMICOLON
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1188:2: ( ';' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1188:4: ';'
            {
            match(';'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMICOLON

    // $ANTLR start DOT_STAR
    public final void mDOT_STAR() throws RecognitionException {
        try {
            int _type = DOT_STAR;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1192:2: ( '.*' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1192:4: '.*'
            {
            match(".*"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT_STAR

    // $ANTLR start COLON
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1196:2: ( ':' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1196:4: ':'
            {
            match(':'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLON

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1200:2: ( '==' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1200:4: '=='
            {
            match("=="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start NOT_EQUAL
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1204:2: ( '!=' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1204:4: '!='
            {
            match("!="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUAL

    // $ANTLR start GREATER
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1208:2: ( '>' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1208:4: '>'
            {
            match('>'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER

    // $ANTLR start GREATER_EQUAL
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1212:2: ( '>=' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1212:4: '>='
            {
            match(">="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER_EQUAL

    // $ANTLR start LESS
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1216:2: ( '<' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1216:4: '<'
            {
            match('<'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS

    // $ANTLR start LESS_EQUAL
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1220:2: ( '<=' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1220:4: '<='
            {
            match("<="); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS_EQUAL

    // $ANTLR start ARROW
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1224:2: ( '->' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1224:4: '->'
            {
            match("->"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARROW

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1228:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '\\u00c0' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '\\u00c0' .. '\\u00ff' )* )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1228:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '\\u00c0' .. '\\u00ff' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '\\u00c0' .. '\\u00ff' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00FF') ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1228:50: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '\\u00c0' .. '\\u00ff' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')||(LA14_0>='\u00C0' && LA14_0<='\u00FF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00FF') ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start LEFT_PAREN
    public final void mLEFT_PAREN() throws RecognitionException {
        try {
            int _type = LEFT_PAREN;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1232:9: ( '(' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1232:11: '('
            {
            match('('); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFT_PAREN

    // $ANTLR start RIGHT_PAREN
    public final void mRIGHT_PAREN() throws RecognitionException {
        try {
            int _type = RIGHT_PAREN;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1236:9: ( ')' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1236:11: ')'
            {
            match(')'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_PAREN

    // $ANTLR start LEFT_SQUARE
    public final void mLEFT_SQUARE() throws RecognitionException {
        try {
            int _type = LEFT_SQUARE;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1240:9: ( '[' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1240:11: '['
            {
            match('['); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFT_SQUARE

    // $ANTLR start RIGHT_SQUARE
    public final void mRIGHT_SQUARE() throws RecognitionException {
        try {
            int _type = RIGHT_SQUARE;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1244:9: ( ']' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1244:11: ']'
            {
            match(']'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_SQUARE

    // $ANTLR start LEFT_CURLY
    public final void mLEFT_CURLY() throws RecognitionException {
        try {
            int _type = LEFT_CURLY;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1248:9: ( '{' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1248:11: '{'
            {
            match('{'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEFT_CURLY

    // $ANTLR start RIGHT_CURLY
    public final void mRIGHT_CURLY() throws RecognitionException {
        try {
            int _type = RIGHT_CURLY;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1252:9: ( '}' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1252:11: '}'
            {
            match('}'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RIGHT_CURLY

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1255:7: ( ',' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1255:9: ','
            {
            match(','); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start DOT
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1258:5: ( '.' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1258:7: '.'
            {
            match('.'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOT

    // $ANTLR start DOUBLE_AMPER
    public final void mDOUBLE_AMPER() throws RecognitionException {
        try {
            int _type = DOUBLE_AMPER;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1262:2: ( '&&' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1262:4: '&&'
            {
            match("&&"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_AMPER

    // $ANTLR start DOUBLE_PIPE
    public final void mDOUBLE_PIPE() throws RecognitionException {
        try {
            int _type = DOUBLE_PIPE;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1266:2: ( '||' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1266:4: '||'
            {
            match("||"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_PIPE

    // $ANTLR start SH_STYLE_SINGLE_LINE_COMMENT
    public final void mSH_STYLE_SINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = SH_STYLE_SINGLE_LINE_COMMENT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1270:2: ( '#' ( options {greedy=false; } : . )* EOL )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1270:4: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); if (failed) return ;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1270:8: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\r') ) {
                    alt15=2;
                }
                else if ( (LA15_0=='\n') ) {
                    alt15=2;
                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1270:35: .
            	    {
            	    matchAny(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            mEOL(); if (failed) return ;
            if ( backtracking==0 ) {
               channel=HIDDEN; setText("//"+getText().substring(1));
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SH_STYLE_SINGLE_LINE_COMMENT

    // $ANTLR start C_STYLE_SINGLE_LINE_COMMENT
    public final void mC_STYLE_SINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = C_STYLE_SINGLE_LINE_COMMENT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1276:2: ( '//' ( options {greedy=false; } : . )* EOL )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1276:4: '//' ( options {greedy=false; } : . )* EOL
            {
            match("//"); if (failed) return ;

            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1276:9: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\r') ) {
                    alt16=2;
                }
                else if ( (LA16_0=='\n') ) {
                    alt16=2;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1276:36: .
            	    {
            	    matchAny(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            mEOL(); if (failed) return ;
            if ( backtracking==0 ) {
               channel=HIDDEN; 
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end C_STYLE_SINGLE_LINE_COMMENT

    // $ANTLR start MULTI_LINE_COMMENT
    public final void mMULTI_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_LINE_COMMENT;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1281:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1281:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); if (failed) return ;

            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1281:9: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFE')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFE')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1281:35: .
            	    {
            	    matchAny(); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); if (failed) return ;

            if ( backtracking==0 ) {
               channel=HIDDEN; 
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULTI_LINE_COMMENT

    // $ANTLR start MISC
    public final void mMISC() throws RecognitionException {
        try {
            int _type = MISC;
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1285:7: ( '!' | '$' | '%' | '^' | '*' | '_' | '-' | '+' | '?' | '/' | '\\'' | '\\\\' | '|' | '&' )
            // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||input.LA(1)=='?'||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='_')||input.LA(1)=='|' ) {
                input.consume();
            failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MISC

    public void mTokens() throws RecognitionException {
        // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:8: ( WS | INT | FLOAT | STRING | BOOL | NULL | OVER | THEN | END | GRAVE_ACCENT | AT | EQUALS | SEMICOLON | DOT_STAR | COLON | EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | ARROW | ID | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE | RIGHT_SQUARE | LEFT_CURLY | RIGHT_CURLY | COMMA | DOT | DOUBLE_AMPER | DOUBLE_PIPE | SH_STYLE_SINGLE_LINE_COMMENT | C_STYLE_SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT | MISC )
        int alt18=37;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:10: WS
                {
                mWS(); if (failed) return ;

                }
                break;
            case 2 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:13: INT
                {
                mINT(); if (failed) return ;

                }
                break;
            case 3 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:17: FLOAT
                {
                mFLOAT(); if (failed) return ;

                }
                break;
            case 4 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:23: STRING
                {
                mSTRING(); if (failed) return ;

                }
                break;
            case 5 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:30: BOOL
                {
                mBOOL(); if (failed) return ;

                }
                break;
            case 6 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:35: NULL
                {
                mNULL(); if (failed) return ;

                }
                break;
            case 7 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:40: OVER
                {
                mOVER(); if (failed) return ;

                }
                break;
            case 8 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:45: THEN
                {
                mTHEN(); if (failed) return ;

                }
                break;
            case 9 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:50: END
                {
                mEND(); if (failed) return ;

                }
                break;
            case 10 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:54: GRAVE_ACCENT
                {
                mGRAVE_ACCENT(); if (failed) return ;

                }
                break;
            case 11 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:67: AT
                {
                mAT(); if (failed) return ;

                }
                break;
            case 12 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:70: EQUALS
                {
                mEQUALS(); if (failed) return ;

                }
                break;
            case 13 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:77: SEMICOLON
                {
                mSEMICOLON(); if (failed) return ;

                }
                break;
            case 14 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:87: DOT_STAR
                {
                mDOT_STAR(); if (failed) return ;

                }
                break;
            case 15 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:96: COLON
                {
                mCOLON(); if (failed) return ;

                }
                break;
            case 16 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:102: EQUAL
                {
                mEQUAL(); if (failed) return ;

                }
                break;
            case 17 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:108: NOT_EQUAL
                {
                mNOT_EQUAL(); if (failed) return ;

                }
                break;
            case 18 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:118: GREATER
                {
                mGREATER(); if (failed) return ;

                }
                break;
            case 19 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:126: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (failed) return ;

                }
                break;
            case 20 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:140: LESS
                {
                mLESS(); if (failed) return ;

                }
                break;
            case 21 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:145: LESS_EQUAL
                {
                mLESS_EQUAL(); if (failed) return ;

                }
                break;
            case 22 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:156: ARROW
                {
                mARROW(); if (failed) return ;

                }
                break;
            case 23 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:162: ID
                {
                mID(); if (failed) return ;

                }
                break;
            case 24 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:165: LEFT_PAREN
                {
                mLEFT_PAREN(); if (failed) return ;

                }
                break;
            case 25 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:176: RIGHT_PAREN
                {
                mRIGHT_PAREN(); if (failed) return ;

                }
                break;
            case 26 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:188: LEFT_SQUARE
                {
                mLEFT_SQUARE(); if (failed) return ;

                }
                break;
            case 27 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:200: RIGHT_SQUARE
                {
                mRIGHT_SQUARE(); if (failed) return ;

                }
                break;
            case 28 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:213: LEFT_CURLY
                {
                mLEFT_CURLY(); if (failed) return ;

                }
                break;
            case 29 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:224: RIGHT_CURLY
                {
                mRIGHT_CURLY(); if (failed) return ;

                }
                break;
            case 30 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:236: COMMA
                {
                mCOMMA(); if (failed) return ;

                }
                break;
            case 31 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:242: DOT
                {
                mDOT(); if (failed) return ;

                }
                break;
            case 32 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:246: DOUBLE_AMPER
                {
                mDOUBLE_AMPER(); if (failed) return ;

                }
                break;
            case 33 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:259: DOUBLE_PIPE
                {
                mDOUBLE_PIPE(); if (failed) return ;

                }
                break;
            case 34 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:271: SH_STYLE_SINGLE_LINE_COMMENT
                {
                mSH_STYLE_SINGLE_LINE_COMMENT(); if (failed) return ;

                }
                break;
            case 35 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:300: C_STYLE_SINGLE_LINE_COMMENT
                {
                mC_STYLE_SINGLE_LINE_COMMENT(); if (failed) return ;

                }
                break;
            case 36 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:328: MULTI_LINE_COMMENT
                {
                mMULTI_LINE_COMMENT(); if (failed) return ;

                }
                break;
            case 37 :
                // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1:347: MISC
                {
                mMISC(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1115:14: ( '\\r\\n' )
        // /Users/porcelli/Documents/dev/drools-trunk/drools-compiler/src/main/resources/org/drools/lang/DRL.g:1115:16: '\\r\\n'
        {
        match("\r\n"); if (failed) return ;


        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\2\uffff\1\41\1\43\1\uffff\1\41\5\40\2\uffff\1\54\1\uffff\1\56\1"+
        "\uffff\1\41\1\61\1\63\10\uffff\2\41\1\uffff\1\41\5\uffff\6\40\15"+
        "\uffff\5\40\1\103\1\104\1\105\1\40\1\107\1\110\3\uffff\1\104\2\uffff";
    static final String DFA18_eofS =
        "\111\uffff";
    static final String DFA18_minS =
        "\1\11\1\uffff\1\60\1\56\1\uffff\1\0\1\150\1\141\1\165\1\166\1\156"+
        "\2\uffff\1\75\1\uffff\1\52\1\uffff\3\75\10\uffff\1\46\1\174\1\uffff"+
        "\1\52\5\uffff\1\165\1\145\2\154\1\145\1\144\15\uffff\1\145\1\156"+
        "\1\163\1\154\1\162\3\60\1\145\2\60\3\uffff\1\60\2\uffff";
    static final String DFA18_maxS =
        "\1\u00ff\1\uffff\1\76\1\71\1\uffff\1\ufffe\1\162\1\141\1\165\1\166"+
        "\1\156\2\uffff\1\75\1\uffff\1\52\1\uffff\3\75\10\uffff\1\46\1\174"+
        "\1\uffff\1\57\5\uffff\1\165\1\145\2\154\1\145\1\144\15\uffff\1\145"+
        "\1\156\1\163\1\154\1\162\3\u00ff\1\145\2\u00ff\3\uffff\1\u00ff\2"+
        "\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\6\uffff\1\12\1\13\1\uffff\1\15\1\uffff"+
        "\1\17\3\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff\1"+
        "\42\1\uffff\1\27\1\45\1\26\1\2\1\3\6\uffff\1\20\1\14\1\16\1\37\1"+
        "\21\1\23\1\22\1\25\1\24\1\40\1\41\1\44\1\43\13\uffff\1\11\1\5\1"+
        "\10\1\uffff\1\6\1\7";
    static final String DFA18_specialS =
        "\111\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\1\1\uffff\2\1\22\uffff\1\1\1\21\1\4\1\36\1\24\1\41\1\34\1"+
            "\5\1\25\1\26\2\41\1\33\1\2\1\17\1\37\12\3\1\20\1\16\1\23\1\15"+
            "\1\22\1\41\1\14\32\40\1\27\1\41\1\30\1\41\1\24\1\13\4\40\1\12"+
            "\1\7\7\40\1\10\1\11\4\40\1\6\6\40\1\31\1\35\1\32\102\uffff\100"+
            "\40",
            "",
            "\12\3\4\uffff\1\42",
            "\1\44\1\uffff\12\3",
            "",
            "\uffff\4",
            "\1\46\11\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\53",
            "",
            "\1\55",
            "",
            "\1\57",
            "\1\60",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "",
            "\1\66\4\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "\1\106",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40\105\uffff\100"+
            "\40",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WS | INT | FLOAT | STRING | BOOL | NULL | OVER | THEN | END | GRAVE_ACCENT | AT | EQUALS | SEMICOLON | DOT_STAR | COLON | EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | ARROW | ID | LEFT_PAREN | RIGHT_PAREN | LEFT_SQUARE | RIGHT_SQUARE | LEFT_CURLY | RIGHT_CURLY | COMMA | DOT | DOUBLE_AMPER | DOUBLE_PIPE | SH_STYLE_SINGLE_LINE_COMMENT | C_STYLE_SINGLE_LINE_COMMENT | MULTI_LINE_COMMENT | MISC );";
        }
    }
 

}