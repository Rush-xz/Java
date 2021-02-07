class Base
{
	public int i;

	public Base()
	{
		i = 10;
		System.out.println("Inside Base Constructor.");
	}

	public void Fun()
	{
		System.out.println("Inside Demo Fun");
	}
}

class Derived1 extends Base
{
	public int j;

	public Derived1()
	{
		j = 20;
		System.out.println("Inside Derived1 Constructor.");
	}

	public void Gun()
	{
		System.out.println("Inside Derived1 Gun");
	}
}

class Derived2 extends Derived1
{
	public int k;

	public Derived2()
	{
		k = 30;
		System.out.println("Inside Derived2 Constructor.");
	}

	public void Sun()
	{
		System.out.println("Inside Derived2 Sun");
	}
}

class MultiLInheritance
{
	public static void main( String arg[])
	{
		Base dobj = new Base();
		System.out.println("Value of i"+dobj.i);
		dobj.Fun();

		System.out.println();

		Derived1 dobj1 = new Derived1();
		System.out.println("Value of i"+dobj1.i);
		System.out.println("Value of j"+dobj1.j);
		dobj1.Fun();
		dobj1.Gun();

		System.out.println();

		Derived2 dobj2 = new Derived2();
		System.out.println("Value of i"+dobj2.i);
		System.out.println("Value of j"+dobj2.j);
		System.out.println("Value of j"+dobj2.k);		
		dobj2.Fun();
		dobj2.Gun();		
		dobj2.Sun();		

	}
}

/*

Inside Base Constructor.
Value of i10
Inside Demo Fun

Inside Base Constructor.
Inside Derived1 Constructor.
Value of i10
Value of j20
Inside Demo Fun
Inside Derived1 Gun

Inside Base Constructor.
Inside Derived1 Constructor.
Inside Derived2 Constructor.
Value of i10
Value of j20
Value of j30
Inside Demo Fun
Inside Derived1 Gun
Inside Derived2 Sun

*/