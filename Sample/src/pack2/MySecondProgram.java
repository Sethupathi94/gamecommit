package pack2;
//code from nisha
class A{
	 static int a=15;
	 private static int j;
	 protected static int b=6;
	 public final static int varB = 456;
	 public static int gg = MySecondProgram.lk;
	 public static void jhg(){
	  System.out.println("Class a calling  varb "+varB);
	  System.out.println("Class a calling  b "+b);
	  System.out.println("Class a calling j  "+j);
	  System.out.println("Class a calling gg  "+gg);
	 }
	}



	public class MySecondProgram extends A{
	 static int c;
	 static int d;
	 //static int b =5;
	 public static int lk =5;
	 static int n;
	 public static int b=90;
	 
	 //static void jhg(){
	 // System.out.println("Class while calling");
	 //}
	 
	 public static void main(String[] args){
	  A.jhg();
	  c = A.a;
	  n = A.b;
	  System.out.println("value c-->"+n);
	  n = A.varB;
	  System.out.println("value c-->"+n);
	  System.out.println("value base class-->"+c);
	  System.out.println("value protected -->"+n);
	  System.out.println("value public class-->"+b);
	  d = A.b;
	  System.out.println("value not init-->"+d);
	 }
	}
