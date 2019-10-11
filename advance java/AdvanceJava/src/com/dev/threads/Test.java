package com.dev.threads;

public class Test {
	
	public static void main(String [] args) {
		System.out.println("main thread started...");
		
		for(int i = 1 ;i <=1000000 ; i++) {
			System.out.println("i = "+i);
		}
		
		for(int j = 1 ; j<= 11 ;j++) {
			System.out.println("j = "+j);
		}
		
		System.out.println("main thread is terminated...");
	}

}
