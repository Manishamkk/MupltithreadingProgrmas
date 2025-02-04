package com.threads;

public class RunnableWithString implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("threds are running..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Runnable  r1 = new RunnableWithString();
         Thread t1 = new Thread(r1,"Java Developers");
         t1.start();
         String str =t1.getName();
         System.out.println(str);
      
	}

}
