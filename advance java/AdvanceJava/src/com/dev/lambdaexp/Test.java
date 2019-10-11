package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		
		FuncInt f = () -> {                             // lambda expression   
			for (int i =1 ; i <=10 ; i++) {
				System.out.println("i = "+i);
			}
		};         // we close it with the semicolon bcoz lambda expression is treated as a function
f.printVal();
	}

}
