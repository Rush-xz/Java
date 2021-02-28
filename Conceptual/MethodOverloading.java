class MethodOverloading
{
	public static void main( String[] args)
	{
		int i = 10 , j=2 , iRet = 0;
		float x=10.8f , y=2.8f , fRet = 0.0f;
		double a=10.8 , b=2.8 , c=9.7 , dRet = 0.0;

		Demo dobj = new Demo();

		iRet = dobj.Add(i,j);
		fRet = dobj.Add(x,y);
		dRet = dobj.Add(a,b,c);

		System.out.println("Add	:"+iRet);
		System.out.println("Add	:"+fRet);
		System.out.println("Add	:"+dRet);
	}
}

class Demo
{
	public int Add(int no1 , int no2)
	{
		return no1 + no2;
	}

	public float Add(float no1 , float no2)
	{
		return no1 + no2;
	}

	public double Add(double no1 , double no2 , double no3)
	{
		return no1 + no2 + no3;
	}

}

/*OUTPUT :

Add     :12
Add     :13.6
Add     :23.3

*/