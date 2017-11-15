package pack2;

import pack1.Base;

public class C {
	
	void get()
	{
		new Base(this);
		System.out.println("normal class C is calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C().get();
	}

}
