class Base
{
	public int i = 0;

	public Base( int no)
	{
		System.out.println("Parameterised Base");
		this.i = no;
	}

	public void fun()
	{
		System.out.println("Inside Base fun.");
	}
}

class Derived extends Base
{
	public int j = 0;
	public Derived()
	{
		super(11);
		System.out.println("Default Derived.");
		this.j = 20;
	}

	public void gun()
	{
		System.out.println("Derived gun.");
		System.out.println(this.j);
		System.out.println(super.i);
	}
}

class Super
{
	public static void main( String[] args)
	{
		Derived dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}
}
