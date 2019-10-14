package com.dev.abstraction;

public class Abstraction extends AbstractClass{
	
	public Abstraction() {
		System.out.println("cost of abstrction class");
	}

	@Override
	void display() {
		System.out.println("this is the implemented abstract method ");
		
	}

	public static void main(String[]args){
		Abstraction a = new Abstraction();
		a.display();
		a.show();
		a.print();
	}

	@Override
	void print() {
		System.out.println("again it is a abstract method");
		
	}
}
