import java_cup.runtime.*;

/**
*This class calls the cup and flex classes to compile the source code
*/
public class Compiler2
{

	/**
	* Compiles the source code file
	* @param String filename The absolute path of the file
	*/
	public void compile(String filename)
	{
		System.out.println("Compiling: " + filename);
		
		Lexer scanner = null;
		
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(filename);
          java.io.Reader reader = new java.io.InputStreamReader(stream);
		  
		  
		  ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
		  BinaryGenerator bin = new BinaryGenerator();
          Parser parser = new Parser(new Lexer(reader,symbolFactory),symbolFactory,filename,bin);
		  parser.parse();
		  

		  System.out.println("Compiling finished.");
        }
        catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
        }
		
		
	}
}