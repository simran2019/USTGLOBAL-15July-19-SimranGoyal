package com.dev.lambdaexp;

public class Test123 {

	public static void main(String[] args) {
		
		FuncInt1 m1 =() ->{
			
			int i = 10/2;
			System.out.println("output of method1 "+i);
			
		};
		m1.method1();

		
		FuncInt2 m2 = () ->{
			try{
				int j = 10/1 ;
				System.out.println("output of method2 "+j);
				
			} catch(Exception e) {
				System.out.println("exception occur in try block");
			}
		};
		m2.method2();
		
		FuncInt3 m3 = () ->
		System.out.println("hello this function is without curly bracket");
		
		m3.method3();
		
		
		FuncInt4 m4 = (int k)->{
			for(int x = 1; x <= k;x++ ) {
				System.out.println("output of printval(int argument)= "+x);
			}
		};
		m4.printVal(8);
		
		
		
	}

}
