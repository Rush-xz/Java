/////////////////////////////////////////////////////
//
//	Accept no. from user and check whether no. is ArmStrong 
//	no. or not.
//	ArmStrong no. is such a no. whose summesion of digits with
//	the power is same as the digit where power is no. of digits
//	in the number.	
//
/////////////////////////////////////////////////////
//import java.lang.*;
import java.util.*;

class ArmstrongNo
{
	public int iDigit = 0 , iSum =0 , iMult = 0;
	public int i = 0 , length = 0;

	public boolean isArmstrong( int iNo )
	{
		int iTemp = iNo;

		if( iNo < 0)
		{
			iNo = -iNo;
		}

		while( iNo != 0 )
		{
			length++;
			iNo = iNo/10;
		} 

		iNo = iTemp;
		while( iNo != 0)
		{	
			iDigit = iNo % 10;

			for( i=0,iMult=1; i<length; i++)
			{
				iMult = iMult * iDigit;
			}

			iSum = iSum + iMult;

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

public class ChkArmstrong
{
	public static void main( String arg[] )
	{
		Scanner scan = new Scanner(System.in);
		boolean bRes = false;

		System.out.println("Enter Number :");
		int iNo = scan.nextInt();

		ArmstrongNo lobj = new ArmstrongNo();
		bRes = lobj.isArmstrong(iNo);

		if( bRes == true )
		{
			System.out.println("Given no. is Armstrong Number.");
		}
		else
		{
			System.out.println("Given no. is not Armstrong Number.");			
		}
	}
}

/* OUTPUT :

Enter Number :
153
Given no. is Armstrong Number.

Enter Number :
1534
Given no. is not Armstrong Number.
*/