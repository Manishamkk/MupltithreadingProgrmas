package com.exapmles;

public class Thread1 extends Thread{

	
	public void run() {
		try {
			Thread.sleep(0);
			System.out.println("Thread is running.....");
		}catch(InterruptedException e) {
			System.out.println(e +  "InterruptedException throws:");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread1 t = new Thread1();
t.start();
t.interrupt();

	}

}
