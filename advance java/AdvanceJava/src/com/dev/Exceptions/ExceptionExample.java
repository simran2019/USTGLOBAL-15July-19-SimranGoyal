package com.dev.Exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		
		  double d = 10.0;
		  double q = 0.0;
		  System.out.println("Result = "+d/q);
		 
		
		
		System.out.println("print statement before");
		// for represent the error handling the the flow of hierarchy
		s();
		System.out.println("print statement after");
		
	}
	
	public static void s() {
		
		StringBuffer sb = new StringBuffer(-1);
		System.out.println("print statement");
		
	}

}
