///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate Constructor and Destructor.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package
import java.io.*;

class Hello
{
	public int i;
	public int j;

	public Hello() //default destructor
	{
		this.i = 0;
		this.j = 0;
	} 

	public Hello( int x , int y )//parametermised constructor
	{
		this.i = x;
		this.j = y;
	}

	public void Hello()
	{
		System.out.println("Inside Hello Method");
	}

}//end of the Hello class declaration

class ConstrDestr
{
	public static void main(String[] args)
	{

		Hello hobj1; //Reference of Hello class
		hobj1 = new Hello(); //object creation
		Hello hobj2 = new Hello(11 , 23);
		Hello hobj3 = hobj2;
		hobj1.Hello();

		System.out.println(hobj1.hashCode());
		System.out.println(hobj2.hashCode());
		System.out.println(hobj3.hashCode());

		hobj1 = null;
		hobj2 = null;
		hobj3 = null;

	}
}

/* OutPut :

Inside Hello Method
26253138
33121026
33121026

*/