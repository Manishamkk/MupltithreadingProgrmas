package com.threads;

public class Multi extends Thread{

	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Multi m1 = new Multi();
     m1.start();

	}

}
