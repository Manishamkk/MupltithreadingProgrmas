package com.threads;

public class DemoPriority  extends Thread{

	public void run() {
		System.out.println(" running thread name " + Thread.currentThread().getName());
		System.out.println("running thread priority " + Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoPriority d = new DemoPriority();
		DemoPriority d2 = new DemoPriority();
		d.setPriority(MAX_PRIORITY);
		d2.setPriority(MIN_PRIORITY);
		
		d.setName("Manisha");
		d2.setName("Kadam");
		d.start();
		d2.start();
	}

}
