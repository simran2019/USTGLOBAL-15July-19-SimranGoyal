
package com.dev.threads;

public class MainThreadClass3 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("main thread printing the value of k");
		System.out.println("thread started...");
		
		for(int k = 1;k<= 5;k++ ) {
			System.out.println("k = "+k);
		}
			
	
		System.out.println("thread end ...");
		
	}

}
