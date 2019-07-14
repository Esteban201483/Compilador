import java.util.*;
import java_cup.runtime.*;

%%
%public
%class Lexer
%unicode
%cup 
%implements sym
%line
%column
%cupdebug

%{
	ComplexSymbolFactory symbolFactory;
	
	public Lexer(java.io.Reader in, ComplexSymbolFactory sf)
	{
		this(in);
		symbolFactory = sf;
	}
	
	private Symbol symbol(int type) 
	{
		//System.out.println("column: " + yycolumn);
		//System.out.println("line: " + yyline);
		return symbolFactory.newSymbol("",type,yytext());
	}

	private Symbol symbol(int type, Object value) 
	{
		return symbolFactory.newSymbol("",type);
	}
%}

%eofval{
	return symbol(sym.EOF);
%eofval}

%init{
	yybegin( DATA );
%init}

%state DATA,CODE

string = \"[^\"]*\"
comment = #(.)*
spaces = ([\t ]+)
endLine = ([\n\r]+)
types = ((.ascii)|(word)|(dword))
registers = r[0-9]{1,2}
immediate = [-]?[0-9]+
separator = [\,]
segment = ((\.data)|(\.code))
label = ([a-zA-z][a-zA-Z0-9]*:)
variable = [a-zA-Z][a-zA-Z0-9]*

operation = (add|and|andi|addi|call|div|divi|je|jges|jgeu|jgs|jgu|jles|jleu|jls|jlu|jmp|jne|lsb|lsh|lsw|
			lub|luh|luw|mul|multi|not|noti|or|ori|pop|push|ret|sal|sali|sar|sari|sb|scl|scli|scr|scri|sh|
			sll|slli|slr|slri|sub|subi|sw|syscall|xor|xori)

%%

<DATA>
{
	{immediate} {System.out.println("Inmediato Detectado: " + yytext());return symbol(sym.immediate);}
	{separator} {System.out.println("Separador Detectado: " + yytext());return symbol(sym.separator);}
	{segment} {
				System.out.println("Segmento Detectado: " + yytext());
				if(yytext().equals(".code"))
					yybegin( CODE );
				return symbol(sym.segment);}
				
	{types} {System.out.println("Tipo Detectado: " + yytext());return symbol(sym.types);}
	{variable} {System.out.println("Variable detectada: " + yytext());return symbol(sym.variable);}
	{string} {System.out.println("String Detectado: " + yytext());return symbol(sym.string);}
	{comment} {/*Ignores*/}
	{spaces} {/*Ignores*/}
	{endLine} {/*Ignores*/}
	. {System.out.println("Input no reconocido: " + yytext());}
}
<CODE>
{
	{registers} {System.out.println("Registro Detectado: " + yytext());return symbol(sym.register);}
	{immediate} {System.out.println("Inmediato Detectado: " + yytext());return symbol(sym.immediate);}
	{separator} {System.out.println("Separador Detectado: " + yytext());return symbol(sym.separator);}
	{label} {System.out.println("Etiqueta Detectada: " + yytext());return symbol(sym.label);}
	{operation} {System.out.println("Instruccion Detectada: " + yytext()); return symbol(sym.operation);}
	{variable} {System.out.println("Variable detectada: " + yytext());return symbol(sym.tag);}
	{comment} {/*Ignores*/}
	{spaces} {/*Ignores*/}
	{endLine} {/*Ignores*/}
	. {System.out.println("Input no reconocido: " + yytext());}
}






