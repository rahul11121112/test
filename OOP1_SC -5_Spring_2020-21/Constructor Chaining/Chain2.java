class A
	{
		A()
		{
			System.out.print("A0");
		}
		A(int x)
		{
			this();
			System.out.print("A1");
		}
	}
	class B extends A
	{
		B()
		{			
			super(10);
			System.out.print("B0");
		}
		B(int x)
		{
			this();
			System.out.print("B1");
		}
	}
	class Chain2
	{
		public static void main(String arg[]) 
		{	
			new B(20);
		}
	}