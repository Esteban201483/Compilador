import java.io.*;

/**
* Handles the output generation
*/
public class OutputWriter
{
	private FileWriter writer;
	
	/**
	* Creates a new file to put the binary code.
	* @param String filename The absolute path of the file
	*/
	public OutputWriter(String filename)
	{
		try
		{
			writer = new FileWriter(filename + ".code");
		}
		catch(Exception e)
		{
			System.out.println("Error: Output file can't be created");
		}
		
	}
	
	/**
	* Writes text and a line break into the file
	* @param String newLine The new line to write into the file
	*/
	public void writeLine(String newLine)
	{	
		try
		{
			writer.write(newLine + "\n");
			writer.flush();
		}
		catch(Exception e)
		{
			System.out.println("Error: file can't be writed");
		}
		
	}
	
	/**
	* Writes text into the file
	* @param String text The text to write into the file
	*/	
	public void write(String text)
	{	
		try
		{
			writer.write(text);
			writer.flush();
		}
		catch(Exception e)
		{
			System.out.println("Error: file can't be writed");
		}
		
	}
	
	
	/**
	* close the file
	*/
	public void Finish()
	{
		try
		{
			writer.close();
		}
		catch(Exception e)
		{
			System.out.println("Error: file can't be closed");
		}
	}
}