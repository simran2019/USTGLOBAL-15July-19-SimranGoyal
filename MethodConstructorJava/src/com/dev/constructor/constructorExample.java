package com.dev.constructor;

public class constructorExample {
	
	public constructorExample() {                  // no argument constructor
		System.out.println("this is no-arg constructor");
	}

	public constructorExample(int i) {         // parametarized constructor
		System.out.println( "this const is with int arg ");
	}
	
	public constructorExample(String s) {
		System.out.println("this cons is with String arg");
	}
	
	public constructorExample(String s , int i) {
		System.out.println("this cons is with String arg and int arg");
	}
	public constructorExample( int i , String s ) {
		System.out.println("this cons is with  int arg and String arg");
	}

	
	public static void main(String[] args) {
		
		constructorExample ce = new constructorExample();       // invoke the constructor by creating the object of constructor
		constructorExample ce1 = new constructorExample(1);
		constructorExample ce2 = new constructorExample("sim");
		constructorExample ce3 = new constructorExample("sim" , 2);
		constructorExample ce4 = new constructorExample(3,"sim");
	}

}
