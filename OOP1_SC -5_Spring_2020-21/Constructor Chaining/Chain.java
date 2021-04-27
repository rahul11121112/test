class Person
	{
		Person()
		{
			System.out.print("A");
		}
		Person(int x)
		{
			System.out.print("B");
		}
		Person(int x,int y) // this method is not invoked in this program
		{
			System.out.print("C");
		}
	}
	class Emp extends Person
	{
		Emp()
		{	
			//by default the default constructor of Person is invoked
			System.out.print("X");
		}
		Emp(int x)
		{
			super();	// default constructor of Person is invoked
			System.out.print("Y");
		}
		Emp(int x,int y)
		{
			super(x);	//1-argumented constructor of Person is invoked
			System.out.print("Z");
		}
	}
	class Chain
	{
		public static void main(String arg[]) 
		{	
			Emp e1=new Emp();
			Emp e2=new Emp(10);
			Emp e3=new Emp(20,30);
		}
	}