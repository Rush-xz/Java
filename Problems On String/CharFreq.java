import java.util.*;

class CharFreq
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string :");
		String s = scan.next();

		System.out.println("Enter the Character :");
		char c = scan.next().charAt(0);

		int iCnt= 0;

		for( int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				iCnt++;
			}
		}
		

		System.out.println(iCnt);

	}
}