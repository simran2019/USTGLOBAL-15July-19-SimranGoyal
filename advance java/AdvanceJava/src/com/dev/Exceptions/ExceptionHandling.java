package com.dev.Exceptions;

public class ExceptionHandling {

	
	public static void main(String []args) {
		
		try {
			
			s();
			
		}catch(Exception e) {
			
			System.out.println("Excepton Occured");
			e.printStackTrace();
		}finally {
			System.out.println("this is a finally block");
		}
		System.out.println("code for Exception");
		
	}
	
	public static void s() {
		StringBuffer sb = new StringBuffer(-1);
		
	}
}
