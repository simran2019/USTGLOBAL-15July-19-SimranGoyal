package com.dev.methods;

public class MethodOverloading {

	static MethodOverloading mo = new MethodOverloading();
	
	
	public void print() {
		System.out.println("this is print method with no-arg");
	}
	
	public int print(int i) {
		System.out.println("this is print method with int-arg");
		return 1;
	}
	
	static String print(String str) {
		System.out.println("this is print method with string arg");
		return "A";
	}
	
	private char print(char a) {
		System.out.println("this is print method with int and string arg");
		return 'c';
	}
	final String print(int i , String a) {
		System.out.println("this is print method with int and string arg");
		return "b";
	}
	
	public static void main(String[] args) {
		mo.print("s");

	}

}
