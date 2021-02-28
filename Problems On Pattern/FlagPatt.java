import java.util.*;

class FlagPatt
{
	public static void main( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scan.next();

		Pattern pobj = new Pattern();

		pobj.pattTriangle(str);
	}
}

class Pattern
{
	public void pattTriangle( String str)
	{
	  char[] Arr = str.toCharArray();
	  
	  System.out.println();
	  for (int i=0; i<Arr.length-1; i++) 
	  {
	  	for( int j=0; j<Arr.length-1; j++)
	  	{
	  		if( i<=j )
	  		{
	  			System.out.print(Arr[j]+"\t");
	  		}
	  	}
	  	System.out.println();
	  	System.out.println();
	  	System.out.println();
	  }

	  
	  for (int i=1; i<Arr.length-1; i++) 
	  {
	  	for( int j=0,k=0; j<Arr.length-1; j++,k++)
	  	{
	  		if( i>=j )
	  		{
	  			System.out.print(Arr[k]+"\t");
	  		}
	  	}
	  	System.out.println();
	  	System.out.println();
	  	System.out.println();
	  }
	}
}

/* OUTPUT :

Enter the String :
HELLO

H       E       L       L


E       L       L


L       L


L


H       E


H       E       L


H       E       L       L

*/