public class CommandLineArg
{
	public static void main( String arg[])
	{
		System.out.println("Inside main");

		System.out.println("Total no. of arguments :"+arg.length);

		System.out.println("Arguments :");
		for( int i=0; i<arg.length; i++)
		{
			System.out.println(arg[i]);
		}
	}
}

/*

javac CommandLineArg.java

java CommandLineArg First Second Third
Inside main
Total no. of arguments :3
Arguments :
First
Second
Third

*/