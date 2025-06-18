package com.threads;

public class StudentThread extends Thread {
	
	public void run() {
		
		int stuId =101;
		String stuName = "Pooja";
		String stuAdd = "PUNE";
		System.out.println(" Student Id : "+stuId + " Student Name"+ stuName+  "Student Address"+stuAdd);
	}

	public static void main(String[] args) {
		Thread t = new Thread( new StudentThread());
		t.start();
	
	}
}
