package pack2;

class TestSleepMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
	  TestSleepMethod1 t1=new TestSleepMethod1();  
	  TestSleepMethod1 t2=new TestSleepMethod1();  
	   
	  t1.start();  
	 // t2.start();  
	 }  
	}  
