import java.util.*;

class FibonacciPatt
{
	public static void main( String arg[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number :");
		int iNo = scan.nextInt();

		Pattern sobj = new Pattern();

		sobj.fibPattern(iNo); 
	}
}

class Pattern 
{
	public void fibPattern( int iValue)
	{
		int iFirst = 0 , iSecond = 1 , iThird = 0;

		System.out.println();
		for( int i=1; i<iValue; i++)
		{
			for( int j=1; j<iValue; j++)
			{
				if( i>=j )
				{
					System.out.print(iFirst+"\t");
					iThird = iFirst + iSecond;
					iFirst = iSecond;
					iSecond = iThird;	
				}
				else
				{
					System.out.print("*"+"\t");
				}
			}

			System.out.println();
			System.out.println();
			System.out.println();

		}
	}
}

/* OUTPUT :

Enter a number :
5

0       *       *       *


1       1       *       *


2       3       5       *


8       13      21      34

*/