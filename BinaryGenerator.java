import java.util.HashMap;

public class BinaryGenerator
{
	private HashMap<String,String> instructions;
	private HashMap<String,Integer> symbolTable;
	
	private int byteCounter; //used to calculate padding in data section and offset when using a variable
	private int stackSize; //Used to calculate directions
	private int memorySize;
	private int registerSize;
	
	public BinaryGenerator()
	{
		byteCounter = 0;
		stackSize = 128;
		memorySize = 32;
		registerSize = 5;
		
		instructions = new HashMap<String,String>();
		symbolTable = new HashMap<String,Integer>();

		//Fills the instructions
		instructions.put("add","000000");
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
		
		binary = convertIntToBinary(registerID,registerSize);
		
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
	
	public String convertStringToBinary(String string, String varName)
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
		
		symbolTable.put(varName, new Integer(byteCounter));
		byteCounter += string.replace("\\","").length() -2; //quotes
		return binary;
	}
	
	public String ConvertWordToBinary(int immediate, String wordType, String varName)
	{
		String binary = "";
		
		int size = 64; //dword by default
		
		if(wordType.equals("word"))
			size = 32;
		
		binary = convertIntToBinary(immediate,size);
		symbolTable.put(varName, new Integer(byteCounter));
		
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
	
	public String getVariableOffset(String varName)
	{
		String offset = "";
		
		if(symbolTable.containsKey(varName))
			offset = convertIntToBinary(symbolTable.get(varName),16); 
		else
			System.out.println(">>>Warning: Tag:  " + varName + " not found" );
		
		return offset;
	}
	
	public void printSymbolTable()
	{
		for (String variable : symbolTable.keySet()) 
		{
		  System.out.println("Variable: " + variable + " Offset: " + symbolTable.get(variable));
		}
	}
}