package com.dev.Exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) throws Exception{
		
		try {
			s();
			System.out.println("No exception for s()");
			int res = divide(10 , 0);
			System.out.println("No exception for divide()");
			System.out.println(res);
			
		}catch(NegativeArraySizeException e) {       // Unchecked or run time exception
			System.err.println("Exception caught in catch block");
			System.err.println("get message(): "+e.getMessage());
			e.printStackTrace();
			
		}catch(ArithmeticException e) {
			System.err.println("Exception caught in catch block");
			System.err.println("get message(): "+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}
		

	}
	
	public static int divide(int i , int j ) {
		int res = i/j;
		return res;
	}
	
	public static void s() throws Exception{
		StringBuffer sb = new StringBuffer(1);
	}

}  
