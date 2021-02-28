import java.util.*;

class StringReverse
{
	public static void main( String arg[])
	{
		Scanner scan = new Scanner(System.in);

		String str = new String();

		System.out.println("Enter String :");
		str = scan.next();
		/*
		Reverse robj = new Reverse();*/

		char Arr[] = str.toCharArray();
		int iStart = 0;
		int iEnd = Arr.length-1;
		char Temp;

		while( iStart < iEnd )
		{
			Temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = Temp;

			iStart++;
			iEnd--;
		}


		/*String strx = robj.revString(str);*/

		String strx = Arr.toString();
		System.out.println("Reversed String :"+strx);
	}
}

class Reverse
{
	public String revString( String input)
	{
		char Arr[] = input.toCharArray();
		int iStart = 0;
		int iEnd = Arr.length-1;
		char Temp;

		while( iStart < iEnd )
		{
			Temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = Temp;

			iStart++;
			iEnd--;
		}

		iStart = 0;
		while( iStart < Arr.length )
		{
			System.out.print(Arr[iStart]);
			iStart++;
		}
		
		return Arr.toString();
	}
}