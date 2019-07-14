import java.io.*;

public class OutputWriter
{
	private FileWriter writer;
	
	public OutputWriter(String filename)
	{
		try
		{
			writer = new FileWriter(filename + ".code");
			System.out.println("OutputWritter Up");
		}
		catch(Exception e)
		{
			System.out.println("Error: Output file can't be created");
		}
		
	}
	
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
	
	
	public void Finish()
	{
		try
		{
			writer.close();
			System.out.println("File Closed");
		}
		catch(Exception e)
		{
			System.out.println("Error: file can't be closed");
		}
	}
}