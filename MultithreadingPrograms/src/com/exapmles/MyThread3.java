package com.exapmles;

public class MyThread3 extends Thread {

	public MyThread3(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +
					"Priority :" + Thread.currentThread().getPriority() + "count:" + i);
			
			try {
				Thread.sleep(100);
			}catch(Exception e){
				
			}
			
		}
	}
	
	public  static void main(String[] args) {
		
		MyThread3 my = new MyThread3("Java Development");
		my.start();
		
		MyThread3 l = new MyThread3("Low priority");
		MyThread3 m = new MyThread3("medhium  priority");
		MyThread3 h = new MyThread3("High priority");
		
		l.setPriority(MIN_PRIORITY);
        m.setPriority(NORM_PRIORITY);
        h.setPriority(MAX_PRIORITY);
       l.start();
       m.start();
       h.start();
        
	}
}
