
class main
{
	public static void main(String[] args)  throws Exception
	{
		System.out.println(args[0]);
		
		if(args.length == 0)
			System.out.println("Specify the source files as parameters");
		else
		{
			Compiler2 c = new Compiler2();
			for(int i = 0; i < args.length; ++i)
				c.compile(args[i]);
		}
				
	}
}