package com.interfaces;



public class RunnableWithString implements Runnable {
int num;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("threds are running..");
		for(int i =0;i<=100;i++) {
		if(i%2==0) {
			System.out.println("even numbers:"+i);
		}else {
			System.out.println("odd numbers : " + i);
		}}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         Runnable  r1 = new RunnableWithString();
         Thread t1 = new Thread(r1);
         t1.start();
         t1.sleep(1000);
       System.out.println("Runnable interface is run:");
      
	}
}

