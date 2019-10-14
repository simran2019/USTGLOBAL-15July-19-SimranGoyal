package com.dev.inheritance;

public class parent3 extends parent2 {

	
	String name = "rudra";
	
static	parent3 p3 = new parent3();
	
	
		public static void main(String[] args) {
		p3.printName();

	}
	@Override
	
public void printName() {
	System.out.println(name+" "+super.name+" "+p3.lastName);
	}

}
