package com.threads;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Selver is running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Task t1 = new Task();
	Thread te = new Thread(t1);
	te.start();
	}

	
}
