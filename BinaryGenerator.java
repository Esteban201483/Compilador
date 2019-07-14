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

		//Fills the hashmap of instructions
		instructions.put("add","000000");
		instructions.put("and","001010");
		instructions.put("andi","001011");
		instructions.put("addi","000001");
		instructions.put("call","110011 " + "00000000000000000000000000");
		instructions.put("div","000110");
		instructions.put("divi","000111");
		instructions.put("je","101010");
		instructions.put("jges","101101");
		instructions.put("jgeu","101110");
		instructions.put("jgs","111001");
		instructions.put("jgu","111010");
		instructions.put("jles","110001");
		instructions.put("jleu","110010");
		instructions.put("jls","101111");
		instructions.put("jlu","110000");
		instructions.put("jmp","101001");
		instructions.put("jne","101011");
		instructions.put("lsb","100000");
		instructions.put("lsh","100010");
		instructions.put("lsw","100100");
		instructions.put("lub","100001");
		instructions.put("luh","100011");
		instructions.put("luw","100101");
		instructions.put("mod","001000");
		instructions.put("modi","001001");
		instructions.put("mul","000001");
		instructions.put("muli","000101");
		instructions.put("not","010000");
		instructions.put("noti","010001");
		instructions.put("or","001100");
		instructions.put("ori","001101");
		instructions.put("pop","111000");
		instructions.put("push","110111");
		instructions.put("ret","110101 " + "00000000000000000000000000");
		instructions.put("sal","010010");
		instructions.put("sali","010011");
		instructions.put("sar","010100");
		instructions.put("sari","010101");
		instructions.put("sb","100110");
		instructions.put("scl","011010");
		instructions.put("scli","011011");
		instructions.put("scr","011100");
		instructions.put("scri","011101");
		instructions.put("sh","100111");
		instructions.put("sll","010110");
		instructions.put("slli","010111");
		instructions.put("slr","011000");
		instructions.put("slri","011001");
		instructions.put("sub","000010");
		instructions.put("subi","000011");
		instructions.put("sw","101000");
		instructions.put("syscall","110110 " + "00000000000000000000000000");
		instructions.put("xor","001110");
		instructions.put("xori","001111");
	
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