import java_cup.runtime.*;

public class Compiler2
{
	public Compiler2()
	{
		
	}
	
	public void compile(String filename)
	{
		System.out.println("Compiling: " + filename);
		
		Lexer scanner = null;
		
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(filename);
          java.io.Reader reader = new java.io.InputStreamReader(stream);
		  
		  
		  ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
          Parser parser = new Parser(new Lexer(reader,symbolFactory),symbolFactory);
		  parser.parse();

		  System.out.println("Compiling finished.");
        }
        catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
        }
		
		
	}
}