class A 
{ 
 void msg() 
 { 
    System.out.println("Hello Java"); 
  } 
} 
class B 
{ 
  void msg() 
  { 
     System.out.println("Welcome you"); 
  } 
 } 
public class C extends A, B 
{ 
 // Suppose if it is.
 public static void main(String args[]) 
 { 
   C obj = new C(); 
   obj.msg();//Now which msg() method would be called? 
  } 
 }