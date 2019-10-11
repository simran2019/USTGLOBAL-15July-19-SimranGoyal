package com.dev.Exceptions;

public class ThrowExample{

	/*
	 * public static void main(String[] args) throws Exception { s();
	 * System.out.println("code after the execution");
	 * 
	 * }
	 */

	/*
	 * public static void s() throws Exception , NegativeArraySizeException{
	 * StringBuffer sb = new StringBuffer(-1); }
	 */
	
	public static void main(String[] args) throws CustomException{
		s();
		try {
			
			divide(10 , 0);
		}catch (Exception e) {
			throw new CustomException();
		}
		/*
		 * s(); System.out.println("code after exception");
		 */
	}

	public static int divide(int i, int j) {
		
		int res = i/j;
		System.out.println(res);
		return 1 ;
		
		
	}
	
	public static void s() {
		try {
			StringBuffer sb = new StringBuffer(-1);
		}catch(Exception e) {
			new CustomException().printStackTrace();
		}
	}
	
	
/*	public static void s() throws CustomException{
		try {
			StringBuffer sb = new StringBuffer(-1);
			throw new CustomException();
			
		} catch (CustomException e) {
			System.out.println("catch block");
		}*/
	
		
//	}
}
