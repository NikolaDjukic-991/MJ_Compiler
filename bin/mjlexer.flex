package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;

%%

%{
	StringBuilder string = new StringBuilder();

	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}

%}


%cup
%line
%column

%xstate COMMENT
%xstate CHARLITERAL
%xstate STRINGLITERAL

%eofval{
	return new_symbol(sym.EOF);
%eofval}

%%

" "		{}
"\b"	{}
"\r\n"	{}
"\f"	{}
"\t"	{}

"program" 	{ return new_symbol(sym.PROGRAM, yytext());	}
"print"		{ return new_symbol(sym.PRINT, yytext());	}
"return"	{ return new_symbol(sym.RETURN, yytext());	}
"const"		{ return new_symbol(sym.CONST, yytext());	}
"class"		{ return new_symbol(sym.CLASS, yytext());	}
"extends"	{ return new_symbol(sym.EXTENDS, yytext());	}
"if"		{ return new_symbol(sym.IF, yytext());		}
"else"		{ return new_symbol(sym.ELSE, yytext());	}
"while"		{ return new_symbol(sym.WHILE, yytext());	}
"break"		{ return new_symbol(sym.BREAK, yytext());	}
"read"		{ return new_symbol(sym.READ, yytext());	}
"new"		{ return new_symbol(sym.NEW, yytext());		}

"+"		{ return new_symbol(sym.ADD, yytext()); }
"-"		{ return new_symbol(sym.SUB, yytext()); }
"*"		{ return new_symbol(sym.MUL, yytext()); }
"/"		{ return new_symbol(sym.DIV, yytext()); }
"%"		{ return new_symbol(sym.MOD, yytext()); }
"=="	{ return new_symbol(sym.EQU, yytext()); }
"!="	{ return new_symbol(sym.NEQ, yytext()); }
">"		{ return new_symbol(sym.GT, yytext());  }
">="	{ return new_symbol(sym.GTE, yytext()); }
"<"		{ return new_symbol(sym.LE, yytext());  }
"<="	{ return new_symbol(sym.LEQ, yytext()); }
","		{ return new_symbol(sym.COMMA, yytext()); }
";"		{ return new_symbol(sym.SEMIC, yytext()); }
"{"		{ return new_symbol(sym.LEFT_CBRACKET, yytext());  }
"}"		{ return new_symbol(sym.RIGHT_CBRACKET, yytext()); }
"["		{ return new_symbol(sym.LEFT_SBRACKET, yytext());  }
"]"		{ return new_symbol(sym.RIGHT_SBRACKET, yytext()); }
"("		{ return new_symbol(sym.LEFT_BRACKET, yytext());   }
")"		{ return new_symbol(sym.RIGHT_BRACKET, yytext());  }
"++"	{ return new_symbol(sym.PP, yytext());  }
"--"	{ return new_symbol(sym.MM, yytext());  }
"&&"	{ return new_symbol(sym.AND, yytext()); }
"||"	{ return new_symbol(sym.OR, yytext());  }
"="		{ return new_symbol(sym.ASSIGNMENT, yytext()); }
"."		{ return new_symbol(sym.DOT, yytext()); }

"void"	{ return new_symbol(sym.VOID, yytext()); }

"//"	{ yybegin(COMMENT); }
<COMMENT>	.	{ yybegin(COMMENT); }
<COMMENT>	"\r\n"	{ yybegin(YYINITIAL); }

[0-9]+		{ return new_symbol(sym.NUM, new Integer (yytext())); }
"true"		{ return new_symbol(sym.BOOL, new Boolean(yytext()));	 }
"false"		{ return new_symbol(sym.BOOL, new Boolean(yytext()));	 }

"'"		{ yybegin(CHARLITERAL); }

<CHARLITERAL> {
<CHARLITERAL> ([a-z]|[A-Z]|0-9|\"|\!|@|#|\$|%|\^|&|\*|\(|\)|-|\+|=|\||\[|\]|\{|\}|;|:|\<|\>|\.|,|\?|\/)"\'"	 { yybegin(YYINITIAL); return new_symbol(sym.CHAR, yytext().charAt(0));	 }

" "\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, ' '); }
"\\b"\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\b'); }
"\\t"\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\t'); }
"\\n"\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\n'); }
"\\f"\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\f'); }
"\\r"\'		{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\r'); }
"\\\""\'	{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\"'); }
"\\\'"\'	{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\''); }
"\\\\"\'	{ yybegin(YYINITIAL); return new_symbol(sym.CHAR, '\\'); }

.			{ System.err.println("Error: Incorrect character token("+yytext()+") in line: "+(yyline+1)); }
}


"\""	{ yybegin(STRINGLITERAL); }
<STRINGLITERAL> {



"\\b"                          { string.append( "\b" ); }
"\\t"                          { string.append( "\t" ); }
"\\n"                          { string.append( "\n" ); }
"\\f"                          { string.append( "\f" ); }
"\\r"                          { string.append( "\r" ); }
"\\\""                         { string.append( "\"" ); }
"\\'"                          { string.append( "\'" ); }
"\\\\"                         { string.append( "\\" ); }

"\""						   { yybegin(YYINITIAL); String s = new String(string.toString()); string.setLength(0); return new_symbol(sym.STRING, s); }

\r|\n|\r\n { System.err.println("Unterminated character literal at end of line ("+yytext()+") at line: "+(yyline+1)); }

.		{ yybegin(STRINGLITERAL); string.append(yytext()); }

}


 
([a-z]|[A-Z])[a-z|A-Z|0-9|_]*	{ return new_symbol(sym.IDENT, yytext()); }

. { System.err.println("Error: Incorrect token("+yytext()+") in line: "+(yyline+1)); }