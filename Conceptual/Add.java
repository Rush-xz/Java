///////////////////////////////////////////////////////////////
//
//	Application program for addition.
//  
///////////////////////////////////////////////////////////////
import java.util.Scanner;

class Arithmetic
{
	public int no1 = 0 ;
	 int no2 = 0;

	public Arithmetic()//default
	{
		this.no1 = 0;
		this.no2 = 0;
	}

	public Arithmetic( int x , int y)//parameterised
	{
		this.no1 = x;
		this.no2 = y;
	}

	public int Add()
	{
		int iAns = 0;

		iAns = this.no1 + this.no2;

		return iAns;
	}
}

class Add
{
	public static void main(String[] args)
	{
		int iValue1 = 0;
		int  iValue2 = 0 , iRet = 0;

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First no :");
		iValue1 = sobj.nextInt();

		System.out.println("Enter Second no :");
		iValue2 = sobj.nextInt();

		Arithmetic aobj = new Arithmetic(iValue1 , iValue2);

		iRet = aobj.Add();

		System.out.println("Addition is :"+iRet);

		aobj = null;

	}
}

/* OutPut :

Enter First no :
5
Enter Second no :
6
Addition is :11


*/