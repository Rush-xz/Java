import java.util.*;

class Fibonacci
{
	public static void main( String arg[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number :");
		int iNo = scan.nextInt();

		Series sobj = new Series();

		sobj.fibSeries(iNo); 
	}
}

class Series 
{
	public void fibSeries( int iValue)
	{
		int iFirst = 0 , iSecond = 1 , iThird = 0;

		while(iValue != 0)
		{
			System.out.print(iFirst+" ");

			iThird = iFirst + iSecond;

			iFirst = iSecond;

			iSecond = iThird;

			iValue--;
		}
	}
}

/* OUTPUT :

Enter a number :
10
0 1 1 2 3 5 8 13 21 34

*/