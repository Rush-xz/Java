/////////////////////////////////////////////////////
//
//	Accept no. from user and check whether no. is Strong 
//	no. or not.
//	Strong no. is such a no. whose summesion of factorial
//	of its digit is same as that no.	
//
/////////////////////////////////////////////////////
//import java.lang.*;
import java.util.*;

class StrongNo
{
	public int iDigit = 0 , iSum =0 , iFact = 0;
	public int i = 0;

	public boolean isStrong( int iNo )
	{
		int iTemp = iNo;

		if( iNo < 0)
		{
			iNo = -iNo;
		}

		while( iNo != 0)
		{	
			iDigit = iNo % 10;

			for( i=iDigit,iFact=1; i!=0; i--)
			{
				iFact = iFact * i;
			}

			iSum = iSum + iFact;

			if( iSum > iTemp )
				break;

			iNo = iNo / 10;
		}

		if( iSum == iTemp )
			return true;
		else
			return false;
	}

}

public class ChkStrong
{
	public static void main( String arg[] )
	{
		Scanner scan = new Scanner(System.in);
		boolean bRes = false;

		System.out.println("Enter Number :");
		int iNo = scan.nextInt();

		StrongNo lobj = new StrongNo();
		bRes = lobj.isStrong(iNo);

		if( bRes == true )
		{
			System.out.println("Given no. is Strong Number.");
		}
		else
		{
			System.out.println("Given no. is not Strong Number.");			
		}
	}
}

/* OUTPUT :

Enter Number :
145
Given no. is Strong Number.

Enter Number :
456
Given no. is not Strong Number.

*/