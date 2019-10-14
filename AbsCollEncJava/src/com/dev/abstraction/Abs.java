package com.dev.abstraction;


@FunctionalInterface         
public interface Abs {
	
	//final int i = 0;    
	void display();                 // without any interface keyword in front of method it treated as interface method

	
	 static void print() {
		System.out.println("A");
	}
	 
	 static void print1() {
			System.out.println("A");
		}
	
}
