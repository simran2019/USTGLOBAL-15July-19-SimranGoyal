package com.dev.inheritance;

public class parent1 {

	String lastName= "goyal";
	String name = "anita";
	
	
	static parent1 p1 = new parent1();
	
	public static void main(String[] args) {
	p1.printName();

	}
	
	public void printName() {
		System.out.println(name+" "+p1.lastName);
	}

}
