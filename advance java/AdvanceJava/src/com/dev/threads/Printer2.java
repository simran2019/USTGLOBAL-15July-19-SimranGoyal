package com.dev.threads;

public class Printer2 {
	
	synchronized public void printing(int i , String pic) {
		
		for(int j = 1 ; j <i ;j++) {
			System.out.println("Thread "+ " "+pic+" "+j);
		}
	}

}
