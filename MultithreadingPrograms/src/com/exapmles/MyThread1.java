package com.exapmles;

public class MyThread1 extends Thread {

	
	public void run() {
		
			
			
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){
				throw new RuntimeException(e);
				
			}
			
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread1 t = new MyThread1();
		t.start();
		t.join();
		System.out.println("Manisha");
		
		
	}

}
