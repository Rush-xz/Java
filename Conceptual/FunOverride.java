class Base
{
	public void fun()
	{
		System.out.println("Base fun.");
	}

	public void gun()
	{
		System.out.println("Base gun.");
	}
}

class Derived extends Base
{
	public void fun()
	{
		System.out.println("Derived fun.");
	}

	public void sun()
	{
		System.out.println("Derived sun.");
	}
}

class FunOverride 
{
	public static void main(String[] arg)
	{
		Base bobj = new Base(); //no casting
		Derived dobj = new Derived(); //no casting
		Base up = new Derived(); //up casting

		bobj.fun();//Base fun
		bobj.gun();//Base fun

		dobj.fun();//Derived fun
		dobj.gun();//Base gun
		dobj.sun();//Derived sun

		up.fun();//Derived fun
		up.gun();//Base gun
		//up.sun(); //error

	}

}
