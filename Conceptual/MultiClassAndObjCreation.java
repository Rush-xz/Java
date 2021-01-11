///////////////////////////////////////////////////////////////
//
//	Application program to demonstrate multiple classes and object
//	creation.
//  
///////////////////////////////////////////////////////////////
import java.lang.*; //default Package
import java.io.*;

class Hello
{
	public int no = 10;
	public int value = 20;

	public void Fun() //behaviour
	{
		System.out.println("Inside Fun");
	} 

	public void Gun() //behaviour
	{
		System.out.println("Inside Gun");
	}
}//end of the Hello class declaration

class MultiClassAndObjCreation
{
	public static void main(String[] args)
	{
		System.out.println("Inside main");

		Hello hobj; //Reference of Hello class
		hobj = new Hello(); //object creation

		System.out.println("Value of no :"+hobj.no);
		System.out.println("Value of value :"+hobj.value);

		hobj.Fun();

		System.out.println("Hashcode of hobj :"+hobj.hashCode());

		hobj = null;

	}
}

/* OutPut :

Inside main
Value of no :10
Value of value :20
Inside Fun
Hashcode of hobj :26253138

*/