///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate Multi-D Array.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package
import java.util.Scanner;

class MultiDArray
{
	public static void main(String[] args)
	{
		int iMult = 0;
		int Arr[][] = new int[3][2];
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Values :");

		for( int i=0; i<Arr.length; i++)
		{
			for( int j=0; j<Arr[i].length; j++)
			{
				Arr[i][j] = sobj.nextInt();
			}
		}

		iMult = 1;	
		for( int i=0; i<Arr.length; i++)
		{
			for( int j=0; j<Arr[i].length; j++)
			{
				iMult = iMult * Arr[i][j];
			}
		}

		System.out.println("Multiplication is :"+iMult);
		System.out.println(Arr.length);		
	}
}

/* OutPut :

Enter the Values :
5
1
2
3
4
1
Multiplication is :120
3

*/