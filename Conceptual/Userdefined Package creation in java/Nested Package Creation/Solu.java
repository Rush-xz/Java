import Multiplication.info.Multi;
import java.util.*;

class Solu
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		float fValue1 = 0 , fValue2 = 0;

		System.out.println("Enter First number :");
		fValue1 = scan.nextFloat();
		System.out.println("Enter Second number :");
		fValue2 = scan.nextFloat();

		Multi mobj = new Multi();

		float fRet = mobj.Multiply(fValue1,fValue2);

		System.out.println("Multiplication is :"+fRet);

	}

}

/* OUTPUT : 

Enter First number :
3
Enter Second number :
6
Multiplication is :18.0

*/