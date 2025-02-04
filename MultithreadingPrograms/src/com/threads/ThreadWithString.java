package com.threads;

public class ThreadWithString extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread("Hello world");
		t1.start();
		String string = t1.getName();
		System.out.println(string);
	}

}
