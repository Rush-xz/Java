///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate Iteration.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package
import java.io.*;

class Loops
{
	public static void main(String[] args)
	{

		for( int i=0; i<5; i++)
		{
			System.out.println(i);
		}

		int no = 0;
		while( no < 5)
		{
			System.out.println(no);
			no++;
		}

		int value = 0;
		do
		{
			System.out.println(value);
			value++;
		}while( value < 5);

	}
}

/* OutPut :

0
1
2
3
4
0
1
2
3
4
0
1
2
3
4

*/