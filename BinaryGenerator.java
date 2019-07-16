import java.util.HashMap;

public class BinaryGenerator
{
	private HashMap<String,String> instructions;
	private HashMap<String,Integer> symbolTable;
	private HashMap<String,Integer> labelMap;
	
	private int byteCounter; //used to calculate padding in data section and offset when using a variable
	private int stackSize; //Used to calculate directions
	private int memorySize;
	private int registerSize;
	private int instructionCounter;
	private int instructionSize;
	
	public BinaryGenerator()
	{
		byteCounter = 0;
		instructionCounter = 0;
		stackSize = 128;
		memorySize = 32;
		registerSize = 5;
		instructionSize = 4; //Bytes
		
		instructions = new HashMap<String,String>();
		symbolTable = new HashMap<String,Integer>();
		labelMap = new HashMap<String,Integer>();

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
	
	/**
	* Obtains the binary code of the operation
	* @param String operation The operation which binary code is required.
	* @returns the binary code of the operation.
	*/
	public String getOperationBinary(String operation)
	{
		++instructionCounter;
		System.out.println("Instruction Counter: " + instructionCounter);
		return instructions.get(operation);
	}
	

	/**
	* Converts a register value into binary representation
	* @param String register: The register to convert
	* @returns The Binary representation of the register.
	*/
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
	
	/**
	* Convert an int to binary representation and fill with zeros to fulfill the required bits
	* @param int value: The int value to convert 
	* @param int bits: indicates how many bits are spected.
	* @returns binary representation of the int, with the ammount of bits expected.
	*/
	public String convertIntToBinary(int value, int bits)
	{
		String binary = "";
		
		binary = Integer.toBinaryString(value);
		
		while(binary.length() < bits)
			binary = "0" + binary;
		
		return binary;
	}
	
	
	/**
	* Converts a String into binary representation and stores the string's name in the symbol table. Ignores quotes.
	* @param String string: The string to convert
	* @param String varName: The name of the variable
	* @return: The binary representation of the string
	*/
	public String convertStringToBinary(String string, String varName)
	{
		String binary = "";
		
		boolean isSpecial = false; //Used to detecte \0 and \n as single characters
		
		for(int c = 0; c < string.length(); ++c)
		{
			char character = string.charAt(c);
			if(character != '\"')
			{
				if(!isSpecial)
				{
					if(character=='\\') //Then it will be \0 or \n
					{
						isSpecial = true;
						//Expects an 0 or n
					}
					else
					{
						binary += convertIntToBinary((int)(character),8); //Normal convertion
					}
				}
				else
				{
					switch(character)
					{
						case '0':
							binary += convertIntToBinary(0,8); 
							break;
						case 'n':
							binary += convertIntToBinary(13,8);
							break;
						default:
							System.out.println("Warnings: Special character \\" + character + " not recognized");
							break;
					}
					isSpecial = false;
				}
			}
		}
		
		symbolTable.put(varName, new Integer(byteCounter));
		byteCounter += string.replace("\\","").length() -2; //Ignores start and end quotes
		return binary;
	}
	
	/**
	* add a label into the label's map
	* @param String labelName
	*/
	public void addLabel(String labelName)
	{
		labelMap.put(labelName.replace(":",""),new Integer(instructionCounter));
	}
	
	/**
	* Stores a word or dword variable in the symbol table.
	* @param int immediate: the value of the variable.
	* @param String wordType: word or dword.
	* @param String varName: the name of the variable. 
	* @returns Binary representation of the immediate value
	*/
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
	
	
	/**
	* Creates ceros as padding to fill data section.
	* @returns strings with ceros .
	*/
	public String getPadding()
	{
		String padding = "";
		int total = 512 - byteCounter;
		
		for(int i = 0; i < total; ++i)
			padding+="0";
		
		return padding;
	}
	
	/**
	* Returns the respective offset value of the variable. Uses the Stack Segment size in the offset's calculation .
	* Also handles labels, because the regex of labels and variables is equal
	* @param String varName: The variable or label name.
	* @returns: variable or label offset.
	*/
	public String getVariableOffset(String varName)
	{
		String offset = "";
		
		if(symbolTable.containsKey(varName))
			offset = convertIntToBinary(symbolTable.get(varName) + stackSize,16); 
		else
			if(labelMap.containsKey(varName))
				offset = convertIntToBinary((labelMap.get(varName) - instructionCounter)  * instructionSize,16); 
			else
				System.out.println(">>>Warning: Tag:  " + varName + " not found" );
		
		return offset;
	}
	
	
	/**
	* Prints all the symbols detected and their respective offset, ignoring stack segment.
	*
	*/
	public void printSymbolTable()
	{
		for (String variable : symbolTable.keySet()) 
		{
		  System.out.println("Variable: " + variable + " Offset: " + symbolTable.get(variable));
		}
	}
}