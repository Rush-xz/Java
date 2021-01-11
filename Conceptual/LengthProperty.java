///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate length property and 
//	Single-D Array.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package

class LengthProperty
{
	public static void main(String[] args)
	{
		int iSum = 0;
		int Arr[] = new int[4];
		Arr[0] = 5;
		Arr[1] = 6;
		Arr[2] = 8;
		Arr[3] = 2;

		for( int i=0; i<Arr.length; i++)
		{
			iSum = iSum + Arr[i];
		}

		System.out.println("Sum is :"+iSum);
		
	}
}

/* OutPut :

Sum is :21

*/