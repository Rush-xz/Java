/////////////////////////////////////////////////////
//
//	Accept two no. from user and check whether no. are 
//	anagram no. or not.
//	Anagram numbers are such numbers which contains same 
//	digits with same frequency in any order.	
//
/////////////////////////////////////////////////////
//import java.lang.*;
import java.util.*;

class AnagramNo
{
	public int iDigit = 0;
	public int i = 0;

	public boolean isAnagram( int iNo1 , int iNo2 )
	{
		if( iNo1 < 0)
		{
			iNo1 = -iNo1;
		}

		if( iNo2 < 0)
		{
			iNo2 = -iNo2;
		}

		int Arr[] = {0,0,0,0,0,0,0,0,0,0};

		while( (iNo1 != 0) && (iNo2 != 0))
		{	
			Arr[iNo1%10]++;
			Arr[iNo2%10]--;
			iNo1 = iNo1 / 10;
			iNo2 = iNo2 / 10;
		}

		if( (iNo1!=0) || (iNo2 != 0))
			return false;

		for( i=0; i<Arr.length; i++)
		{
			if(Arr[i] != 0)
			{
				break;
			} 
		}

		if( i != Arr.length )
			return false;
		else
			return true;
	}

}

public class ChkAnagram
{
	public static void main( String arg[] )
	{
		Scanner scan = new Scanner(System.in);
		boolean bRes = false;

		System.out.println("Enter First Number :");
		int iValue1 = scan.nextInt();

		System.out.println("Enter Second Number :");
		int iValue2 = scan.nextInt();

		AnagramNo lobj = new AnagramNo();
		bRes = lobj.isAnagram(iValue1,iValue2);

		if( bRes == true )
		{
			System.out.println("Given numbers are Anagram Numbers.");
		}
		else
		{
			System.out.println("Given numbers are not Anagram Numbers.");			
		}
	}
}

/* OUTPUT :

Enter First Number :
7589
Enter Second Number :
7598
Given numbers are Anagram Numbers.

Enter First Number :
7758
Enter Second Number :
5787
Given numbers are Anagram Numbers.

Enter First Number :
4589
Enter Second Number :
4509
Given numbers are not Anagram Numbers.

*/