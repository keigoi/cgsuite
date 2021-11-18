// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g 2015-08-16 14:39:11

    package org.cgsuite.lang.parser;

    import org.cgsuite.lang.parser.CgsuiteParser.SyntaxError;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"unchecked","cast","all"}) public class CgsuiteLexer extends Lexer {
    public static final int EOF=-1;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int PLUSMINUS=6;
    public static final int AST=7;
    public static final int FSLASH=8;
    public static final int DOT=9;
    public static final int PERCENT=10;
    public static final int LPAREN=11;
    public static final int RPAREN=12;
    public static final int LBRACKET=13;
    public static final int RBRACKET=14;
    public static final int LBRACE=15;
    public static final int RBRACE=16;
    public static final int DQUOTE=17;
    public static final int SQUOTE=18;
    public static final int COMMA=19;
    public static final int SEMI=20;
    public static final int COLON=21;
    public static final int QUESTION=22;
    public static final int CARET=23;
    public static final int VEE=24;
    public static final int AMPERSAND=25;
    public static final int EQUALS=26;
    public static final int NEQ=27;
    public static final int LT=28;
    public static final int GT=29;
    public static final int LEQ=30;
    public static final int GEQ=31;
    public static final int CONFUSED=32;
    public static final int LCONFUSED=33;
    public static final int GCONFUSED=34;
    public static final int COMPARE=35;
    public static final int RARROW=36;
    public static final int BIGRARROW=37;
    public static final int BACKSLASH=38;
    public static final int REFEQUALS=39;
    public static final int REFNEQ=40;
    public static final int ASSIGN=41;
    public static final int BAD_ASSIGN=42;
    public static final int DOTDOT=43;
    public static final int DOTDOTDOT=44;
    public static final int AND=45;
    public static final int BEGIN=46;
    public static final int BREAK=47;
    public static final int BY=48;
    public static final int CLASS=49;
    public static final int CLEAR=50;
    public static final int CONTINUE=51;
    public static final int DO=52;
    public static final int ELSE=53;
    public static final int ELSEIF=54;
    public static final int END=55;
    public static final int ENUM=56;
    public static final int ERROR=57;
    public static final int EXTENDS=58;
    public static final int FALSE=59;
    public static final int FINALLY=60;
    public static final int FOR=61;
    public static final int FOREACH=62;
    public static final int FROM=63;
    public static final int GET=64;
    public static final int IF=65;
    public static final int IMPORT=66;
    public static final int IN=67;
    public static final int INF=68;
    public static final int IS=69;
    public static final int JAVA=70;
    public static final int LISTOF=71;
    public static final int METHOD=72;
    public static final int MUTABLE=73;
    public static final int NEG=74;
    public static final int NIL=75;
    public static final int NOT=76;
    public static final int OP=77;
    public static final int OR=78;
    public static final int OVERRIDE=79;
    public static final int PASS=80;
    public static final int POS=81;
    public static final int PROPERTY=82;
    public static final int RETURN=83;
    public static final int SET=84;
    public static final int SETOF=85;
    public static final int STATIC=86;
    public static final int SUMOF=87;
    public static final int SUPER=88;
    public static final int TABLEOF=89;
    public static final int THEN=90;
    public static final int THIS=91;
    public static final int TO=92;
    public static final int TRUE=93;
    public static final int TRY=94;
    public static final int VAR=95;
    public static final int WHERE=96;
    public static final int WHILE=97;
    public static final int ARRAY_REFERENCE=98;
    public static final int ARRAY_INDEX_LIST=99;
    public static final int ASN_ANTECEDENT=100;
    public static final int ENUM_ELEMENT=101;
    public static final int ENUM_ELEMENT_LIST=102;
    public static final int EXP=103;
    public static final int EXPLICIT_LIST=104;
    public static final int EXPLICIT_MAP=105;
    public static final int EXPLICIT_SET=106;
    public static final int EXPRESSION_LIST=107;
    public static final int FUNCTION_CALL=108;
    public static final int FUNCTION_CALL_ARGUMENT_LIST=109;
    public static final int METHOD_PARAMETER_LIST=110;
    public static final int MODIFIERS=111;
    public static final int NODE_LABEL=112;
    public static final int PREAMBLE=113;
    public static final int PROCEDURE_PARAMETER_LIST=114;
    public static final int STATEMENT_SEQUENCE=115;
    public static final int UNARY_AST=116;
    public static final int UNARY_MINUS=117;
    public static final int UNARY_PLUS=118;
    public static final int IDENTIFIER=119;
    public static final int STRING=120;
    public static final int MULTI_CARET=121;
    public static final int MULTI_VEE=122;
    public static final int INTEGER=123;
    public static final int SLASHES=124;
    public static final int DIGIT=125;
    public static final int NONV=126;
    public static final int LETTER=127;
    public static final int ESCAPE_SEQ=128;
    public static final int SLASH=129;
    public static final int NEWLINE=130;
    public static final int WHITESPACE=131;
    public static final int SL_COMMENT=132;
    public static final int ML_COMMENT=133;
    public static final int HEX_DIGIT=134;

        private List<SyntaxError> errors = new ArrayList<SyntaxError>();

        @Override
        public String getErrorMessage(RecognitionException re, String[] tokenNames)
        {
            String message = super.getErrorMessage(re, tokenNames);
            errors.add(new SyntaxError(re, message));
            return message;
        }

        @Override
        public void emitErrorMessage(String message)
        {
        }

        public List<SyntaxError> getErrors()
        {
            return errors;
        }


    // delegates
    // delegators

    public CgsuiteLexer() {;} 
    public CgsuiteLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CgsuiteLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:34:6: ( '+' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:34:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:35:7: ( '-' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "PLUSMINUS"
    public final void mPLUSMINUS() throws RecognitionException {
        try {
            int _type = PLUSMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:36:11: ( '+-' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:36:13: '+-'
            {
            match("+-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSMINUS"

    // $ANTLR start "AST"
    public final void mAST() throws RecognitionException {
        try {
            int _type = AST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:37:5: ( '*' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:37:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AST"

    // $ANTLR start "FSLASH"
    public final void mFSLASH() throws RecognitionException {
        try {
            int _type = FSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:38:8: ( '/' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:38:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FSLASH"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:39:5: ( '.' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:39:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:40:9: ( '%' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:40:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:41:8: ( '(' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:41:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:42:8: ( ')' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:42:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:43:10: ( '[' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:43:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:44:10: ( ']' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:44:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:45:8: ( '{' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:45:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:46:8: ( '}' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:46:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:47:8: ( '\"' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:47:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:48:8: ( '\\'' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:48:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:49:7: ( ',' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:49:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:50:6: ( ';' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:50:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:51:7: ( ':' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:51:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:52:10: ( '?' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:52:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:53:7: ( '^' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:53:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "VEE"
    public final void mVEE() throws RecognitionException {
        try {
            int _type = VEE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:54:5: ( 'v' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:54:7: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VEE"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:55:11: ( '&' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:55:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:56:8: ( '==' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:56:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:57:5: ( '!=' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:57:7: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:58:4: ( '<' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:58:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:59:4: ( '>' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:59:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:60:5: ( '<=' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:60:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:61:5: ( '>=' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:61:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "CONFUSED"
    public final void mCONFUSED() throws RecognitionException {
        try {
            int _type = CONFUSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:62:10: ( '<>' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:62:12: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONFUSED"

    // $ANTLR start "LCONFUSED"
    public final void mLCONFUSED() throws RecognitionException {
        try {
            int _type = LCONFUSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:63:11: ( '<|' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:63:13: '<|'
            {
            match("<|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCONFUSED"

    // $ANTLR start "GCONFUSED"
    public final void mGCONFUSED() throws RecognitionException {
        try {
            int _type = GCONFUSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:64:11: ( '|>' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:64:13: '|>'
            {
            match("|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GCONFUSED"

    // $ANTLR start "COMPARE"
    public final void mCOMPARE() throws RecognitionException {
        try {
            int _type = COMPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:65:9: ( '<=>' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:65:11: '<=>'
            {
            match("<=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPARE"

    // $ANTLR start "RARROW"
    public final void mRARROW() throws RecognitionException {
        try {
            int _type = RARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:66:8: ( '->' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:66:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RARROW"

    // $ANTLR start "BIGRARROW"
    public final void mBIGRARROW() throws RecognitionException {
        try {
            int _type = BIGRARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:67:11: ( '=>' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:67:13: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIGRARROW"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:68:11: ( '\\\\' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:68:13: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "REFEQUALS"
    public final void mREFEQUALS() throws RecognitionException {
        try {
            int _type = REFEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:69:11: ( '===' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:69:13: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFEQUALS"

    // $ANTLR start "REFNEQ"
    public final void mREFNEQ() throws RecognitionException {
        try {
            int _type = REFNEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:70:8: ( '!==' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:70:10: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFNEQ"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:71:8: ( ':=' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:71:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "BAD_ASSIGN"
    public final void mBAD_ASSIGN() throws RecognitionException {
        try {
            int _type = BAD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:72:12: ( '=' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:72:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAD_ASSIGN"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:73:8: ( '..' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:73:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "DOTDOTDOT"
    public final void mDOTDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:74:11: ( '...' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:74:13: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTDOTDOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:75:5: ( 'and' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:75:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:76:7: ( 'begin' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:76:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:77:7: ( 'break' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:77:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:78:4: ( 'by' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:78:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:79:7: ( 'class' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:79:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:80:7: ( 'clear' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:80:9: 'clear'
            {
            match("clear"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:81:10: ( 'continue' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:81:12: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:82:4: ( 'do' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:82:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:83:6: ( 'else' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:83:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSEIF"
    public final void mELSEIF() throws RecognitionException {
        try {
            int _type = ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:84:8: ( 'elseif' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:84:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSEIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:85:5: ( 'end' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:85:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:86:6: ( 'enum' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:86:8: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "ERROR"
    public final void mERROR() throws RecognitionException {
        try {
            int _type = ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:87:7: ( 'error' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:87:9: 'error'
            {
            match("error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ERROR"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:88:9: ( 'extends' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:88:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:89:7: ( 'false' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:89:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:90:9: ( 'finally' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:90:11: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:91:5: ( 'for' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:91:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FOREACH"
    public final void mFOREACH() throws RecognitionException {
        try {
            int _type = FOREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:92:9: ( 'foreach' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:92:11: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREACH"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:93:6: ( 'from' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:93:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:94:5: ( 'get' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:94:7: 'get'
            {
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:95:4: ( 'if' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:95:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:96:8: ( 'import' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:96:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:97:4: ( 'in' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:97:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "INF"
    public final void mINF() throws RecognitionException {
        try {
            int _type = INF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:98:5: ( 'inf' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:98:7: 'inf'
            {
            match("inf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INF"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:99:4: ( 'is' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:99:6: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "JAVA"
    public final void mJAVA() throws RecognitionException {
        try {
            int _type = JAVA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:100:6: ( 'java' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:100:8: 'java'
            {
            match("java"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JAVA"

    // $ANTLR start "LISTOF"
    public final void mLISTOF() throws RecognitionException {
        try {
            int _type = LISTOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:101:8: ( 'listof' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:101:10: 'listof'
            {
            match("listof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LISTOF"

    // $ANTLR start "METHOD"
    public final void mMETHOD() throws RecognitionException {
        try {
            int _type = METHOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:102:8: ( 'method' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:102:10: 'method'
            {
            match("method"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD"

    // $ANTLR start "MUTABLE"
    public final void mMUTABLE() throws RecognitionException {
        try {
            int _type = MUTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:103:9: ( 'mutable' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:103:11: 'mutable'
            {
            match("mutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUTABLE"

    // $ANTLR start "NEG"
    public final void mNEG() throws RecognitionException {
        try {
            int _type = NEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:104:5: ( 'neg' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:104:7: 'neg'
            {
            match("neg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEG"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:105:5: ( 'nil' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:105:7: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:106:5: ( 'not' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:106:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:107:4: ( 'op' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:107:6: 'op'
            {
            match("op"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:108:4: ( 'or' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:108:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:109:10: ( 'override' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:109:12: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "PASS"
    public final void mPASS() throws RecognitionException {
        try {
            int _type = PASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:110:6: ( 'pass' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:110:8: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASS"

    // $ANTLR start "POS"
    public final void mPOS() throws RecognitionException {
        try {
            int _type = POS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:111:5: ( 'pos' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:111:7: 'pos'
            {
            match("pos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POS"

    // $ANTLR start "PROPERTY"
    public final void mPROPERTY() throws RecognitionException {
        try {
            int _type = PROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:112:10: ( 'property' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:112:12: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPERTY"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:113:8: ( 'return' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:113:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:114:5: ( 'set' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:114:7: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "SETOF"
    public final void mSETOF() throws RecognitionException {
        try {
            int _type = SETOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:115:7: ( 'setof' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:115:9: 'setof'
            {
            match("setof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SETOF"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:116:8: ( 'static' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:116:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "SUMOF"
    public final void mSUMOF() throws RecognitionException {
        try {
            int _type = SUMOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:117:7: ( 'sumof' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:117:9: 'sumof'
            {
            match("sumof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUMOF"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:118:7: ( 'super' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:118:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "TABLEOF"
    public final void mTABLEOF() throws RecognitionException {
        try {
            int _type = TABLEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:119:9: ( 'tableof' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:119:11: 'tableof'
            {
            match("tableof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLEOF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:120:6: ( 'then' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:120:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:121:6: ( 'this' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:121:8: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:122:4: ( 'to' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:122:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:123:6: ( 'true' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:123:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:124:5: ( 'try' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:124:7: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:125:5: ( 'var' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:125:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:126:7: ( 'where' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:126:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:127:7: ( 'while' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:127:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:709:10: ( ( DIGIT )+ )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:709:12: ( DIGIT )+
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:709:12: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:709:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "MULTI_CARET"
    public final void mMULTI_CARET() throws RecognitionException {
        try {
            int _type = MULTI_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:711:13: ( '^' ( '^' )+ )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:711:15: '^' ( '^' )+
            {
            match('^'); 
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:711:19: ( '^' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='^') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:711:20: '^'
            	    {
            	    match('^'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_CARET"

    // $ANTLR start "MULTI_VEE"
    public final void mMULTI_VEE() throws RecognitionException {
        try {
            int _type = MULTI_VEE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:713:13: ( 'v' ( 'v' )+ )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:713:15: 'v' ( 'v' )+
            {
            match('v'); 
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:713:19: ( 'v' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='v') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:713:20: 'v'
            	    {
            	    match('v'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_VEE"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:715:12: ( ( 'v' )* NONV ( LETTER | DIGIT )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:715:14: ( 'v' )* NONV ( LETTER | DIGIT )*
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:715:14: ( 'v' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='v') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:715:14: 'v'
            	    {
            	    match('v'); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mNONV(); 
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:715:24: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
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
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:717:9: ( DQUOTE (~ ( DQUOTE | BACKSLASH | '\\n' | '\\r' ) | ESCAPE_SEQ )* DQUOTE )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:717:11: DQUOTE (~ ( DQUOTE | BACKSLASH | '\\n' | '\\r' ) | ESCAPE_SEQ )* DQUOTE
            {
            mDQUOTE(); 
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:717:18: (~ ( DQUOTE | BACKSLASH | '\\n' | '\\r' ) | ESCAPE_SEQ )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }
                else if ( (LA6_0=='\\') ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:717:19: ~ ( DQUOTE | BACKSLASH | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:717:51: ESCAPE_SEQ
            	    {
            	    mESCAPE_SEQ(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            mDQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SLASHES"
    public final void mSLASHES() throws RecognitionException {
        try {
            int _type = SLASHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:719:10: ( ( SLASH )+ )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:719:12: ( SLASH )+
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:719:12: ( SLASH )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='|') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:719:12: SLASH
            	    {
            	    mSLASH(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHES"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:13: ( ( ' ' | '\\t' | '\\u00A0' | NEWLINE )+ )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:15: ( ' ' | '\\t' | '\\u00A0' | NEWLINE )+
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:15: ( ' ' | '\\t' | '\\u00A0' | NEWLINE )+
            int cnt8=0;
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt8=1;
                    }
                    break;
                case '\t':
                    {
                    alt8=2;
                    }
                    break;
                case '\u00A0':
                    {
                    alt8=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:16: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:22: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:29: '\\u00A0'
            	    {
            	    match('\u00A0'); 

            	    }
            	    break;
            	case 4 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:722:40: NEWLINE
            	    {
            	    mNEWLINE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:13: ( '//' (~ ( '\\r' | '\\n' ) )* ( NEWLINE )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:15: '//' (~ ( '\\r' | '\\n' ) )* ( NEWLINE )?
            {
            match("//"); 

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:20: (~ ( '\\r' | '\\n' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:20: ~ ( '\\r' | '\\n' )
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
            	    break loop9;
                }
            } while (true);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:34: ( NEWLINE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:724:34: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;

            }

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:13: ( '/*' (~ ( '*' ) | '*' ~ ( '/' ) )* ( '*/' )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:15: '/*' (~ ( '*' ) | '*' ~ ( '/' ) )* ( '*/' )?
            {
            match("/*"); 

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:20: (~ ( '*' ) | '*' ~ ( '/' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=2;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:22: ~ ( '*' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:31: '*' ~ ( '/' )
            	    {
            	    match('*'); 
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:46: ( '*/' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='*') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:726:46: '*/'
                    {
                    match("*/"); 


                    }
                    break;

            }

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:729:8: ( '0' .. '9' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:729:10: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:732:11: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:735:9: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "NONV"
    public final void mNONV() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:738:13: ( 'A' .. 'Z' | 'a' .. 'u' | 'w' .. 'z' | '_' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='u')||(input.LA(1)>='w' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "NONV"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:741:8: ( '|' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:741:10: '|'
            {
            match('|'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "ESCAPE_SEQ"
    public final void mESCAPE_SEQ() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:744:12: ( BACKSLASH ( BACKSLASH | 'n' | 'r' | 't' | DQUOTE | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:744:14: BACKSLASH ( BACKSLASH | 'n' | 'r' | 't' | DQUOTE | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            {
            mBACKSLASH(); 
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:745:6: ( BACKSLASH | 'n' | 'r' | 't' | DQUOTE | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            int alt13=6;
            switch ( input.LA(1) ) {
            case '\\':
                {
                alt13=1;
                }
                break;
            case 'n':
                {
                alt13=2;
                }
                break;
            case 'r':
                {
                alt13=3;
                }
                break;
            case 't':
                {
                alt13=4;
                }
                break;
            case '\"':
                {
                alt13=5;
                }
                break;
            case 'u':
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:745:8: BACKSLASH
                    {
                    mBACKSLASH(); 

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:746:8: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:747:8: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:748:8: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 5 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:749:8: DQUOTE
                    {
                    mDQUOTE(); 

                    }
                    break;
                case 6 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:750:8: 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
                    {
                    match('u'); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 
                    mHEX_DIGIT(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ESCAPE_SEQ"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:755:13: ( ( '\\r' )? '\\n' )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:755:15: ( '\\r' )? '\\n'
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:755:15: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:755:15: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    public void mTokens() throws RecognitionException {
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:8: ( PLUS | MINUS | PLUSMINUS | AST | FSLASH | DOT | PERCENT | LPAREN | RPAREN | LBRACKET | RBRACKET | LBRACE | RBRACE | DQUOTE | SQUOTE | COMMA | SEMI | COLON | QUESTION | CARET | VEE | AMPERSAND | EQUALS | NEQ | LT | GT | LEQ | GEQ | CONFUSED | LCONFUSED | GCONFUSED | COMPARE | RARROW | BIGRARROW | BACKSLASH | REFEQUALS | REFNEQ | ASSIGN | BAD_ASSIGN | DOTDOT | DOTDOTDOT | AND | BEGIN | BREAK | BY | CLASS | CLEAR | CONTINUE | DO | ELSE | ELSEIF | END | ENUM | ERROR | EXTENDS | FALSE | FINALLY | FOR | FOREACH | FROM | GET | IF | IMPORT | IN | INF | IS | JAVA | LISTOF | METHOD | MUTABLE | NEG | NIL | NOT | OP | OR | OVERRIDE | PASS | POS | PROPERTY | RETURN | SET | SETOF | STATIC | SUMOF | SUPER | TABLEOF | THEN | THIS | TO | TRUE | TRY | VAR | WHERE | WHILE | INTEGER | MULTI_CARET | MULTI_VEE | IDENTIFIER | STRING | SLASHES | WHITESPACE | SL_COMMENT | ML_COMMENT )
        int alt15=103;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:21: PLUSMINUS
                {
                mPLUSMINUS(); 

                }
                break;
            case 4 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:31: AST
                {
                mAST(); 

                }
                break;
            case 5 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:35: FSLASH
                {
                mFSLASH(); 

                }
                break;
            case 6 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:42: DOT
                {
                mDOT(); 

                }
                break;
            case 7 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:46: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 8 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:54: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 9 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:61: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 10 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:68: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 11 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:77: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 12 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:86: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 13 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:93: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 14 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:100: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 15 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:107: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 16 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:114: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 17 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:120: SEMI
                {
                mSEMI(); 

                }
                break;
            case 18 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:125: COLON
                {
                mCOLON(); 

                }
                break;
            case 19 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:131: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 20 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:140: CARET
                {
                mCARET(); 

                }
                break;
            case 21 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:146: VEE
                {
                mVEE(); 

                }
                break;
            case 22 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:150: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 23 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:160: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 24 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:167: NEQ
                {
                mNEQ(); 

                }
                break;
            case 25 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:171: LT
                {
                mLT(); 

                }
                break;
            case 26 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:174: GT
                {
                mGT(); 

                }
                break;
            case 27 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:177: LEQ
                {
                mLEQ(); 

                }
                break;
            case 28 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:181: GEQ
                {
                mGEQ(); 

                }
                break;
            case 29 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:185: CONFUSED
                {
                mCONFUSED(); 

                }
                break;
            case 30 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:194: LCONFUSED
                {
                mLCONFUSED(); 

                }
                break;
            case 31 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:204: GCONFUSED
                {
                mGCONFUSED(); 

                }
                break;
            case 32 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:214: COMPARE
                {
                mCOMPARE(); 

                }
                break;
            case 33 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:222: RARROW
                {
                mRARROW(); 

                }
                break;
            case 34 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:229: BIGRARROW
                {
                mBIGRARROW(); 

                }
                break;
            case 35 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:239: BACKSLASH
                {
                mBACKSLASH(); 

                }
                break;
            case 36 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:249: REFEQUALS
                {
                mREFEQUALS(); 

                }
                break;
            case 37 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:259: REFNEQ
                {
                mREFNEQ(); 

                }
                break;
            case 38 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:266: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 39 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:273: BAD_ASSIGN
                {
                mBAD_ASSIGN(); 

                }
                break;
            case 40 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:284: DOTDOT
                {
                mDOTDOT(); 

                }
                break;
            case 41 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:291: DOTDOTDOT
                {
                mDOTDOTDOT(); 

                }
                break;
            case 42 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:301: AND
                {
                mAND(); 

                }
                break;
            case 43 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:305: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 44 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:311: BREAK
                {
                mBREAK(); 

                }
                break;
            case 45 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:317: BY
                {
                mBY(); 

                }
                break;
            case 46 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:320: CLASS
                {
                mCLASS(); 

                }
                break;
            case 47 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:326: CLEAR
                {
                mCLEAR(); 

                }
                break;
            case 48 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:332: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 49 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:341: DO
                {
                mDO(); 

                }
                break;
            case 50 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:344: ELSE
                {
                mELSE(); 

                }
                break;
            case 51 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:349: ELSEIF
                {
                mELSEIF(); 

                }
                break;
            case 52 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:356: END
                {
                mEND(); 

                }
                break;
            case 53 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:360: ENUM
                {
                mENUM(); 

                }
                break;
            case 54 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:365: ERROR
                {
                mERROR(); 

                }
                break;
            case 55 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:371: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 56 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:379: FALSE
                {
                mFALSE(); 

                }
                break;
            case 57 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:385: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 58 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:393: FOR
                {
                mFOR(); 

                }
                break;
            case 59 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:397: FOREACH
                {
                mFOREACH(); 

                }
                break;
            case 60 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:405: FROM
                {
                mFROM(); 

                }
                break;
            case 61 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:410: GET
                {
                mGET(); 

                }
                break;
            case 62 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:414: IF
                {
                mIF(); 

                }
                break;
            case 63 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:417: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 64 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:424: IN
                {
                mIN(); 

                }
                break;
            case 65 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:427: INF
                {
                mINF(); 

                }
                break;
            case 66 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:431: IS
                {
                mIS(); 

                }
                break;
            case 67 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:434: JAVA
                {
                mJAVA(); 

                }
                break;
            case 68 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:439: LISTOF
                {
                mLISTOF(); 

                }
                break;
            case 69 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:446: METHOD
                {
                mMETHOD(); 

                }
                break;
            case 70 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:453: MUTABLE
                {
                mMUTABLE(); 

                }
                break;
            case 71 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:461: NEG
                {
                mNEG(); 

                }
                break;
            case 72 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:465: NIL
                {
                mNIL(); 

                }
                break;
            case 73 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:469: NOT
                {
                mNOT(); 

                }
                break;
            case 74 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:473: OP
                {
                mOP(); 

                }
                break;
            case 75 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:476: OR
                {
                mOR(); 

                }
                break;
            case 76 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:479: OVERRIDE
                {
                mOVERRIDE(); 

                }
                break;
            case 77 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:488: PASS
                {
                mPASS(); 

                }
                break;
            case 78 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:493: POS
                {
                mPOS(); 

                }
                break;
            case 79 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:497: PROPERTY
                {
                mPROPERTY(); 

                }
                break;
            case 80 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:506: RETURN
                {
                mRETURN(); 

                }
                break;
            case 81 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:513: SET
                {
                mSET(); 

                }
                break;
            case 82 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:517: SETOF
                {
                mSETOF(); 

                }
                break;
            case 83 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:523: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 84 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:530: SUMOF
                {
                mSUMOF(); 

                }
                break;
            case 85 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:536: SUPER
                {
                mSUPER(); 

                }
                break;
            case 86 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:542: TABLEOF
                {
                mTABLEOF(); 

                }
                break;
            case 87 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:550: THEN
                {
                mTHEN(); 

                }
                break;
            case 88 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:555: THIS
                {
                mTHIS(); 

                }
                break;
            case 89 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:560: TO
                {
                mTO(); 

                }
                break;
            case 90 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:563: TRUE
                {
                mTRUE(); 

                }
                break;
            case 91 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:568: TRY
                {
                mTRY(); 

                }
                break;
            case 92 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:572: VAR
                {
                mVAR(); 

                }
                break;
            case 93 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:576: WHERE
                {
                mWHERE(); 

                }
                break;
            case 94 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:582: WHILE
                {
                mWHILE(); 

                }
                break;
            case 95 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:588: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 96 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:596: MULTI_CARET
                {
                mMULTI_CARET(); 

                }
                break;
            case 97 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:608: MULTI_VEE
                {
                mMULTI_VEE(); 

                }
                break;
            case 98 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:618: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 99 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:629: STRING
                {
                mSTRING(); 

                }
                break;
            case 100 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:636: SLASHES
                {
                mSLASHES(); 

                }
                break;
            case 101 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:644: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 102 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:655: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 103 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:1:666: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\62\1\64\1\uffff\1\67\1\71\7\uffff\1\72\3\uffff\1\75\1"+
        "\uffff\1\76\1\101\1\uffff\1\105\1\uffff\1\112\1\114\1\116\1\uffff"+
        "\22\57\12\uffff\1\172\7\uffff\1\57\1\uffff\1\174\1\176\2\uffff\1"+
        "\u0080\1\u0082\7\uffff\3\57\1\u0086\2\57\1\u008a\11\57\1\u0095\1"+
        "\57\1\u0098\1\u0099\7\57\1\u00a1\1\u00a2\12\57\1\u00af\2\57\2\uffff"+
        "\1\u00b4\7\uffff\1\u00b5\2\57\1\uffff\3\57\1\uffff\1\57\1\u00bc"+
        "\5\57\1\u00c3\1\57\1\u00c5\1\uffff\1\57\1\u00c7\2\uffff\4\57\1\u00cc"+
        "\1\u00cd\1\u00ce\2\uffff\2\57\1\u00d1\2\57\1\u00d5\6\57\1\uffff"+
        "\1\57\1\u00dd\2\57\2\uffff\5\57\1\u00e6\1\uffff\1\u00e7\5\57\1\uffff"+
        "\1\u00ed\1\uffff\1\57\1\uffff\1\u00ef\3\57\3\uffff\1\57\1\u00f4"+
        "\1\uffff\3\57\1\uffff\4\57\1\u00fc\1\u00fd\1\u00fe\1\uffff\2\57"+
        "\1\u0101\1\u0102\1\u0103\1\u0104\2\57\2\uffff\1\u0107\1\57\1\u0109"+
        "\2\57\1\uffff\1\57\1\uffff\4\57\1\uffff\2\57\1\u0113\1\57\1\u0115"+
        "\1\u0116\1\57\3\uffff\1\u0118\1\u0119\4\uffff\1\57\1\u011b\1\uffff"+
        "\1\57\1\uffff\2\57\1\u011f\1\u0120\1\u0121\3\57\1\u0125\1\uffff"+
        "\1\u0126\2\uffff\1\57\2\uffff\1\57\1\uffff\1\u0129\1\u012a\1\u012b"+
        "\3\uffff\1\u012c\2\57\2\uffff\1\u012f\1\u0130\4\uffff\1\u0131\1"+
        "\u0132\4\uffff";
    static final String DFA15_eofS =
        "\u0133\uffff";
    static final String DFA15_minS =
        "\1\11\1\55\1\76\1\uffff\1\52\1\56\7\uffff\1\0\3\uffff\1\75\1\uffff"+
        "\1\136\1\101\1\uffff\4\75\1\76\1\uffff\1\156\1\145\1\154\1\157\1"+
        "\154\1\141\1\145\1\146\1\141\1\151\2\145\1\160\1\141\2\145\1\141"+
        "\1\150\12\uffff\1\56\7\uffff\1\162\1\uffff\1\101\1\75\2\uffff\1"+
        "\75\1\76\7\uffff\1\144\1\147\1\145\1\60\1\141\1\156\1\60\1\163\1"+
        "\144\1\162\1\164\1\154\1\156\1\162\1\157\1\164\1\60\1\160\2\60\1"+
        "\166\1\163\2\164\1\147\1\154\1\164\2\60\1\145\2\163\1\157\2\164"+
        "\1\141\1\155\1\142\1\145\1\60\1\165\1\145\2\uffff\1\60\7\uffff\1"+
        "\60\1\151\1\141\1\uffff\1\163\1\141\1\164\1\uffff\1\145\1\60\1\155"+
        "\1\157\1\145\1\163\1\141\1\60\1\155\1\60\1\uffff\1\157\1\60\2\uffff"+
        "\1\141\1\164\1\150\1\141\3\60\2\uffff\1\162\1\163\1\60\1\160\1\165"+
        "\1\60\1\164\1\157\1\145\1\154\1\156\1\163\1\uffff\1\145\1\60\1\162"+
        "\1\154\2\uffff\1\156\1\153\1\163\1\162\1\151\1\60\1\uffff\1\60\1"+
        "\162\1\156\1\145\1\154\1\141\1\uffff\1\60\1\uffff\1\162\1\uffff"+
        "\1\60\2\157\1\142\3\uffff\1\162\1\60\1\uffff\1\145\1\162\1\146\1"+
        "\uffff\1\151\1\146\1\162\1\145\3\60\1\uffff\2\145\4\60\1\156\1\146"+
        "\2\uffff\1\60\1\144\1\60\1\154\1\143\1\uffff\1\164\1\uffff\1\146"+
        "\1\144\1\154\1\151\1\uffff\1\162\1\156\1\60\1\143\2\60\1\157\3\uffff"+
        "\2\60\4\uffff\1\165\1\60\1\uffff\1\163\1\uffff\1\171\1\150\3\60"+
        "\1\145\1\144\1\164\1\60\1\uffff\1\60\2\uffff\1\146\2\uffff\1\145"+
        "\1\uffff\3\60\3\uffff\1\60\1\145\1\171\2\uffff\2\60\4\uffff\2\60"+
        "\4\uffff";
    static final String DFA15_maxS =
        "\1\u00a0\1\55\1\76\1\uffff\1\57\1\56\7\uffff\1\uffff\3\uffff\1\75"+
        "\1\uffff\1\136\1\172\1\uffff\1\76\1\75\1\174\1\75\1\76\1\uffff\1"+
        "\156\1\171\2\157\1\170\1\162\1\145\1\163\1\141\1\151\1\165\1\157"+
        "\1\166\1\162\1\145\1\165\1\162\1\150\12\uffff\1\56\7\uffff\1\162"+
        "\1\uffff\1\172\1\75\2\uffff\1\75\1\76\7\uffff\1\144\1\147\1\145"+
        "\1\172\1\145\1\156\1\172\1\163\1\165\1\162\1\164\1\154\1\156\1\162"+
        "\1\157\1\164\1\172\1\160\2\172\1\166\1\163\2\164\1\147\1\154\1\164"+
        "\2\172\1\145\2\163\1\157\2\164\1\141\1\160\1\142\1\151\1\172\1\171"+
        "\1\151\2\uffff\1\172\7\uffff\1\172\1\151\1\141\1\uffff\1\163\1\141"+
        "\1\164\1\uffff\1\145\1\172\1\155\1\157\1\145\1\163\1\141\1\172\1"+
        "\155\1\172\1\uffff\1\157\1\172\2\uffff\1\141\1\164\1\150\1\141\3"+
        "\172\2\uffff\1\162\1\163\1\172\1\160\1\165\1\172\1\164\1\157\1\145"+
        "\1\154\1\156\1\163\1\uffff\1\145\1\172\1\162\1\154\2\uffff\1\156"+
        "\1\153\1\163\1\162\1\151\1\172\1\uffff\1\172\1\162\1\156\1\145\1"+
        "\154\1\141\1\uffff\1\172\1\uffff\1\162\1\uffff\1\172\2\157\1\142"+
        "\3\uffff\1\162\1\172\1\uffff\1\145\1\162\1\146\1\uffff\1\151\1\146"+
        "\1\162\1\145\3\172\1\uffff\2\145\4\172\1\156\1\146\2\uffff\1\172"+
        "\1\144\1\172\1\154\1\143\1\uffff\1\164\1\uffff\1\146\1\144\1\154"+
        "\1\151\1\uffff\1\162\1\156\1\172\1\143\2\172\1\157\3\uffff\2\172"+
        "\4\uffff\1\165\1\172\1\uffff\1\163\1\uffff\1\171\1\150\3\172\1\145"+
        "\1\144\1\164\1\172\1\uffff\1\172\2\uffff\1\146\2\uffff\1\145\1\uffff"+
        "\3\172\3\uffff\1\172\1\145\1\171\2\uffff\2\172\4\uffff\2\172\4\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff\1"+
        "\17\1\20\1\21\1\uffff\1\23\2\uffff\1\26\5\uffff\1\43\22\uffff\1"+
        "\137\1\142\1\145\1\3\1\1\1\41\1\2\1\146\1\147\1\5\1\uffff\1\6\1"+
        "\16\1\143\1\46\1\22\1\24\1\140\1\uffff\1\25\2\uffff\1\42\1\47\2"+
        "\uffff\1\35\1\36\1\31\1\34\1\32\1\37\1\144\52\uffff\1\51\1\50\1"+
        "\uffff\1\141\1\44\1\27\1\45\1\30\1\40\1\33\3\uffff\1\55\3\uffff"+
        "\1\61\12\uffff\1\76\2\uffff\1\100\1\102\7\uffff\1\112\1\113\14\uffff"+
        "\1\131\4\uffff\1\134\1\52\6\uffff\1\64\6\uffff\1\72\1\uffff\1\75"+
        "\1\uffff\1\101\4\uffff\1\107\1\110\1\111\2\uffff\1\116\3\uffff\1"+
        "\121\7\uffff\1\133\10\uffff\1\62\1\65\5\uffff\1\74\1\uffff\1\103"+
        "\4\uffff\1\115\7\uffff\1\127\1\130\1\132\2\uffff\1\53\1\54\1\56"+
        "\1\57\2\uffff\1\66\1\uffff\1\70\11\uffff\1\122\1\uffff\1\124\1\125"+
        "\1\uffff\1\135\1\136\1\uffff\1\63\3\uffff\1\77\1\104\1\105\3\uffff"+
        "\1\120\1\123\2\uffff\1\67\1\71\1\73\1\106\2\uffff\1\126\1\60\1\114"+
        "\1\117";
    static final String DFA15_specialS =
        "\15\uffff\1\0\u0125\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\60\2\uffff\1\60\22\uffff\1\60\1\27\1\15\2\uffff\1\6\1\25"+
            "\1\16\1\7\1\10\1\3\1\1\1\17\1\2\1\5\1\4\12\56\1\21\1\20\1\30"+
            "\1\26\1\31\1\22\1\uffff\32\57\1\11\1\33\1\12\1\23\1\57\1\uffff"+
            "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\57\1\43\1\44\1\57\1\45"+
            "\1\46\1\47\1\50\1\51\1\57\1\52\1\53\1\54\1\57\1\24\1\55\3\57"+
            "\1\13\1\32\1\14\42\uffff\1\60",
            "\1\61",
            "\1\63",
            "",
            "\1\66\4\uffff\1\65",
            "\1\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\73\1\uffff\2\73\1\uffff\ufff2\73",
            "",
            "",
            "",
            "\1\74",
            "",
            "\1\77",
            "\32\57\4\uffff\1\57\1\uffff\1\100\24\57\1\102\4\57",
            "",
            "\1\103\1\104",
            "\1\106",
            "\1\107\1\110\75\uffff\1\111",
            "\1\113",
            "\1\115",
            "",
            "\1\117",
            "\1\120\14\uffff\1\121\6\uffff\1\122",
            "\1\123\2\uffff\1\124",
            "\1\125",
            "\1\126\1\uffff\1\127\3\uffff\1\130\5\uffff\1\131",
            "\1\132\7\uffff\1\133\5\uffff\1\134\2\uffff\1\135",
            "\1\136",
            "\1\137\6\uffff\1\140\1\141\4\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145\17\uffff\1\146",
            "\1\147\3\uffff\1\150\5\uffff\1\151",
            "\1\152\1\uffff\1\153\3\uffff\1\154",
            "\1\155\15\uffff\1\156\2\uffff\1\157",
            "\1\160",
            "\1\161\16\uffff\1\162\1\163",
            "\1\164\6\uffff\1\165\6\uffff\1\166\2\uffff\1\167",
            "\1\170",
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
            "\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "",
            "\32\57\4\uffff\1\57\1\uffff\25\57\1\102\4\57",
            "\1\175",
            "",
            "",
            "\1\177",
            "\1\u0081",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0087\3\uffff\1\u0088",
            "\1\u0089",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u008b",
            "\1\u008c\20\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0096",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u0097\24\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\2\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\3\uffff\1\u00ae",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b0\3\uffff\1\u00b1",
            "\1\u00b2\3\uffff\1\u00b3",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c2\25\57",
            "\1\u00c4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00c6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d2",
            "\1\u00d3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00d4\13"+
            "\57",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00de",
            "\1\u00df",
            "",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00e5\21"+
            "\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ee",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "",
            "\1\u00f3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0105",
            "\1\u0106",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0108",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0114",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0117",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\u011a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\u0127",
            "",
            "",
            "\1\u0128",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u012d",
            "\1\u012e",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | PLUSMINUS | AST | FSLASH | DOT | PERCENT | LPAREN | RPAREN | LBRACKET | RBRACKET | LBRACE | RBRACE | DQUOTE | SQUOTE | COMMA | SEMI | COLON | QUESTION | CARET | VEE | AMPERSAND | EQUALS | NEQ | LT | GT | LEQ | GEQ | CONFUSED | LCONFUSED | GCONFUSED | COMPARE | RARROW | BIGRARROW | BACKSLASH | REFEQUALS | REFNEQ | ASSIGN | BAD_ASSIGN | DOTDOT | DOTDOTDOT | AND | BEGIN | BREAK | BY | CLASS | CLEAR | CONTINUE | DO | ELSE | ELSEIF | END | ENUM | ERROR | EXTENDS | FALSE | FINALLY | FOR | FOREACH | FROM | GET | IF | IMPORT | IN | INF | IS | JAVA | LISTOF | METHOD | MUTABLE | NEG | NIL | NOT | OP | OR | OVERRIDE | PASS | POS | PROPERTY | RETURN | SET | SETOF | STATIC | SUMOF | SUPER | TABLEOF | THEN | THIS | TO | TRUE | TRY | VAR | WHERE | WHILE | INTEGER | MULTI_CARET | MULTI_VEE | IDENTIFIER | STRING | SLASHES | WHITESPACE | SL_COMMENT | ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_13 = input.LA(1);

                        s = -1;
                        if ( ((LA15_13>='\u0000' && LA15_13<='\t')||(LA15_13>='\u000B' && LA15_13<='\f')||(LA15_13>='\u000E' && LA15_13<='\uFFFF')) ) {s = 59;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}