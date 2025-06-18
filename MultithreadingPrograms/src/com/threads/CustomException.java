package com.threads;


public class CustomException  extends Thread{
	
	public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	 CustomException t1 = new  CustomException();
    	 CustomException t2 = new  CustomException();
        t1.start();
        t1.join(); // waits for t1 to finish
        t2.start();
    }

}
