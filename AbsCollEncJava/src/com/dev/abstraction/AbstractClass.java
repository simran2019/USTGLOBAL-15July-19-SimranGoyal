package com.dev.abstraction;

public abstract class AbstractClass {

	
	public AbstractClass() {
		System.out.println("constructor of abstract class");
	}
	
	abstract void display();
	abstract void print();

	public void show() {
		System.out.println("concrete method of abstract class");
	}

}
