package pack2;

import pack1.A;
import pack1.Base;

public class B {
	 void get()
	 {
		new Base(this); 
		System.out.println(" class B is calling");
		
	 }
	 

	public static void main(String[] args) {
		new B().get();
	    

	}

}
