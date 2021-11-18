// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g 2015-08-16 14:39:11

    package org.cgsuite.lang.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@SuppressWarnings({"unchecked","cast","all"}) public class CgsuiteParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "PLUSMINUS", "AST", "FSLASH", "DOT", "PERCENT", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "DQUOTE", "SQUOTE", "COMMA", "SEMI", "COLON", "QUESTION", "CARET", "VEE", "AMPERSAND", "EQUALS", "NEQ", "LT", "GT", "LEQ", "GEQ", "CONFUSED", "LCONFUSED", "GCONFUSED", "COMPARE", "RARROW", "BIGRARROW", "BACKSLASH", "REFEQUALS", "REFNEQ", "ASSIGN", "BAD_ASSIGN", "DOTDOT", "DOTDOTDOT", "AND", "BEGIN", "BREAK", "BY", "CLASS", "CLEAR", "CONTINUE", "DO", "ELSE", "ELSEIF", "END", "ENUM", "ERROR", "EXTENDS", "FALSE", "FINALLY", "FOR", "FOREACH", "FROM", "GET", "IF", "IMPORT", "IN", "INF", "IS", "JAVA", "LISTOF", "METHOD", "MUTABLE", "NEG", "NIL", "NOT", "OP", "OR", "OVERRIDE", "PASS", "POS", "PROPERTY", "RETURN", "SET", "SETOF", "STATIC", "SUMOF", "SUPER", "TABLEOF", "THEN", "THIS", "TO", "TRUE", "TRY", "VAR", "WHERE", "WHILE", "ARRAY_REFERENCE", "ARRAY_INDEX_LIST", "ASN_ANTECEDENT", "ENUM_ELEMENT", "ENUM_ELEMENT_LIST", "EXP", "EXPLICIT_LIST", "EXPLICIT_MAP", "EXPLICIT_SET", "EXPRESSION_LIST", "FUNCTION_CALL", "FUNCTION_CALL_ARGUMENT_LIST", "METHOD_PARAMETER_LIST", "MODIFIERS", "NODE_LABEL", "PREAMBLE", "PROCEDURE_PARAMETER_LIST", "STATEMENT_SEQUENCE", "UNARY_AST", "UNARY_MINUS", "UNARY_PLUS", "IDENTIFIER", "STRING", "MULTI_CARET", "MULTI_VEE", "INTEGER", "SLASHES", "DIGIT", "NONV", "LETTER", "ESCAPE_SEQ", "SLASH", "NEWLINE", "WHITESPACE", "SL_COMMENT", "ML_COMMENT", "HEX_DIGIT"
    };
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

    // delegates
    // delegators


        public CgsuiteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CgsuiteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[97+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CgsuiteParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g"; }


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

        public String getErrorMessageString()
        {
            StringBuilder str = new StringBuilder();
            for (SyntaxError error : errors)
            {
                str.append(error.getMessage());
                str.append("\n");
            }
            return str.toString();
        }

        public static class SyntaxError
        {
            private RecognitionException re;
            private String message;

            public SyntaxError(RecognitionException re, String message)
            {
                this.re = re;
                this.message = message;
            }

            public RecognitionException getException()
            {
                return re;
            }

            public String getMessage()
            {
                return message;
            }

            @Override
            public String toString()
            {
                return "SyntaxError[" + message + "]";
            }
        }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:240:1: compilationUnit : ( cuDeclaration | script );
    public final CgsuiteParser.compilationUnit_return compilationUnit() throws RecognitionException {
        CgsuiteParser.compilationUnit_return retval = new CgsuiteParser.compilationUnit_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.cuDeclaration_return cuDeclaration1 = null;

        CgsuiteParser.script_return script2 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:241:2: ( cuDeclaration | script )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CLASS||LA1_0==ENUM||LA1_0==IMPORT||LA1_0==MUTABLE||LA1_0==OVERRIDE||LA1_0==STATIC) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||(LA1_0>=PLUS && LA1_0<=AST)||LA1_0==LPAREN||LA1_0==LBRACKET||LA1_0==LBRACE||LA1_0==SQUOTE||LA1_0==SEMI||(LA1_0>=CARET && LA1_0<=VEE)||(LA1_0>=BEGIN && LA1_0<=BY)||(LA1_0>=CLEAR && LA1_0<=DO)||LA1_0==ERROR||LA1_0==FALSE||LA1_0==FOR||LA1_0==FROM||LA1_0==IF||LA1_0==INF||LA1_0==LISTOF||(LA1_0>=NIL && LA1_0<=OP)||LA1_0==PASS||LA1_0==RETURN||LA1_0==SETOF||(LA1_0>=SUMOF && LA1_0<=TABLEOF)||(LA1_0>=THIS && LA1_0<=TRY)||(LA1_0>=WHERE && LA1_0<=WHILE)||(LA1_0>=IDENTIFIER && LA1_0<=INTEGER)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:241:4: cuDeclaration
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_cuDeclaration_in_compilationUnit1309);
                    cuDeclaration1=cuDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cuDeclaration1.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:242:7: script
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_script_in_compilationUnit1317);
                    script2=script();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, script2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class cuDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cuDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:245:1: cuDeclaration : preamble ( classDeclaration | enumDeclaration ) EOF ;
    public final CgsuiteParser.cuDeclaration_return cuDeclaration() throws RecognitionException {
        CgsuiteParser.cuDeclaration_return retval = new CgsuiteParser.cuDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token EOF6=null;
        CgsuiteParser.preamble_return preamble3 = null;

        CgsuiteParser.classDeclaration_return classDeclaration4 = null;

        CgsuiteParser.enumDeclaration_return enumDeclaration5 = null;


        CgsuiteTree EOF6_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:246:5: ( preamble ( classDeclaration | enumDeclaration ) EOF )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:246:7: preamble ( classDeclaration | enumDeclaration ) EOF
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_preamble_in_cuDeclaration1331);
            preamble3=preamble();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, preamble3.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:246:16: ( classDeclaration | enumDeclaration )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:246:17: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_cuDeclaration1334);
                    classDeclaration4=classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDeclaration4.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:246:36: enumDeclaration
                    {
                    pushFollow(FOLLOW_enumDeclaration_in_cuDeclaration1338);
                    enumDeclaration5=enumDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDeclaration5.getTree());

                    }
                    break;

            }

            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_cuDeclaration1341); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF6_tree = (CgsuiteTree)adaptor.create(EOF6);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(EOF6_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cuDeclaration"

    public static class preamble_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preamble"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:249:1: preamble : ( importStatement SEMI )* -> ^( PREAMBLE ( importStatement )* ) ;
    public final CgsuiteParser.preamble_return preamble() throws RecognitionException {
        CgsuiteParser.preamble_return retval = new CgsuiteParser.preamble_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token SEMI8=null;
        CgsuiteParser.importStatement_return importStatement7 = null;


        CgsuiteTree SEMI8_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_importStatement=new RewriteRuleSubtreeStream(adaptor,"rule importStatement");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:5: ( ( importStatement SEMI )* -> ^( PREAMBLE ( importStatement )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:7: ( importStatement SEMI )*
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:7: ( importStatement SEMI )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IMPORT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:8: importStatement SEMI
            	    {
            	    pushFollow(FOLLOW_importStatement_in_preamble1360);
            	    importStatement7=importStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importStatement.add(importStatement7.getTree());
            	    SEMI8=(Token)match(input,SEMI,FOLLOW_SEMI_in_preamble1362); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SEMI.add(SEMI8);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: importStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 250:31: -> ^( PREAMBLE ( importStatement )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:34: ^( PREAMBLE ( importStatement )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(PREAMBLE, "PREAMBLE"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:250:45: ( importStatement )*
                while ( stream_importStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_importStatement.nextTree());

                }
                stream_importStatement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "preamble"

    public static class importStatement_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importStatement"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:253:1: importStatement : IMPORT importClause ;
    public final CgsuiteParser.importStatement_return importStatement() throws RecognitionException {
        CgsuiteParser.importStatement_return retval = new CgsuiteParser.importStatement_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IMPORT9=null;
        CgsuiteParser.importClause_return importClause10 = null;


        CgsuiteTree IMPORT9_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:254:5: ( IMPORT importClause )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:254:7: IMPORT importClause
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            IMPORT9=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importStatement1390); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT9_tree = (CgsuiteTree)adaptor.create(IMPORT9);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(IMPORT9_tree, root_0);
            }
            pushFollow(FOLLOW_importClause_in_importStatement1393);
            importClause10=importClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, importClause10.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "importStatement"

    public static class importClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:257:1: importClause : qualifiedId ( DOT AST )? ;
    public final CgsuiteParser.importClause_return importClause() throws RecognitionException {
        CgsuiteParser.importClause_return retval = new CgsuiteParser.importClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token DOT12=null;
        Token AST13=null;
        CgsuiteParser.qualifiedId_return qualifiedId11 = null;


        CgsuiteTree DOT12_tree=null;
        CgsuiteTree AST13_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:258:5: ( qualifiedId ( DOT AST )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:258:7: qualifiedId ( DOT AST )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_qualifiedId_in_importClause1410);
            qualifiedId11=qualifiedId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedId11.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:258:19: ( DOT AST )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DOT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:258:20: DOT AST
                    {
                    DOT12=(Token)match(input,DOT,FOLLOW_DOT_in_importClause1413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT12_tree = (CgsuiteTree)adaptor.create(DOT12);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(DOT12_tree, root_0);
                    }
                    AST13=(Token)match(input,AST,FOLLOW_AST_in_importClause1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AST13_tree = (CgsuiteTree)adaptor.create(AST13);
                    adaptor.addChild(root_0, AST13_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "importClause"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:261:1: classDeclaration : classModifiers CLASS IDENTIFIER ( extendsClause )? ( javaClause )? ( declaration )* END ;
    public final CgsuiteParser.classDeclaration_return classDeclaration() throws RecognitionException {
        CgsuiteParser.classDeclaration_return retval = new CgsuiteParser.classDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token CLASS15=null;
        Token IDENTIFIER16=null;
        Token END20=null;
        CgsuiteParser.classModifiers_return classModifiers14 = null;

        CgsuiteParser.extendsClause_return extendsClause17 = null;

        CgsuiteParser.javaClause_return javaClause18 = null;

        CgsuiteParser.declaration_return declaration19 = null;


        CgsuiteTree CLASS15_tree=null;
        CgsuiteTree IDENTIFIER16_tree=null;
        CgsuiteTree END20_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:2: ( classModifiers CLASS IDENTIFIER ( extendsClause )? ( javaClause )? ( declaration )* END )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:4: classModifiers CLASS IDENTIFIER ( extendsClause )? ( javaClause )? ( declaration )* END
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_classModifiers_in_classDeclaration1432);
            classModifiers14=classModifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classModifiers14.getTree());
            CLASS15=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDeclaration1434); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS15_tree = (CgsuiteTree)adaptor.create(CLASS15);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(CLASS15_tree, root_0);
            }
            IDENTIFIER16=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDeclaration1437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER16_tree = (CgsuiteTree)adaptor.create(IDENTIFIER16);
            adaptor.addChild(root_0, IDENTIFIER16_tree);
            }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:37: ( extendsClause )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EXTENDS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:37: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration1439);
                    extendsClause17=extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extendsClause17.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:52: ( javaClause )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:52: javaClause
                    {
                    pushFollow(FOLLOW_javaClause_in_classDeclaration1442);
                    javaClause18=javaClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaClause18.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:64: ( declaration )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ENUM||(LA7_0>=METHOD && LA7_0<=MUTABLE)||LA7_0==OVERRIDE||LA7_0==PROPERTY||LA7_0==STATIC||LA7_0==VAR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:262:64: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_classDeclaration1445);
            	    declaration19=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            END20=(Token)match(input,END,FOLLOW_END_in_classDeclaration1448); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classModifiers_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classModifiers"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:265:1: classModifiers : ( MUTABLE )* -> ^( MODIFIERS ( MUTABLE )* ) ;
    public final CgsuiteParser.classModifiers_return classModifiers() throws RecognitionException {
        CgsuiteParser.classModifiers_return retval = new CgsuiteParser.classModifiers_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token MUTABLE21=null;

        CgsuiteTree MUTABLE21_tree=null;
        RewriteRuleTokenStream stream_MUTABLE=new RewriteRuleTokenStream(adaptor,"token MUTABLE");

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:5: ( ( MUTABLE )* -> ^( MODIFIERS ( MUTABLE )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:7: ( MUTABLE )*
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:7: ( MUTABLE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==MUTABLE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:7: MUTABLE
            	    {
            	    MUTABLE21=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_classModifiers1463); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MUTABLE.add(MUTABLE21);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: MUTABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 266:16: -> ^( MODIFIERS ( MUTABLE )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:19: ^( MODIFIERS ( MUTABLE )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(MODIFIERS, "MODIFIERS"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:266:31: ( MUTABLE )*
                while ( stream_MUTABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_MUTABLE.nextNode());

                }
                stream_MUTABLE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classModifiers"

    public static class extendsClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extendsClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:269:1: extendsClause : EXTENDS qualifiedId ( COMMA qualifiedId )* ;
    public final CgsuiteParser.extendsClause_return extendsClause() throws RecognitionException {
        CgsuiteParser.extendsClause_return retval = new CgsuiteParser.extendsClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token EXTENDS22=null;
        Token COMMA24=null;
        CgsuiteParser.qualifiedId_return qualifiedId23 = null;

        CgsuiteParser.qualifiedId_return qualifiedId25 = null;


        CgsuiteTree EXTENDS22_tree=null;
        CgsuiteTree COMMA24_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:270:2: ( EXTENDS qualifiedId ( COMMA qualifiedId )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:270:4: EXTENDS qualifiedId ( COMMA qualifiedId )*
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            EXTENDS22=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extendsClause1488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS22_tree = (CgsuiteTree)adaptor.create(EXTENDS22);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(EXTENDS22_tree, root_0);
            }
            pushFollow(FOLLOW_qualifiedId_in_extendsClause1491);
            qualifiedId23=qualifiedId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedId23.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:270:25: ( COMMA qualifiedId )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:270:26: COMMA qualifiedId
            	    {
            	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_extendsClause1494); if (state.failed) return retval;
            	    pushFollow(FOLLOW_qualifiedId_in_extendsClause1497);
            	    qualifiedId25=qualifiedId();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualifiedId25.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extendsClause"

    public static class qualifiedId_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedId"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:273:1: qualifiedId : IDENTIFIER ( DOT IDENTIFIER )* ;
    public final CgsuiteParser.qualifiedId_return qualifiedId() throws RecognitionException {
        CgsuiteParser.qualifiedId_return retval = new CgsuiteParser.qualifiedId_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER26=null;
        Token DOT27=null;
        Token IDENTIFIER28=null;

        CgsuiteTree IDENTIFIER26_tree=null;
        CgsuiteTree DOT27_tree=null;
        CgsuiteTree IDENTIFIER28_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:274:5: ( IDENTIFIER ( DOT IDENTIFIER )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:274:7: IDENTIFIER ( DOT IDENTIFIER )*
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedId1513); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER26_tree = (CgsuiteTree)adaptor.create(IDENTIFIER26);
            adaptor.addChild(root_0, IDENTIFIER26_tree);
            }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:274:18: ( DOT IDENTIFIER )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==IDENTIFIER) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:274:19: DOT IDENTIFIER
            	    {
            	    DOT27=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedId1516); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT27_tree = (CgsuiteTree)adaptor.create(DOT27);
            	    root_0 = (CgsuiteTree)adaptor.becomeRoot(DOT27_tree, root_0);
            	    }
            	    IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedId1519); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENTIFIER28_tree = (CgsuiteTree)adaptor.create(IDENTIFIER28);
            	    adaptor.addChild(root_0, IDENTIFIER28_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qualifiedId"

    public static class javaClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "javaClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:277:1: javaClause : COLON JAVA STRING ;
    public final CgsuiteParser.javaClause_return javaClause() throws RecognitionException {
        CgsuiteParser.javaClause_return retval = new CgsuiteParser.javaClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token COLON29=null;
        Token JAVA30=null;
        Token STRING31=null;

        CgsuiteTree COLON29_tree=null;
        CgsuiteTree JAVA30_tree=null;
        CgsuiteTree STRING31_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:278:5: ( COLON JAVA STRING )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:278:7: COLON JAVA STRING
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            COLON29=(Token)match(input,COLON,FOLLOW_COLON_in_javaClause1538); if (state.failed) return retval;
            JAVA30=(Token)match(input,JAVA,FOLLOW_JAVA_in_javaClause1541); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            JAVA30_tree = (CgsuiteTree)adaptor.create(JAVA30);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(JAVA30_tree, root_0);
            }
            STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_javaClause1544); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING31_tree = (CgsuiteTree)adaptor.create(STRING31);
            adaptor.addChild(root_0, STRING31_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "javaClause"

    public static class declaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:281:1: declaration : ( staticDeclaration | varDeclaration | propertyDeclaration | methodDeclaration );
    public final CgsuiteParser.declaration_return declaration() throws RecognitionException {
        CgsuiteParser.declaration_return retval = new CgsuiteParser.declaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.staticDeclaration_return staticDeclaration32 = null;

        CgsuiteParser.varDeclaration_return varDeclaration33 = null;

        CgsuiteParser.propertyDeclaration_return propertyDeclaration34 = null;

        CgsuiteParser.methodDeclaration_return methodDeclaration35 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:282:2: ( staticDeclaration | varDeclaration | propertyDeclaration | methodDeclaration )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:282:4: staticDeclaration
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_staticDeclaration_in_declaration1559);
                    staticDeclaration32=staticDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, staticDeclaration32.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:283:7: varDeclaration
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_varDeclaration_in_declaration1567);
                    varDeclaration33=varDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration33.getTree());

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:284:4: propertyDeclaration
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_propertyDeclaration_in_declaration1572);
                    propertyDeclaration34=propertyDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyDeclaration34.getTree());

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:285:4: methodDeclaration
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_methodDeclaration_in_declaration1577);
                    methodDeclaration35=methodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration35.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class staticDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "staticDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:288:1: staticDeclaration : STATIC statementSequence END ;
    public final CgsuiteParser.staticDeclaration_return staticDeclaration() throws RecognitionException {
        CgsuiteParser.staticDeclaration_return retval = new CgsuiteParser.staticDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token STATIC36=null;
        Token END38=null;
        CgsuiteParser.statementSequence_return statementSequence37 = null;


        CgsuiteTree STATIC36_tree=null;
        CgsuiteTree END38_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:289:5: ( STATIC statementSequence END )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:289:7: STATIC statementSequence END
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            STATIC36=(Token)match(input,STATIC,FOLLOW_STATIC_in_staticDeclaration1591); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STATIC36_tree = (CgsuiteTree)adaptor.create(STATIC36);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(STATIC36_tree, root_0);
            }
            pushFollow(FOLLOW_statementSequence_in_staticDeclaration1594);
            statementSequence37=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence37.getTree());
            END38=(Token)match(input,END,FOLLOW_END_in_staticDeclaration1596); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "staticDeclaration"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:292:1: varDeclaration : modifiers VAR varInitializer ( COMMA varInitializer )* SEMI ;
    public final CgsuiteParser.varDeclaration_return varDeclaration() throws RecognitionException {
        CgsuiteParser.varDeclaration_return retval = new CgsuiteParser.varDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token VAR40=null;
        Token COMMA42=null;
        Token SEMI44=null;
        CgsuiteParser.modifiers_return modifiers39 = null;

        CgsuiteParser.varInitializer_return varInitializer41 = null;

        CgsuiteParser.varInitializer_return varInitializer43 = null;


        CgsuiteTree VAR40_tree=null;
        CgsuiteTree COMMA42_tree=null;
        CgsuiteTree SEMI44_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:293:5: ( modifiers VAR varInitializer ( COMMA varInitializer )* SEMI )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:293:7: modifiers VAR varInitializer ( COMMA varInitializer )* SEMI
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_modifiers_in_varDeclaration1615);
            modifiers39=modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers39.getTree());
            VAR40=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclaration1617); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR40_tree = (CgsuiteTree)adaptor.create(VAR40);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(VAR40_tree, root_0);
            }
            pushFollow(FOLLOW_varInitializer_in_varDeclaration1620);
            varInitializer41=varInitializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInitializer41.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:293:37: ( COMMA varInitializer )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:293:38: COMMA varInitializer
            	    {
            	    COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclaration1623); if (state.failed) return retval;
            	    pushFollow(FOLLOW_varInitializer_in_varDeclaration1626);
            	    varInitializer43=varInitializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInitializer43.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            SEMI44=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclaration1630); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclaration"

    public static class varInitializer_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInitializer"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:296:1: varInitializer : IDENTIFIER ( ASSIGN functionExpression )? ;
    public final CgsuiteParser.varInitializer_return varInitializer() throws RecognitionException {
        CgsuiteParser.varInitializer_return retval = new CgsuiteParser.varInitializer_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER45=null;
        Token ASSIGN46=null;
        CgsuiteParser.functionExpression_return functionExpression47 = null;


        CgsuiteTree IDENTIFIER45_tree=null;
        CgsuiteTree ASSIGN46_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:297:5: ( IDENTIFIER ( ASSIGN functionExpression )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:297:7: IDENTIFIER ( ASSIGN functionExpression )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varInitializer1648); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER45_tree = (CgsuiteTree)adaptor.create(IDENTIFIER45);
            adaptor.addChild(root_0, IDENTIFIER45_tree);
            }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:297:18: ( ASSIGN functionExpression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ASSIGN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:297:19: ASSIGN functionExpression
                    {
                    ASSIGN46=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_varInitializer1651); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN46_tree = (CgsuiteTree)adaptor.create(ASSIGN46);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(ASSIGN46_tree, root_0);
                    }
                    pushFollow(FOLLOW_functionExpression_in_varInitializer1654);
                    functionExpression47=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression47.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varInitializer"

    public static class propertyDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:300:1: propertyDeclaration : modifiers PROPERTY IDENTIFIER DOT ( GET | setterClause ) ( javaClause SEMI | statementSequence END ) ;
    public final CgsuiteParser.propertyDeclaration_return propertyDeclaration() throws RecognitionException {
        CgsuiteParser.propertyDeclaration_return retval = new CgsuiteParser.propertyDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token PROPERTY49=null;
        Token IDENTIFIER50=null;
        Token DOT51=null;
        Token GET52=null;
        Token SEMI55=null;
        Token END57=null;
        CgsuiteParser.modifiers_return modifiers48 = null;

        CgsuiteParser.setterClause_return setterClause53 = null;

        CgsuiteParser.javaClause_return javaClause54 = null;

        CgsuiteParser.statementSequence_return statementSequence56 = null;


        CgsuiteTree PROPERTY49_tree=null;
        CgsuiteTree IDENTIFIER50_tree=null;
        CgsuiteTree DOT51_tree=null;
        CgsuiteTree GET52_tree=null;
        CgsuiteTree SEMI55_tree=null;
        CgsuiteTree END57_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:301:2: ( modifiers PROPERTY IDENTIFIER DOT ( GET | setterClause ) ( javaClause SEMI | statementSequence END ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:301:4: modifiers PROPERTY IDENTIFIER DOT ( GET | setterClause ) ( javaClause SEMI | statementSequence END )
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_modifiers_in_propertyDeclaration1670);
            modifiers48=modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers48.getTree());
            PROPERTY49=(Token)match(input,PROPERTY,FOLLOW_PROPERTY_in_propertyDeclaration1672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PROPERTY49_tree = (CgsuiteTree)adaptor.create(PROPERTY49);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(PROPERTY49_tree, root_0);
            }
            IDENTIFIER50=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_propertyDeclaration1675); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER50_tree = (CgsuiteTree)adaptor.create(IDENTIFIER50);
            adaptor.addChild(root_0, IDENTIFIER50_tree);
            }
            DOT51=(Token)match(input,DOT,FOLLOW_DOT_in_propertyDeclaration1677); if (state.failed) return retval;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:301:40: ( GET | setterClause )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==GET) ) {
                alt14=1;
            }
            else if ( (LA14_0==SET) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:301:41: GET
                    {
                    GET52=(Token)match(input,GET,FOLLOW_GET_in_propertyDeclaration1681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GET52_tree = (CgsuiteTree)adaptor.create(GET52);
                    adaptor.addChild(root_0, GET52_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:301:47: setterClause
                    {
                    pushFollow(FOLLOW_setterClause_in_propertyDeclaration1685);
                    setterClause53=setterClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setterClause53.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:302:4: ( javaClause SEMI | statementSequence END )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLON) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=PLUS && LA15_0<=AST)||LA15_0==LPAREN||LA15_0==LBRACKET||LA15_0==LBRACE||LA15_0==SQUOTE||LA15_0==SEMI||(LA15_0>=CARET && LA15_0<=VEE)||(LA15_0>=BEGIN && LA15_0<=BY)||(LA15_0>=CLEAR && LA15_0<=DO)||LA15_0==END||LA15_0==ERROR||LA15_0==FALSE||LA15_0==FOR||LA15_0==FROM||LA15_0==IF||LA15_0==INF||LA15_0==LISTOF||(LA15_0>=NIL && LA15_0<=OP)||LA15_0==PASS||LA15_0==RETURN||LA15_0==SETOF||(LA15_0>=SUMOF && LA15_0<=TABLEOF)||(LA15_0>=THIS && LA15_0<=TRY)||(LA15_0>=WHERE && LA15_0<=WHILE)||(LA15_0>=IDENTIFIER && LA15_0<=INTEGER)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:302:5: javaClause SEMI
                    {
                    pushFollow(FOLLOW_javaClause_in_propertyDeclaration1692);
                    javaClause54=javaClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaClause54.getTree());
                    SEMI55=(Token)match(input,SEMI,FOLLOW_SEMI_in_propertyDeclaration1694); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:302:24: statementSequence END
                    {
                    pushFollow(FOLLOW_statementSequence_in_propertyDeclaration1699);
                    statementSequence56=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence56.getTree());
                    END57=(Token)match(input,END,FOLLOW_END_in_propertyDeclaration1701); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyDeclaration"

    public static class setterClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setterClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:305:1: setterClause : SET LPAREN requiredParameter RPAREN -> ^( SET ^( METHOD_PARAMETER_LIST requiredParameter ) ) ;
    public final CgsuiteParser.setterClause_return setterClause() throws RecognitionException {
        CgsuiteParser.setterClause_return retval = new CgsuiteParser.setterClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token SET58=null;
        Token LPAREN59=null;
        Token RPAREN61=null;
        CgsuiteParser.requiredParameter_return requiredParameter60 = null;


        CgsuiteTree SET58_tree=null;
        CgsuiteTree LPAREN59_tree=null;
        CgsuiteTree RPAREN61_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_requiredParameter=new RewriteRuleSubtreeStream(adaptor,"rule requiredParameter");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:306:5: ( SET LPAREN requiredParameter RPAREN -> ^( SET ^( METHOD_PARAMETER_LIST requiredParameter ) ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:306:7: SET LPAREN requiredParameter RPAREN
            {
            SET58=(Token)match(input,SET,FOLLOW_SET_in_setterClause1717); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET58);

            LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_setterClause1719); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN59);

            pushFollow(FOLLOW_requiredParameter_in_setterClause1721);
            requiredParameter60=requiredParameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_requiredParameter.add(requiredParameter60.getTree());
            RPAREN61=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_setterClause1723); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN61);



            // AST REWRITE
            // elements: SET, requiredParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 306:43: -> ^( SET ^( METHOD_PARAMETER_LIST requiredParameter ) )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:306:46: ^( SET ^( METHOD_PARAMETER_LIST requiredParameter ) )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_SET.nextNode(), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:306:52: ^( METHOD_PARAMETER_LIST requiredParameter )
                {
                CgsuiteTree root_2 = (CgsuiteTree)adaptor.nil();
                root_2 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(METHOD_PARAMETER_LIST, "METHOD_PARAMETER_LIST"), root_2);

                adaptor.addChild(root_2, stream_requiredParameter.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setterClause"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:309:1: methodDeclaration : modifiers METHOD generalizedId LPAREN methodParameterList RPAREN ( javaClause SEMI | statementSequence END ) ;
    public final CgsuiteParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
        CgsuiteParser.methodDeclaration_return retval = new CgsuiteParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token METHOD63=null;
        Token LPAREN65=null;
        Token RPAREN67=null;
        Token SEMI69=null;
        Token END71=null;
        CgsuiteParser.modifiers_return modifiers62 = null;

        CgsuiteParser.generalizedId_return generalizedId64 = null;

        CgsuiteParser.methodParameterList_return methodParameterList66 = null;

        CgsuiteParser.javaClause_return javaClause68 = null;

        CgsuiteParser.statementSequence_return statementSequence70 = null;


        CgsuiteTree METHOD63_tree=null;
        CgsuiteTree LPAREN65_tree=null;
        CgsuiteTree RPAREN67_tree=null;
        CgsuiteTree SEMI69_tree=null;
        CgsuiteTree END71_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:310:2: ( modifiers METHOD generalizedId LPAREN methodParameterList RPAREN ( javaClause SEMI | statementSequence END ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:310:4: modifiers METHOD generalizedId LPAREN methodParameterList RPAREN ( javaClause SEMI | statementSequence END )
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_modifiers_in_methodDeclaration1750);
            modifiers62=modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers62.getTree());
            METHOD63=(Token)match(input,METHOD,FOLLOW_METHOD_in_methodDeclaration1752); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            METHOD63_tree = (CgsuiteTree)adaptor.create(METHOD63);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(METHOD63_tree, root_0);
            }
            pushFollow(FOLLOW_generalizedId_in_methodDeclaration1755);
            generalizedId64=generalizedId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, generalizedId64.getTree());
            LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodDeclaration1757); if (state.failed) return retval;
            pushFollow(FOLLOW_methodParameterList_in_methodDeclaration1760);
            methodParameterList66=methodParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, methodParameterList66.getTree());
            RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodDeclaration1762); if (state.failed) return retval;
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:311:4: ( javaClause SEMI | statementSequence END )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COLON) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=PLUS && LA16_0<=AST)||LA16_0==LPAREN||LA16_0==LBRACKET||LA16_0==LBRACE||LA16_0==SQUOTE||LA16_0==SEMI||(LA16_0>=CARET && LA16_0<=VEE)||(LA16_0>=BEGIN && LA16_0<=BY)||(LA16_0>=CLEAR && LA16_0<=DO)||LA16_0==END||LA16_0==ERROR||LA16_0==FALSE||LA16_0==FOR||LA16_0==FROM||LA16_0==IF||LA16_0==INF||LA16_0==LISTOF||(LA16_0>=NIL && LA16_0<=OP)||LA16_0==PASS||LA16_0==RETURN||LA16_0==SETOF||(LA16_0>=SUMOF && LA16_0<=TABLEOF)||(LA16_0>=THIS && LA16_0<=TRY)||(LA16_0>=WHERE && LA16_0<=WHILE)||(LA16_0>=IDENTIFIER && LA16_0<=INTEGER)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:311:5: javaClause SEMI
                    {
                    pushFollow(FOLLOW_javaClause_in_methodDeclaration1769);
                    javaClause68=javaClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, javaClause68.getTree());
                    SEMI69=(Token)match(input,SEMI,FOLLOW_SEMI_in_methodDeclaration1771); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:311:24: statementSequence END
                    {
                    pushFollow(FOLLOW_statementSequence_in_methodDeclaration1776);
                    statementSequence70=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence70.getTree());
                    END71=(Token)match(input,END,FOLLOW_END_in_methodDeclaration1778); if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDeclaration"

    public static class modifiers_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifiers"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:314:1: modifiers : ( OVERRIDE | MUTABLE | STATIC )* -> ^( MODIFIERS ( OVERRIDE )* ( MUTABLE )* ( STATIC )* ) ;
    public final CgsuiteParser.modifiers_return modifiers() throws RecognitionException {
        CgsuiteParser.modifiers_return retval = new CgsuiteParser.modifiers_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token OVERRIDE72=null;
        Token MUTABLE73=null;
        Token STATIC74=null;

        CgsuiteTree OVERRIDE72_tree=null;
        CgsuiteTree MUTABLE73_tree=null;
        CgsuiteTree STATIC74_tree=null;
        RewriteRuleTokenStream stream_OVERRIDE=new RewriteRuleTokenStream(adaptor,"token OVERRIDE");
        RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
        RewriteRuleTokenStream stream_MUTABLE=new RewriteRuleTokenStream(adaptor,"token MUTABLE");

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:2: ( ( OVERRIDE | MUTABLE | STATIC )* -> ^( MODIFIERS ( OVERRIDE )* ( MUTABLE )* ( STATIC )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:4: ( OVERRIDE | MUTABLE | STATIC )*
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:4: ( OVERRIDE | MUTABLE | STATIC )*
            loop17:
            do {
                int alt17=4;
                switch ( input.LA(1) ) {
                case OVERRIDE:
                    {
                    alt17=1;
                    }
                    break;
                case MUTABLE:
                    {
                    alt17=2;
                    }
                    break;
                case STATIC:
                    {
                    alt17=3;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:5: OVERRIDE
            	    {
            	    OVERRIDE72=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_modifiers1793); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_OVERRIDE.add(OVERRIDE72);


            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:16: MUTABLE
            	    {
            	    MUTABLE73=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_modifiers1797); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_MUTABLE.add(MUTABLE73);


            	    }
            	    break;
            	case 3 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:26: STATIC
            	    {
            	    STATIC74=(Token)match(input,STATIC,FOLLOW_STATIC_in_modifiers1801); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_STATIC.add(STATIC74);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: MUTABLE, OVERRIDE, STATIC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 315:35: -> ^( MODIFIERS ( OVERRIDE )* ( MUTABLE )* ( STATIC )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:38: ^( MODIFIERS ( OVERRIDE )* ( MUTABLE )* ( STATIC )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(MODIFIERS, "MODIFIERS"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:50: ( OVERRIDE )*
                while ( stream_OVERRIDE.hasNext() ) {
                    adaptor.addChild(root_1, stream_OVERRIDE.nextNode());

                }
                stream_OVERRIDE.reset();
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:60: ( MUTABLE )*
                while ( stream_MUTABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_MUTABLE.nextNode());

                }
                stream_MUTABLE.reset();
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:315:69: ( STATIC )*
                while ( stream_STATIC.hasNext() ) {
                    adaptor.addChild(root_1, stream_STATIC.nextNode());

                }
                stream_STATIC.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modifiers"

    public static class opCode_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "opCode"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:318:1: opCode options {greedy=true; } : ( PLUS | MINUS | AST | FSLASH | PERCENT | CARET | COLON | AMPERSAND | NEG | POS | standardRelationalToken | LBRACKET RBRACKET ASSIGN -> OP[$LBRACKET, \"[]:=\"] | LBRACKET RBRACKET -> OP[$LBRACKET, \"[]\"] );
    public final CgsuiteParser.opCode_return opCode() throws RecognitionException {
        CgsuiteParser.opCode_return retval = new CgsuiteParser.opCode_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token PLUS75=null;
        Token MINUS76=null;
        Token AST77=null;
        Token FSLASH78=null;
        Token PERCENT79=null;
        Token CARET80=null;
        Token COLON81=null;
        Token AMPERSAND82=null;
        Token NEG83=null;
        Token POS84=null;
        Token LBRACKET86=null;
        Token RBRACKET87=null;
        Token ASSIGN88=null;
        Token LBRACKET89=null;
        Token RBRACKET90=null;
        CgsuiteParser.standardRelationalToken_return standardRelationalToken85 = null;


        CgsuiteTree PLUS75_tree=null;
        CgsuiteTree MINUS76_tree=null;
        CgsuiteTree AST77_tree=null;
        CgsuiteTree FSLASH78_tree=null;
        CgsuiteTree PERCENT79_tree=null;
        CgsuiteTree CARET80_tree=null;
        CgsuiteTree COLON81_tree=null;
        CgsuiteTree AMPERSAND82_tree=null;
        CgsuiteTree NEG83_tree=null;
        CgsuiteTree POS84_tree=null;
        CgsuiteTree LBRACKET86_tree=null;
        CgsuiteTree RBRACKET87_tree=null;
        CgsuiteTree ASSIGN88_tree=null;
        CgsuiteTree LBRACKET89_tree=null;
        CgsuiteTree RBRACKET90_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:5: ( PLUS | MINUS | AST | FSLASH | PERCENT | CARET | COLON | AMPERSAND | NEG | POS | standardRelationalToken | LBRACKET RBRACKET ASSIGN -> OP[$LBRACKET, \"[]:=\"] | LBRACKET RBRACKET -> OP[$LBRACKET, \"[]\"] )
            int alt18=13;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:7: PLUS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    PLUS75=(Token)match(input,PLUS,FOLLOW_PLUS_in_opCode1843); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS75_tree = (CgsuiteTree)adaptor.create(PLUS75);
                    adaptor.addChild(root_0, PLUS75_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:14: MINUS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    MINUS76=(Token)match(input,MINUS,FOLLOW_MINUS_in_opCode1847); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS76_tree = (CgsuiteTree)adaptor.create(MINUS76);
                    adaptor.addChild(root_0, MINUS76_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:22: AST
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    AST77=(Token)match(input,AST,FOLLOW_AST_in_opCode1851); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AST77_tree = (CgsuiteTree)adaptor.create(AST77);
                    adaptor.addChild(root_0, AST77_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:28: FSLASH
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    FSLASH78=(Token)match(input,FSLASH,FOLLOW_FSLASH_in_opCode1855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FSLASH78_tree = (CgsuiteTree)adaptor.create(FSLASH78);
                    adaptor.addChild(root_0, FSLASH78_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:37: PERCENT
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    PERCENT79=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_opCode1859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERCENT79_tree = (CgsuiteTree)adaptor.create(PERCENT79);
                    adaptor.addChild(root_0, PERCENT79_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:47: CARET
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    CARET80=(Token)match(input,CARET,FOLLOW_CARET_in_opCode1863); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CARET80_tree = (CgsuiteTree)adaptor.create(CARET80);
                    adaptor.addChild(root_0, CARET80_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:55: COLON
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    COLON81=(Token)match(input,COLON,FOLLOW_COLON_in_opCode1867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON81_tree = (CgsuiteTree)adaptor.create(COLON81);
                    adaptor.addChild(root_0, COLON81_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:63: AMPERSAND
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    AMPERSAND82=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_opCode1871); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMPERSAND82_tree = (CgsuiteTree)adaptor.create(AMPERSAND82);
                    adaptor.addChild(root_0, AMPERSAND82_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:75: NEG
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    NEG83=(Token)match(input,NEG,FOLLOW_NEG_in_opCode1875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEG83_tree = (CgsuiteTree)adaptor.create(NEG83);
                    adaptor.addChild(root_0, NEG83_tree);
                    }

                    }
                    break;
                case 10 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:320:81: POS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    POS84=(Token)match(input,POS,FOLLOW_POS_in_opCode1879); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    POS84_tree = (CgsuiteTree)adaptor.create(POS84);
                    adaptor.addChild(root_0, POS84_tree);
                    }

                    }
                    break;
                case 11 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:321:7: standardRelationalToken
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_standardRelationalToken_in_opCode1887);
                    standardRelationalToken85=standardRelationalToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, standardRelationalToken85.getTree());

                    }
                    break;
                case 12 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:322:7: LBRACKET RBRACKET ASSIGN
                    {
                    LBRACKET86=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_opCode1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET86);

                    RBRACKET87=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_opCode1897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET87);

                    ASSIGN88=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_opCode1899); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN88);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 322:32: -> OP[$LBRACKET, \"[]:=\"]
                    {
                        adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(OP, LBRACKET86, "[]:="));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:323:7: LBRACKET RBRACKET
                    {
                    LBRACKET89=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_opCode1912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET89);

                    RBRACKET90=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_opCode1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET90);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 323:25: -> OP[$LBRACKET, \"[]\"]
                    {
                        adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(OP, LBRACKET89, "[]"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "opCode"

    public static class methodParameterList_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodParameterList"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:326:1: methodParameterList : ( methodParameter ( COMMA methodParameter )* )? -> ^( METHOD_PARAMETER_LIST ( methodParameter )* ) ;
    public final CgsuiteParser.methodParameterList_return methodParameterList() throws RecognitionException {
        CgsuiteParser.methodParameterList_return retval = new CgsuiteParser.methodParameterList_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token COMMA92=null;
        CgsuiteParser.methodParameter_return methodParameter91 = null;

        CgsuiteParser.methodParameter_return methodParameter93 = null;


        CgsuiteTree COMMA92_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_methodParameter=new RewriteRuleSubtreeStream(adaptor,"rule methodParameter");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:2: ( ( methodParameter ( COMMA methodParameter )* )? -> ^( METHOD_PARAMETER_LIST ( methodParameter )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:4: ( methodParameter ( COMMA methodParameter )* )?
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:4: ( methodParameter ( COMMA methodParameter )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:5: methodParameter ( COMMA methodParameter )*
                    {
                    pushFollow(FOLLOW_methodParameter_in_methodParameterList1935);
                    methodParameter91=methodParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_methodParameter.add(methodParameter91.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:21: ( COMMA methodParameter )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:22: COMMA methodParameter
                    	    {
                    	    COMMA92=(Token)match(input,COMMA,FOLLOW_COMMA_in_methodParameterList1938); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA92);

                    	    pushFollow(FOLLOW_methodParameter_in_methodParameterList1940);
                    	    methodParameter93=methodParameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_methodParameter.add(methodParameter93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: methodParameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 327:48: -> ^( METHOD_PARAMETER_LIST ( methodParameter )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:51: ^( METHOD_PARAMETER_LIST ( methodParameter )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(METHOD_PARAMETER_LIST, "METHOD_PARAMETER_LIST"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:327:75: ( methodParameter )*
                while ( stream_methodParameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_methodParameter.nextTree());

                }
                stream_methodParameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodParameterList"

    public static class methodParameter_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodParameter"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:330:1: methodParameter : ( optionalParameter | requiredParameter );
    public final CgsuiteParser.methodParameter_return methodParameter() throws RecognitionException {
        CgsuiteParser.methodParameter_return retval = new CgsuiteParser.methodParameter_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.optionalParameter_return optionalParameter94 = null;

        CgsuiteParser.requiredParameter_return requiredParameter95 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:331:5: ( optionalParameter | requiredParameter )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==QUESTION) ) {
                        alt21=1;
                    }
                    else if ( (LA21_2==RPAREN||LA21_2==COMMA||LA21_2==DOTDOTDOT) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case QUESTION:
                    {
                    alt21=1;
                    }
                    break;
                case RPAREN:
                case COMMA:
                case DOTDOTDOT:
                    {
                    alt21=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:331:7: optionalParameter
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_optionalParameter_in_methodParameter1968);
                    optionalParameter94=optionalParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, optionalParameter94.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:332:7: requiredParameter
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_requiredParameter_in_methodParameter1976);
                    requiredParameter95=requiredParameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, requiredParameter95.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodParameter"

    public static class optionalParameter_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "optionalParameter"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:335:1: optionalParameter : (a= IDENTIFIER b= IDENTIFIER QUESTION ( expression )? -> ^( QUESTION ^( $b ( $a)? ) ( expression )? ) | a= IDENTIFIER QUESTION ( expression )? -> ^( QUESTION $a ( expression )? ) );
    public final CgsuiteParser.optionalParameter_return optionalParameter() throws RecognitionException {
        CgsuiteParser.optionalParameter_return retval = new CgsuiteParser.optionalParameter_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token a=null;
        Token b=null;
        Token QUESTION96=null;
        Token QUESTION98=null;
        CgsuiteParser.expression_return expression97 = null;

        CgsuiteParser.expression_return expression99 = null;


        CgsuiteTree a_tree=null;
        CgsuiteTree b_tree=null;
        CgsuiteTree QUESTION96_tree=null;
        CgsuiteTree QUESTION98_tree=null;
        RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:2: (a= IDENTIFIER b= IDENTIFIER QUESTION ( expression )? -> ^( QUESTION ^( $b ( $a)? ) ( expression )? ) | a= IDENTIFIER QUESTION ( expression )? -> ^( QUESTION $a ( expression )? ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENTIFIER) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==IDENTIFIER) ) {
                    alt24=1;
                }
                else if ( (LA24_1==QUESTION) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:4: a= IDENTIFIER b= IDENTIFIER QUESTION ( expression )?
                    {
                    a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_optionalParameter1992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);

                    b=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_optionalParameter1996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(b);

                    QUESTION96=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_optionalParameter1998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION96);

                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:39: ( expression )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=PLUS && LA22_0<=AST)||LA22_0==LPAREN||LA22_0==LBRACKET||LA22_0==LBRACE||LA22_0==SQUOTE||(LA22_0>=CARET && LA22_0<=VEE)||LA22_0==BEGIN||LA22_0==BY||LA22_0==DO||LA22_0==ERROR||LA22_0==FALSE||LA22_0==FOR||LA22_0==FROM||LA22_0==IF||LA22_0==INF||LA22_0==LISTOF||(LA22_0>=NIL && LA22_0<=OP)||LA22_0==PASS||LA22_0==SETOF||(LA22_0>=SUMOF && LA22_0<=TABLEOF)||(LA22_0>=THIS && LA22_0<=TRUE)||(LA22_0>=WHERE && LA22_0<=WHILE)||(LA22_0>=IDENTIFIER && LA22_0<=INTEGER)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:39: expression
                            {
                            pushFollow(FOLLOW_expression_in_optionalParameter2000);
                            expression97=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression97.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: QUESTION, expression, b, a
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 336:51: -> ^( QUESTION ^( $b ( $a)? ) ( expression )? )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:54: ^( QUESTION ^( $b ( $a)? ) ( expression )? )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_QUESTION.nextNode(), root_1);

                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:65: ^( $b ( $a)? )
                        {
                        CgsuiteTree root_2 = (CgsuiteTree)adaptor.nil();
                        root_2 = (CgsuiteTree)adaptor.becomeRoot(stream_b.nextNode(), root_2);

                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:70: ( $a)?
                        if ( stream_a.hasNext() ) {
                            adaptor.addChild(root_2, stream_a.nextNode());

                        }
                        stream_a.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:336:75: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:337:7: a= IDENTIFIER QUESTION ( expression )?
                    {
                    a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_optionalParameter2029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);

                    QUESTION98=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_optionalParameter2031); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION98);

                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:337:29: ( expression )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=PLUS && LA23_0<=AST)||LA23_0==LPAREN||LA23_0==LBRACKET||LA23_0==LBRACE||LA23_0==SQUOTE||(LA23_0>=CARET && LA23_0<=VEE)||LA23_0==BEGIN||LA23_0==BY||LA23_0==DO||LA23_0==ERROR||LA23_0==FALSE||LA23_0==FOR||LA23_0==FROM||LA23_0==IF||LA23_0==INF||LA23_0==LISTOF||(LA23_0>=NIL && LA23_0<=OP)||LA23_0==PASS||LA23_0==SETOF||(LA23_0>=SUMOF && LA23_0<=TABLEOF)||(LA23_0>=THIS && LA23_0<=TRUE)||(LA23_0>=WHERE && LA23_0<=WHILE)||(LA23_0>=IDENTIFIER && LA23_0<=INTEGER)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:337:29: expression
                            {
                            pushFollow(FOLLOW_expression_in_optionalParameter2033);
                            expression99=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: a, expression, QUESTION
                    // token labels: a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 337:41: -> ^( QUESTION $a ( expression )? )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:337:44: ^( QUESTION $a ( expression )? )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_QUESTION.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:337:58: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionalParameter"

    public static class requiredParameter_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requiredParameter"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:340:1: requiredParameter : (a= IDENTIFIER b= IDENTIFIER ( DOTDOTDOT )? -> ^( $b $a ( DOTDOTDOT )? ) | IDENTIFIER ( DOTDOTDOT )? );
    public final CgsuiteParser.requiredParameter_return requiredParameter() throws RecognitionException {
        CgsuiteParser.requiredParameter_return retval = new CgsuiteParser.requiredParameter_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token a=null;
        Token b=null;
        Token DOTDOTDOT100=null;
        Token IDENTIFIER101=null;
        Token DOTDOTDOT102=null;

        CgsuiteTree a_tree=null;
        CgsuiteTree b_tree=null;
        CgsuiteTree DOTDOTDOT100_tree=null;
        CgsuiteTree IDENTIFIER101_tree=null;
        CgsuiteTree DOTDOTDOT102_tree=null;
        RewriteRuleTokenStream stream_DOTDOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOTDOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:2: (a= IDENTIFIER b= IDENTIFIER ( DOTDOTDOT )? -> ^( $b $a ( DOTDOTDOT )? ) | IDENTIFIER ( DOTDOTDOT )? )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENTIFIER) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==IDENTIFIER) ) {
                    alt27=1;
                }
                else if ( (LA27_1==RPAREN||LA27_1==COMMA||LA27_1==DOTDOTDOT) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:4: a= IDENTIFIER b= IDENTIFIER ( DOTDOTDOT )?
                    {
                    a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requiredParameter2062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);

                    b=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requiredParameter2066); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(b);

                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:30: ( DOTDOTDOT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DOTDOTDOT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:30: DOTDOTDOT
                            {
                            DOTDOTDOT100=(Token)match(input,DOTDOTDOT,FOLLOW_DOTDOTDOT_in_requiredParameter2068); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOTDOTDOT.add(DOTDOTDOT100);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: DOTDOTDOT, b, a
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 341:41: -> ^( $b $a ( DOTDOTDOT )? )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:44: ^( $b $a ( DOTDOTDOT )? )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_b.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:341:52: ( DOTDOTDOT )?
                        if ( stream_DOTDOTDOT.hasNext() ) {
                            adaptor.addChild(root_1, stream_DOTDOTDOT.nextNode());

                        }
                        stream_DOTDOTDOT.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:342:4: IDENTIFIER ( DOTDOTDOT )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_requiredParameter2087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER101_tree = (CgsuiteTree)adaptor.create(IDENTIFIER101);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(IDENTIFIER101_tree, root_0);
                    }
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:342:16: ( DOTDOTDOT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DOTDOTDOT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:342:16: DOTDOTDOT
                            {
                            DOTDOTDOT102=(Token)match(input,DOTDOTDOT,FOLLOW_DOTDOTDOT_in_requiredParameter2090); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOTDOTDOT102_tree = (CgsuiteTree)adaptor.create(DOTDOTDOT102);
                            adaptor.addChild(root_0, DOTDOTDOT102_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requiredParameter"

    protected static class enumDeclaration_scope {
        String name;
    }
    protected Stack enumDeclaration_stack = new Stack();

    public static class enumDeclaration_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDeclaration"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:345:1: enumDeclaration : modifiers ENUM IDENTIFIER enumElementList ( declaration )* END ;
    public final CgsuiteParser.enumDeclaration_return enumDeclaration() throws RecognitionException {
        enumDeclaration_stack.push(new enumDeclaration_scope());
        CgsuiteParser.enumDeclaration_return retval = new CgsuiteParser.enumDeclaration_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token ENUM104=null;
        Token IDENTIFIER105=null;
        Token END108=null;
        CgsuiteParser.modifiers_return modifiers103 = null;

        CgsuiteParser.enumElementList_return enumElementList106 = null;

        CgsuiteParser.declaration_return declaration107 = null;


        CgsuiteTree ENUM104_tree=null;
        CgsuiteTree IDENTIFIER105_tree=null;
        CgsuiteTree END108_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:350:5: ( modifiers ENUM IDENTIFIER enumElementList ( declaration )* END )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:350:7: modifiers ENUM IDENTIFIER enumElementList ( declaration )* END
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_modifiers_in_enumDeclaration2109);
            modifiers103=modifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, modifiers103.getTree());
            ENUM104=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration2111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ENUM104_tree = (CgsuiteTree)adaptor.create(ENUM104);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(ENUM104_tree, root_0);
            }
            IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDeclaration2114); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER105_tree = (CgsuiteTree)adaptor.create(IDENTIFIER105);
            adaptor.addChild(root_0, IDENTIFIER105_tree);
            }
            if ( state.backtracking==0 ) {
              ((enumDeclaration_scope)enumDeclaration_stack.peek()).name = (IDENTIFIER105!=null?IDENTIFIER105.getText():null);
            }
            pushFollow(FOLLOW_enumElementList_in_enumDeclaration2118);
            enumElementList106=enumElementList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, enumElementList106.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:350:95: ( declaration )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ENUM||(LA28_0>=METHOD && LA28_0<=MUTABLE)||LA28_0==OVERRIDE||LA28_0==PROPERTY||LA28_0==STATIC||LA28_0==VAR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:350:95: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_enumDeclaration2120);
            	    declaration107=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration107.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            END108=(Token)match(input,END,FOLLOW_END_in_enumDeclaration2123); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            enumDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "enumDeclaration"

    public static class enumElementList_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumElementList"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:353:1: enumElementList : ( enumElement ( COMMA enumElement )* ) SEMI -> ^( ENUM_ELEMENT_LIST ( enumElement )* ) ;
    public final CgsuiteParser.enumElementList_return enumElementList() throws RecognitionException {
        CgsuiteParser.enumElementList_return retval = new CgsuiteParser.enumElementList_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token COMMA110=null;
        Token SEMI112=null;
        CgsuiteParser.enumElement_return enumElement109 = null;

        CgsuiteParser.enumElement_return enumElement111 = null;


        CgsuiteTree COMMA110_tree=null;
        CgsuiteTree SEMI112_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_enumElement=new RewriteRuleSubtreeStream(adaptor,"rule enumElement");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:5: ( ( enumElement ( COMMA enumElement )* ) SEMI -> ^( ENUM_ELEMENT_LIST ( enumElement )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:7: ( enumElement ( COMMA enumElement )* ) SEMI
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:7: ( enumElement ( COMMA enumElement )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:8: enumElement ( COMMA enumElement )*
            {
            pushFollow(FOLLOW_enumElement_in_enumElementList2142);
            enumElement109=enumElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumElement.add(enumElement109.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:20: ( COMMA enumElement )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:21: COMMA enumElement
            	    {
            	    COMMA110=(Token)match(input,COMMA,FOLLOW_COMMA_in_enumElementList2145); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA110);

            	    pushFollow(FOLLOW_enumElement_in_enumElementList2147);
            	    enumElement111=enumElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumElement.add(enumElement111.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            SEMI112=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumElementList2152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI112);



            // AST REWRITE
            // elements: enumElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 354:47: -> ^( ENUM_ELEMENT_LIST ( enumElement )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:50: ^( ENUM_ELEMENT_LIST ( enumElement )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(ENUM_ELEMENT_LIST, "ENUM_ELEMENT_LIST"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:354:70: ( enumElement )*
                while ( stream_enumElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumElement.nextTree());

                }
                stream_enumElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumElementList"

    public static class enumElement_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumElement"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:357:1: enumElement : IDENTIFIER ( functionCall )? -> ^( ENUM_ELEMENT[$IDENTIFIER] ^( ASSIGN IDENTIFIER ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? ) ) ) ;
    public final CgsuiteParser.enumElement_return enumElement() throws RecognitionException {
        CgsuiteParser.enumElement_return retval = new CgsuiteParser.enumElement_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER113=null;
        CgsuiteParser.functionCall_return functionCall114 = null;


        CgsuiteTree IDENTIFIER113_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:358:5: ( IDENTIFIER ( functionCall )? -> ^( ENUM_ELEMENT[$IDENTIFIER] ^( ASSIGN IDENTIFIER ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? ) ) ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:358:7: IDENTIFIER ( functionCall )?
            {
            IDENTIFIER113=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumElement2178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER113);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:358:18: ( functionCall )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LPAREN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:358:19: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_enumElement2181);
                    functionCall114=functionCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionCall.add(functionCall114.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: functionCall, IDENTIFIER, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 359:7: -> ^( ENUM_ELEMENT[$IDENTIFIER] ^( ASSIGN IDENTIFIER ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? ) ) )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:359:10: ^( ENUM_ELEMENT[$IDENTIFIER] ^( ASSIGN IDENTIFIER ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? ) ) )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(ENUM_ELEMENT, IDENTIFIER113), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:359:38: ^( ASSIGN IDENTIFIER ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? ) )
                {
                CgsuiteTree root_2 = (CgsuiteTree)adaptor.nil();
                root_2 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(ASSIGN, "ASSIGN"), root_2);

                adaptor.addChild(root_2, stream_IDENTIFIER.nextNode());
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:359:58: ^( FUNCTION_CALL[$IDENTIFIER] IDENTIFIER[$IDENTIFIER, $enumDeclaration::name] ( functionCall )? )
                {
                CgsuiteTree root_3 = (CgsuiteTree)adaptor.nil();
                root_3 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(FUNCTION_CALL, IDENTIFIER113), root_3);

                adaptor.addChild(root_3, (CgsuiteTree)adaptor.create(IDENTIFIER, IDENTIFIER113, ((enumDeclaration_scope)enumDeclaration_stack.peek()).name));
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:359:135: ( functionCall )?
                if ( stream_functionCall.hasNext() ) {
                    adaptor.addChild(root_3, stream_functionCall.nextTree());

                }
                stream_functionCall.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumElement"

    public static class script_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:362:1: script : block EOF ;
    public final CgsuiteParser.script_return script() throws RecognitionException {
        CgsuiteParser.script_return retval = new CgsuiteParser.script_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token EOF116=null;
        CgsuiteParser.block_return block115 = null;


        CgsuiteTree EOF116_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:363:5: ( block EOF )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:363:7: block EOF
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_block_in_script2230);
            block115=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block115.getTree());
            EOF116=(Token)match(input,EOF,FOLLOW_EOF_in_script2232); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF116_tree = (CgsuiteTree)adaptor.create(EOF116);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(EOF116_tree, root_0);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "script"

    public static class block_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:366:1: block : statementSequence ;
    public final CgsuiteParser.block_return block() throws RecognitionException {
        CgsuiteParser.block_return retval = new CgsuiteParser.block_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.statementSequence_return statementSequence117 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:367:5: ( statementSequence )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:367:7: statementSequence
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_statementSequence_in_block2250);
            statementSequence117=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence117.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statementSequence_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:370:1: statementSequence : ( statementChain )? -> ^( STATEMENT_SEQUENCE ( statementChain )? ) ;
    public final CgsuiteParser.statementSequence_return statementSequence() throws RecognitionException {
        CgsuiteParser.statementSequence_return retval = new CgsuiteParser.statementSequence_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.statementChain_return statementChain118 = null;


        RewriteRuleSubtreeStream stream_statementChain=new RewriteRuleSubtreeStream(adaptor,"rule statementChain");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:2: ( ( statementChain )? -> ^( STATEMENT_SEQUENCE ( statementChain )? ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:4: ( statementChain )?
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:4: ( statementChain )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=PLUS && LA31_0<=AST)||LA31_0==LPAREN||LA31_0==LBRACKET||LA31_0==LBRACE||LA31_0==SQUOTE||LA31_0==SEMI||(LA31_0>=CARET && LA31_0<=VEE)||(LA31_0>=BEGIN && LA31_0<=BY)||(LA31_0>=CLEAR && LA31_0<=DO)||LA31_0==ERROR||LA31_0==FALSE||LA31_0==FOR||LA31_0==FROM||LA31_0==IF||LA31_0==INF||LA31_0==LISTOF||(LA31_0>=NIL && LA31_0<=OP)||LA31_0==PASS||LA31_0==RETURN||LA31_0==SETOF||(LA31_0>=SUMOF && LA31_0<=TABLEOF)||(LA31_0>=THIS && LA31_0<=TRY)||(LA31_0>=WHERE && LA31_0<=WHILE)||(LA31_0>=IDENTIFIER && LA31_0<=INTEGER)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:4: statementChain
                    {
                    pushFollow(FOLLOW_statementChain_in_statementSequence2265);
                    statementChain118=statementChain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementChain.add(statementChain118.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: statementChain
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 371:20: -> ^( STATEMENT_SEQUENCE ( statementChain )? )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:23: ^( STATEMENT_SEQUENCE ( statementChain )? )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(STATEMENT_SEQUENCE, "STATEMENT_SEQUENCE"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:371:44: ( statementChain )?
                if ( stream_statementChain.hasNext() ) {
                    adaptor.addChild(root_1, stream_statementChain.nextTree());

                }
                stream_statementChain.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class statementChain_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementChain"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:374:1: statementChain : ( ( IF | inLoopAntecedent DO | doLoopAntecedent DO | BEGIN )=> controlExpression ( statementChain )? | ( TRY )=> tryStatement ( statementChain )? | statement ( SEMI ( statementChain )? )? | SEMI ( statementChain )? );
    public final CgsuiteParser.statementChain_return statementChain() throws RecognitionException {
        CgsuiteParser.statementChain_return retval = new CgsuiteParser.statementChain_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token SEMI124=null;
        Token SEMI126=null;
        CgsuiteParser.controlExpression_return controlExpression119 = null;

        CgsuiteParser.statementChain_return statementChain120 = null;

        CgsuiteParser.tryStatement_return tryStatement121 = null;

        CgsuiteParser.statementChain_return statementChain122 = null;

        CgsuiteParser.statement_return statement123 = null;

        CgsuiteParser.statementChain_return statementChain125 = null;

        CgsuiteParser.statementChain_return statementChain127 = null;


        CgsuiteTree SEMI124_tree=null;
        CgsuiteTree SEMI126_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:5: ( ( IF | inLoopAntecedent DO | doLoopAntecedent DO | BEGIN )=> controlExpression ( statementChain )? | ( TRY )=> tryStatement ( statementChain )? | statement ( SEMI ( statementChain )? )? | SEMI ( statementChain )? )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:7: ( IF | inLoopAntecedent DO | doLoopAntecedent DO | BEGIN )=> controlExpression ( statementChain )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_controlExpression_in_statementChain2311);
                    controlExpression119=controlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, controlExpression119.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:85: ( statementChain )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=PLUS && LA32_0<=AST)||LA32_0==LPAREN||LA32_0==LBRACKET||LA32_0==LBRACE||LA32_0==SQUOTE||LA32_0==SEMI||(LA32_0>=CARET && LA32_0<=VEE)||(LA32_0>=BEGIN && LA32_0<=BY)||(LA32_0>=CLEAR && LA32_0<=DO)||LA32_0==ERROR||LA32_0==FALSE||LA32_0==FOR||LA32_0==FROM||LA32_0==IF||LA32_0==INF||LA32_0==LISTOF||(LA32_0>=NIL && LA32_0<=OP)||LA32_0==PASS||LA32_0==RETURN||LA32_0==SETOF||(LA32_0>=SUMOF && LA32_0<=TABLEOF)||(LA32_0>=THIS && LA32_0<=TRY)||(LA32_0>=WHERE && LA32_0<=WHILE)||(LA32_0>=IDENTIFIER && LA32_0<=INTEGER)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:85: statementChain
                            {
                            pushFollow(FOLLOW_statementChain_in_statementChain2313);
                            statementChain120=statementChain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementChain120.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:376:7: ( TRY )=> tryStatement ( statementChain )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementChain2328);
                    tryStatement121=tryStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement121.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:376:29: ( statementChain )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=PLUS && LA33_0<=AST)||LA33_0==LPAREN||LA33_0==LBRACKET||LA33_0==LBRACE||LA33_0==SQUOTE||LA33_0==SEMI||(LA33_0>=CARET && LA33_0<=VEE)||(LA33_0>=BEGIN && LA33_0<=BY)||(LA33_0>=CLEAR && LA33_0<=DO)||LA33_0==ERROR||LA33_0==FALSE||LA33_0==FOR||LA33_0==FROM||LA33_0==IF||LA33_0==INF||LA33_0==LISTOF||(LA33_0>=NIL && LA33_0<=OP)||LA33_0==PASS||LA33_0==RETURN||LA33_0==SETOF||(LA33_0>=SUMOF && LA33_0<=TABLEOF)||(LA33_0>=THIS && LA33_0<=TRY)||(LA33_0>=WHERE && LA33_0<=WHILE)||(LA33_0>=IDENTIFIER && LA33_0<=INTEGER)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:376:29: statementChain
                            {
                            pushFollow(FOLLOW_statementChain_in_statementChain2330);
                            statementChain122=statementChain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementChain122.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:377:7: statement ( SEMI ( statementChain )? )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_statementChain2339);
                    statement123=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement123.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:377:17: ( SEMI ( statementChain )? )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==SEMI) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:377:18: SEMI ( statementChain )?
                            {
                            SEMI124=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementChain2342); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SEMI124_tree = (CgsuiteTree)adaptor.create(SEMI124);
                            adaptor.addChild(root_0, SEMI124_tree);
                            }
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:377:23: ( statementChain )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=PLUS && LA34_0<=AST)||LA34_0==LPAREN||LA34_0==LBRACKET||LA34_0==LBRACE||LA34_0==SQUOTE||LA34_0==SEMI||(LA34_0>=CARET && LA34_0<=VEE)||(LA34_0>=BEGIN && LA34_0<=BY)||(LA34_0>=CLEAR && LA34_0<=DO)||LA34_0==ERROR||LA34_0==FALSE||LA34_0==FOR||LA34_0==FROM||LA34_0==IF||LA34_0==INF||LA34_0==LISTOF||(LA34_0>=NIL && LA34_0<=OP)||LA34_0==PASS||LA34_0==RETURN||LA34_0==SETOF||(LA34_0>=SUMOF && LA34_0<=TABLEOF)||(LA34_0>=THIS && LA34_0<=TRY)||(LA34_0>=WHERE && LA34_0<=WHILE)||(LA34_0>=IDENTIFIER && LA34_0<=INTEGER)) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:377:23: statementChain
                                    {
                                    pushFollow(FOLLOW_statementChain_in_statementChain2344);
                                    statementChain125=statementChain();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementChain125.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:378:7: SEMI ( statementChain )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementChain2355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI126_tree = (CgsuiteTree)adaptor.create(SEMI126);
                    adaptor.addChild(root_0, SEMI126_tree);
                    }
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:378:12: ( statementChain )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=PLUS && LA36_0<=AST)||LA36_0==LPAREN||LA36_0==LBRACKET||LA36_0==LBRACE||LA36_0==SQUOTE||LA36_0==SEMI||(LA36_0>=CARET && LA36_0<=VEE)||(LA36_0>=BEGIN && LA36_0<=BY)||(LA36_0>=CLEAR && LA36_0<=DO)||LA36_0==ERROR||LA36_0==FALSE||LA36_0==FOR||LA36_0==FROM||LA36_0==IF||LA36_0==INF||LA36_0==LISTOF||(LA36_0>=NIL && LA36_0<=OP)||LA36_0==PASS||LA36_0==RETURN||LA36_0==SETOF||(LA36_0>=SUMOF && LA36_0<=TABLEOF)||(LA36_0>=THIS && LA36_0<=TRY)||(LA36_0>=WHERE && LA36_0<=WHILE)||(LA36_0>=IDENTIFIER && LA36_0<=INTEGER)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:378:12: statementChain
                            {
                            pushFollow(FOLLOW_statementChain_in_statementChain2357);
                            statementChain127=statementChain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementChain127.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementChain"

    public static class statement_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:381:1: statement : ( BREAK | CONTINUE | RETURN ( expression )? | CLEAR | tryStatement | expression );
    public final CgsuiteParser.statement_return statement() throws RecognitionException {
        CgsuiteParser.statement_return retval = new CgsuiteParser.statement_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token BREAK128=null;
        Token CONTINUE129=null;
        Token RETURN130=null;
        Token CLEAR132=null;
        CgsuiteParser.expression_return expression131 = null;

        CgsuiteParser.tryStatement_return tryStatement133 = null;

        CgsuiteParser.expression_return expression134 = null;


        CgsuiteTree BREAK128_tree=null;
        CgsuiteTree CONTINUE129_tree=null;
        CgsuiteTree RETURN130_tree=null;
        CgsuiteTree CLEAR132_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:382:2: ( BREAK | CONTINUE | RETURN ( expression )? | CLEAR | tryStatement | expression )
            int alt39=6;
            switch ( input.LA(1) ) {
            case BREAK:
                {
                alt39=1;
                }
                break;
            case CONTINUE:
                {
                alt39=2;
                }
                break;
            case RETURN:
                {
                alt39=3;
                }
                break;
            case CLEAR:
                {
                alt39=4;
                }
                break;
            case TRY:
                {
                alt39=5;
                }
                break;
            case PLUS:
            case MINUS:
            case PLUSMINUS:
            case AST:
            case LPAREN:
            case LBRACKET:
            case LBRACE:
            case SQUOTE:
            case CARET:
            case VEE:
            case BEGIN:
            case BY:
            case DO:
            case ERROR:
            case FALSE:
            case FOR:
            case FROM:
            case IF:
            case INF:
            case LISTOF:
            case NIL:
            case NOT:
            case OP:
            case PASS:
            case SETOF:
            case SUMOF:
            case SUPER:
            case TABLEOF:
            case THIS:
            case TO:
            case TRUE:
            case WHERE:
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case MULTI_CARET:
            case MULTI_VEE:
            case INTEGER:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:382:4: BREAK
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    BREAK128=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement2373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK128_tree = (CgsuiteTree)adaptor.create(BREAK128);
                    adaptor.addChild(root_0, BREAK128_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:383:4: CONTINUE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    CONTINUE129=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE129_tree = (CgsuiteTree)adaptor.create(CONTINUE129);
                    adaptor.addChild(root_0, CONTINUE129_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:384:4: RETURN ( expression )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    RETURN130=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN130_tree = (CgsuiteTree)adaptor.create(RETURN130);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(RETURN130_tree, root_0);
                    }
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:384:12: ( expression )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=PLUS && LA38_0<=AST)||LA38_0==LPAREN||LA38_0==LBRACKET||LA38_0==LBRACE||LA38_0==SQUOTE||(LA38_0>=CARET && LA38_0<=VEE)||LA38_0==BEGIN||LA38_0==BY||LA38_0==DO||LA38_0==ERROR||LA38_0==FALSE||LA38_0==FOR||LA38_0==FROM||LA38_0==IF||LA38_0==INF||LA38_0==LISTOF||(LA38_0>=NIL && LA38_0<=OP)||LA38_0==PASS||LA38_0==SETOF||(LA38_0>=SUMOF && LA38_0<=TABLEOF)||(LA38_0>=THIS && LA38_0<=TRUE)||(LA38_0>=WHERE && LA38_0<=WHILE)||(LA38_0>=IDENTIFIER && LA38_0<=INTEGER)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:384:12: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2386);
                            expression131=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:385:7: CLEAR
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    CLEAR132=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_statement2395); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLEAR132_tree = (CgsuiteTree)adaptor.create(CLEAR132);
                    adaptor.addChild(root_0, CLEAR132_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:386:7: tryStatement
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statement2403);
                    tryStatement133=tryStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement133.getTree());

                    }
                    break;
                case 6 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:387:7: expression
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_statement2411);
                    expression134=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression134.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStatement"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:390:1: tryStatement : TRY statementSequence FINALLY statementSequence END ;
    public final CgsuiteParser.tryStatement_return tryStatement() throws RecognitionException {
        CgsuiteParser.tryStatement_return retval = new CgsuiteParser.tryStatement_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token TRY135=null;
        Token FINALLY137=null;
        Token END139=null;
        CgsuiteParser.statementSequence_return statementSequence136 = null;

        CgsuiteParser.statementSequence_return statementSequence138 = null;


        CgsuiteTree TRY135_tree=null;
        CgsuiteTree FINALLY137_tree=null;
        CgsuiteTree END139_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:391:5: ( TRY statementSequence FINALLY statementSequence END )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:391:7: TRY statementSequence FINALLY statementSequence END
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            TRY135=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement2428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TRY135_tree = (CgsuiteTree)adaptor.create(TRY135);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(TRY135_tree, root_0);
            }
            pushFollow(FOLLOW_statementSequence_in_tryStatement2431);
            statementSequence136=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence136.getTree());
            FINALLY137=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_tryStatement2433); if (state.failed) return retval;
            pushFollow(FOLLOW_statementSequence_in_tryStatement2436);
            statementSequence138=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence138.getTree());
            END139=(Token)match(input,END,FOLLOW_END_in_tryStatement2438); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tryStatement"

    public static class expression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:394:1: expression : assignmentExpression ;
    public final CgsuiteParser.expression_return expression() throws RecognitionException {
        CgsuiteParser.expression_return retval = new CgsuiteParser.expression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.assignmentExpression_return assignmentExpression140 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:395:2: ( assignmentExpression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:395:4: assignmentExpression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expression2453);
            assignmentExpression140=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression140.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:398:1: assignmentExpression : functionExpression ( assignmentToken assignmentExpression )? ;
    public final CgsuiteParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        CgsuiteParser.assignmentExpression_return retval = new CgsuiteParser.assignmentExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.functionExpression_return functionExpression141 = null;

        CgsuiteParser.assignmentToken_return assignmentToken142 = null;

        CgsuiteParser.assignmentExpression_return assignmentExpression143 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:399:2: ( functionExpression ( assignmentToken assignmentExpression )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:399:4: functionExpression ( assignmentToken assignmentExpression )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_functionExpression_in_assignmentExpression2464);
            functionExpression141=functionExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression141.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:399:23: ( assignmentToken assignmentExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ASSIGN) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:399:24: assignmentToken assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentToken_in_assignmentExpression2467);
                    assignmentToken142=assignmentToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot(assignmentToken142.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression2470);
                    assignmentExpression143=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression143.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class assignmentToken_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentToken"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:402:1: assignmentToken : ASSIGN ;
    public final CgsuiteParser.assignmentToken_return assignmentToken() throws RecognitionException {
        CgsuiteParser.assignmentToken_return retval = new CgsuiteParser.assignmentToken_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token ASSIGN144=null;

        CgsuiteTree ASSIGN144_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:403:2: ( ASSIGN )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:403:4: ASSIGN
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            ASSIGN144=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignmentToken2484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASSIGN144_tree = (CgsuiteTree)adaptor.create(ASSIGN144);
            adaptor.addChild(root_0, ASSIGN144_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentToken"

    public static class functionExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:406:1: functionExpression : ( procedureParameterList RARROW functionExpression | orExpression );
    public final CgsuiteParser.functionExpression_return functionExpression() throws RecognitionException {
        CgsuiteParser.functionExpression_return retval = new CgsuiteParser.functionExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token RARROW146=null;
        CgsuiteParser.procedureParameterList_return procedureParameterList145 = null;

        CgsuiteParser.functionExpression_return functionExpression147 = null;

        CgsuiteParser.orExpression_return orExpression148 = null;


        CgsuiteTree RARROW146_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:407:2: ( procedureParameterList RARROW functionExpression | orExpression )
            int alt41=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RARROW) ) {
                    alt41=1;
                }
                else if ( (LA41_1==EOF||(LA41_1>=PLUS && LA41_1<=RBRACE)||(LA41_1>=SQUOTE && LA41_1<=COLON)||LA41_1==CARET||(LA41_1>=AMPERSAND && LA41_1<=COMPARE)||LA41_1==BIGRARROW||(LA41_1>=REFEQUALS && LA41_1<=ASSIGN)||LA41_1==DOTDOT||LA41_1==AND||LA41_1==BY||(LA41_1>=DO && LA41_1<=END)||(LA41_1>=FINALLY && LA41_1<=FOR)||LA41_1==FROM||LA41_1==IS||LA41_1==OR||LA41_1==THEN||LA41_1==TO||(LA41_1>=WHERE && LA41_1<=WHILE)||LA41_1==SLASHES) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    switch ( input.LA(3) ) {
                    case COMMA:
                        {
                        alt41=1;
                        }
                        break;
                    case RPAREN:
                        {
                        int LA41_6 = input.LA(4);

                        if ( (LA41_6==RARROW) ) {
                            alt41=1;
                        }
                        else if ( (LA41_6==EOF||(LA41_6>=PLUS && LA41_6<=RBRACKET)||LA41_6==RBRACE||(LA41_6>=COMMA && LA41_6<=COLON)||LA41_6==CARET||(LA41_6>=AMPERSAND && LA41_6<=COMPARE)||LA41_6==BIGRARROW||(LA41_6>=REFEQUALS && LA41_6<=ASSIGN)||LA41_6==DOTDOT||LA41_6==AND||LA41_6==BY||(LA41_6>=DO && LA41_6<=END)||(LA41_6>=FINALLY && LA41_6<=FOR)||LA41_6==FROM||LA41_6==IS||LA41_6==OR||LA41_6==THEN||LA41_6==TO||(LA41_6>=WHERE && LA41_6<=WHILE)||LA41_6==SLASHES) ) {
                            alt41=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case PLUSMINUS:
                    case AST:
                    case FSLASH:
                    case DOT:
                    case PERCENT:
                    case LPAREN:
                    case LBRACKET:
                    case LBRACE:
                    case SQUOTE:
                    case SEMI:
                    case COLON:
                    case CARET:
                    case AMPERSAND:
                    case EQUALS:
                    case NEQ:
                    case LT:
                    case GT:
                    case LEQ:
                    case GEQ:
                    case CONFUSED:
                    case LCONFUSED:
                    case GCONFUSED:
                    case COMPARE:
                    case RARROW:
                    case REFEQUALS:
                    case REFNEQ:
                    case ASSIGN:
                    case DOTDOT:
                    case AND:
                    case IS:
                    case OR:
                        {
                        alt41=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RPAREN:
                    {
                    int LA41_6 = input.LA(3);

                    if ( (LA41_6==RARROW) ) {
                        alt41=1;
                    }
                    else if ( (LA41_6==EOF||(LA41_6>=PLUS && LA41_6<=RBRACKET)||LA41_6==RBRACE||(LA41_6>=COMMA && LA41_6<=COLON)||LA41_6==CARET||(LA41_6>=AMPERSAND && LA41_6<=COMPARE)||LA41_6==BIGRARROW||(LA41_6>=REFEQUALS && LA41_6<=ASSIGN)||LA41_6==DOTDOT||LA41_6==AND||LA41_6==BY||(LA41_6>=DO && LA41_6<=END)||(LA41_6>=FINALLY && LA41_6<=FOR)||LA41_6==FROM||LA41_6==IS||LA41_6==OR||LA41_6==THEN||LA41_6==TO||(LA41_6>=WHERE && LA41_6<=WHILE)||LA41_6==SLASHES) ) {
                        alt41=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case PLUS:
                case MINUS:
                case PLUSMINUS:
                case AST:
                case LPAREN:
                case LBRACKET:
                case LBRACE:
                case SQUOTE:
                case SEMI:
                case CARET:
                case VEE:
                case BEGIN:
                case BREAK:
                case BY:
                case CLEAR:
                case CONTINUE:
                case DO:
                case ERROR:
                case FALSE:
                case FOR:
                case FROM:
                case IF:
                case INF:
                case LISTOF:
                case NIL:
                case NOT:
                case OP:
                case PASS:
                case RETURN:
                case SETOF:
                case SUMOF:
                case SUPER:
                case TABLEOF:
                case THIS:
                case TO:
                case TRUE:
                case TRY:
                case WHERE:
                case WHILE:
                case STRING:
                case MULTI_CARET:
                case MULTI_VEE:
                case INTEGER:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

                }
                break;
            case PLUS:
            case MINUS:
            case PLUSMINUS:
            case AST:
            case LBRACKET:
            case LBRACE:
            case SQUOTE:
            case CARET:
            case VEE:
            case BEGIN:
            case BY:
            case DO:
            case ERROR:
            case FALSE:
            case FOR:
            case FROM:
            case IF:
            case INF:
            case LISTOF:
            case NIL:
            case NOT:
            case OP:
            case PASS:
            case SETOF:
            case SUMOF:
            case SUPER:
            case TABLEOF:
            case THIS:
            case TO:
            case TRUE:
            case WHERE:
            case WHILE:
            case STRING:
            case MULTI_CARET:
            case MULTI_VEE:
            case INTEGER:
                {
                alt41=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:407:4: procedureParameterList RARROW functionExpression
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureParameterList_in_functionExpression2496);
                    procedureParameterList145=procedureParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureParameterList145.getTree());
                    RARROW146=(Token)match(input,RARROW,FOLLOW_RARROW_in_functionExpression2498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RARROW146_tree = (CgsuiteTree)adaptor.create(RARROW146);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(RARROW146_tree, root_0);
                    }
                    pushFollow(FOLLOW_functionExpression_in_functionExpression2501);
                    functionExpression147=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression147.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:408:7: orExpression
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_orExpression_in_functionExpression2509);
                    orExpression148=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class procedureParameterList_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureParameterList"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:411:1: procedureParameterList : ( IDENTIFIER -> ^( PROCEDURE_PARAMETER_LIST IDENTIFIER ) | LPAREN ( IDENTIFIER ( COMMA IDENTIFIER )* )? RPAREN -> ^( PROCEDURE_PARAMETER_LIST ( IDENTIFIER )* ) );
    public final CgsuiteParser.procedureParameterList_return procedureParameterList() throws RecognitionException {
        CgsuiteParser.procedureParameterList_return retval = new CgsuiteParser.procedureParameterList_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER149=null;
        Token LPAREN150=null;
        Token IDENTIFIER151=null;
        Token COMMA152=null;
        Token IDENTIFIER153=null;
        Token RPAREN154=null;

        CgsuiteTree IDENTIFIER149_tree=null;
        CgsuiteTree LPAREN150_tree=null;
        CgsuiteTree IDENTIFIER151_tree=null;
        CgsuiteTree COMMA152_tree=null;
        CgsuiteTree IDENTIFIER153_tree=null;
        CgsuiteTree RPAREN154_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:412:5: ( IDENTIFIER -> ^( PROCEDURE_PARAMETER_LIST IDENTIFIER ) | LPAREN ( IDENTIFIER ( COMMA IDENTIFIER )* )? RPAREN -> ^( PROCEDURE_PARAMETER_LIST ( IDENTIFIER )* ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IDENTIFIER) ) {
                alt44=1;
            }
            else if ( (LA44_0==LPAREN) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:412:7: IDENTIFIER
                    {
                    IDENTIFIER149=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedureParameterList2523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER149);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 412:18: -> ^( PROCEDURE_PARAMETER_LIST IDENTIFIER )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:412:21: ^( PROCEDURE_PARAMETER_LIST IDENTIFIER )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(PROCEDURE_PARAMETER_LIST, "PROCEDURE_PARAMETER_LIST"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:7: LPAREN ( IDENTIFIER ( COMMA IDENTIFIER )* )? RPAREN
                    {
                    LPAREN150=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_procedureParameterList2539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN150);

                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:14: ( IDENTIFIER ( COMMA IDENTIFIER )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==IDENTIFIER) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:15: IDENTIFIER ( COMMA IDENTIFIER )*
                            {
                            IDENTIFIER151=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedureParameterList2542); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER151);

                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:26: ( COMMA IDENTIFIER )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==COMMA) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:27: COMMA IDENTIFIER
                            	    {
                            	    COMMA152=(Token)match(input,COMMA,FOLLOW_COMMA_in_procedureParameterList2545); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA152);

                            	    IDENTIFIER153=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_procedureParameterList2547); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER153);


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_procedureParameterList2553); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN154);



                    // AST REWRITE
                    // elements: IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 413:55: -> ^( PROCEDURE_PARAMETER_LIST ( IDENTIFIER )* )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:58: ^( PROCEDURE_PARAMETER_LIST ( IDENTIFIER )* )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(PROCEDURE_PARAMETER_LIST, "PROCEDURE_PARAMETER_LIST"), root_1);

                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:413:85: ( IDENTIFIER )*
                        while ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureParameterList"

    public static class orExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:416:1: orExpression : andExpression ( OR orExpression )? ;
    public final CgsuiteParser.orExpression_return orExpression() throws RecognitionException {
        CgsuiteParser.orExpression_return retval = new CgsuiteParser.orExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token OR156=null;
        CgsuiteParser.andExpression_return andExpression155 = null;

        CgsuiteParser.orExpression_return orExpression157 = null;


        CgsuiteTree OR156_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:417:2: ( andExpression ( OR orExpression )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:417:4: andExpression ( OR orExpression )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_orExpression2577);
            andExpression155=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression155.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:417:18: ( OR orExpression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==OR) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:417:19: OR orExpression
                    {
                    OR156=(Token)match(input,OR,FOLLOW_OR_in_orExpression2580); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR156_tree = (CgsuiteTree)adaptor.create(OR156);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(OR156_tree, root_0);
                    }
                    pushFollow(FOLLOW_orExpression_in_orExpression2583);
                    orExpression157=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression157.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:420:1: andExpression : notExpr ( AND andExpression )? ;
    public final CgsuiteParser.andExpression_return andExpression() throws RecognitionException {
        CgsuiteParser.andExpression_return retval = new CgsuiteParser.andExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token AND159=null;
        CgsuiteParser.notExpr_return notExpr158 = null;

        CgsuiteParser.andExpression_return andExpression160 = null;


        CgsuiteTree AND159_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:421:2: ( notExpr ( AND andExpression )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:421:4: notExpr ( AND andExpression )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_notExpr_in_andExpression2596);
            notExpr158=notExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr158.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:421:12: ( AND andExpression )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AND) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:421:13: AND andExpression
                    {
                    AND159=(Token)match(input,AND,FOLLOW_AND_in_andExpression2599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND159_tree = (CgsuiteTree)adaptor.create(AND159);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(AND159_tree, root_0);
                    }
                    pushFollow(FOLLOW_andExpression_in_andExpression2602);
                    andExpression160=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression160.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class notExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:424:1: notExpr : ( NOT notExpr | isExpr );
    public final CgsuiteParser.notExpr_return notExpr() throws RecognitionException {
        CgsuiteParser.notExpr_return retval = new CgsuiteParser.notExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token NOT161=null;
        CgsuiteParser.notExpr_return notExpr162 = null;

        CgsuiteParser.isExpr_return isExpr163 = null;


        CgsuiteTree NOT161_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:425:5: ( NOT notExpr | isExpr )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==NOT) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=PLUS && LA47_0<=AST)||LA47_0==LPAREN||LA47_0==LBRACKET||LA47_0==LBRACE||LA47_0==SQUOTE||(LA47_0>=CARET && LA47_0<=VEE)||LA47_0==BEGIN||LA47_0==BY||LA47_0==DO||LA47_0==ERROR||LA47_0==FALSE||LA47_0==FOR||LA47_0==FROM||LA47_0==IF||LA47_0==INF||LA47_0==LISTOF||LA47_0==NIL||LA47_0==OP||LA47_0==PASS||LA47_0==SETOF||(LA47_0>=SUMOF && LA47_0<=TABLEOF)||(LA47_0>=THIS && LA47_0<=TRUE)||(LA47_0>=WHERE && LA47_0<=WHILE)||(LA47_0>=IDENTIFIER && LA47_0<=INTEGER)) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:425:7: NOT notExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    NOT161=(Token)match(input,NOT,FOLLOW_NOT_in_notExpr2618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT161_tree = (CgsuiteTree)adaptor.create(NOT161);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(NOT161_tree, root_0);
                    }
                    pushFollow(FOLLOW_notExpr_in_notExpr2621);
                    notExpr162=notExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr162.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:426:7: isExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_isExpr_in_notExpr2629);
                    isExpr163=isExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, isExpr163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notExpr"

    public static class isExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "isExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:429:1: isExpr : relationalExpr ( IS relationalExpr )? ;
    public final CgsuiteParser.isExpr_return isExpr() throws RecognitionException {
        CgsuiteParser.isExpr_return retval = new CgsuiteParser.isExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IS165=null;
        CgsuiteParser.relationalExpr_return relationalExpr164 = null;

        CgsuiteParser.relationalExpr_return relationalExpr166 = null;


        CgsuiteTree IS165_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:430:5: ( relationalExpr ( IS relationalExpr )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:430:7: relationalExpr ( IS relationalExpr )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpr_in_isExpr2646);
            relationalExpr164=relationalExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr164.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:430:22: ( IS relationalExpr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IS) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:430:23: IS relationalExpr
                    {
                    IS165=(Token)match(input,IS,FOLLOW_IS_in_isExpr2649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS165_tree = (CgsuiteTree)adaptor.create(IS165);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(IS165_tree, root_0);
                    }
                    pushFollow(FOLLOW_relationalExpr_in_isExpr2652);
                    relationalExpr166=relationalExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr166.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "isExpr"

    public static class relationalExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:433:1: relationalExpr : rangeExpr ( relationalToken relationalExpr )? ;
    public final CgsuiteParser.relationalExpr_return relationalExpr() throws RecognitionException {
        CgsuiteParser.relationalExpr_return retval = new CgsuiteParser.relationalExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.rangeExpr_return rangeExpr167 = null;

        CgsuiteParser.relationalToken_return relationalToken168 = null;

        CgsuiteParser.relationalExpr_return relationalExpr169 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:434:2: ( rangeExpr ( relationalToken relationalExpr )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:434:4: rangeExpr ( relationalToken relationalExpr )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_relationalExpr2668);
            rangeExpr167=rangeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rangeExpr167.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:434:14: ( relationalToken relationalExpr )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=EQUALS && LA49_0<=COMPARE)||(LA49_0>=REFEQUALS && LA49_0<=REFNEQ)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:434:15: relationalToken relationalExpr
                    {
                    pushFollow(FOLLOW_relationalToken_in_relationalExpr2671);
                    relationalToken168=relationalToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot(relationalToken168.getTree(), root_0);
                    pushFollow(FOLLOW_relationalExpr_in_relationalExpr2674);
                    relationalExpr169=relationalExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpr169.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpr"

    public static class relationalToken_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalToken"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:437:1: relationalToken : ( REFEQUALS | REFNEQ | standardRelationalToken );
    public final CgsuiteParser.relationalToken_return relationalToken() throws RecognitionException {
        CgsuiteParser.relationalToken_return retval = new CgsuiteParser.relationalToken_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token REFEQUALS170=null;
        Token REFNEQ171=null;
        CgsuiteParser.standardRelationalToken_return standardRelationalToken172 = null;


        CgsuiteTree REFEQUALS170_tree=null;
        CgsuiteTree REFNEQ171_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:438:2: ( REFEQUALS | REFNEQ | standardRelationalToken )
            int alt50=3;
            switch ( input.LA(1) ) {
            case REFEQUALS:
                {
                alt50=1;
                }
                break;
            case REFNEQ:
                {
                alt50=2;
                }
                break;
            case EQUALS:
            case NEQ:
            case LT:
            case GT:
            case LEQ:
            case GEQ:
            case CONFUSED:
            case LCONFUSED:
            case GCONFUSED:
            case COMPARE:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:438:4: REFEQUALS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    REFEQUALS170=(Token)match(input,REFEQUALS,FOLLOW_REFEQUALS_in_relationalToken2687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REFEQUALS170_tree = (CgsuiteTree)adaptor.create(REFEQUALS170);
                    adaptor.addChild(root_0, REFEQUALS170_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:439:4: REFNEQ
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    REFNEQ171=(Token)match(input,REFNEQ,FOLLOW_REFNEQ_in_relationalToken2692); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REFNEQ171_tree = (CgsuiteTree)adaptor.create(REFNEQ171);
                    adaptor.addChild(root_0, REFNEQ171_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:440:4: standardRelationalToken
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_standardRelationalToken_in_relationalToken2697);
                    standardRelationalToken172=standardRelationalToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, standardRelationalToken172.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalToken"

    public static class standardRelationalToken_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "standardRelationalToken"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:443:1: standardRelationalToken : ( EQUALS | NEQ | LT | GT | LEQ | GEQ | CONFUSED | LCONFUSED | GCONFUSED | COMPARE );
    public final CgsuiteParser.standardRelationalToken_return standardRelationalToken() throws RecognitionException {
        CgsuiteParser.standardRelationalToken_return retval = new CgsuiteParser.standardRelationalToken_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token set173=null;

        CgsuiteTree set173_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:444:5: ( EQUALS | NEQ | LT | GT | LEQ | GEQ | CONFUSED | LCONFUSED | GCONFUSED | COMPARE )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            set173=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=COMPARE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(set173));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "standardRelationalToken"

    public static class rangeExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rangeExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:456:1: rangeExpr : addExpr ( DOTDOT addExpr )? ;
    public final CgsuiteParser.rangeExpr_return rangeExpr() throws RecognitionException {
        CgsuiteParser.rangeExpr_return retval = new CgsuiteParser.rangeExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token DOTDOT175=null;
        CgsuiteParser.addExpr_return addExpr174 = null;

        CgsuiteParser.addExpr_return addExpr176 = null;


        CgsuiteTree DOTDOT175_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:457:5: ( addExpr ( DOTDOT addExpr )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:457:7: addExpr ( DOTDOT addExpr )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_rangeExpr2780);
            addExpr174=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr174.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:457:15: ( DOTDOT addExpr )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DOTDOT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:457:16: DOTDOT addExpr
                    {
                    DOTDOT175=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_rangeExpr2783); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTDOT175_tree = (CgsuiteTree)adaptor.create(DOTDOT175);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(DOTDOT175_tree, root_0);
                    }
                    pushFollow(FOLLOW_addExpr_in_rangeExpr2786);
                    addExpr176=addExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr176.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rangeExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:460:1: addExpr : unaryAddExpr ( ( PLUS | MINUS ) unaryAddExpr | binaryPlusMinus )* ;
    public final CgsuiteParser.addExpr_return addExpr() throws RecognitionException {
        CgsuiteParser.addExpr_return retval = new CgsuiteParser.addExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token PLUS178=null;
        Token MINUS179=null;
        CgsuiteParser.unaryAddExpr_return unaryAddExpr177 = null;

        CgsuiteParser.unaryAddExpr_return unaryAddExpr180 = null;

        CgsuiteParser.binaryPlusMinus_return binaryPlusMinus181 = null;


        CgsuiteTree PLUS178_tree=null;
        CgsuiteTree MINUS179_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:2: ( unaryAddExpr ( ( PLUS | MINUS ) unaryAddExpr | binaryPlusMinus )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:4: unaryAddExpr ( ( PLUS | MINUS ) unaryAddExpr | binaryPlusMinus )*
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAddExpr_in_addExpr2802);
            unaryAddExpr177=unaryAddExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAddExpr177.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:17: ( ( PLUS | MINUS ) unaryAddExpr | binaryPlusMinus )*
            loop53:
            do {
                int alt53=3;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=PLUS && LA53_0<=MINUS)) ) {
                    alt53=1;
                }
                else if ( (LA53_0==PLUSMINUS) ) {
                    alt53=2;
                }


                switch (alt53) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:18: ( PLUS | MINUS ) unaryAddExpr
            	    {
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:18: ( PLUS | MINUS )
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==PLUS) ) {
            	        alt52=1;
            	    }
            	    else if ( (LA52_0==MINUS) ) {
            	        alt52=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 52, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:19: PLUS
            	            {
            	            PLUS178=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2806); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS178_tree = (CgsuiteTree)adaptor.create(PLUS178);
            	            root_0 = (CgsuiteTree)adaptor.becomeRoot(PLUS178_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:27: MINUS
            	            {
            	            MINUS179=(Token)match(input,MINUS,FOLLOW_MINUS_in_addExpr2811); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS179_tree = (CgsuiteTree)adaptor.create(MINUS179);
            	            root_0 = (CgsuiteTree)adaptor.becomeRoot(MINUS179_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryAddExpr_in_addExpr2815);
            	    unaryAddExpr180=unaryAddExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAddExpr180.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:461:50: binaryPlusMinus
            	    {
            	    pushFollow(FOLLOW_binaryPlusMinus_in_addExpr2819);
            	    binaryPlusMinus181=binaryPlusMinus();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot(binaryPlusMinus181.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class binaryPlusMinus_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binaryPlusMinus"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:464:1: binaryPlusMinus : plusMinus -> ^( PLUS plusMinus ) ;
    public final CgsuiteParser.binaryPlusMinus_return binaryPlusMinus() throws RecognitionException {
        CgsuiteParser.binaryPlusMinus_return retval = new CgsuiteParser.binaryPlusMinus_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.plusMinus_return plusMinus182 = null;


        RewriteRuleSubtreeStream stream_plusMinus=new RewriteRuleSubtreeStream(adaptor,"rule plusMinus");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:465:5: ( plusMinus -> ^( PLUS plusMinus ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:465:7: plusMinus
            {
            pushFollow(FOLLOW_plusMinus_in_binaryPlusMinus2836);
            plusMinus182=plusMinus();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_plusMinus.add(plusMinus182.getTree());


            // AST REWRITE
            // elements: plusMinus
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 465:17: -> ^( PLUS plusMinus )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:465:20: ^( PLUS plusMinus )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(PLUS, "PLUS"), root_1);

                adaptor.addChild(root_1, stream_plusMinus.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binaryPlusMinus"

    public static class unaryAddExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryAddExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:468:1: unaryAddExpr : ( plusMinus | MINUS sidleExpr -> ^( UNARY_MINUS[$MINUS] sidleExpr ) | PLUS sidleExpr -> ^( UNARY_PLUS[$PLUS] sidleExpr ) | sidleExpr );
    public final CgsuiteParser.unaryAddExpr_return unaryAddExpr() throws RecognitionException {
        CgsuiteParser.unaryAddExpr_return retval = new CgsuiteParser.unaryAddExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token MINUS184=null;
        Token PLUS186=null;
        CgsuiteParser.plusMinus_return plusMinus183 = null;

        CgsuiteParser.sidleExpr_return sidleExpr185 = null;

        CgsuiteParser.sidleExpr_return sidleExpr187 = null;

        CgsuiteParser.sidleExpr_return sidleExpr188 = null;


        CgsuiteTree MINUS184_tree=null;
        CgsuiteTree PLUS186_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_sidleExpr=new RewriteRuleSubtreeStream(adaptor,"rule sidleExpr");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:469:5: ( plusMinus | MINUS sidleExpr -> ^( UNARY_MINUS[$MINUS] sidleExpr ) | PLUS sidleExpr -> ^( UNARY_PLUS[$PLUS] sidleExpr ) | sidleExpr )
            int alt54=4;
            switch ( input.LA(1) ) {
            case PLUSMINUS:
                {
                alt54=1;
                }
                break;
            case MINUS:
                {
                alt54=2;
                }
                break;
            case PLUS:
                {
                alt54=3;
                }
                break;
            case AST:
            case LPAREN:
            case LBRACKET:
            case LBRACE:
            case SQUOTE:
            case CARET:
            case VEE:
            case BEGIN:
            case BY:
            case DO:
            case ERROR:
            case FALSE:
            case FOR:
            case FROM:
            case IF:
            case INF:
            case LISTOF:
            case NIL:
            case OP:
            case PASS:
            case SETOF:
            case SUMOF:
            case SUPER:
            case TABLEOF:
            case THIS:
            case TO:
            case TRUE:
            case WHERE:
            case WHILE:
            case IDENTIFIER:
            case STRING:
            case MULTI_CARET:
            case MULTI_VEE:
            case INTEGER:
                {
                alt54=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:469:7: plusMinus
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_plusMinus_in_unaryAddExpr2862);
                    plusMinus183=plusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, plusMinus183.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:470:7: MINUS sidleExpr
                    {
                    MINUS184=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAddExpr2870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS184);

                    pushFollow(FOLLOW_sidleExpr_in_unaryAddExpr2872);
                    sidleExpr185=sidleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sidleExpr.add(sidleExpr185.getTree());


                    // AST REWRITE
                    // elements: sidleExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 470:23: -> ^( UNARY_MINUS[$MINUS] sidleExpr )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:470:26: ^( UNARY_MINUS[$MINUS] sidleExpr )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(UNARY_MINUS, MINUS184), root_1);

                        adaptor.addChild(root_1, stream_sidleExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:471:7: PLUS sidleExpr
                    {
                    PLUS186=(Token)match(input,PLUS,FOLLOW_PLUS_in_unaryAddExpr2889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS186);

                    pushFollow(FOLLOW_sidleExpr_in_unaryAddExpr2891);
                    sidleExpr187=sidleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sidleExpr.add(sidleExpr187.getTree());


                    // AST REWRITE
                    // elements: sidleExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 471:22: -> ^( UNARY_PLUS[$PLUS] sidleExpr )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:471:25: ^( UNARY_PLUS[$PLUS] sidleExpr )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(UNARY_PLUS, PLUS186), root_1);

                        adaptor.addChild(root_1, stream_sidleExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:472:7: sidleExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_sidleExpr_in_unaryAddExpr2908);
                    sidleExpr188=sidleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sidleExpr188.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryAddExpr"

    public static class plusMinus_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plusMinus"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:475:1: plusMinus options {backtrack=true; memoize=true; } : ( PLUSMINUS LPAREN expression ( COMMA expression )* RPAREN -> ^( PLUSMINUS ( expression )* ) | PLUSMINUS sidleExpr );
    public final CgsuiteParser.plusMinus_return plusMinus() throws RecognitionException {
        CgsuiteParser.plusMinus_return retval = new CgsuiteParser.plusMinus_return();
        retval.start = input.LT(1);
        int plusMinus_StartIndex = input.index();
        CgsuiteTree root_0 = null;

        Token PLUSMINUS189=null;
        Token LPAREN190=null;
        Token COMMA192=null;
        Token RPAREN194=null;
        Token PLUSMINUS195=null;
        CgsuiteParser.expression_return expression191 = null;

        CgsuiteParser.expression_return expression193 = null;

        CgsuiteParser.sidleExpr_return sidleExpr196 = null;


        CgsuiteTree PLUSMINUS189_tree=null;
        CgsuiteTree LPAREN190_tree=null;
        CgsuiteTree COMMA192_tree=null;
        CgsuiteTree RPAREN194_tree=null;
        CgsuiteTree PLUSMINUS195_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_PLUSMINUS=new RewriteRuleTokenStream(adaptor,"token PLUSMINUS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:5: ( PLUSMINUS LPAREN expression ( COMMA expression )* RPAREN -> ^( PLUSMINUS ( expression )* ) | PLUSMINUS sidleExpr )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==PLUSMINUS) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred3_Cgsuite()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:7: PLUSMINUS LPAREN expression ( COMMA expression )* RPAREN
                    {
                    PLUSMINUS189=(Token)match(input,PLUSMINUS,FOLLOW_PLUSMINUS_in_plusMinus2951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSMINUS.add(PLUSMINUS189);

                    LPAREN190=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_plusMinus2953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN190);

                    pushFollow(FOLLOW_expression_in_plusMinus2955);
                    expression191=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression191.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:35: ( COMMA expression )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:36: COMMA expression
                    	    {
                    	    COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_plusMinus2958); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA192);

                    	    pushFollow(FOLLOW_expression_in_plusMinus2960);
                    	    expression193=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression193.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    RPAREN194=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_plusMinus2964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN194);



                    // AST REWRITE
                    // elements: expression, PLUSMINUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 481:62: -> ^( PLUSMINUS ( expression )* )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:65: ^( PLUSMINUS ( expression )* )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_PLUSMINUS.nextNode(), root_1);

                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:77: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:482:7: PLUSMINUS sidleExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    PLUSMINUS195=(Token)match(input,PLUSMINUS,FOLLOW_PLUSMINUS_in_plusMinus2981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUSMINUS195_tree = (CgsuiteTree)adaptor.create(PLUSMINUS195);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(PLUSMINUS195_tree, root_0);
                    }
                    pushFollow(FOLLOW_sidleExpr_in_plusMinus2984);
                    sidleExpr196=sidleExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sidleExpr196.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, plusMinus_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "plusMinus"

    public static class sidleExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sidleExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:485:1: sidleExpr : ordinalSumExpr ( AMPERSAND ordinalSumExpr )? ;
    public final CgsuiteParser.sidleExpr_return sidleExpr() throws RecognitionException {
        CgsuiteParser.sidleExpr_return retval = new CgsuiteParser.sidleExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token AMPERSAND198=null;
        CgsuiteParser.ordinalSumExpr_return ordinalSumExpr197 = null;

        CgsuiteParser.ordinalSumExpr_return ordinalSumExpr199 = null;


        CgsuiteTree AMPERSAND198_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:486:5: ( ordinalSumExpr ( AMPERSAND ordinalSumExpr )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:486:7: ordinalSumExpr ( AMPERSAND ordinalSumExpr )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_ordinalSumExpr_in_sidleExpr3001);
            ordinalSumExpr197=ordinalSumExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinalSumExpr197.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:486:22: ( AMPERSAND ordinalSumExpr )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AMPERSAND) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:486:23: AMPERSAND ordinalSumExpr
                    {
                    AMPERSAND198=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_sidleExpr3004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AMPERSAND198_tree = (CgsuiteTree)adaptor.create(AMPERSAND198);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(AMPERSAND198_tree, root_0);
                    }
                    pushFollow(FOLLOW_ordinalSumExpr_in_sidleExpr3007);
                    ordinalSumExpr199=ordinalSumExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ordinalSumExpr199.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sidleExpr"

    public static class ordinalSumExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ordinalSumExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:489:1: ordinalSumExpr : multiplyExpr ( COLON multiplyExpr )* ;
    public final CgsuiteParser.ordinalSumExpr_return ordinalSumExpr() throws RecognitionException {
        CgsuiteParser.ordinalSumExpr_return retval = new CgsuiteParser.ordinalSumExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token COLON201=null;
        CgsuiteParser.multiplyExpr_return multiplyExpr200 = null;

        CgsuiteParser.multiplyExpr_return multiplyExpr202 = null;


        CgsuiteTree COLON201_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:490:5: ( multiplyExpr ( COLON multiplyExpr )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:490:7: multiplyExpr ( COLON multiplyExpr )*
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_multiplyExpr_in_ordinalSumExpr3026);
            multiplyExpr200=multiplyExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpr200.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:490:20: ( COLON multiplyExpr )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==COLON) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:490:21: COLON multiplyExpr
            	    {
            	    COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_ordinalSumExpr3029); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COLON201_tree = (CgsuiteTree)adaptor.create(COLON201);
            	    root_0 = (CgsuiteTree)adaptor.becomeRoot(COLON201_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplyExpr_in_ordinalSumExpr3032);
            	    multiplyExpr202=multiplyExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyExpr202.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ordinalSumExpr"

    public static class multiplyExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:493:1: multiplyExpr : expExpr ( ( AST | FSLASH | PERCENT ) expExpr )* ;
    public final CgsuiteParser.multiplyExpr_return multiplyExpr() throws RecognitionException {
        CgsuiteParser.multiplyExpr_return retval = new CgsuiteParser.multiplyExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token AST204=null;
        Token FSLASH205=null;
        Token PERCENT206=null;
        CgsuiteParser.expExpr_return expExpr203 = null;

        CgsuiteParser.expExpr_return expExpr207 = null;


        CgsuiteTree AST204_tree=null;
        CgsuiteTree FSLASH205_tree=null;
        CgsuiteTree PERCENT206_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:2: ( expExpr ( ( AST | FSLASH | PERCENT ) expExpr )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:4: expExpr ( ( AST | FSLASH | PERCENT ) expExpr )*
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_expExpr_in_multiplyExpr3048);
            expExpr203=expExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expExpr203.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:12: ( ( AST | FSLASH | PERCENT ) expExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=AST && LA60_0<=FSLASH)||LA60_0==PERCENT) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:13: ( AST | FSLASH | PERCENT ) expExpr
            	    {
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:13: ( AST | FSLASH | PERCENT )
            	    int alt59=3;
            	    switch ( input.LA(1) ) {
            	    case AST:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case FSLASH:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:14: AST
            	            {
            	            AST204=(Token)match(input,AST,FOLLOW_AST_in_multiplyExpr3052); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AST204_tree = (CgsuiteTree)adaptor.create(AST204);
            	            root_0 = (CgsuiteTree)adaptor.becomeRoot(AST204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:21: FSLASH
            	            {
            	            FSLASH205=(Token)match(input,FSLASH,FOLLOW_FSLASH_in_multiplyExpr3057); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            FSLASH205_tree = (CgsuiteTree)adaptor.create(FSLASH205);
            	            root_0 = (CgsuiteTree)adaptor.becomeRoot(FSLASH205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:494:31: PERCENT
            	            {
            	            PERCENT206=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multiplyExpr3062); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT206_tree = (CgsuiteTree)adaptor.create(PERCENT206);
            	            root_0 = (CgsuiteTree)adaptor.becomeRoot(PERCENT206_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expExpr_in_multiplyExpr3066);
            	    expExpr207=expExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expExpr207.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplyExpr"

    public static class expExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:497:1: expExpr : postfixExpr ( CARET postfixExpr )? ;
    public final CgsuiteParser.expExpr_return expExpr() throws RecognitionException {
        CgsuiteParser.expExpr_return retval = new CgsuiteParser.expExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token CARET209=null;
        CgsuiteParser.postfixExpr_return postfixExpr208 = null;

        CgsuiteParser.postfixExpr_return postfixExpr210 = null;


        CgsuiteTree CARET209_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:498:2: ( postfixExpr ( CARET postfixExpr )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:498:4: postfixExpr ( CARET postfixExpr )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_postfixExpr_in_expExpr3079);
            postfixExpr208=postfixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr208.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:498:16: ( CARET postfixExpr )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==CARET) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:498:17: CARET postfixExpr
                    {
                    CARET209=(Token)match(input,CARET,FOLLOW_CARET_in_expExpr3082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CARET209_tree = (CgsuiteTree)adaptor.create(CARET209);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(CARET209_tree, root_0);
                    }
                    pushFollow(FOLLOW_postfixExpr_in_expExpr3085);
                    postfixExpr210=postfixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpr210.getTree());
                    if ( state.backtracking==0 ) {
                       CARET209.setType(EXP); 
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expExpr"

    public static class postfixExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:501:1: postfixExpr : ( upstarExpr -> upstarExpr ) ( DOT SUPER DOT id= generalizedId -> ^( DOT $postfixExpr $id) | DOT id= generalizedId -> ^( DOT $postfixExpr $id) | x= arrayReference -> ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference ) | y= functionCall -> ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall ) )* ;
    public final CgsuiteParser.postfixExpr_return postfixExpr() throws RecognitionException {
        CgsuiteParser.postfixExpr_return retval = new CgsuiteParser.postfixExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token DOT212=null;
        Token SUPER213=null;
        Token DOT214=null;
        Token DOT215=null;
        CgsuiteParser.generalizedId_return id = null;

        CgsuiteParser.arrayReference_return x = null;

        CgsuiteParser.functionCall_return y = null;

        CgsuiteParser.upstarExpr_return upstarExpr211 = null;


        CgsuiteTree DOT212_tree=null;
        CgsuiteTree SUPER213_tree=null;
        CgsuiteTree DOT214_tree=null;
        CgsuiteTree DOT215_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_upstarExpr=new RewriteRuleSubtreeStream(adaptor,"rule upstarExpr");
        RewriteRuleSubtreeStream stream_generalizedId=new RewriteRuleSubtreeStream(adaptor,"rule generalizedId");
        RewriteRuleSubtreeStream stream_arrayReference=new RewriteRuleSubtreeStream(adaptor,"rule arrayReference");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:502:2: ( ( upstarExpr -> upstarExpr ) ( DOT SUPER DOT id= generalizedId -> ^( DOT $postfixExpr $id) | DOT id= generalizedId -> ^( DOT $postfixExpr $id) | x= arrayReference -> ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference ) | y= functionCall -> ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall ) )* )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:502:4: ( upstarExpr -> upstarExpr ) ( DOT SUPER DOT id= generalizedId -> ^( DOT $postfixExpr $id) | DOT id= generalizedId -> ^( DOT $postfixExpr $id) | x= arrayReference -> ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference ) | y= functionCall -> ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall ) )*
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:502:4: ( upstarExpr -> upstarExpr )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:502:5: upstarExpr
            {
            pushFollow(FOLLOW_upstarExpr_in_postfixExpr3102);
            upstarExpr211=upstarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_upstarExpr.add(upstarExpr211.getTree());


            // AST REWRITE
            // elements: upstarExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 502:16: -> upstarExpr
            {
                adaptor.addChild(root_0, stream_upstarExpr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:503:4: ( DOT SUPER DOT id= generalizedId -> ^( DOT $postfixExpr $id) | DOT id= generalizedId -> ^( DOT $postfixExpr $id) | x= arrayReference -> ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference ) | y= functionCall -> ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall ) )*
            loop62:
            do {
                int alt62=5;
                switch ( input.LA(1) ) {
                case DOT:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==SUPER) ) {
                        alt62=1;
                    }
                    else if ( (LA62_2==OP||LA62_2==IDENTIFIER) ) {
                        alt62=2;
                    }


                    }
                    break;
                case LBRACKET:
                    {
                    alt62=3;
                    }
                    break;
                case LPAREN:
                    {
                    alt62=4;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:503:6: DOT SUPER DOT id= generalizedId
            	    {
            	    DOT212=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpr3114); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT212);

            	    SUPER213=(Token)match(input,SUPER,FOLLOW_SUPER_in_postfixExpr3116); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SUPER.add(SUPER213);

            	    DOT214=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpr3118); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT214);

            	    pushFollow(FOLLOW_generalizedId_in_postfixExpr3122);
            	    id=generalizedId();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_generalizedId.add(id.getTree());
            	    if ( state.backtracking==0 ) {
            	       (id!=null?((CgsuiteTree)id.tree):null).getToken().setText("super$" + (id!=null?((CgsuiteTree)id.tree):null).getText()); 
            	    }


            	    // AST REWRITE
            	    // elements: DOT, postfixExpr, id
            	    // token labels: 
            	    // rule labels: id, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CgsuiteTree)adaptor.nil();
            	    // 503:101: -> ^( DOT $postfixExpr $id)
            	    {
            	        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:503:104: ^( DOT $postfixExpr $id)
            	        {
            	        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
            	        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_id.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:504:9: DOT id= generalizedId
            	    {
            	    DOT215=(Token)match(input,DOT,FOLLOW_DOT_in_postfixExpr3146); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT215);

            	    pushFollow(FOLLOW_generalizedId_in_postfixExpr3150);
            	    id=generalizedId();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_generalizedId.add(id.getTree());


            	    // AST REWRITE
            	    // elements: DOT, postfixExpr, id
            	    // token labels: 
            	    // rule labels: id, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CgsuiteTree)adaptor.nil();
            	    // 504:31: -> ^( DOT $postfixExpr $id)
            	    {
            	        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:504:34: ^( DOT $postfixExpr $id)
            	        {
            	        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
            	        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_id.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:505:6: x= arrayReference
            	    {
            	    pushFollow(FOLLOW_arrayReference_in_postfixExpr3172);
            	    x=arrayReference();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arrayReference.add(x.getTree());


            	    // AST REWRITE
            	    // elements: postfixExpr, arrayReference
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CgsuiteTree)adaptor.nil();
            	    // 505:22: -> ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference )
            	    {
            	        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:505:25: ^( ARRAY_REFERENCE[$x.tree.getToken()] $postfixExpr arrayReference )
            	        {
            	        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
            	        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(ARRAY_REFERENCE, (x!=null?((CgsuiteTree)x.tree):null).getToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_arrayReference.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 4 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:506:6: y= functionCall
            	    {
            	    pushFollow(FOLLOW_functionCall_in_postfixExpr3192);
            	    y=functionCall();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionCall.add(y.getTree());


            	    // AST REWRITE
            	    // elements: postfixExpr, functionCall
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CgsuiteTree)adaptor.nil();
            	    // 506:21: -> ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall )
            	    {
            	        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:506:24: ^( FUNCTION_CALL[$y.tree.getToken()] $postfixExpr functionCall )
            	        {
            	        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
            	        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(FUNCTION_CALL, (y!=null?((CgsuiteTree)y.tree):null).getToken()), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_functionCall.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpr"

    public static class arrayReference_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayReference"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:510:1: arrayReference : LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_INDEX_LIST[$LBRACKET] ( expression )* ) ;
    public final CgsuiteParser.arrayReference_return arrayReference() throws RecognitionException {
        CgsuiteParser.arrayReference_return retval = new CgsuiteParser.arrayReference_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LBRACKET216=null;
        Token COMMA218=null;
        Token RBRACKET220=null;
        CgsuiteParser.expression_return expression217 = null;

        CgsuiteParser.expression_return expression219 = null;


        CgsuiteTree LBRACKET216_tree=null;
        CgsuiteTree COMMA218_tree=null;
        CgsuiteTree RBRACKET220_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:511:2: ( LBRACKET expression ( COMMA expression )* RBRACKET -> ^( ARRAY_INDEX_LIST[$LBRACKET] ( expression )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:511:4: LBRACKET expression ( COMMA expression )* RBRACKET
            {
            LBRACKET216=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayReference3223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET216);

            pushFollow(FOLLOW_expression_in_arrayReference3225);
            expression217=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression217.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:511:24: ( COMMA expression )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:511:25: COMMA expression
            	    {
            	    COMMA218=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayReference3228); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA218);

            	    pushFollow(FOLLOW_expression_in_arrayReference3230);
            	    expression219=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression219.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            RBRACKET220=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayReference3234); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET220);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 512:7: -> ^( ARRAY_INDEX_LIST[$LBRACKET] ( expression )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:512:10: ^( ARRAY_INDEX_LIST[$LBRACKET] ( expression )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(ARRAY_INDEX_LIST, LBRACKET216), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:512:40: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayReference"

    public static class functionCall_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:515:1: functionCall : LPAREN ( functionArgument ( COMMA functionArgument )* )? RPAREN -> ^( FUNCTION_CALL_ARGUMENT_LIST[$LPAREN] ( functionArgument )* ) ;
    public final CgsuiteParser.functionCall_return functionCall() throws RecognitionException {
        CgsuiteParser.functionCall_return retval = new CgsuiteParser.functionCall_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LPAREN221=null;
        Token COMMA223=null;
        Token RPAREN225=null;
        CgsuiteParser.functionArgument_return functionArgument222 = null;

        CgsuiteParser.functionArgument_return functionArgument224 = null;


        CgsuiteTree LPAREN221_tree=null;
        CgsuiteTree COMMA223_tree=null;
        CgsuiteTree RPAREN225_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_functionArgument=new RewriteRuleSubtreeStream(adaptor,"rule functionArgument");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:2: ( LPAREN ( functionArgument ( COMMA functionArgument )* )? RPAREN -> ^( FUNCTION_CALL_ARGUMENT_LIST[$LPAREN] ( functionArgument )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:4: LPAREN ( functionArgument ( COMMA functionArgument )* )? RPAREN
            {
            LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionCall3261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN221);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:11: ( functionArgument ( COMMA functionArgument )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=PLUS && LA65_0<=AST)||LA65_0==LPAREN||LA65_0==LBRACKET||LA65_0==LBRACE||LA65_0==SQUOTE||(LA65_0>=CARET && LA65_0<=VEE)||LA65_0==BEGIN||LA65_0==BY||LA65_0==DO||LA65_0==ERROR||LA65_0==FALSE||LA65_0==FOR||LA65_0==FROM||LA65_0==IF||LA65_0==INF||LA65_0==LISTOF||(LA65_0>=NIL && LA65_0<=OP)||LA65_0==PASS||LA65_0==SETOF||(LA65_0>=SUMOF && LA65_0<=TABLEOF)||(LA65_0>=THIS && LA65_0<=TRUE)||(LA65_0>=WHERE && LA65_0<=WHILE)||(LA65_0>=IDENTIFIER && LA65_0<=INTEGER)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:12: functionArgument ( COMMA functionArgument )*
                    {
                    pushFollow(FOLLOW_functionArgument_in_functionCall3264);
                    functionArgument222=functionArgument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument222.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:29: ( COMMA functionArgument )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:516:30: COMMA functionArgument
                    	    {
                    	    COMMA223=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionCall3267); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA223);

                    	    pushFollow(FOLLOW_functionArgument_in_functionCall3269);
                    	    functionArgument224=functionArgument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_functionArgument.add(functionArgument224.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN225=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionCall3275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN225);



            // AST REWRITE
            // elements: functionArgument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 517:7: -> ^( FUNCTION_CALL_ARGUMENT_LIST[$LPAREN] ( functionArgument )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:517:10: ^( FUNCTION_CALL_ARGUMENT_LIST[$LPAREN] ( functionArgument )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(FUNCTION_CALL_ARGUMENT_LIST, LPAREN221), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:517:49: ( functionArgument )*
                while ( stream_functionArgument.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionArgument.nextTree());

                }
                stream_functionArgument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class functionArgument_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionArgument"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:520:1: functionArgument : ( IDENTIFIER BIGRARROW )? expression ;
    public final CgsuiteParser.functionArgument_return functionArgument() throws RecognitionException {
        CgsuiteParser.functionArgument_return retval = new CgsuiteParser.functionArgument_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER226=null;
        Token BIGRARROW227=null;
        CgsuiteParser.expression_return expression228 = null;


        CgsuiteTree IDENTIFIER226_tree=null;
        CgsuiteTree BIGRARROW227_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:521:2: ( ( IDENTIFIER BIGRARROW )? expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:521:4: ( IDENTIFIER BIGRARROW )? expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:521:4: ( IDENTIFIER BIGRARROW )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==IDENTIFIER) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==BIGRARROW) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:521:5: IDENTIFIER BIGRARROW
                    {
                    IDENTIFIER226=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionArgument3305); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER226_tree = (CgsuiteTree)adaptor.create(IDENTIFIER226);
                    adaptor.addChild(root_0, IDENTIFIER226_tree);
                    }
                    BIGRARROW227=(Token)match(input,BIGRARROW,FOLLOW_BIGRARROW_in_functionArgument3307); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIGRARROW227_tree = (CgsuiteTree)adaptor.create(BIGRARROW227);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(BIGRARROW227_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_functionArgument3312);
            expression228=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression228.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionArgument"

    public static class upstarExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upstarExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:524:1: upstarExpr options {backtrack=true; memoize=true; } : ( ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr | ( CARET | VEE ) primaryExpr starExpr | ( CARET | VEE ) primaryExpr | starExpr | CARET | MULTI_CARET | VEE | MULTI_VEE | primaryExpr );
    public final CgsuiteParser.upstarExpr_return upstarExpr() throws RecognitionException {
        CgsuiteParser.upstarExpr_return retval = new CgsuiteParser.upstarExpr_return();
        retval.start = input.LT(1);
        int upstarExpr_StartIndex = input.index();
        CgsuiteTree root_0 = null;

        Token set229=null;
        Token set231=null;
        Token set234=null;
        Token CARET237=null;
        Token MULTI_CARET238=null;
        Token VEE239=null;
        Token MULTI_VEE240=null;
        CgsuiteParser.starExpr_return starExpr230 = null;

        CgsuiteParser.primaryExpr_return primaryExpr232 = null;

        CgsuiteParser.starExpr_return starExpr233 = null;

        CgsuiteParser.primaryExpr_return primaryExpr235 = null;

        CgsuiteParser.starExpr_return starExpr236 = null;

        CgsuiteParser.primaryExpr_return primaryExpr241 = null;


        CgsuiteTree set229_tree=null;
        CgsuiteTree set231_tree=null;
        CgsuiteTree set234_tree=null;
        CgsuiteTree CARET237_tree=null;
        CgsuiteTree MULTI_CARET238_tree=null;
        CgsuiteTree VEE239_tree=null;
        CgsuiteTree MULTI_VEE240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:530:5: ( ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr | ( CARET | VEE ) primaryExpr starExpr | ( CARET | VEE ) primaryExpr | starExpr | CARET | MULTI_CARET | VEE | MULTI_VEE | primaryExpr )
            int alt67=9;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:530:7: ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    set229=(Token)input.LT(1);
                    set229=(Token)input.LT(1);
                    if ( (input.LA(1)>=CARET && input.LA(1)<=VEE)||(input.LA(1)>=MULTI_CARET && input.LA(1)<=MULTI_VEE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(set229), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_starExpr_in_upstarExpr3370);
                    starExpr230=starExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, starExpr230.getTree());

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:531:7: ( CARET | VEE ) primaryExpr starExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    set231=(Token)input.LT(1);
                    set231=(Token)input.LT(1);
                    if ( (input.LA(1)>=CARET && input.LA(1)<=VEE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(set231), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_primaryExpr_in_upstarExpr3387);
                    primaryExpr232=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpr232.getTree());
                    pushFollow(FOLLOW_starExpr_in_upstarExpr3389);
                    starExpr233=starExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, starExpr233.getTree());

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:532:7: ( CARET | VEE ) primaryExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    set234=(Token)input.LT(1);
                    set234=(Token)input.LT(1);
                    if ( (input.LA(1)>=CARET && input.LA(1)<=VEE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(set234), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_primaryExpr_in_upstarExpr3406);
                    primaryExpr235=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpr235.getTree());

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:533:7: starExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_starExpr_in_upstarExpr3414);
                    starExpr236=starExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, starExpr236.getTree());

                    }
                    break;
                case 5 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:7: CARET
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    CARET237=(Token)match(input,CARET,FOLLOW_CARET_in_upstarExpr3422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CARET237_tree = (CgsuiteTree)adaptor.create(CARET237);
                    adaptor.addChild(root_0, CARET237_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:15: MULTI_CARET
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    MULTI_CARET238=(Token)match(input,MULTI_CARET,FOLLOW_MULTI_CARET_in_upstarExpr3426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTI_CARET238_tree = (CgsuiteTree)adaptor.create(MULTI_CARET238);
                    adaptor.addChild(root_0, MULTI_CARET238_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:29: VEE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    VEE239=(Token)match(input,VEE,FOLLOW_VEE_in_upstarExpr3430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VEE239_tree = (CgsuiteTree)adaptor.create(VEE239);
                    adaptor.addChild(root_0, VEE239_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:35: MULTI_VEE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    MULTI_VEE240=(Token)match(input,MULTI_VEE,FOLLOW_MULTI_VEE_in_upstarExpr3434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MULTI_VEE240_tree = (CgsuiteTree)adaptor.create(MULTI_VEE240);
                    adaptor.addChild(root_0, MULTI_VEE240_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:535:7: primaryExpr
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpr_in_upstarExpr3442);
                    primaryExpr241=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpr241.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, upstarExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "upstarExpr"

    public static class starExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "starExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:538:1: starExpr options {backtrack=true; memoize=true; } : ( AST primaryExpr -> ^( UNARY_AST[$AST] primaryExpr ) | AST -> UNARY_AST[$AST] );
    public final CgsuiteParser.starExpr_return starExpr() throws RecognitionException {
        CgsuiteParser.starExpr_return retval = new CgsuiteParser.starExpr_return();
        retval.start = input.LT(1);
        int starExpr_StartIndex = input.index();
        CgsuiteTree root_0 = null;

        Token AST242=null;
        Token AST244=null;
        CgsuiteParser.primaryExpr_return primaryExpr243 = null;


        CgsuiteTree AST242_tree=null;
        CgsuiteTree AST244_tree=null;
        RewriteRuleTokenStream stream_AST=new RewriteRuleTokenStream(adaptor,"token AST");
        RewriteRuleSubtreeStream stream_primaryExpr=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:544:5: ( AST primaryExpr -> ^( UNARY_AST[$AST] primaryExpr ) | AST -> UNARY_AST[$AST] )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==AST) ) {
                int LA68_1 = input.LA(2);

                if ( (synpred12_Cgsuite()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:544:7: AST primaryExpr
                    {
                    AST242=(Token)match(input,AST,FOLLOW_AST_in_starExpr3485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AST.add(AST242);

                    pushFollow(FOLLOW_primaryExpr_in_starExpr3487);
                    primaryExpr243=primaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpr.add(primaryExpr243.getTree());


                    // AST REWRITE
                    // elements: primaryExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 544:23: -> ^( UNARY_AST[$AST] primaryExpr )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:544:26: ^( UNARY_AST[$AST] primaryExpr )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(UNARY_AST, AST242), root_1);

                        adaptor.addChild(root_1, stream_primaryExpr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:545:7: AST
                    {
                    AST244=(Token)match(input,AST,FOLLOW_AST_in_starExpr3504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AST.add(AST244);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 545:11: -> UNARY_AST[$AST]
                    {
                        adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(UNARY_AST, AST244));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, starExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "starExpr"

    public static class primaryExpr_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpr"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:548:1: primaryExpr : ( NIL | THIS | TRUE | FALSE | INTEGER | INF | STRING | PASS | SUPER DOT id= generalizedId -> ^( DOT THIS[$SUPER] $id) | ERROR LPAREN statementSequence RPAREN | LPAREN statementSequence RPAREN | ( ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES )=> explicitGame | ( LBRACE ( expression )? BIGRARROW )=> explicitMap | generalizedId | explicitSet | explicitList | of | controlExpression );
    public final CgsuiteParser.primaryExpr_return primaryExpr() throws RecognitionException {
        CgsuiteParser.primaryExpr_return retval = new CgsuiteParser.primaryExpr_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token NIL245=null;
        Token THIS246=null;
        Token TRUE247=null;
        Token FALSE248=null;
        Token INTEGER249=null;
        Token INF250=null;
        Token STRING251=null;
        Token PASS252=null;
        Token SUPER253=null;
        Token DOT254=null;
        Token ERROR255=null;
        Token LPAREN256=null;
        Token RPAREN258=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        CgsuiteParser.generalizedId_return id = null;

        CgsuiteParser.statementSequence_return statementSequence257 = null;

        CgsuiteParser.statementSequence_return statementSequence260 = null;

        CgsuiteParser.explicitGame_return explicitGame262 = null;

        CgsuiteParser.explicitMap_return explicitMap263 = null;

        CgsuiteParser.generalizedId_return generalizedId264 = null;

        CgsuiteParser.explicitSet_return explicitSet265 = null;

        CgsuiteParser.explicitList_return explicitList266 = null;

        CgsuiteParser.of_return of267 = null;

        CgsuiteParser.controlExpression_return controlExpression268 = null;


        CgsuiteTree NIL245_tree=null;
        CgsuiteTree THIS246_tree=null;
        CgsuiteTree TRUE247_tree=null;
        CgsuiteTree FALSE248_tree=null;
        CgsuiteTree INTEGER249_tree=null;
        CgsuiteTree INF250_tree=null;
        CgsuiteTree STRING251_tree=null;
        CgsuiteTree PASS252_tree=null;
        CgsuiteTree SUPER253_tree=null;
        CgsuiteTree DOT254_tree=null;
        CgsuiteTree ERROR255_tree=null;
        CgsuiteTree LPAREN256_tree=null;
        CgsuiteTree RPAREN258_tree=null;
        CgsuiteTree LPAREN259_tree=null;
        CgsuiteTree RPAREN261_tree=null;
        RewriteRuleTokenStream stream_SUPER=new RewriteRuleTokenStream(adaptor,"token SUPER");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_generalizedId=new RewriteRuleSubtreeStream(adaptor,"rule generalizedId");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:549:2: ( NIL | THIS | TRUE | FALSE | INTEGER | INF | STRING | PASS | SUPER DOT id= generalizedId -> ^( DOT THIS[$SUPER] $id) | ERROR LPAREN statementSequence RPAREN | LPAREN statementSequence RPAREN | ( ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES )=> explicitGame | ( LBRACE ( expression )? BIGRARROW )=> explicitMap | generalizedId | explicitSet | explicitList | of | controlExpression )
            int alt69=18;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:549:4: NIL
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    NIL245=(Token)match(input,NIL,FOLLOW_NIL_in_primaryExpr3524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NIL245_tree = (CgsuiteTree)adaptor.create(NIL245);
                    adaptor.addChild(root_0, NIL245_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:550:4: THIS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    THIS246=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpr3529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS246_tree = (CgsuiteTree)adaptor.create(THIS246);
                    adaptor.addChild(root_0, THIS246_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:551:4: TRUE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    TRUE247=(Token)match(input,TRUE,FOLLOW_TRUE_in_primaryExpr3534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE247_tree = (CgsuiteTree)adaptor.create(TRUE247);
                    adaptor.addChild(root_0, TRUE247_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:552:4: FALSE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    FALSE248=(Token)match(input,FALSE,FOLLOW_FALSE_in_primaryExpr3539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE248_tree = (CgsuiteTree)adaptor.create(FALSE248);
                    adaptor.addChild(root_0, FALSE248_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:553:4: INTEGER
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    INTEGER249=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_primaryExpr3544); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER249_tree = (CgsuiteTree)adaptor.create(INTEGER249);
                    adaptor.addChild(root_0, INTEGER249_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:554:7: INF
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    INF250=(Token)match(input,INF,FOLLOW_INF_in_primaryExpr3552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INF250_tree = (CgsuiteTree)adaptor.create(INF250);
                    adaptor.addChild(root_0, INF250_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:555:4: STRING
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    STRING251=(Token)match(input,STRING,FOLLOW_STRING_in_primaryExpr3557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING251_tree = (CgsuiteTree)adaptor.create(STRING251);
                    adaptor.addChild(root_0, STRING251_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:556:7: PASS
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    PASS252=(Token)match(input,PASS,FOLLOW_PASS_in_primaryExpr3565); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PASS252_tree = (CgsuiteTree)adaptor.create(PASS252);
                    adaptor.addChild(root_0, PASS252_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:557:7: SUPER DOT id= generalizedId
                    {
                    SUPER253=(Token)match(input,SUPER,FOLLOW_SUPER_in_primaryExpr3573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUPER.add(SUPER253);

                    DOT254=(Token)match(input,DOT,FOLLOW_DOT_in_primaryExpr3575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT254);

                    pushFollow(FOLLOW_generalizedId_in_primaryExpr3579);
                    id=generalizedId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_generalizedId.add(id.getTree());
                    if ( state.backtracking==0 ) {
                       (id!=null?((CgsuiteTree)id.tree):null).getToken().setText("super$" + (id!=null?((CgsuiteTree)id.tree):null).getText()); 
                    }


                    // AST REWRITE
                    // elements: id, DOT
                    // token labels: 
                    // rule labels: id, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 557:98: -> ^( DOT THIS[$SUPER] $id)
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:557:101: ^( DOT THIS[$SUPER] $id)
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

                        adaptor.addChild(root_1, (CgsuiteTree)adaptor.create(THIS, SUPER253));
                        adaptor.addChild(root_1, stream_id.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:558:7: ERROR LPAREN statementSequence RPAREN
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    ERROR255=(Token)match(input,ERROR,FOLLOW_ERROR_in_primaryExpr3601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ERROR255_tree = (CgsuiteTree)adaptor.create(ERROR255);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(ERROR255_tree, root_0);
                    }
                    LPAREN256=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpr3604); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementSequence_in_primaryExpr3607);
                    statementSequence257=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence257.getTree());
                    RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpr3609); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:559:4: LPAREN statementSequence RPAREN
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpr3615); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementSequence_in_primaryExpr3618);
                    statementSequence260=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence260.getTree());
                    RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpr3620); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:7: ( ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES )=> explicitGame
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_explicitGame_in_primaryExpr3645);
                    explicitGame262=explicitGame();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGame262.getTree());

                    }
                    break;
                case 13 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:561:4: ( LBRACE ( expression )? BIGRARROW )=> explicitMap
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_explicitMap_in_primaryExpr3661);
                    explicitMap263=explicitMap();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitMap263.getTree());

                    }
                    break;
                case 14 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:562:4: generalizedId
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_generalizedId_in_primaryExpr3666);
                    generalizedId264=generalizedId();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, generalizedId264.getTree());

                    }
                    break;
                case 15 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:563:4: explicitSet
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_explicitSet_in_primaryExpr3671);
                    explicitSet265=explicitSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitSet265.getTree());

                    }
                    break;
                case 16 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:564:4: explicitList
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_explicitList_in_primaryExpr3676);
                    explicitList266=explicitList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitList266.getTree());

                    }
                    break;
                case 17 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:565:7: of
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_of_in_primaryExpr3684);
                    of267=of();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, of267.getTree());

                    }
                    break;
                case 18 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:566:7: controlExpression
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_controlExpression_in_primaryExpr3692);
                    controlExpression268=controlExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, controlExpression268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpr"

    public static class explicitGame_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitGame"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:569:1: explicitGame : ( IDENTIFIER explicitGameBraces -> ^( NODE_LABEL IDENTIFIER explicitGameBraces ) | explicitGameBraces );
    public final CgsuiteParser.explicitGame_return explicitGame() throws RecognitionException {
        CgsuiteParser.explicitGame_return retval = new CgsuiteParser.explicitGame_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER269=null;
        CgsuiteParser.explicitGameBraces_return explicitGameBraces270 = null;

        CgsuiteParser.explicitGameBraces_return explicitGameBraces271 = null;


        CgsuiteTree IDENTIFIER269_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_explicitGameBraces=new RewriteRuleSubtreeStream(adaptor,"rule explicitGameBraces");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:570:5: ( IDENTIFIER explicitGameBraces -> ^( NODE_LABEL IDENTIFIER explicitGameBraces ) | explicitGameBraces )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENTIFIER) ) {
                alt70=1;
            }
            else if ( (LA70_0==LBRACE||LA70_0==SQUOTE) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:570:7: IDENTIFIER explicitGameBraces
                    {
                    IDENTIFIER269=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_explicitGame3706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER269);

                    pushFollow(FOLLOW_explicitGameBraces_in_explicitGame3708);
                    explicitGameBraces270=explicitGameBraces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_explicitGameBraces.add(explicitGameBraces270.getTree());


                    // AST REWRITE
                    // elements: IDENTIFIER, explicitGameBraces
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 570:37: -> ^( NODE_LABEL IDENTIFIER explicitGameBraces )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:570:40: ^( NODE_LABEL IDENTIFIER explicitGameBraces )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(NODE_LABEL, "NODE_LABEL"), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, stream_explicitGameBraces.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:571:7: explicitGameBraces
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_explicitGameBraces_in_explicitGame3726);
                    explicitGameBraces271=explicitGameBraces();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, explicitGameBraces271.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitGame"

    public static class explicitGameBraces_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitGameBraces"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:574:1: explicitGameBraces : ( SQUOTE LBRACE slashExpression RBRACE SQUOTE | LBRACE slashExpression RBRACE );
    public final CgsuiteParser.explicitGameBraces_return explicitGameBraces() throws RecognitionException {
        CgsuiteParser.explicitGameBraces_return retval = new CgsuiteParser.explicitGameBraces_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token SQUOTE272=null;
        Token LBRACE273=null;
        Token RBRACE275=null;
        Token SQUOTE276=null;
        Token LBRACE277=null;
        Token RBRACE279=null;
        CgsuiteParser.slashExpression_return slashExpression274 = null;

        CgsuiteParser.slashExpression_return slashExpression278 = null;


        CgsuiteTree SQUOTE272_tree=null;
        CgsuiteTree LBRACE273_tree=null;
        CgsuiteTree RBRACE275_tree=null;
        CgsuiteTree SQUOTE276_tree=null;
        CgsuiteTree LBRACE277_tree=null;
        CgsuiteTree RBRACE279_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:575:5: ( SQUOTE LBRACE slashExpression RBRACE SQUOTE | LBRACE slashExpression RBRACE )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==SQUOTE) ) {
                alt71=1;
            }
            else if ( (LA71_0==LBRACE) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:575:7: SQUOTE LBRACE slashExpression RBRACE SQUOTE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    SQUOTE272=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_explicitGameBraces3743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SQUOTE272_tree = (CgsuiteTree)adaptor.create(SQUOTE272);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(SQUOTE272_tree, root_0);
                    }
                    LBRACE273=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_explicitGameBraces3746); if (state.failed) return retval;
                    pushFollow(FOLLOW_slashExpression_in_explicitGameBraces3749);
                    slashExpression274=slashExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slashExpression274.getTree());
                    RBRACE275=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_explicitGameBraces3751); if (state.failed) return retval;
                    SQUOTE276=(Token)match(input,SQUOTE,FOLLOW_SQUOTE_in_explicitGameBraces3754); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:576:7: LBRACE slashExpression RBRACE
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    LBRACE277=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_explicitGameBraces3763); if (state.failed) return retval;
                    pushFollow(FOLLOW_slashExpression_in_explicitGameBraces3766);
                    slashExpression278=slashExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, slashExpression278.getTree());
                    RBRACE279=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_explicitGameBraces3768); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitGameBraces"

    public static class slashExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "slashExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:579:1: slashExpression : ( ( expressionList SLASHES )=>lo= expressionList SLASHES ro= slashExpression -> | lo= expressionList -> $lo);
    public final CgsuiteParser.slashExpression_return slashExpression() throws RecognitionException {
        CgsuiteParser.slashExpression_return retval = new CgsuiteParser.slashExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token SLASHES280=null;
        CgsuiteParser.expressionList_return lo = null;

        CgsuiteParser.slashExpression_return ro = null;


        CgsuiteTree SLASHES280_tree=null;
        RewriteRuleTokenStream stream_SLASHES=new RewriteRuleTokenStream(adaptor,"token SLASHES");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_slashExpression=new RewriteRuleSubtreeStream(adaptor,"rule slashExpression");

                CommonTree newTree = null;
            
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:584:5: ( ( expressionList SLASHES )=>lo= expressionList SLASHES ro= slashExpression -> | lo= expressionList -> $lo)
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:584:7: ( expressionList SLASHES )=>lo= expressionList SLASHES ro= slashExpression
                    {
                    pushFollow(FOLLOW_expressionList_in_slashExpression3809);
                    lo=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(lo.getTree());
                    SLASHES280=(Token)match(input,SLASHES,FOLLOW_SLASHES_in_slashExpression3811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHES.add(SLASHES280);

                    pushFollow(FOLLOW_slashExpression_in_slashExpression3815);
                    ro=slashExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_slashExpression.add(ro.getTree());
                    if ( state.backtracking==0 ) {

                              if ((ro!=null?((CgsuiteTree)ro.tree):null).token.getType() != SLASHES ||
                                  (ro!=null?((CgsuiteTree)ro.tree):null).token.getText().length() < SLASHES280.getText().length())
                              {
                                  newTree = (CgsuiteTree) adaptor.create(SLASHES280);
                                  adaptor.addChild(newTree, (lo!=null?((CgsuiteTree)lo.tree):null));
                                  adaptor.addChild(newTree, (ro!=null?((CgsuiteTree)ro.tree):null));
                              }
                              else
                              {
                                  CommonTree t = (ro!=null?((CgsuiteTree)ro.tree):null);
                                  while (true)
                                  {
                                      if (SLASHES280.getText().length() == t.getText().length())
                                      {
                                          throw new RecognitionException(input);  // Ambiguous pattern of slashes.
                                      }
                                      else if (t.getChild(0).getType() != SLASHES ||
                                               t.getChild(0).getText().length() < SLASHES280.getText().length())
                                      {
                                          break;
                                      }
                                      t = (CgsuiteTree) adaptor.getChild(t, 0);
                                  }
                                  CommonTree tLeft  = (CgsuiteTree) adaptor.getChild(t, 0);
                                  CommonTree tRight = (CgsuiteTree) adaptor.getChild(t, 1);
                                  CommonTree tRightNew = (CgsuiteTree) adaptor.create(SLASHES280);
                                  adaptor.addChild(tRightNew, (lo!=null?((CgsuiteTree)lo.tree):null));
                                  adaptor.addChild(tRightNew, tLeft);
                                  adaptor.setChild(t, 0, tRightNew);
                                  adaptor.setChild(t, 1, tRight);
                                  newTree = (ro!=null?((CgsuiteTree)ro.tree):null);
                              }
                          
                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 618:7: ->
                    {
                        adaptor.addChild(root_0, newTree);

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:619:7: lo= expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_slashExpression3835);
                    lo=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionList.add(lo.getTree());


                    // AST REWRITE
                    // elements: lo
                    // token labels: 
                    // rule labels: lo, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_lo=new RewriteRuleSubtreeStream(adaptor,"rule lo",lo!=null?lo.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 619:25: -> $lo
                    {
                        adaptor.addChild(root_0, stream_lo.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "slashExpression"

    public static class explicitMap_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitMap"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:622:1: explicitMap : LBRACE ( mapEntry ( COMMA mapEntry )* | BIGRARROW ) RBRACE -> ^( EXPLICIT_MAP ( mapEntry )* ) ;
    public final CgsuiteParser.explicitMap_return explicitMap() throws RecognitionException {
        CgsuiteParser.explicitMap_return retval = new CgsuiteParser.explicitMap_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LBRACE281=null;
        Token COMMA283=null;
        Token BIGRARROW285=null;
        Token RBRACE286=null;
        CgsuiteParser.mapEntry_return mapEntry282 = null;

        CgsuiteParser.mapEntry_return mapEntry284 = null;


        CgsuiteTree LBRACE281_tree=null;
        CgsuiteTree COMMA283_tree=null;
        CgsuiteTree BIGRARROW285_tree=null;
        CgsuiteTree RBRACE286_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_BIGRARROW=new RewriteRuleTokenStream(adaptor,"token BIGRARROW");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_mapEntry=new RewriteRuleSubtreeStream(adaptor,"rule mapEntry");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:2: ( LBRACE ( mapEntry ( COMMA mapEntry )* | BIGRARROW ) RBRACE -> ^( EXPLICIT_MAP ( mapEntry )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:4: LBRACE ( mapEntry ( COMMA mapEntry )* | BIGRARROW ) RBRACE
            {
            LBRACE281=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_explicitMap3854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE281);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:11: ( mapEntry ( COMMA mapEntry )* | BIGRARROW )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=PLUS && LA74_0<=AST)||LA74_0==LPAREN||LA74_0==LBRACKET||LA74_0==LBRACE||LA74_0==SQUOTE||(LA74_0>=CARET && LA74_0<=VEE)||LA74_0==BEGIN||LA74_0==BY||LA74_0==DO||LA74_0==ERROR||LA74_0==FALSE||LA74_0==FOR||LA74_0==FROM||LA74_0==IF||LA74_0==INF||LA74_0==LISTOF||(LA74_0>=NIL && LA74_0<=OP)||LA74_0==PASS||LA74_0==SETOF||(LA74_0>=SUMOF && LA74_0<=TABLEOF)||(LA74_0>=THIS && LA74_0<=TRUE)||(LA74_0>=WHERE && LA74_0<=WHILE)||(LA74_0>=IDENTIFIER && LA74_0<=INTEGER)) ) {
                alt74=1;
            }
            else if ( (LA74_0==BIGRARROW) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:12: mapEntry ( COMMA mapEntry )*
                    {
                    pushFollow(FOLLOW_mapEntry_in_explicitMap3857);
                    mapEntry282=mapEntry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_mapEntry.add(mapEntry282.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:21: ( COMMA mapEntry )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==COMMA) ) {
                            alt73=1;
                        }


                        switch (alt73) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:22: COMMA mapEntry
                    	    {
                    	    COMMA283=(Token)match(input,COMMA,FOLLOW_COMMA_in_explicitMap3860); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA283);

                    	    pushFollow(FOLLOW_mapEntry_in_explicitMap3862);
                    	    mapEntry284=mapEntry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_mapEntry.add(mapEntry284.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:41: BIGRARROW
                    {
                    BIGRARROW285=(Token)match(input,BIGRARROW,FOLLOW_BIGRARROW_in_explicitMap3868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BIGRARROW.add(BIGRARROW285);


                    }
                    break;

            }

            RBRACE286=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_explicitMap3871); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE286);



            // AST REWRITE
            // elements: mapEntry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 623:59: -> ^( EXPLICIT_MAP ( mapEntry )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:62: ^( EXPLICIT_MAP ( mapEntry )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(EXPLICIT_MAP, "EXPLICIT_MAP"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:623:77: ( mapEntry )*
                while ( stream_mapEntry.hasNext() ) {
                    adaptor.addChild(root_1, stream_mapEntry.nextTree());

                }
                stream_mapEntry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitMap"

    public static class mapEntry_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mapEntry"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:626:1: mapEntry : expression BIGRARROW expression ;
    public final CgsuiteParser.mapEntry_return mapEntry() throws RecognitionException {
        CgsuiteParser.mapEntry_return retval = new CgsuiteParser.mapEntry_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token BIGRARROW288=null;
        CgsuiteParser.expression_return expression287 = null;

        CgsuiteParser.expression_return expression289 = null;


        CgsuiteTree BIGRARROW288_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:627:2: ( expression BIGRARROW expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:627:4: expression BIGRARROW expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_mapEntry3891);
            expression287=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression287.getTree());
            BIGRARROW288=(Token)match(input,BIGRARROW,FOLLOW_BIGRARROW_in_mapEntry3893); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BIGRARROW288_tree = (CgsuiteTree)adaptor.create(BIGRARROW288);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(BIGRARROW288_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_mapEntry3896);
            expression289=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression289.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mapEntry"

    public static class explicitSet_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitSet"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:630:1: explicitSet : LBRACE ( expression ( COMMA expression )* )? RBRACE -> ^( EXPLICIT_SET ( expression )* ) ;
    public final CgsuiteParser.explicitSet_return explicitSet() throws RecognitionException {
        CgsuiteParser.explicitSet_return retval = new CgsuiteParser.explicitSet_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LBRACE290=null;
        Token COMMA292=null;
        Token RBRACE294=null;
        CgsuiteParser.expression_return expression291 = null;

        CgsuiteParser.expression_return expression293 = null;


        CgsuiteTree LBRACE290_tree=null;
        CgsuiteTree COMMA292_tree=null;
        CgsuiteTree RBRACE294_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:2: ( LBRACE ( expression ( COMMA expression )* )? RBRACE -> ^( EXPLICIT_SET ( expression )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:4: LBRACE ( expression ( COMMA expression )* )? RBRACE
            {
            LBRACE290=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_explicitSet3907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE290);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:11: ( expression ( COMMA expression )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=PLUS && LA76_0<=AST)||LA76_0==LPAREN||LA76_0==LBRACKET||LA76_0==LBRACE||LA76_0==SQUOTE||(LA76_0>=CARET && LA76_0<=VEE)||LA76_0==BEGIN||LA76_0==BY||LA76_0==DO||LA76_0==ERROR||LA76_0==FALSE||LA76_0==FOR||LA76_0==FROM||LA76_0==IF||LA76_0==INF||LA76_0==LISTOF||(LA76_0>=NIL && LA76_0<=OP)||LA76_0==PASS||LA76_0==SETOF||(LA76_0>=SUMOF && LA76_0<=TABLEOF)||(LA76_0>=THIS && LA76_0<=TRUE)||(LA76_0>=WHERE && LA76_0<=WHILE)||(LA76_0>=IDENTIFIER && LA76_0<=INTEGER)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:12: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_explicitSet3910);
                    expression291=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression291.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:23: ( COMMA expression )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==COMMA) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:24: COMMA expression
                    	    {
                    	    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_explicitSet3913); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA292);

                    	    pushFollow(FOLLOW_expression_in_explicitSet3915);
                    	    expression293=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression293.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE294=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_explicitSet3921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE294);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 631:52: -> ^( EXPLICIT_SET ( expression )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:55: ^( EXPLICIT_SET ( expression )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(EXPLICIT_SET, "EXPLICIT_SET"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:631:70: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitSet"

    public static class explicitList_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitList"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:634:1: explicitList : LBRACKET ( expression ( COMMA expression )* )? RBRACKET -> ^( EXPLICIT_LIST ( expression )* ) ;
    public final CgsuiteParser.explicitList_return explicitList() throws RecognitionException {
        CgsuiteParser.explicitList_return retval = new CgsuiteParser.explicitList_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LBRACKET295=null;
        Token COMMA297=null;
        Token RBRACKET299=null;
        CgsuiteParser.expression_return expression296 = null;

        CgsuiteParser.expression_return expression298 = null;


        CgsuiteTree LBRACKET295_tree=null;
        CgsuiteTree COMMA297_tree=null;
        CgsuiteTree RBRACKET299_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:2: ( LBRACKET ( expression ( COMMA expression )* )? RBRACKET -> ^( EXPLICIT_LIST ( expression )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:4: LBRACKET ( expression ( COMMA expression )* )? RBRACKET
            {
            LBRACKET295=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_explicitList3941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET295);

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:13: ( expression ( COMMA expression )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=PLUS && LA78_0<=AST)||LA78_0==LPAREN||LA78_0==LBRACKET||LA78_0==LBRACE||LA78_0==SQUOTE||(LA78_0>=CARET && LA78_0<=VEE)||LA78_0==BEGIN||LA78_0==BY||LA78_0==DO||LA78_0==ERROR||LA78_0==FALSE||LA78_0==FOR||LA78_0==FROM||LA78_0==IF||LA78_0==INF||LA78_0==LISTOF||(LA78_0>=NIL && LA78_0<=OP)||LA78_0==PASS||LA78_0==SETOF||(LA78_0>=SUMOF && LA78_0<=TABLEOF)||(LA78_0>=THIS && LA78_0<=TRUE)||(LA78_0>=WHERE && LA78_0<=WHILE)||(LA78_0>=IDENTIFIER && LA78_0<=INTEGER)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:14: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_explicitList3944);
                    expression296=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression296.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:25: ( COMMA expression )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==COMMA) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:26: COMMA expression
                    	    {
                    	    COMMA297=(Token)match(input,COMMA,FOLLOW_COMMA_in_explicitList3947); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA297);

                    	    pushFollow(FOLLOW_expression_in_explicitList3949);
                    	    expression298=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression298.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACKET299=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_explicitList3955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET299);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 635:56: -> ^( EXPLICIT_LIST ( expression )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:59: ^( EXPLICIT_LIST ( expression )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(EXPLICIT_LIST, "EXPLICIT_LIST"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:635:75: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "explicitList"

    public static class of_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "of"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:638:1: of : ofToken LPAREN expression ( inLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) ) | doLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) ) ) ;
    public final CgsuiteParser.of_return of() throws RecognitionException {
        CgsuiteParser.of_return retval = new CgsuiteParser.of_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token LPAREN301=null;
        Token RPAREN304=null;
        Token RPAREN306=null;
        CgsuiteParser.ofToken_return ofToken300 = null;

        CgsuiteParser.expression_return expression302 = null;

        CgsuiteParser.inLoopAntecedent_return inLoopAntecedent303 = null;

        CgsuiteParser.doLoopAntecedent_return doLoopAntecedent305 = null;


        CgsuiteTree LPAREN301_tree=null;
        CgsuiteTree RPAREN304_tree=null;
        CgsuiteTree RPAREN306_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ofToken=new RewriteRuleSubtreeStream(adaptor,"rule ofToken");
        RewriteRuleSubtreeStream stream_inLoopAntecedent=new RewriteRuleSubtreeStream(adaptor,"rule inLoopAntecedent");
        RewriteRuleSubtreeStream stream_doLoopAntecedent=new RewriteRuleSubtreeStream(adaptor,"rule doLoopAntecedent");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:5: ( ofToken LPAREN expression ( inLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) ) | doLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) ) ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:7: ofToken LPAREN expression ( inLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) ) | doLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) ) )
            {
            pushFollow(FOLLOW_ofToken_in_of3978);
            ofToken300=ofToken();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ofToken.add(ofToken300.getTree());
            LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_of3980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN301);

            pushFollow(FOLLOW_expression_in_of3982);
            expression302=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression302.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:33: ( inLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) ) | doLoopAntecedent RPAREN -> ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==FOR) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==IDENTIFIER) ) {
                    int LA79_3 = input.LA(3);

                    if ( (LA79_3==IN) ) {
                        alt79=1;
                    }
                    else if ( (LA79_3==RPAREN||LA79_3==BY||LA79_3==FROM||LA79_3==TO||(LA79_3>=WHERE && LA79_3<=WHILE)) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA79_0==RPAREN||LA79_0==BY||LA79_0==FROM||LA79_0==TO||(LA79_0>=WHERE && LA79_0<=WHILE)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:35: inLoopAntecedent RPAREN
                    {
                    pushFollow(FOLLOW_inLoopAntecedent_in_of3986);
                    inLoopAntecedent303=inLoopAntecedent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inLoopAntecedent.add(inLoopAntecedent303.getTree());
                    RPAREN304=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_of3988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN304);



                    // AST REWRITE
                    // elements: expression, inLoopAntecedent, ofToken
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 639:59: -> ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:62: ^( DO[$ofToken.tree.getToken()] ofToken inLoopAntecedent ^( STATEMENT_SEQUENCE expression ) )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(DO, (ofToken300!=null?((CgsuiteTree)ofToken300.tree):null).getToken()), root_1);

                        adaptor.addChild(root_1, stream_ofToken.nextTree());
                        adaptor.addChild(root_1, stream_inLoopAntecedent.nextTree());
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:639:118: ^( STATEMENT_SEQUENCE expression )
                        {
                        CgsuiteTree root_2 = (CgsuiteTree)adaptor.nil();
                        root_2 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(STATEMENT_SEQUENCE, "STATEMENT_SEQUENCE"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:640:35: doLoopAntecedent RPAREN
                    {
                    pushFollow(FOLLOW_doLoopAntecedent_in_of4041);
                    doLoopAntecedent305=doLoopAntecedent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doLoopAntecedent.add(doLoopAntecedent305.getTree());
                    RPAREN306=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_of4043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN306);

                    if ( state.backtracking==0 ) {
                       if ((doLoopAntecedent305!=null?((CgsuiteTree)doLoopAntecedent305.tree):null) == null)
                                                              throw new RecognitionException(input);
                                                          
                    }


                    // AST REWRITE
                    // elements: doLoopAntecedent, expression, ofToken
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 644:39: -> ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) )
                    {
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:644:42: ^( DO[$ofToken.tree.getToken()] ofToken ( doLoopAntecedent )? ^( STATEMENT_SEQUENCE expression ) )
                        {
                        CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                        root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(DO, (ofToken300!=null?((CgsuiteTree)ofToken300.tree):null).getToken()), root_1);

                        adaptor.addChild(root_1, stream_ofToken.nextTree());
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:644:81: ( doLoopAntecedent )?
                        if ( stream_doLoopAntecedent.hasNext() ) {
                            adaptor.addChild(root_1, stream_doLoopAntecedent.nextTree());

                        }
                        stream_doLoopAntecedent.reset();
                        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:644:99: ^( STATEMENT_SEQUENCE expression )
                        {
                        CgsuiteTree root_2 = (CgsuiteTree)adaptor.nil();
                        root_2 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(STATEMENT_SEQUENCE, "STATEMENT_SEQUENCE"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "of"

    public static class ofToken_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ofToken"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:648:1: ofToken : ( SETOF | LISTOF | TABLEOF | SUMOF );
    public final CgsuiteParser.ofToken_return ofToken() throws RecognitionException {
        CgsuiteParser.ofToken_return retval = new CgsuiteParser.ofToken_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token set307=null;

        CgsuiteTree set307_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:649:5: ( SETOF | LISTOF | TABLEOF | SUMOF )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            set307=(Token)input.LT(1);
            if ( input.LA(1)==LISTOF||input.LA(1)==SETOF||input.LA(1)==SUMOF||input.LA(1)==TABLEOF ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(set307));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ofToken"

    public static class expressionList_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:652:1: expressionList : ( expression ( COMMA expression )* )? -> ^( EXPRESSION_LIST ( expression )* ) ;
    public final CgsuiteParser.expressionList_return expressionList() throws RecognitionException {
        CgsuiteParser.expressionList_return retval = new CgsuiteParser.expressionList_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token COMMA309=null;
        CgsuiteParser.expression_return expression308 = null;

        CgsuiteParser.expression_return expression310 = null;


        CgsuiteTree COMMA309_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:5: ( ( expression ( COMMA expression )* )? -> ^( EXPRESSION_LIST ( expression )* ) )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:7: ( expression ( COMMA expression )* )?
            {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:7: ( expression ( COMMA expression )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=PLUS && LA81_0<=AST)||LA81_0==LPAREN||LA81_0==LBRACKET||LA81_0==LBRACE||LA81_0==SQUOTE||(LA81_0>=CARET && LA81_0<=VEE)||LA81_0==BEGIN||LA81_0==BY||LA81_0==DO||LA81_0==ERROR||LA81_0==FALSE||LA81_0==FOR||LA81_0==FROM||LA81_0==IF||LA81_0==INF||LA81_0==LISTOF||(LA81_0>=NIL && LA81_0<=OP)||LA81_0==PASS||LA81_0==SETOF||(LA81_0>=SUMOF && LA81_0<=TABLEOF)||(LA81_0>=THIS && LA81_0<=TRUE)||(LA81_0>=WHERE && LA81_0<=WHILE)||(LA81_0>=IDENTIFIER && LA81_0<=INTEGER)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:8: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expressionList4217);
                    expression308=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression308.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:19: ( COMMA expression )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==COMMA) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:20: COMMA expression
                    	    {
                    	    COMMA309=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList4220); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA309);

                    	    pushFollow(FOLLOW_expression_in_expressionList4222);
                    	    expression310=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression310.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CgsuiteTree)adaptor.nil();
            // 653:41: -> ^( EXPRESSION_LIST ( expression )* )
            {
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:44: ^( EXPRESSION_LIST ( expression )* )
                {
                CgsuiteTree root_1 = (CgsuiteTree)adaptor.nil();
                root_1 = (CgsuiteTree)adaptor.becomeRoot((CgsuiteTree)adaptor.create(EXPRESSION_LIST, "EXPRESSION_LIST"), root_1);

                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:653:62: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class controlExpression_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "controlExpression"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:656:1: controlExpression : ( IF expression THEN statementSequence ( elseifClause )? END | doLoopAntecedent DO statementSequence END | inLoopAntecedent DO statementSequence END | BEGIN statementSequence END );
    public final CgsuiteParser.controlExpression_return controlExpression() throws RecognitionException {
        CgsuiteParser.controlExpression_return retval = new CgsuiteParser.controlExpression_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IF311=null;
        Token THEN313=null;
        Token END316=null;
        Token DO318=null;
        Token END320=null;
        Token DO322=null;
        Token END324=null;
        Token BEGIN325=null;
        Token END327=null;
        CgsuiteParser.expression_return expression312 = null;

        CgsuiteParser.statementSequence_return statementSequence314 = null;

        CgsuiteParser.elseifClause_return elseifClause315 = null;

        CgsuiteParser.doLoopAntecedent_return doLoopAntecedent317 = null;

        CgsuiteParser.statementSequence_return statementSequence319 = null;

        CgsuiteParser.inLoopAntecedent_return inLoopAntecedent321 = null;

        CgsuiteParser.statementSequence_return statementSequence323 = null;

        CgsuiteParser.statementSequence_return statementSequence326 = null;


        CgsuiteTree IF311_tree=null;
        CgsuiteTree THEN313_tree=null;
        CgsuiteTree END316_tree=null;
        CgsuiteTree DO318_tree=null;
        CgsuiteTree END320_tree=null;
        CgsuiteTree DO322_tree=null;
        CgsuiteTree END324_tree=null;
        CgsuiteTree BEGIN325_tree=null;
        CgsuiteTree END327_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:657:2: ( IF expression THEN statementSequence ( elseifClause )? END | doLoopAntecedent DO statementSequence END | inLoopAntecedent DO statementSequence END | BEGIN statementSequence END )
            int alt83=4;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt83=1;
                }
                break;
            case FOR:
                {
                int LA83_2 = input.LA(2);

                if ( (LA83_2==IDENTIFIER) ) {
                    int LA83_5 = input.LA(3);

                    if ( (LA83_5==BY||LA83_5==DO||LA83_5==FROM||LA83_5==TO||(LA83_5>=WHERE && LA83_5<=WHILE)) ) {
                        alt83=2;
                    }
                    else if ( (LA83_5==IN) ) {
                        alt83=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 83, 2, input);

                    throw nvae;
                }
                }
                break;
            case BY:
            case DO:
            case FROM:
            case TO:
            case WHERE:
            case WHILE:
                {
                alt83=2;
                }
                break;
            case BEGIN:
                {
                alt83=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:657:4: IF expression THEN statementSequence ( elseifClause )? END
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    IF311=(Token)match(input,IF,FOLLOW_IF_in_controlExpression4249); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF311_tree = (CgsuiteTree)adaptor.create(IF311);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(IF311_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_controlExpression4252);
                    expression312=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression312.getTree());
                    THEN313=(Token)match(input,THEN,FOLLOW_THEN_in_controlExpression4254); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementSequence_in_controlExpression4257);
                    statementSequence314=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence314.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:657:43: ( elseifClause )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=ELSE && LA82_0<=ELSEIF)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:657:43: elseifClause
                            {
                            pushFollow(FOLLOW_elseifClause_in_controlExpression4259);
                            elseifClause315=elseifClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, elseifClause315.getTree());

                            }
                            break;

                    }

                    END316=(Token)match(input,END,FOLLOW_END_in_controlExpression4262); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:658:4: doLoopAntecedent DO statementSequence END
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_doLoopAntecedent_in_controlExpression4268);
                    doLoopAntecedent317=doLoopAntecedent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doLoopAntecedent317.getTree());
                    DO318=(Token)match(input,DO,FOLLOW_DO_in_controlExpression4270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO318_tree = (CgsuiteTree)adaptor.create(DO318);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(DO318_tree, root_0);
                    }
                    pushFollow(FOLLOW_statementSequence_in_controlExpression4273);
                    statementSequence319=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence319.getTree());
                    END320=(Token)match(input,END,FOLLOW_END_in_controlExpression4275); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:659:4: inLoopAntecedent DO statementSequence END
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    pushFollow(FOLLOW_inLoopAntecedent_in_controlExpression4281);
                    inLoopAntecedent321=inLoopAntecedent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inLoopAntecedent321.getTree());
                    DO322=(Token)match(input,DO,FOLLOW_DO_in_controlExpression4283); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO322_tree = (CgsuiteTree)adaptor.create(DO322);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(DO322_tree, root_0);
                    }
                    pushFollow(FOLLOW_statementSequence_in_controlExpression4286);
                    statementSequence323=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence323.getTree());
                    END324=(Token)match(input,END,FOLLOW_END_in_controlExpression4288); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:660:7: BEGIN statementSequence END
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    BEGIN325=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_controlExpression4297); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementSequence_in_controlExpression4300);
                    statementSequence326=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence326.getTree());
                    END327=(Token)match(input,END,FOLLOW_END_in_controlExpression4302); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "controlExpression"

    public static class doLoopAntecedent_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doLoopAntecedent"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:663:1: doLoopAntecedent : ( forClause )? ( fromClause )? ( toClause )? ( byClause )? ( whileClause )? ( whereClause )? ;
    public final CgsuiteParser.doLoopAntecedent_return doLoopAntecedent() throws RecognitionException {
        CgsuiteParser.doLoopAntecedent_return retval = new CgsuiteParser.doLoopAntecedent_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.forClause_return forClause328 = null;

        CgsuiteParser.fromClause_return fromClause329 = null;

        CgsuiteParser.toClause_return toClause330 = null;

        CgsuiteParser.byClause_return byClause331 = null;

        CgsuiteParser.whileClause_return whileClause332 = null;

        CgsuiteParser.whereClause_return whereClause333 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:5: ( ( forClause )? ( fromClause )? ( toClause )? ( byClause )? ( whileClause )? ( whereClause )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:7: ( forClause )? ( fromClause )? ( toClause )? ( byClause )? ( whileClause )? ( whereClause )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:7: ( forClause )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==FOR) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:7: forClause
                    {
                    pushFollow(FOLLOW_forClause_in_doLoopAntecedent4317);
                    forClause328=forClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forClause328.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:18: ( fromClause )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==FROM) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:18: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_doLoopAntecedent4320);
                    fromClause329=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause329.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:30: ( toClause )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==TO) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:30: toClause
                    {
                    pushFollow(FOLLOW_toClause_in_doLoopAntecedent4323);
                    toClause330=toClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, toClause330.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:40: ( byClause )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==BY) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:40: byClause
                    {
                    pushFollow(FOLLOW_byClause_in_doLoopAntecedent4326);
                    byClause331=byClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, byClause331.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:50: ( whileClause )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==WHILE) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:50: whileClause
                    {
                    pushFollow(FOLLOW_whileClause_in_doLoopAntecedent4329);
                    whileClause332=whileClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileClause332.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:63: ( whereClause )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==WHERE) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:664:63: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_doLoopAntecedent4332);
                    whereClause333=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause333.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doLoopAntecedent"

    public static class inLoopAntecedent_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inLoopAntecedent"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:667:1: inLoopAntecedent : forClause inClause ( whileClause )? ( whereClause )? ;
    public final CgsuiteParser.inLoopAntecedent_return inLoopAntecedent() throws RecognitionException {
        CgsuiteParser.inLoopAntecedent_return retval = new CgsuiteParser.inLoopAntecedent_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        CgsuiteParser.forClause_return forClause334 = null;

        CgsuiteParser.inClause_return inClause335 = null;

        CgsuiteParser.whileClause_return whileClause336 = null;

        CgsuiteParser.whereClause_return whereClause337 = null;



        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:5: ( forClause inClause ( whileClause )? ( whereClause )? )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:7: forClause inClause ( whileClause )? ( whereClause )?
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            pushFollow(FOLLOW_forClause_in_inLoopAntecedent4350);
            forClause334=forClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, forClause334.getTree());
            pushFollow(FOLLOW_inClause_in_inLoopAntecedent4352);
            inClause335=inClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inClause335.getTree());
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:26: ( whileClause )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==WHILE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:26: whileClause
                    {
                    pushFollow(FOLLOW_whileClause_in_inLoopAntecedent4354);
                    whileClause336=whileClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileClause336.getTree());

                    }
                    break;

            }

            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:39: ( whereClause )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==WHERE) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:668:39: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_inLoopAntecedent4357);
                    whereClause337=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause337.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inLoopAntecedent"

    public static class forClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:671:1: forClause : FOR IDENTIFIER ;
    public final CgsuiteParser.forClause_return forClause() throws RecognitionException {
        CgsuiteParser.forClause_return retval = new CgsuiteParser.forClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token FOR338=null;
        Token IDENTIFIER339=null;

        CgsuiteTree FOR338_tree=null;
        CgsuiteTree IDENTIFIER339_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:672:2: ( FOR IDENTIFIER )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:672:4: FOR IDENTIFIER
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            FOR338=(Token)match(input,FOR,FOLLOW_FOR_in_forClause4372); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR338_tree = (CgsuiteTree)adaptor.create(FOR338);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(FOR338_tree, root_0);
            }
            IDENTIFIER339=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forClause4375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER339_tree = (CgsuiteTree)adaptor.create(IDENTIFIER339);
            adaptor.addChild(root_0, IDENTIFIER339_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forClause"

    public static class fromClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fromClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:675:1: fromClause : FROM expression ;
    public final CgsuiteParser.fromClause_return fromClause() throws RecognitionException {
        CgsuiteParser.fromClause_return retval = new CgsuiteParser.fromClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token FROM340=null;
        CgsuiteParser.expression_return expression341 = null;


        CgsuiteTree FROM340_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:676:2: ( FROM expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:676:4: FROM expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            FROM340=(Token)match(input,FROM,FOLLOW_FROM_in_fromClause4387); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FROM340_tree = (CgsuiteTree)adaptor.create(FROM340);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(FROM340_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_fromClause4390);
            expression341=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression341.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fromClause"

    public static class toClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "toClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:679:1: toClause : TO expression ;
    public final CgsuiteParser.toClause_return toClause() throws RecognitionException {
        CgsuiteParser.toClause_return retval = new CgsuiteParser.toClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token TO342=null;
        CgsuiteParser.expression_return expression343 = null;


        CgsuiteTree TO342_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:680:5: ( TO expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:680:7: TO expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            TO342=(Token)match(input,TO,FOLLOW_TO_in_toClause4405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TO342_tree = (CgsuiteTree)adaptor.create(TO342);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(TO342_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_toClause4408);
            expression343=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression343.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "toClause"

    public static class byClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "byClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:683:1: byClause : BY expression ;
    public final CgsuiteParser.byClause_return byClause() throws RecognitionException {
        CgsuiteParser.byClause_return retval = new CgsuiteParser.byClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token BY344=null;
        CgsuiteParser.expression_return expression345 = null;


        CgsuiteTree BY344_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:684:5: ( BY expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:684:7: BY expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            BY344=(Token)match(input,BY,FOLLOW_BY_in_byClause4425); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BY344_tree = (CgsuiteTree)adaptor.create(BY344);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(BY344_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_byClause4428);
            expression345=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression345.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "byClause"

    public static class whileClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:687:1: whileClause : WHILE expression ;
    public final CgsuiteParser.whileClause_return whileClause() throws RecognitionException {
        CgsuiteParser.whileClause_return retval = new CgsuiteParser.whileClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token WHILE346=null;
        CgsuiteParser.expression_return expression347 = null;


        CgsuiteTree WHILE346_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:688:5: ( WHILE expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:688:7: WHILE expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            WHILE346=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileClause4446); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE346_tree = (CgsuiteTree)adaptor.create(WHILE346);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(WHILE346_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_whileClause4449);
            expression347=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression347.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileClause"

    public static class whereClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whereClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:691:1: whereClause : WHERE expression ;
    public final CgsuiteParser.whereClause_return whereClause() throws RecognitionException {
        CgsuiteParser.whereClause_return retval = new CgsuiteParser.whereClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token WHERE348=null;
        CgsuiteParser.expression_return expression349 = null;


        CgsuiteTree WHERE348_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:692:5: ( WHERE expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:692:7: WHERE expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            WHERE348=(Token)match(input,WHERE,FOLLOW_WHERE_in_whereClause4463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHERE348_tree = (CgsuiteTree)adaptor.create(WHERE348);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(WHERE348_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_whereClause4466);
            expression349=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression349.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whereClause"

    public static class inClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:695:1: inClause : IN expression ;
    public final CgsuiteParser.inClause_return inClause() throws RecognitionException {
        CgsuiteParser.inClause_return retval = new CgsuiteParser.inClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IN350=null;
        CgsuiteParser.expression_return expression351 = null;


        CgsuiteTree IN350_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:696:5: ( IN expression )
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:696:7: IN expression
            {
            root_0 = (CgsuiteTree)adaptor.nil();

            IN350=(Token)match(input,IN,FOLLOW_IN_in_inClause4483); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IN350_tree = (CgsuiteTree)adaptor.create(IN350);
            root_0 = (CgsuiteTree)adaptor.becomeRoot(IN350_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_inClause4486);
            expression351=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression351.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inClause"

    public static class elseifClause_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseifClause"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:699:1: elseifClause : ( ELSEIF expression THEN statementSequence ( elseifClause )? | ELSE statementSequence );
    public final CgsuiteParser.elseifClause_return elseifClause() throws RecognitionException {
        CgsuiteParser.elseifClause_return retval = new CgsuiteParser.elseifClause_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token ELSEIF352=null;
        Token THEN354=null;
        Token ELSE357=null;
        CgsuiteParser.expression_return expression353 = null;

        CgsuiteParser.statementSequence_return statementSequence355 = null;

        CgsuiteParser.elseifClause_return elseifClause356 = null;

        CgsuiteParser.statementSequence_return statementSequence358 = null;


        CgsuiteTree ELSEIF352_tree=null;
        CgsuiteTree THEN354_tree=null;
        CgsuiteTree ELSE357_tree=null;

        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:700:2: ( ELSEIF expression THEN statementSequence ( elseifClause )? | ELSE statementSequence )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ELSEIF) ) {
                alt93=1;
            }
            else if ( (LA93_0==ELSE) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:700:4: ELSEIF expression THEN statementSequence ( elseifClause )?
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    ELSEIF352=(Token)match(input,ELSEIF,FOLLOW_ELSEIF_in_elseifClause4500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSEIF352_tree = (CgsuiteTree)adaptor.create(ELSEIF352);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(ELSEIF352_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_elseifClause4503);
                    expression353=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression353.getTree());
                    THEN354=(Token)match(input,THEN,FOLLOW_THEN_in_elseifClause4505); if (state.failed) return retval;
                    pushFollow(FOLLOW_statementSequence_in_elseifClause4508);
                    statementSequence355=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence355.getTree());
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:700:47: ( elseifClause )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=ELSE && LA92_0<=ELSEIF)) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:700:47: elseifClause
                            {
                            pushFollow(FOLLOW_elseifClause_in_elseifClause4510);
                            elseifClause356=elseifClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, elseifClause356.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:701:4: ELSE statementSequence
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    ELSE357=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseifClause4516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE357_tree = (CgsuiteTree)adaptor.create(ELSE357);
                    root_0 = (CgsuiteTree)adaptor.becomeRoot(ELSE357_tree, root_0);
                    }
                    pushFollow(FOLLOW_statementSequence_in_elseifClause4519);
                    statementSequence358=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementSequence358.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseifClause"

    public static class generalizedId_return extends ParserRuleReturnScope {
        CgsuiteTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "generalizedId"
    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:704:1: generalizedId : ( IDENTIFIER | OP opc= opCode -> IDENTIFIER[$OP, $OP.getText() + \" \" + $opc.tree.getText()] );
    public final CgsuiteParser.generalizedId_return generalizedId() throws RecognitionException {
        CgsuiteParser.generalizedId_return retval = new CgsuiteParser.generalizedId_return();
        retval.start = input.LT(1);

        CgsuiteTree root_0 = null;

        Token IDENTIFIER359=null;
        Token OP360=null;
        CgsuiteParser.opCode_return opc = null;


        CgsuiteTree IDENTIFIER359_tree=null;
        CgsuiteTree OP360_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleSubtreeStream stream_opCode=new RewriteRuleSubtreeStream(adaptor,"rule opCode");
        try {
            // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:705:5: ( IDENTIFIER | OP opc= opCode -> IDENTIFIER[$OP, $OP.getText() + \" \" + $opc.tree.getText()] )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==IDENTIFIER) ) {
                alt94=1;
            }
            else if ( (LA94_0==OP) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:705:7: IDENTIFIER
                    {
                    root_0 = (CgsuiteTree)adaptor.nil();

                    IDENTIFIER359=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_generalizedId4533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER359_tree = (CgsuiteTree)adaptor.create(IDENTIFIER359);
                    adaptor.addChild(root_0, IDENTIFIER359_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:706:7: OP opc= opCode
                    {
                    OP360=(Token)match(input,OP,FOLLOW_OP_in_generalizedId4541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP.add(OP360);

                    pushFollow(FOLLOW_opCode_in_generalizedId4545);
                    opc=opCode();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_opCode.add(opc.getTree());


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CgsuiteTree)adaptor.nil();
                    // 706:21: -> IDENTIFIER[$OP, $OP.getText() + \" \" + $opc.tree.getText()]
                    {
                        adaptor.addChild(root_0, (CgsuiteTree)adaptor.create(IDENTIFIER, OP360, OP360.getText() + " " + (opc!=null?((CgsuiteTree)opc.tree):null).getText()));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CgsuiteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CgsuiteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "generalizedId"

    // $ANTLR start synpred1_Cgsuite
    public final void synpred1_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:7: ( IF | inLoopAntecedent DO | doLoopAntecedent DO | BEGIN )
        int alt95=4;
        switch ( input.LA(1) ) {
        case IF:
            {
            alt95=1;
            }
            break;
        case FOR:
            {
            int LA95_2 = input.LA(2);

            if ( (LA95_2==IDENTIFIER) ) {
                int LA95_5 = input.LA(3);

                if ( (LA95_5==IN) ) {
                    alt95=2;
                }
                else if ( (LA95_5==BY||LA95_5==DO||LA95_5==FROM||LA95_5==TO||(LA95_5>=WHERE && LA95_5<=WHILE)) ) {
                    alt95=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 95, 5, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 2, input);

                throw nvae;
            }
            }
            break;
        case BY:
        case DO:
        case FROM:
        case TO:
        case WHERE:
        case WHILE:
            {
            alt95=3;
            }
            break;
        case BEGIN:
            {
            alt95=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 95, 0, input);

            throw nvae;
        }

        switch (alt95) {
            case 1 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:8: IF
                {
                match(input,IF,FOLLOW_IF_in_synpred1_Cgsuite2290); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:13: inLoopAntecedent DO
                {
                pushFollow(FOLLOW_inLoopAntecedent_in_synpred1_Cgsuite2294);
                inLoopAntecedent();

                state._fsp--;
                if (state.failed) return ;
                match(input,DO,FOLLOW_DO_in_synpred1_Cgsuite2296); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:35: doLoopAntecedent DO
                {
                pushFollow(FOLLOW_doLoopAntecedent_in_synpred1_Cgsuite2300);
                doLoopAntecedent();

                state._fsp--;
                if (state.failed) return ;
                match(input,DO,FOLLOW_DO_in_synpred1_Cgsuite2302); if (state.failed) return ;

                }
                break;
            case 4 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:375:57: BEGIN
                {
                match(input,BEGIN,FOLLOW_BEGIN_in_synpred1_Cgsuite2306); if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred1_Cgsuite

    // $ANTLR start synpred2_Cgsuite
    public final void synpred2_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:376:7: ( TRY )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:376:8: TRY
        {
        match(input,TRY,FOLLOW_TRY_in_synpred2_Cgsuite2323); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Cgsuite

    // $ANTLR start synpred3_Cgsuite
    public final void synpred3_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:7: ( PLUSMINUS LPAREN expression ( COMMA expression )* RPAREN )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:7: PLUSMINUS LPAREN expression ( COMMA expression )* RPAREN
        {
        match(input,PLUSMINUS,FOLLOW_PLUSMINUS_in_synpred3_Cgsuite2951); if (state.failed) return ;
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_Cgsuite2953); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred3_Cgsuite2955);
        expression();

        state._fsp--;
        if (state.failed) return ;
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:35: ( COMMA expression )*
        loop96:
        do {
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==COMMA) ) {
                alt96=1;
            }


            switch (alt96) {
        	case 1 :
        	    // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:481:36: COMMA expression
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred3_Cgsuite2958); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred3_Cgsuite2960);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop96;
            }
        } while (true);

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred3_Cgsuite2964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Cgsuite

    // $ANTLR start synpred4_Cgsuite
    public final void synpred4_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:530:7: ( ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:530:7: ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr
        {
        if ( (input.LA(1)>=CARET && input.LA(1)<=VEE)||(input.LA(1)>=MULTI_CARET && input.LA(1)<=MULTI_VEE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_starExpr_in_synpred4_Cgsuite3370);
        starExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Cgsuite

    // $ANTLR start synpred5_Cgsuite
    public final void synpred5_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:531:7: ( ( CARET | VEE ) primaryExpr starExpr )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:531:7: ( CARET | VEE ) primaryExpr starExpr
        {
        if ( (input.LA(1)>=CARET && input.LA(1)<=VEE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_primaryExpr_in_synpred5_Cgsuite3387);
        primaryExpr();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_starExpr_in_synpred5_Cgsuite3389);
        starExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Cgsuite

    // $ANTLR start synpred6_Cgsuite
    public final void synpred6_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:532:7: ( ( CARET | VEE ) primaryExpr )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:532:7: ( CARET | VEE ) primaryExpr
        {
        if ( (input.LA(1)>=CARET && input.LA(1)<=VEE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_primaryExpr_in_synpred6_Cgsuite3406);
        primaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Cgsuite

    // $ANTLR start synpred8_Cgsuite
    public final void synpred8_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:7: ( CARET )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:7: CARET
        {
        match(input,CARET,FOLLOW_CARET_in_synpred8_Cgsuite3422); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Cgsuite

    // $ANTLR start synpred9_Cgsuite
    public final void synpred9_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:15: ( MULTI_CARET )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:15: MULTI_CARET
        {
        match(input,MULTI_CARET,FOLLOW_MULTI_CARET_in_synpred9_Cgsuite3426); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Cgsuite

    // $ANTLR start synpred10_Cgsuite
    public final void synpred10_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:29: ( VEE )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:29: VEE
        {
        match(input,VEE,FOLLOW_VEE_in_synpred10_Cgsuite3430); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Cgsuite

    // $ANTLR start synpred11_Cgsuite
    public final void synpred11_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:35: ( MULTI_VEE )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:534:35: MULTI_VEE
        {
        match(input,MULTI_VEE,FOLLOW_MULTI_VEE_in_synpred11_Cgsuite3434); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Cgsuite

    // $ANTLR start synpred12_Cgsuite
    public final void synpred12_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:544:7: ( AST primaryExpr )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:544:7: AST primaryExpr
        {
        match(input,AST,FOLLOW_AST_in_synpred12_Cgsuite3485); if (state.failed) return ;
        pushFollow(FOLLOW_primaryExpr_in_synpred12_Cgsuite3487);
        primaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Cgsuite

    // $ANTLR start synpred13_Cgsuite
    public final void synpred13_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:7: ( ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:8: ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES
        {
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:8: ( IDENTIFIER )?
        int alt97=2;
        int LA97_0 = input.LA(1);

        if ( (LA97_0==IDENTIFIER) ) {
            alt97=1;
        }
        switch (alt97) {
            case 1 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:8: IDENTIFIER
                {
                match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred13_Cgsuite3630); if (state.failed) return ;

                }
                break;

        }

        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:20: ( SQUOTE )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==SQUOTE) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:560:20: SQUOTE
                {
                match(input,SQUOTE,FOLLOW_SQUOTE_in_synpred13_Cgsuite3633); if (state.failed) return ;

                }
                break;

        }

        match(input,LBRACE,FOLLOW_LBRACE_in_synpred13_Cgsuite3636); if (state.failed) return ;
        pushFollow(FOLLOW_expressionList_in_synpred13_Cgsuite3638);
        expressionList();

        state._fsp--;
        if (state.failed) return ;
        match(input,SLASHES,FOLLOW_SLASHES_in_synpred13_Cgsuite3640); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Cgsuite

    // $ANTLR start synpred14_Cgsuite
    public final void synpred14_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:561:4: ( LBRACE ( expression )? BIGRARROW )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:561:5: LBRACE ( expression )? BIGRARROW
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred14_Cgsuite3651); if (state.failed) return ;
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:561:12: ( expression )?
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( ((LA99_0>=PLUS && LA99_0<=AST)||LA99_0==LPAREN||LA99_0==LBRACKET||LA99_0==LBRACE||LA99_0==SQUOTE||(LA99_0>=CARET && LA99_0<=VEE)||LA99_0==BEGIN||LA99_0==BY||LA99_0==DO||LA99_0==ERROR||LA99_0==FALSE||LA99_0==FOR||LA99_0==FROM||LA99_0==IF||LA99_0==INF||LA99_0==LISTOF||(LA99_0>=NIL && LA99_0<=OP)||LA99_0==PASS||LA99_0==SETOF||(LA99_0>=SUMOF && LA99_0<=TABLEOF)||(LA99_0>=THIS && LA99_0<=TRUE)||(LA99_0>=WHERE && LA99_0<=WHILE)||(LA99_0>=IDENTIFIER && LA99_0<=INTEGER)) ) {
            alt99=1;
        }
        switch (alt99) {
            case 1 :
                // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:561:12: expression
                {
                pushFollow(FOLLOW_expression_in_synpred14_Cgsuite3653);
                expression();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,BIGRARROW,FOLLOW_BIGRARROW_in_synpred14_Cgsuite3656); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Cgsuite

    // $ANTLR start synpred15_Cgsuite
    public final void synpred15_Cgsuite_fragment() throws RecognitionException {   
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:584:7: ( expressionList SLASHES )
        // /Users/asiegel/cgsuite-trunk/Language/src/org/cgsuite/lang/parser/Cgsuite.g:584:8: expressionList SLASHES
        {
        pushFollow(FOLLOW_expressionList_in_synpred15_Cgsuite3800);
        expressionList();

        state._fsp--;
        if (state.failed) return ;
        match(input,SLASHES,FOLLOW_SLASHES_in_synpred15_Cgsuite3802); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Cgsuite

    // Delegated rules

    public final boolean synpred11_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Cgsuite() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Cgsuite_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\61\2\uffff";
    static final String DFA2_maxS =
        "\2\126\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\6\uffff\1\3\20\uffff\1\1\5\uffff\1\3\6\uffff\1\3",
            "\1\2\6\uffff\1\3\20\uffff\1\1\5\uffff\1\3\6\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "246:16: ( classDeclaration | enumDeclaration )";
        }
    }
    static final String DFA11_eotS =
        "\11\uffff";
    static final String DFA11_eofS =
        "\11\uffff";
    static final String DFA11_minS =
        "\1\110\1\4\2\110\4\uffff\1\110";
    static final String DFA11_maxS =
        "\1\137\1\173\2\137\4\uffff\1\137";
    static final String DFA11_acceptS =
        "\4\uffff\1\2\1\3\1\4\1\1\1\uffff";
    static final String DFA11_specialS =
        "\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\6\1\3\5\uffff\1\2\2\uffff\1\5\3\uffff\1\1\10\uffff\1\4",
            "\4\7\3\uffff\1\7\1\uffff\1\7\1\uffff\1\7\2\uffff\1\7\1\uffff"+
            "\1\7\2\uffff\2\7\25\uffff\3\7\1\uffff\3\7\2\uffff\1\7\1\uffff"+
            "\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7\2\uffff"+
            "\1\7\2\uffff\1\7\1\6\1\3\1\uffff\3\7\1\uffff\1\2\1\7\1\uffff"+
            "\1\5\1\7\1\uffff\1\7\1\10\3\7\1\uffff\4\7\1\4\2\7\25\uffff\5"+
            "\7",
            "\1\6\1\3\5\uffff\1\2\2\uffff\1\5\3\uffff\1\10\10\uffff\1\4",
            "\1\6\1\3\5\uffff\1\2\2\uffff\1\5\3\uffff\1\10\10\uffff\1\4",
            "",
            "",
            "",
            "",
            "\1\6\1\3\5\uffff\1\2\2\uffff\1\5\3\uffff\1\10\10\uffff\1\4"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "281:1: declaration : ( staticDeclaration | varDeclaration | propertyDeclaration | methodDeclaration );";
        }
    }
    static final String DFA18_eotS =
        "\20\uffff";
    static final String DFA18_eofS =
        "\15\uffff\1\17\2\uffff";
    static final String DFA18_minS =
        "\1\4\13\uffff\1\16\1\4\2\uffff";
    static final String DFA18_maxS =
        "\1\121\13\uffff\1\16\1\174\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff"+
        "\1\14\1\15";
    static final String DFA18_specialS =
        "\20\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\2\1\uffff\1\3\1\4\1\uffff\1\5\2\uffff\1\14\7\uffff\1"+
            "\7\1\uffff\1\6\1\uffff\1\10\12\13\46\uffff\1\11\6\uffff\1\12",
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
            "\1\15",
            "\13\17\1\uffff\1\17\2\uffff\3\17\1\uffff\1\17\1\uffff\13\17"+
            "\1\uffff\1\17\1\uffff\2\17\1\16\1\uffff\1\17\1\uffff\1\17\2"+
            "\uffff\1\17\3\uffff\4\17\4\uffff\2\17\1\uffff\1\17\5\uffff\1"+
            "\17\10\uffff\1\17\13\uffff\1\17\1\uffff\1\17\3\uffff\2\17\32"+
            "\uffff\1\17",
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
            return "318:1: opCode options {greedy=true; } : ( PLUS | MINUS | AST | FSLASH | PERCENT | CARET | COLON | AMPERSAND | NEG | POS | standardRelationalToken | LBRACKET RBRACKET ASSIGN -> OP[$LBRACKET, \"[]:=\"] | LBRACKET RBRACKET -> OP[$LBRACKET, \"[]\"] );";
        }
    }
    static final String DFA37_eotS =
        "\54\uffff";
    static final String DFA37_eofS =
        "\54\uffff";
    static final String DFA37_minS =
        "\1\4\12\0\41\uffff";
    static final String DFA37_maxS =
        "\1\173\12\0\41\uffff";
    static final String DFA37_acceptS =
        "\13\uffff\1\3\35\uffff\1\4\1\1\1\2";
    static final String DFA37_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\41\uffff}>";
    static final String[] DFA37_transitionS = {
            "\4\13\3\uffff\1\13\1\uffff\1\13\1\uffff\1\13\2\uffff\1\13\1"+
            "\uffff\1\51\2\uffff\2\13\25\uffff\1\11\1\13\1\5\1\uffff\2\13"+
            "\1\10\4\uffff\1\13\1\uffff\1\13\1\uffff\1\2\1\uffff\1\3\1\uffff"+
            "\1\1\2\uffff\1\13\2\uffff\1\13\3\uffff\3\13\2\uffff\1\13\2\uffff"+
            "\1\13\1\uffff\1\13\1\uffff\3\13\1\uffff\1\13\1\4\1\13\1\12\1"+
            "\uffff\1\7\1\6\25\uffff\5\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "374:1: statementChain : ( ( IF | inLoopAntecedent DO | doLoopAntecedent DO | BEGIN )=> controlExpression ( statementChain )? | ( TRY )=> tryStatement ( statementChain )? | statement ( SEMI ( statementChain )? )? | SEMI ( statementChain )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Cgsuite()) ) {s = 42;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_Cgsuite()) ) {s = 43;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\20\uffff";
    static final String DFA67_eofS =
        "\2\uffff\1\14\2\uffff\1\17\12\uffff";
    static final String DFA67_minS =
        "\2\7\1\4\1\uffff\1\7\1\4\5\uffff\1\0\2\uffff\1\0\1\uffff";
    static final String DFA67_maxS =
        "\1\173\1\7\1\174\1\uffff\1\7\1\174\5\uffff\1\0\2\uffff\1\0\1\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\1\4\2\uffff\1\11\1\1\1\2\1\3\1\5\1\uffff\1\6\1\7\1\uffff"+
        "\1\10";
    static final String DFA67_specialS =
        "\1\uffff\1\2\2\uffff\1\3\6\uffff\1\0\2\uffff\1\1\1\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\3\3\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\6\4\uffff"+
            "\1\1\1\4\25\uffff\1\6\1\uffff\1\6\3\uffff\1\6\4\uffff\1\6\1"+
            "\uffff\1\6\1\uffff\1\6\1\uffff\1\6\1\uffff\1\6\2\uffff\1\6\2"+
            "\uffff\1\6\3\uffff\1\6\1\uffff\1\6\2\uffff\1\6\4\uffff\1\6\1"+
            "\uffff\3\6\1\uffff\3\6\2\uffff\2\6\25\uffff\2\6\1\2\1\5\1\6",
            "\1\7",
            "\3\14\1\13\7\14\1\uffff\1\14\2\uffff\3\14\1\uffff\1\14\1\uffff"+
            "\13\14\1\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\1\14\2"+
            "\uffff\1\14\3\uffff\4\14\4\uffff\2\14\1\uffff\1\14\5\uffff\1"+
            "\14\10\uffff\1\14\13\uffff\1\14\1\uffff\1\14\3\uffff\2\14\32"+
            "\uffff\1\14",
            "",
            "\1\7",
            "\3\17\1\16\7\17\1\uffff\1\17\2\uffff\3\17\1\uffff\1\17\1\uffff"+
            "\13\17\1\uffff\1\17\1\uffff\3\17\1\uffff\1\17\1\uffff\1\17\2"+
            "\uffff\1\17\3\uffff\4\17\4\uffff\2\17\1\uffff\1\17\5\uffff\1"+
            "\17\10\uffff\1\17\13\uffff\1\17\1\uffff\1\17\3\uffff\2\17\32"+
            "\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "524:1: upstarExpr options {backtrack=true; memoize=true; } : ( ( CARET | MULTI_CARET | VEE | MULTI_VEE ) starExpr | ( CARET | VEE ) primaryExpr starExpr | ( CARET | VEE ) primaryExpr | starExpr | CARET | MULTI_CARET | VEE | MULTI_VEE | primaryExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Cgsuite()) ) {s = 7;}

                        else if ( (synpred9_Cgsuite()) ) {s = 12;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Cgsuite()) ) {s = 7;}

                        else if ( (synpred11_Cgsuite()) ) {s = 15;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_1==AST) ) {s = 7;}

                        else if ( (synpred5_Cgsuite()) ) {s = 8;}

                        else if ( (synpred6_Cgsuite()) ) {s = 9;}

                        else if ( (synpred8_Cgsuite()) ) {s = 10;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_4 = input.LA(1);

                         
                        int index67_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_4==AST) ) {s = 7;}

                        else if ( (synpred5_Cgsuite()) ) {s = 8;}

                        else if ( (synpred6_Cgsuite()) ) {s = 9;}

                        else if ( (synpred10_Cgsuite()) ) {s = 13;}

                         
                        input.seek(index67_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\35\uffff";
    static final String DFA69_eofS =
        "\35\uffff";
    static final String DFA69_minS =
        "\1\13\13\uffff\1\0\1\uffff\1\0\16\uffff";
    static final String DFA69_maxS =
        "\1\173\13\uffff\1\0\1\uffff\1\0\16\uffff";
    static final String DFA69_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff"+
        "\1\14\1\uffff\1\16\1\20\1\21\1\22\10\uffff\1\15\1\17";
    static final String DFA69_specialS =
        "\1\0\13\uffff\1\1\1\uffff\1\2\16\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\13\1\uffff\1\20\1\uffff\1\16\2\uffff\1\15\33\uffff\1\22\1"+
            "\uffff\1\22\3\uffff\1\22\4\uffff\1\12\1\uffff\1\4\1\uffff\1"+
            "\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\6\2\uffff\1\21\3\uffff"+
            "\1\1\1\uffff\1\17\2\uffff\1\10\4\uffff\1\21\1\uffff\1\21\1\11"+
            "\1\21\1\uffff\1\2\1\22\1\3\2\uffff\2\22\25\uffff\1\14\1\7\2"+
            "\uffff\1\5",
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
            "\1\uffff",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "548:1: primaryExpr : ( NIL | THIS | TRUE | FALSE | INTEGER | INF | STRING | PASS | SUPER DOT id= generalizedId -> ^( DOT THIS[$SUPER] $id) | ERROR LPAREN statementSequence RPAREN | LPAREN statementSequence RPAREN | ( ( IDENTIFIER )? ( SQUOTE )? LBRACE expressionList SLASHES )=> explicitGame | ( LBRACE ( expression )? BIGRARROW )=> explicitMap | generalizedId | explicitSet | explicitList | of | controlExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_0 = input.LA(1);

                         
                        int index69_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_0==NIL) ) {s = 1;}

                        else if ( (LA69_0==THIS) ) {s = 2;}

                        else if ( (LA69_0==TRUE) ) {s = 3;}

                        else if ( (LA69_0==FALSE) ) {s = 4;}

                        else if ( (LA69_0==INTEGER) ) {s = 5;}

                        else if ( (LA69_0==INF) ) {s = 6;}

                        else if ( (LA69_0==STRING) ) {s = 7;}

                        else if ( (LA69_0==PASS) ) {s = 8;}

                        else if ( (LA69_0==SUPER) ) {s = 9;}

                        else if ( (LA69_0==ERROR) ) {s = 10;}

                        else if ( (LA69_0==LPAREN) ) {s = 11;}

                        else if ( (LA69_0==IDENTIFIER) ) {s = 12;}

                        else if ( (LA69_0==SQUOTE) && (synpred13_Cgsuite())) {s = 13;}

                        else if ( (LA69_0==LBRACE) ) {s = 14;}

                        else if ( (LA69_0==OP) ) {s = 15;}

                        else if ( (LA69_0==LBRACKET) ) {s = 16;}

                        else if ( (LA69_0==LISTOF||LA69_0==SETOF||LA69_0==SUMOF||LA69_0==TABLEOF) ) {s = 17;}

                        else if ( (LA69_0==BEGIN||LA69_0==BY||LA69_0==DO||LA69_0==FOR||LA69_0==FROM||LA69_0==IF||LA69_0==TO||(LA69_0>=WHERE && LA69_0<=WHILE)) ) {s = 18;}

                         
                        input.seek(index69_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Cgsuite()) ) {s = 13;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_Cgsuite()) ) {s = 13;}

                        else if ( (synpred14_Cgsuite()) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\46\uffff";
    static final String DFA72_eofS =
        "\46\uffff";
    static final String DFA72_minS =
        "\1\4\43\0\2\uffff";
    static final String DFA72_maxS =
        "\1\174\43\0\2\uffff";
    static final String DFA72_acceptS =
        "\44\uffff\1\1\1\2";
    static final String DFA72_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
        "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\2\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\6\1\5\1\4\1\11\3\uffff\1\2\1\uffff\1\31\1\uffff\1\27\1\45"+
            "\1\uffff\1\26\4\uffff\1\7\1\12\25\uffff\1\43\1\uffff\1\37\3"+
            "\uffff\1\42\4\uffff\1\25\1\uffff\1\17\1\uffff\1\34\1\uffff\1"+
            "\35\1\uffff\1\33\2\uffff\1\21\2\uffff\1\32\3\uffff\1\14\1\3"+
            "\1\30\2\uffff\1\23\4\uffff\1\32\1\uffff\1\32\1\24\1\32\1\uffff"+
            "\1\15\1\36\1\16\2\uffff\1\41\1\40\25\uffff\1\1\1\22\1\10\1\13"+
            "\1\20\1\44",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "579:1: slashExpression : ( ( expressionList SLASHES )=>lo= expressionList SLASHES ro= slashExpression -> | lo= expressionList -> $lo);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==IDENTIFIER) ) {s = 1;}

                        else if ( (LA72_0==LPAREN) ) {s = 2;}

                        else if ( (LA72_0==NOT) ) {s = 3;}

                        else if ( (LA72_0==PLUSMINUS) ) {s = 4;}

                        else if ( (LA72_0==MINUS) ) {s = 5;}

                        else if ( (LA72_0==PLUS) ) {s = 6;}

                        else if ( (LA72_0==CARET) ) {s = 7;}

                        else if ( (LA72_0==MULTI_CARET) ) {s = 8;}

                        else if ( (LA72_0==AST) ) {s = 9;}

                        else if ( (LA72_0==VEE) ) {s = 10;}

                        else if ( (LA72_0==MULTI_VEE) ) {s = 11;}

                        else if ( (LA72_0==NIL) ) {s = 12;}

                        else if ( (LA72_0==THIS) ) {s = 13;}

                        else if ( (LA72_0==TRUE) ) {s = 14;}

                        else if ( (LA72_0==FALSE) ) {s = 15;}

                        else if ( (LA72_0==INTEGER) ) {s = 16;}

                        else if ( (LA72_0==INF) ) {s = 17;}

                        else if ( (LA72_0==STRING) ) {s = 18;}

                        else if ( (LA72_0==PASS) ) {s = 19;}

                        else if ( (LA72_0==SUPER) ) {s = 20;}

                        else if ( (LA72_0==ERROR) ) {s = 21;}

                        else if ( (LA72_0==SQUOTE) ) {s = 22;}

                        else if ( (LA72_0==LBRACE) ) {s = 23;}

                        else if ( (LA72_0==OP) ) {s = 24;}

                        else if ( (LA72_0==LBRACKET) ) {s = 25;}

                        else if ( (LA72_0==LISTOF||LA72_0==SETOF||LA72_0==SUMOF||LA72_0==TABLEOF) ) {s = 26;}

                        else if ( (LA72_0==IF) ) {s = 27;}

                        else if ( (LA72_0==FOR) ) {s = 28;}

                        else if ( (LA72_0==FROM) ) {s = 29;}

                        else if ( (LA72_0==TO) ) {s = 30;}

                        else if ( (LA72_0==BY) ) {s = 31;}

                        else if ( (LA72_0==WHILE) ) {s = 32;}

                        else if ( (LA72_0==WHERE) ) {s = 33;}

                        else if ( (LA72_0==DO) ) {s = 34;}

                        else if ( (LA72_0==BEGIN) ) {s = 35;}

                        else if ( (LA72_0==SLASHES) && (synpred15_Cgsuite())) {s = 36;}

                        else if ( (LA72_0==RBRACE) ) {s = 37;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA72_5 = input.LA(1);

                         
                        int index72_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA72_7 = input.LA(1);

                         
                        int index72_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA72_8 = input.LA(1);

                         
                        int index72_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA72_9 = input.LA(1);

                         
                        int index72_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA72_10 = input.LA(1);

                         
                        int index72_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA72_11 = input.LA(1);

                         
                        int index72_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA72_12 = input.LA(1);

                         
                        int index72_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA72_13 = input.LA(1);

                         
                        int index72_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA72_14 = input.LA(1);

                         
                        int index72_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA72_15 = input.LA(1);

                         
                        int index72_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA72_16 = input.LA(1);

                         
                        int index72_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_16);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA72_17 = input.LA(1);

                         
                        int index72_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_17);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA72_18 = input.LA(1);

                         
                        int index72_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_18);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA72_19 = input.LA(1);

                         
                        int index72_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_19);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA72_20 = input.LA(1);

                         
                        int index72_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA72_21 = input.LA(1);

                         
                        int index72_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_21);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA72_22 = input.LA(1);

                         
                        int index72_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_22);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA72_23 = input.LA(1);

                         
                        int index72_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_23);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA72_24 = input.LA(1);

                         
                        int index72_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_24);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA72_25 = input.LA(1);

                         
                        int index72_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_25);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA72_26 = input.LA(1);

                         
                        int index72_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_26);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA72_27 = input.LA(1);

                         
                        int index72_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_27);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA72_28 = input.LA(1);

                         
                        int index72_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_28);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA72_29 = input.LA(1);

                         
                        int index72_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_29);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA72_30 = input.LA(1);

                         
                        int index72_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_30);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA72_31 = input.LA(1);

                         
                        int index72_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_31);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA72_32 = input.LA(1);

                         
                        int index72_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_32);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA72_33 = input.LA(1);

                         
                        int index72_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_33);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA72_34 = input.LA(1);

                         
                        int index72_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_34);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA72_35 = input.LA(1);

                         
                        int index72_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_Cgsuite()) ) {s = 36;}

                        else if ( (true) ) {s = 37;}

                         
                        input.seek(index72_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_cuDeclaration_in_compilationUnit1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_script_in_compilationUnit1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_preamble_in_cuDeclaration1331 = new BitSet(new long[]{0x0102000000000000L,0x0000000000408200L});
    public static final BitSet FOLLOW_classDeclaration_in_cuDeclaration1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_enumDeclaration_in_cuDeclaration1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_cuDeclaration1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importStatement_in_preamble1360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_preamble1362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_IMPORT_in_importStatement1390 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_importClause_in_importStatement1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedId_in_importClause1410 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_DOT_in_importClause1413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_AST_in_importClause1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classModifiers_in_classDeclaration1432 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration1434 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDeclaration1437 = new BitSet(new long[]{0x0480000000200000L,0x0000000080448300L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration1439 = new BitSet(new long[]{0x0080000000200000L,0x0000000080448300L});
    public static final BitSet FOLLOW_javaClause_in_classDeclaration1442 = new BitSet(new long[]{0x0080000000000000L,0x0000000080448300L});
    public static final BitSet FOLLOW_declaration_in_classDeclaration1445 = new BitSet(new long[]{0x0080000000000000L,0x0000000080448300L});
    public static final BitSet FOLLOW_END_in_classDeclaration1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_classModifiers1463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_EXTENDS_in_extendsClause1488 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_qualifiedId_in_extendsClause1491 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_extendsClause1494 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_qualifiedId_in_extendsClause1497 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedId1513 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_DOT_in_qualifiedId1516 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedId1519 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COLON_in_javaClause1538 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_JAVA_in_javaClause1541 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_in_javaClause1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_staticDeclaration_in_declaration1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_declaration1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyDeclaration_in_declaration1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_declaration1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_staticDeclaration1591 = new BitSet(new long[]{0xAA9DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_staticDeclaration1594 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_staticDeclaration1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_varDeclaration1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration1617 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_varInitializer_in_varDeclaration1620 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_COMMA_in_varDeclaration1623 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_varInitializer_in_varDeclaration1626 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_SEMI_in_varDeclaration1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varInitializer1648 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_varInitializer1651 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_functionExpression_in_varInitializer1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_propertyDeclaration1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_PROPERTY_in_propertyDeclaration1672 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_propertyDeclaration1675 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_propertyDeclaration1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100001L});
    public static final BitSet FOLLOW_GET_in_propertyDeclaration1681 = new BitSet(new long[]{0xAA9DC00001B4A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_setterClause_in_propertyDeclaration1685 = new BitSet(new long[]{0xAA9DC00001B4A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_javaClause_in_propertyDeclaration1692 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_propertyDeclaration1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSequence_in_propertyDeclaration1699 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_propertyDeclaration1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setterClause1717 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_setterClause1719 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_requiredParameter_in_setterClause1721 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_setterClause1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_METHOD_in_methodDeclaration1752 = new BitSet(new long[]{0x0000000000000000L,0x0080000000002000L});
    public static final BitSet FOLLOW_generalizedId_in_methodDeclaration1755 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_methodDeclaration1757 = new BitSet(new long[]{0x0000000000001000L,0x0080000000000000L});
    public static final BitSet FOLLOW_methodParameterList_in_methodDeclaration1760 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_methodDeclaration1762 = new BitSet(new long[]{0xAA9DC00001B4A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_javaClause_in_methodDeclaration1769 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SEMI_in_methodDeclaration1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSequence_in_methodDeclaration1776 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_methodDeclaration1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_modifiers1793 = new BitSet(new long[]{0x0000000000000002L,0x0000000000408200L});
    public static final BitSet FOLLOW_MUTABLE_in_modifiers1797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000408200L});
    public static final BitSet FOLLOW_STATIC_in_modifiers1801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000408200L});
    public static final BitSet FOLLOW_PLUS_in_opCode1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_opCode1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AST_in_opCode1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FSLASH_in_opCode1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_opCode1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARET_in_opCode1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_opCode1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_opCode1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEG_in_opCode1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_opCode1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_standardRelationalToken_in_opCode1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_opCode1895 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACKET_in_opCode1897 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_opCode1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_opCode1912 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RBRACKET_in_opCode1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodParameter_in_methodParameterList1935 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_methodParameterList1938 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_methodParameter_in_methodParameterList1940 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_optionalParameter_in_methodParameter1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requiredParameter_in_methodParameter1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_optionalParameter1992 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_optionalParameter1996 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_QUESTION_in_optionalParameter1998 = new BitSet(new long[]{0xAA1DC0000184A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_optionalParameter2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_optionalParameter2029 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_QUESTION_in_optionalParameter2031 = new BitSet(new long[]{0xAA1DC0000184A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_optionalParameter2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_requiredParameter2062 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_requiredParameter2066 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOTDOTDOT_in_requiredParameter2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_requiredParameter2087 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_DOTDOTDOT_in_requiredParameter2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_enumDeclaration2109 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDeclaration2111 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDeclaration2114 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumElementList_in_enumDeclaration2118 = new BitSet(new long[]{0x0080000000000000L,0x0000000080448300L});
    public static final BitSet FOLLOW_declaration_in_enumDeclaration2120 = new BitSet(new long[]{0x0080000000000000L,0x0000000080448300L});
    public static final BitSet FOLLOW_END_in_enumDeclaration2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumElement_in_enumElementList2142 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_COMMA_in_enumElementList2145 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_enumElement_in_enumElementList2147 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_SEMI_in_enumElementList2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumElement2178 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_functionCall_in_enumElement2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_script2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_script2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementSequence_in_block2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementChain_in_statementSequence2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_controlExpression_in_statementChain2311 = new BitSet(new long[]{0xAA1DC0000194A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementChain_in_statementChain2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementChain2328 = new BitSet(new long[]{0xAA1DC0000194A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementChain_in_statementChain2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementChain2339 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_SEMI_in_statementChain2342 = new BitSet(new long[]{0xAA1DC0000194A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementChain_in_statementChain2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statementChain2355 = new BitSet(new long[]{0xAA1DC0000194A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementChain_in_statementChain2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2383 = new BitSet(new long[]{0xAA1DC0000184A8F2L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_statement2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_statement2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statement2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_statement2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement2428 = new BitSet(new long[]{0xBA1DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_tryStatement2431 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FINALLY_in_tryStatement2433 = new BitSet(new long[]{0xAA9DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_tryStatement2436 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_tryStatement2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_assignmentExpression2464 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_assignmentToken_in_assignmentExpression2467 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignmentToken2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParameterList_in_functionExpression2496 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RARROW_in_functionExpression2498 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_functionExpression_in_functionExpression2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_functionExpression2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedureParameterList2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_procedureParameterList2539 = new BitSet(new long[]{0x0000000000001000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedureParameterList2542 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_COMMA_in_procedureParameterList2545 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_procedureParameterList2547 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_RPAREN_in_procedureParameterList2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression2577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_OR_in_orExpression2580 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_orExpression_in_orExpression2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpr_in_andExpression2596 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_andExpression2599 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_andExpression_in_andExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_notExpr2618 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_notExpr_in_notExpr2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isExpr_in_notExpr2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_isExpr2646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_IS_in_isExpr2649 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_relationalExpr_in_isExpr2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_relationalExpr2668 = new BitSet(new long[]{0x0000018FFC000002L});
    public static final BitSet FOLLOW_relationalToken_in_relationalExpr2671 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_relationalExpr_in_relationalExpr2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFEQUALS_in_relationalToken2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFNEQ_in_relationalToken2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_standardRelationalToken_in_relationalToken2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_standardRelationalToken0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr2780 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_rangeExpr2783 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_addExpr_in_rangeExpr2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryAddExpr_in_addExpr2802 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2806 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_MINUS_in_addExpr2811 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_unaryAddExpr_in_addExpr2815 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_binaryPlusMinus_in_addExpr2819 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_plusMinus_in_binaryPlusMinus2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusMinus_in_unaryAddExpr2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAddExpr2870 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_sidleExpr_in_unaryAddExpr2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryAddExpr2889 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_sidleExpr_in_unaryAddExpr2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sidleExpr_in_unaryAddExpr2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSMINUS_in_plusMinus2951 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_plusMinus2953 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_plusMinus2955 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_COMMA_in_plusMinus2958 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_plusMinus2960 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_RPAREN_in_plusMinus2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSMINUS_in_plusMinus2981 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_sidleExpr_in_plusMinus2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinalSumExpr_in_sidleExpr3001 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_sidleExpr3004 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_ordinalSumExpr_in_sidleExpr3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExpr_in_ordinalSumExpr3026 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_COLON_in_ordinalSumExpr3029 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_multiplyExpr_in_ordinalSumExpr3032 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_expExpr_in_multiplyExpr3048 = new BitSet(new long[]{0x0000000000000582L});
    public static final BitSet FOLLOW_AST_in_multiplyExpr3052 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_FSLASH_in_multiplyExpr3057 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_PERCENT_in_multiplyExpr3062 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expExpr_in_multiplyExpr3066 = new BitSet(new long[]{0x0000000000000582L});
    public static final BitSet FOLLOW_postfixExpr_in_expExpr3079 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CARET_in_expExpr3082 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_postfixExpr_in_expExpr3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_upstarExpr_in_postfixExpr3102 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_DOT_in_postfixExpr3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_SUPER_in_postfixExpr3116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_postfixExpr3118 = new BitSet(new long[]{0x0000000000000000L,0x0080000000002000L});
    public static final BitSet FOLLOW_generalizedId_in_postfixExpr3122 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_DOT_in_postfixExpr3146 = new BitSet(new long[]{0x0000000000000000L,0x0080000000002000L});
    public static final BitSet FOLLOW_generalizedId_in_postfixExpr3150 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_arrayReference_in_postfixExpr3172 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_functionCall_in_postfixExpr3192 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayReference3223 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_arrayReference3225 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_COMMA_in_arrayReference3228 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_arrayReference3230 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayReference3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_functionCall3261 = new BitSet(new long[]{0xAA1DC0000184B8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3264 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_COMMA_in_functionCall3267 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_functionArgument_in_functionCall3269 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_RPAREN_in_functionCall3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionArgument3305 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BIGRARROW_in_functionArgument3307 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_functionArgument3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_upstarExpr3353 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_starExpr_in_upstarExpr3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_upstarExpr3378 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_upstarExpr3387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_starExpr_in_upstarExpr3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_upstarExpr3397 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_upstarExpr3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_starExpr_in_upstarExpr3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARET_in_upstarExpr3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTI_CARET_in_upstarExpr3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEE_in_upstarExpr3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTI_VEE_in_upstarExpr3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_upstarExpr3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AST_in_starExpr3485 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_starExpr3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AST_in_starExpr3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_primaryExpr3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpr3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_primaryExpr3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_primaryExpr3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_primaryExpr3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INF_in_primaryExpr3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primaryExpr3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASS_in_primaryExpr3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpr3573 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_primaryExpr3575 = new BitSet(new long[]{0x0000000000000000L,0x0080000000002000L});
    public static final BitSet FOLLOW_generalizedId_in_primaryExpr3579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERROR_in_primaryExpr3601 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpr3604 = new BitSet(new long[]{0xAA1DC0000194B8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_primaryExpr3607 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpr3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpr3615 = new BitSet(new long[]{0xAA1DC0000194B8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_primaryExpr3618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpr3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitGame_in_primaryExpr3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitMap_in_primaryExpr3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalizedId_in_primaryExpr3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitSet_in_primaryExpr3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitList_in_primaryExpr3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_of_in_primaryExpr3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_controlExpression_in_primaryExpr3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_explicitGame3706 = new BitSet(new long[]{0x0000000000048000L,0x0080000000000000L});
    public static final BitSet FOLLOW_explicitGameBraces_in_explicitGame3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitGameBraces_in_explicitGame3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOTE_in_explicitGameBraces3743 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACE_in_explicitGameBraces3746 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x1F8000037BA93892L});
    public static final BitSet FOLLOW_slashExpression_in_explicitGameBraces3749 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_explicitGameBraces3751 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_SQUOTE_in_explicitGameBraces3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_explicitGameBraces3763 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x1F8000037BA93892L});
    public static final BitSet FOLLOW_slashExpression_in_explicitGameBraces3766 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_explicitGameBraces3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_slashExpression3809 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_SLASHES_in_slashExpression3811 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x1F8000037BA93892L});
    public static final BitSet FOLLOW_slashExpression_in_slashExpression3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_slashExpression3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_explicitMap3854 = new BitSet(new long[]{0xAA1DC0200184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_mapEntry_in_explicitMap3857 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_COMMA_in_explicitMap3860 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_mapEntry_in_explicitMap3862 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_BIGRARROW_in_explicitMap3868 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RBRACE_in_explicitMap3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_mapEntry3891 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BIGRARROW_in_mapEntry3893 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_mapEntry3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_explicitSet3907 = new BitSet(new long[]{0xAA1DC0000185A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_explicitSet3910 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_COMMA_in_explicitSet3913 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_explicitSet3915 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_RBRACE_in_explicitSet3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_explicitList3941 = new BitSet(new long[]{0xAA1DC0000184E8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_explicitList3944 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_COMMA_in_explicitList3947 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_explicitList3949 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_RBRACKET_in_explicitList3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ofToken_in_of3978 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_of3980 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_of3982 = new BitSet(new long[]{0xA001000000001000L,0x0000000310000000L});
    public static final BitSet FOLLOW_inLoopAntecedent_in_of3986 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_of3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doLoopAntecedent_in_of4041 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RPAREN_in_of4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ofToken0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList4217 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList4220 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_expressionList4222 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IF_in_controlExpression4249 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_controlExpression4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_THEN_in_controlExpression4254 = new BitSet(new long[]{0xAAFDC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_controlExpression4257 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_elseifClause_in_controlExpression4259 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_controlExpression4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doLoopAntecedent_in_controlExpression4268 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DO_in_controlExpression4270 = new BitSet(new long[]{0xAA9DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_controlExpression4273 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_controlExpression4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inLoopAntecedent_in_controlExpression4281 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DO_in_controlExpression4283 = new BitSet(new long[]{0xAA9DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_controlExpression4286 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_controlExpression4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_controlExpression4297 = new BitSet(new long[]{0xAA9DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_controlExpression4300 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_END_in_controlExpression4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_doLoopAntecedent4317 = new BitSet(new long[]{0x8001000000000002L,0x0000000310000000L});
    public static final BitSet FOLLOW_fromClause_in_doLoopAntecedent4320 = new BitSet(new long[]{0x0001000000000002L,0x0000000310000000L});
    public static final BitSet FOLLOW_toClause_in_doLoopAntecedent4323 = new BitSet(new long[]{0x0001000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_byClause_in_doLoopAntecedent4326 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_whileClause_in_doLoopAntecedent4329 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_whereClause_in_doLoopAntecedent4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_inLoopAntecedent4350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_inClause_in_inLoopAntecedent4352 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_whileClause_in_inLoopAntecedent4354 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_whereClause_in_inLoopAntecedent4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause4372 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_forClause4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_fromClause4387 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_fromClause4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_toClause4405 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_toClause4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BY_in_byClause4425 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_byClause4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileClause4446 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_whileClause4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause4463 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_whereClause4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_inClause4483 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_inClause4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_in_elseifClause4500 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_elseifClause4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_THEN_in_elseifClause4505 = new BitSet(new long[]{0xAA7DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_elseifClause4508 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_elseifClause_in_elseifClause4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseifClause4516 = new BitSet(new long[]{0xAA1DC0000194A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_statementSequence_in_elseifClause4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_generalizedId4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_generalizedId4541 = new BitSet(new long[]{0x0000018FFEA025B0L,0x0000000000020400L});
    public static final BitSet FOLLOW_opCode_in_generalizedId4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred1_Cgsuite2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inLoopAntecedent_in_synpred1_Cgsuite2294 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DO_in_synpred1_Cgsuite2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doLoopAntecedent_in_synpred1_Cgsuite2300 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_DO_in_synpred1_Cgsuite2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_synpred1_Cgsuite2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_synpred2_Cgsuite2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSMINUS_in_synpred3_Cgsuite2951 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LPAREN_in_synpred3_Cgsuite2953 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_synpred3_Cgsuite2955 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_COMMA_in_synpred3_Cgsuite2958 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_synpred3_Cgsuite2960 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred3_Cgsuite2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_Cgsuite3353 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_starExpr_in_synpred4_Cgsuite3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_Cgsuite3378 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_synpred5_Cgsuite3387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_starExpr_in_synpred5_Cgsuite3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_Cgsuite3397 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_synpred6_Cgsuite3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARET_in_synpred8_Cgsuite3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTI_CARET_in_synpred9_Cgsuite3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VEE_in_synpred10_Cgsuite3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTI_VEE_in_synpred11_Cgsuite3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AST_in_synpred12_Cgsuite3485 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_primaryExpr_in_synpred12_Cgsuite3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred13_Cgsuite3630 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_SQUOTE_in_synpred13_Cgsuite3633 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACE_in_synpred13_Cgsuite3636 = new BitSet(new long[]{0xAA1DC0000184A8F0L,0x1F8000037BA93892L});
    public static final BitSet FOLLOW_expressionList_in_synpred13_Cgsuite3638 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_SLASHES_in_synpred13_Cgsuite3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_synpred14_Cgsuite3651 = new BitSet(new long[]{0xAA1DC0200184A8F0L,0x0F8000037BA93892L});
    public static final BitSet FOLLOW_expression_in_synpred14_Cgsuite3653 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_BIGRARROW_in_synpred14_Cgsuite3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred15_Cgsuite3800 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_SLASHES_in_synpred15_Cgsuite3802 = new BitSet(new long[]{0x0000000000000002L});

}