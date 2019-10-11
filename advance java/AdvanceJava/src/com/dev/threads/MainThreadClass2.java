package com.dev.threads;

public class MainThreadClass2 extends Thread {    // because t2 extends thread so indrectly it impement the runnable in runnable run method is present thats why we override run method here

	
	@Override
	public void run() {
		System.out.println("main thread printing the value of j");
		System.out.println("t2 thread started...");
			
		for(int j = 1 ; j<= 10 ; j++) {
			System.out.println("j = "+j);
			
		}
		
		System.out.println("t2 thread terminated...");
	}
	
	
	
	
	
	

}
