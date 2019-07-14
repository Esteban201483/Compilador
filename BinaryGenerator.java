import java.util.HashMap;

public class BinaryGenerator
{
	HashMap<String,String> instructions;
	int byteCounter; //used to calculate padding in data section
	
	public BinaryGenerator()
	{
		byteCounter = 0;
		instructions = new HashMap<String,String>();

		//Fills the instructions
		instructions.put("add","00000");
		instructions.put("addi","000001");
		instructions.put("call","110011" + "00000000000000000000000000");
		instructions.put("ret","110101" + "00000000000000000000000000");
		instructions.put("syscall","110110" + "00000000000000000000000000");
		
	
		System.out.println("BinaryGenerator Up");
	}
	
	public String getOperationBinary(String operation)
	{
		return instructions.get(operation);
	}
	

	public String getRegisterBinary(String register)
	{
		String binary = "";
		int registerID = Integer.parseInt(register.replace("r",""));
		
		binary = convertIntToBinary(registerID,6);
		
		return binary;
	}
	
	public String getImmediateBinary(int Immediate)
	{
		return "Immediate";
	}
	
	public String convertIntToBinary(int value, int bits)
	{
		String binary = "";
		
		binary = Integer.toBinaryString(value);
		
		while(binary.length() < bits)
			binary = "0" + binary;
		
		return binary;
	}
	
	public String convertStringToBinary(String string)
	{
		String binary = "";
		
		for(int c = 0; c < string.length(); ++c)
		{
			if(string.charAt(c) != '\"')
			{
				binary += convertIntToBinary((int)(string.charAt(c)),8);
				
				/*System.out.println("Valuee: " + Character.getNumericValue(string.charAt(c)));
				System.out.println("Char: " + string.charAt(c));
				System.out.println("Bin: " + convertIntToBinary((int)(string.charAt(c)),8));*/
				
			}
		}
		
		byteCounter += string.replace("\\","").length() -2; //quotes
		return binary;
	}
	
	public String ConvertWordToBinary(int immediate, String wordType)
	{
		String binary = "";
		
		int size = 64;
		
		if(wordType.equals("word"))
			size = 32;
		
		binary = convertIntToBinary(immediate,size);
		byteCounter += size/8;
		return binary;
	}
	
	public String getPadding()
	{
		String padding = "";
		int total = 512 - byteCounter;
		
		for(int i = 0; i < total; ++i)
			padding+="0";
		
		return padding;
	}
}