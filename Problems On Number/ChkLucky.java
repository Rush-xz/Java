/////////////////////////////////////////////////////
//
//	Accept no. from user and check whether no. is lucky 
//	no. or not.
//	Lucky no. is such a no. which contains every unique 
//	digit in it.	
//
/////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;

class LuckyNo
{
	public int iDigit = 0;
	public int Arr[] = new int[10];
	// int Arr[] = {0,0,0,0,0,0,0,0,0,0};
	public int i = 0;

	LuckyNo()
	{
		for(i=0; i<Arr.length; i++)
		{
			Arr[i] = 0;
		}
	}

	public boolean isLucky( int iNo )
	{

		if( iNo < 0)
		{
			iNo = -iNo;
		}

		while( iNo != 0)
		{	
			iDigit = iNo % 10;

			Arr[iDigit]++;

			if( Arr[iDigit] > 1)
			{
				break;
			}

			iNo = iNo / 10;
		}

		if( iNo == 0 )
			return true;
		else
			return false;
	}

}

public class ChkLucky
{
	public static void main( String arg[] )
	{
		Scanner scan = new Scanner(System.in);
		boolean bRes = false;

		System.out.println("Enter Number :");
		int iNo = scan.nextInt();

		LuckyNo lobj = new LuckyNo();
		bRes = lobj.isLucky(iNo);

		if( bRes == true )
		{
			System.out.println("Given no. is Lucky Number.");
		}
		else
		{
			System.out.println("Given no. is not Lucky Number.");			
		}
	}
}

/* OUTPUT :

Enter Number :
1454
Given no. is not Lucky Number.

Enter Number :
7548
Given no. is Lucky Number.

*/