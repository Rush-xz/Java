import Marvellous.Maths;
import java.util.*;

class Demo 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int iValue1 = 0 , iValue2 = 0;

		System.out.println("Enter First number :");
		iValue1 = scan.nextInt();
		System.out.println("Enter Second number :");
		iValue2 = scan.nextInt();

		Maths mobj = new Maths();

		int iRet = mobj.Add(iValue1,iValue2);

		System.out.println("Addition is :"+iRet);

	}

}

/* OUTPUT : 

Enter First number :
10
Enter Second number :
15
Addition is :25

*/