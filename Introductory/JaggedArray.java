///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate Jagged Array.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package
import java.util.Scanner;

class JaggedArray
{
	public static void main(String[] args)
	{
		int iMult = 0;
		int Arr[][] = new int[3][];

			Arr[0] = new int[2];
			Arr[1] = new int[3];
			Arr[2] = new int[2];
		
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
2
1
3
4
1
2
3
Multiplication is :144
3

*/