package pack1;

import pack2.B;
import pack2.C;

public class Base {
	public B a;
	public C c;
	
	public Base(B a)
	{
		this.a=a;
		System.out.println("Base class B is calling");
	}
	
	public Base(C c)
	{
		System.out.println("Base class C is calling");
		this.c=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
