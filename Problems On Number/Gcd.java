import java.util.*;

class Gcd
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a First numbers");
		int ino1 = scan.nextInt();

		System.out.println("Enter a second numbers");
		int ino2 = scan.nextInt();

		int iSmall = 0;

		if( ino1 < ino2)
			iSmall = ino1;
		else
			iSmall = ino2;

		int iFlag = 0 , i=0;
		for( i=iSmall; i>0; i--)
		{
			if( (ino1%i)==0 && (ino2%i)==0 )
			{
				iFlag = 1;
				break;
			}
		}

		System.out.println("Gcd is :"+i);
		
	}
}