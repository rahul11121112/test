class ParentClass
{
ParentClass()
{
this("hi");
System.out.println("in ParentClass 0 arg constructor 1");
}

ParentClass(String msg)// 2
{
System.out.println("in ParentClass(String) constructor 2");
}
}

class ConstructorChain extends ParentClass
{
ConstructorChain()// 3
{
this(10);// calling 5 number constructor
System.out.println("in ConstructorChain 0 arg constructor 3");
}

ConstructorChain(String  msg)// 4
{
super();//calling 1 number parent class constructor
System.out.println("in ConstructorChain(String msg) arg constructor 4");
}

ConstructorChain(int i)// 5
{
this("hi");//calling 4 number constructor
System.out.println("in ConstructorChain(int i) constructor 5");
}
 // main() method
public static void main(String[] args)
{
ConstructorChain cobj = new ConstructorChain(); // calling 3 number constructor
}
}