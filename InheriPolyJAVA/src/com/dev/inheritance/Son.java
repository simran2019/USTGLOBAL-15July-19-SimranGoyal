package com.dev.inheritance;

public class Son extends Father {
	
	static Son s = new Son();
	String name = "Robb";   // global variable 
	
	@Override
	public void printName() {
	
		System.out.println(name+ " "+super.name+" "+s.lastname);
	}
	
	

	public static void main(String[] args) {
		s.printName();

	}
}
