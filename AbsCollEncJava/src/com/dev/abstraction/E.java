package com.dev.abstraction;

public class E implements Abs { // normal class implements the interface class

	@Override
	public void display() {
		System.out.println("display method of interface");

	}

	public static void main(String[] args) {
		Abs.print();
		E e = new E();
		e.display();
	}
}
