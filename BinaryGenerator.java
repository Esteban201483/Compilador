import java.util.HashMap;

public class BinaryGenerator
{
	HashMap<String,String> instructions;
	HashMap<String,String> registers;
	
	
	public BinaryGenerator()
	{
		instructions = new HashMap<String,String>();
		registers = new HashMap<String,String>();
		
		registers.put("call","110011" + "00000000000000000000000000");
		registers.put("ret","110101" + "00000000000000000000000000");
		registers.put("syscall","110110" + "00000000000000000000000000");
		
		System.out.println("BinaryGenerator Up");
	}
	
	public String getOperationBinary(String operation)
	{
		return registers.get(operation);
	}
	

	public int toBigEndianBinary(int littleEndianImmediate)
	{
		return littleEndianImmediate;
	}
}