package com.interfaces;

public class Employee  implements Runnable{ 

	
	

		public void run()
		{
			int num ;
			for(int i =1 ;i<=100;i++) {
				System.out.println("print the number even and odd numbers");
			if(i%2==0) {
				System.out.println("even numbers" + i);
			}else {
				System.out.println("odd numners" + i);
			}}
			}

		
		
		public static void main(String[] args) {
	 //Thread  t = new Thread(new Employee());
			//Employee e = new Employee();
//			t.start();
			
			Runnable r = new Employee();
			Thread t1 = new Thread(r);
			t1.start();
			
			
		}
	
}
