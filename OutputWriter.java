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
			writer.write(newLine);
		}
		catch(Exception e)
		{
			System.out.println("Error: file can't be closed");
		}
	}
	
	
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