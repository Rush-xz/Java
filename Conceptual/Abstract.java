abstract class Base 
{
	public int value;

	public Base()
	{
		System.out.println("Base Constructor.");
		this.value = 10;
	}

	//concrete method
	public int add( int ino1 , int ino2)
	{
		return ino1 + ino2;
	}

	//abstract method
	abstract public int div( int ino1 , int ino2);
}

class Derived extends Base
{
	public Derived()
	{
		System.out.println("Derived Constructor.");
	}

	//concrete method
	public int div( int ino1 , int ino2)
	{
		return ino1/ino2;
	}
}

class Abstract
{
	public static void main( String arg[])
	{
		Base bobj = new Derived(); //Upcasting
		//Base bobj = new Base(); error

		System.out.println("Add :"+bobj.add(15,65));
		System.out.println("Div :"+bobj.div(3,2));
		System.out.println("Value :"+bobj.value);

	}
}
