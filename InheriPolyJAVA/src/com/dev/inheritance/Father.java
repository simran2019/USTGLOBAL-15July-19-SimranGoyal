package com.dev.inheritance;

public class Father extends GrandFather {

	static Father f = new Father();
	String name = "Eddard";

	@Override
	public void printName() {
		String name = "Eddard";   //local variable
		System.out.println(name+" "+super.name+" "+f.lastname);
	}
	public static void main(String[] args) {

		f.printName();

	}

}
