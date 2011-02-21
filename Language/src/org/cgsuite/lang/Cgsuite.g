grammar Cgsuite;

options
{
    language = Java;
    output = AST;
    ASTLabelType = CgsuiteTree;
}

tokens
{
	PLUS		= '+';
	MINUS		= '-';
	PLUSMINUS   = '+-';
	AST         = '*';
	FSLASH		= '/';
	DOT			= '.';
	EXP			= '**';
	PERCENT		= '%';
	UNDERSCORE	= '_';
	LPAREN		= '(';
	RPAREN		= ')';
	LBRACKET	= '[';
	RBRACKET	= ']';
	LBRACE		= '{';
	RBRACE		= '}';
	SQUOTE		= '\'';
	DQUOTE		= '"';
	COMMA		= ',';
	SEMI		= ';';
	COLON		= ':';
	AMPERSAND	= '&';
	TILDE		= '~';
	BANG		= '!';
	QUESTION	= '?';
	CARET       = '^';
	CARETCARET  = '^^';
	VEE         = 'v';
	VEEVEE      = 'vv';
	EQUALS		= '==';
	NEQ			= '!=';
	LT			= '<';
	GT			= '>';
	LEQ			= '<=';
	GEQ			= '>=';
	CONFUSED    = '<>';
	COMPARE		= '<=>';
	RARROW		= '->';
	BIGRARROW	= '=>';
	BACKSLASH	= '\\';
	REFEQUALS	= '===';
	REFNEQ		= '!==';
	
	ASSIGN		= ':=';
	ASN_PLUS	= '+=';
	ASN_MINUS	= '-=';
	ASN_TIMES	= '*=';
	ASN_DIV		= '/=';
	ASN_MOD		= '%=';
	ASN_AND		= '&=';
	ASN_OR		= '|=';
	ASN_XOR		= '^=';
	ASN_EXP		= '**=';
	
	DOTDOT		= '..';
	DOTDOTDOT   = '...';

	AND			= 'and';
	BEGIN		= 'begin';
	BREAK		= 'break';
	BY			= 'by';
    CLASS       = 'class';
    CLEAR       = 'clear';
	CONTINUE	= 'continue';
	DO			= 'do';
	ELSE		= 'else';
	ELSEIF		= 'elseif';
	END			= 'end';
    ENUM        = 'enum';
	EXTENDS		= 'extends';
	FALSE		= 'false';
	FOR			= 'for';
	FOREACH		= 'foreach';
	FROM		= 'from';
	GET         = 'get';
	IF			= 'if';
	IMMUTABLE	= 'immutable';
//	IMPORT		= 'import';
	IN			= 'in';
	JAVA        = 'java';
	METHOD		= 'method';
//	NAMESPACE	= 'namespace';
    NEG         = 'neg';
    NIL         = 'nil';
	NOT			= 'not';
	OP          = 'op';
	OR			= 'or';
	POS         = 'pos';
	PRIVATE		= 'private';
	PROPERTY	= 'property';
	PROTECTED	= 'protected';
	PUBLIC		= 'public';
	RETURN		= 'return';
	SET         = 'set';
    STATIC      = 'static';
	THEN		= 'then';
	THIS        = 'this';
	TO			= 'to';
	TRUE		= 'true';
	VAR         = 'var';
	WHERE		= 'where';
	WHILE		= 'while';
	
	ARRAY_REFERENCE;
    ARRAY_INDEX_LIST;
	ASN_ANTECEDENT;
    ENUM_ELEMENT;
    ENUM_ELEMENT_LIST;
	EXPLICIT_LIST;
	EXPLICIT_MAP;
	EXPLICIT_SET;
	EXPRESSION_LIST;
	FUNCTION_CALL;
	FUNCTION_CALL_ARGUMENT_LIST;
	METHOD_PARAMETER_LIST;
	MODIFIERS;
	MULTI_CARET;
	MULTI_VEE;
    PROCEDURE_PARAMETER_LIST;
	STATEMENT_SEQUENCE;
    UNARY_AST;
	UNARY_MINUS;
	UNARY_PLUS;
}

@lexer::header
{
    package org.cgsuite.lang;
}

@header
{
    package org.cgsuite.lang;
}

@members
{
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
    }
}

compilationUnit
	: (classDeclaration | enumDeclaration) EOF^
	;

classDeclaration
	: CLASS^ IDENTIFIER extendsClause? javaClause? declaration* END!
	;
	
extendsClause
	: EXTENDS^ IDENTIFIER (COMMA! IDENTIFIER)*
	;

javaClause
    : COLON! JAVA^ STRING
    ;
	
declaration
	: varDeclaration
	| propertyDeclaration
	| methodDeclaration
	;
	
varDeclaration
    : modifiers VAR^ IDENTIFIER (COMMA! IDENTIFIER)* SEMI!
    ;

propertyDeclaration
	: modifiers PROPERTY^ IDENTIFIER DOT! (GET | SET)
	  (javaClause SEMI! | statementSequence END!)
	;

proptype
    : GET
    | SET
    ;
	
methodDeclaration
	: modifiers METHOD^ methodName LPAREN! methodParameterList RPAREN!
	  (javaClause SEMI! | statementSequence END!)
	;
	
modifiers
	: (PRIVATE | PROTECTED | PUBLIC | IMMUTABLE | STATIC)* -> ^(MODIFIERS PRIVATE* PROTECTED* PUBLIC* IMMUTABLE*)
	;

methodName
    : OP^ opCode
    | IDENTIFIER
    ;

opCode
    : PLUS | MINUS | AST | FSLASH | PERCENT | EXP | NEG | POS
    | standardRelationalToken
    | opAssignmentToken
    | LBRACKET RBRACKET ASSIGN?
    ;
	
// TODO Require optional last
methodParameterList
	: (methodParameter (COMMA methodParameter)*)? -> ^(METHOD_PARAMETER_LIST methodParameter*)
	;
	
methodParameter
	: a=IDENTIFIER b=IDENTIFIER? QUESTION expression? -> ^(QUESTION ^($a $b?) expression?)
	| a=IDENTIFIER b=IDENTIFIER -> ^($b $a)
	| IDENTIFIER
	;

enumDeclaration
    : modifiers ENUM^ IDENTIFIER enumElementList declaration* END!
    ;

enumElementList
    : (enumElement (COMMA enumElement)*) SEMI -> ^(ENUM_ELEMENT_LIST enumElement*)
    ;

enumElement
    : IDENTIFIER (LPAREN (expression (COMMA expression)*)? RPAREN)? -> ^(ENUM_ELEMENT[$IDENTIFIER] IDENTIFIER expression*)
    ;

script
    : block EOF^
    ;

block
    : statementSequence
    ;
	
statementSequence
	: statement? (SEMI statement?)* -> ^(STATEMENT_SEQUENCE statement*)
	;
	
statement
	: BREAK
	| CONTINUE
	| RETURN^ expression
    | CLEAR
	| expression
	;

expression
	: assignmentExpression
	;

assignmentExpression
	: functionExpression (assignmentToken^ assignmentExpression)?
	;
	
assignmentToken
	: ASSIGN
	| opAssignmentToken
	;

opAssignmentToken
    : ASN_PLUS
	| ASN_MINUS
	| ASN_TIMES
	| ASN_DIV
	| ASN_MOD
	| ASN_AND
	| ASN_OR
	| ASN_XOR
	| ASN_EXP
	;
	
functionExpression
	: procedureParameterList RARROW^ functionExpression
    | controlExpression
	;

procedureParameterList
    : IDENTIFIER -> ^(PROCEDURE_PARAMETER_LIST IDENTIFIER)
    | LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN -> ^(PROCEDURE_PARAMETER_LIST IDENTIFIER*)
    ;
	
controlExpression
	: IF^ expression THEN! statementSequence elseifClause? END!
	| forExpression? fromExpression? toExpression? byExpression? whileExpression? whereExpression? DO^ statementSequence END!
	| FOR! expression IN^ expression DO! statementSequence END!
	| orExpression
	;

forExpression
	: FOR^ IDENTIFIER
	;
	
fromExpression
	: FROM^ expression
	;
	
toExpression
    : TO^ expression
    ;

byExpression
    : BY^ expression
    ;
	
whileExpression
    : WHILE^ expression
	;

whereExpression
    : WHERE^ expression
    ;

elseifClause
	: ELSEIF^ expression THEN! statementSequence elseifClause?
	| ELSE^ statementSequence
	;

orExpression
	: andExpression (OR^ orExpression)?
	;

andExpression
	: notExpr (AND^ andExpression)?
	;

notExpr
    : NOT^ notExpr
    | relationalExpr
    ;

relationalExpr
	: addExpr (relationalToken^ relationalExpr)?
	;

relationalToken
	: REFEQUALS
	| REFNEQ
	| standardRelationalToken
	;
	
standardRelationalToken
    : EQUALS
	| NEQ
	| LT
	| GT
	| LEQ
	| GEQ
    | CONFUSED
	| COMPARE
	;

addExpr
	: multiplyExpr ((PLUS^ | MINUS^) multiplyExpr)*
	;
	
multiplyExpr
	: expExpr ((AST^ | FSLASH^ | PERCENT^) expExpr)*
	;

expExpr
	: plusminusExpr (EXP^ plusminusExpr)?
	;
	
plusminusExpr
options
{
    backtrack = true;
    memoize = true;
}
    : PLUSMINUS LPAREN expression (COMMA expression)* RPAREN -> ^(PLUSMINUS expression*)
    | PLUSMINUS unaryExpr -> ^(PLUSMINUS unaryExpr)
    | unaryExpr
    ;

unaryExpr
	: MINUS unaryExpr -> ^(UNARY_MINUS unaryExpr)
    | PLUS unaryExpr -> ^(UNARY_PLUS unaryExpr)
    | postfixExpr
	;
	
postfixExpr
	: (upstarExpr -> upstarExpr)
	  ( DOT IDENTIFIER  -> ^(DOT $postfixExpr IDENTIFIER)
	  | x=arrayReference-> ^(ARRAY_REFERENCE[((CgsuiteTree) x.getTree()).getToken()] $postfixExpr arrayReference)
	  | y=functionCall	-> ^(FUNCTION_CALL[((CgsuiteTree) y.getTree()).getToken()] $postfixExpr functionCall)
	  )*
	  ;

arrayReference
	: LBRACKET expression (COMMA expression)* RBRACKET
      -> ^(ARRAY_INDEX_LIST[$LBRACKET] expression*)
	;
	
functionCall
	: LPAREN (functionArgument (COMMA functionArgument)*)? RPAREN
      -> ^(FUNCTION_CALL_ARGUMENT_LIST[$LPAREN] functionArgument*)
	;
		
functionArgument
	: (IDENTIFIER BIGRARROW^)? expression
	;
	
upstarExpr
options
{
    backtrack = true;
    memoize = true;
}
    : (CARET | CARETCARET | VEE | VEEVEE)^ starExpr
    | (CARET | VEE)^ primaryExpr starExpr
    | (CARET | VEE)^ primaryExpr
    | starExpr
    | CARET | CARETCARET | VEE | VEEVEE
    | primaryExpr
    ;

starExpr
options
{
    backtrack = true;
    memoize = true;
}
    : AST primaryExpr -> ^(UNARY_AST primaryExpr)
    | AST -> UNARY_AST
    ;
	
primaryExpr
	: NIL
	| THIS
	| TRUE
	| FALSE
	| (INTEGER DOTDOT) => range
	| INTEGER
	| STRING
	| CHAR
	| IDENTIFIER
	| LPAREN! statementSequence RPAREN!
	| BEGIN! statementSequence END!
    | (LBRACE expressionList SLASHES) => explicitGame
	| (LBRACE expression? BIGRARROW) => explicitMap
	| explicitSet
	| explicitList
	;

explicitGame
    : LBRACE! slashExpression RBRACE!
    ;

slashExpression
    @init
    {
        CommonTree newTree = null;
    }
    : (expressionList SLASHES) =>
      lo=expressionList (SLASHES ro=slashExpression)
    {
        if ($ro.tree.token.getType() != SLASHES ||
            $ro.tree.token.getText().length() < $SLASHES.getText().length())
        {
            newTree = (CgsuiteTree) adaptor.create($SLASHES);
            adaptor.addChild(newTree, $lo.tree);
            adaptor.addChild(newTree, $ro.tree);
        }
        else
        {
            CommonTree t = $ro.tree;
            while (true)
            {
                if ($SLASHES.getText().length() == t.getText().length())
                {
                    throw new RuntimeException("Ambiguous pattern of slashes.");
                }
                else if (t.getChild(0).getType() != SLASHES ||
                         t.getChild(0).getText().length() < $SLASHES.getText().length())
                {
                    break;
                }
                t = (CgsuiteTree) adaptor.getChild(t, 0);
            }
            CommonTree tLeft  = (CgsuiteTree) adaptor.getChild(t, 0);
            CommonTree tRight = (CgsuiteTree) adaptor.getChild(t, 1);
            CommonTree tRightNew = (CgsuiteTree) adaptor.create($SLASHES);
            adaptor.addChild(tRightNew, $lo.tree);
            adaptor.addChild(tRightNew, tLeft);
            adaptor.setChild(t, 0, tRightNew);
            adaptor.setChild(t, 1, tRight);
            newTree = $ro.tree;
        }
    } -> {newTree}
    | lo=expressionList -> $lo
    ;

explicitMap
	: LBRACE (mapEntry (COMMA mapEntry)* | BIGRARROW) RBRACE -> ^(EXPLICIT_MAP mapEntry*)
	;

mapEntry
	: expression BIGRARROW^ expression
	;

explicitSet
	: LBRACE (expression (COMMA expression)*)? RBRACE -> ^(EXPLICIT_SET expression*)
	;

explicitList
	: LBRACKET (expression (COMMA expression)*)? RBRACKET -> ^(EXPLICIT_LIST expression*)
	;

expressionList
    : (expression (COMMA expression)*)? -> ^(EXPRESSION_LIST expression*)
    ;

range
	: INTEGER DOTDOT^ INTEGER
	;

INTEGER		: DIGIT+;

IDENTIFIER	: LETTER (LETTER | DIGIT)*;

STRING		: DQUOTE (~(DQUOTE|BACKSLASH|'\n'|'\r') | ESCAPE_SEQ)* DQUOTE;

CHAR		: SQUOTE (~(SQUOTE|BACKSLASH|'\n'|'\r') | ESCAPE_SEQ) SQUOTE;

SLASHES		: SLASH+;

fragment
DIGIT		: '0'..'9';

fragment
HEX_DIGIT	: '0'..'9' | 'A'..'F' | 'a'..'f';

fragment
LETTER		: UC_LETTER | LC_LETTER | UNDERSCORE;

fragment
UC_LETTER	: 'A'..'Z';

fragment
LC_LETTER	: 'a'..'z';

fragment
SLASH		: '|';

fragment
ESCAPE_SEQ	: BACKSLASH
			  ( BACKSLASH
			  | 'n'
			  | 'r'
			  | 't'
			  | SQUOTE
			  | DQUOTE
			  | 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			  )
			;

fragment
NEWLINE     : '\r'? '\n';

WHITESPACE			: (' ' | '\t' | NEWLINE)+ { $channel = HIDDEN; };

SL_COMMENT			: '//' ~('\r'|'\n')* NEWLINE { $channel = HIDDEN; };

ML_COMMENT	: '/*' ( ~('*') | '*' ~('/')  )* '*/'? { $channel = HIDDEN; };
