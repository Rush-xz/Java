
class Demo
{
	public int i;

	public Demo()
	{
		System.out.println("default constr.");
		this.i = 10;
	}

	public Demo(int no)
	{
		this();
		System.out.println("Parameterised Constr.");
		this.i = no;
	}

	//public void( Demo this)
	public void fun()
	{
		System.out.println("Inside Fun");
		System.out.println("this.i"+this.i);
	}
}

class ThisKeyword
{
	public static void main( String arg[])
	{
		Demo dobj1 = new Demo();

		dobj1.fun();

		Demo dobj2 = new Demo(11);

		dobj2.fun();
	}
}