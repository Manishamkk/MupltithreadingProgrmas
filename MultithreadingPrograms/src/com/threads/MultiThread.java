package com.threads;

import java.util.Scanner;

public class MultiThread extends Thread{
   int num;
	public void run() {
		System.out.println("thread is running...");
		
	//	Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number:");
		//num =sc.nextInt();
		for(int i =1; i<=10;i++) {
		if(i%2==0) {
			System.out.println("even numbers"+i);
		}else {
			System.out.println("odd numbers"+i);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MultiThread m1 = new MultiThread();
     m1.start();

	}
}
