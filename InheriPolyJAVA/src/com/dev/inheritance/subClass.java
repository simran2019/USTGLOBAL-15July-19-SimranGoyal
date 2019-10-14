package com.dev.inheritance;

public class subClass extends superClass {
	


	public static void main(String[] args) {
		 subClass b =new subClass();
		 subClass b1 =new subClass(3);
		 subClass b2 =new subClass('k');
	}

	public subClass() {
		super();
		System.out.println("cont with no-arg of sub-class");
		
	}
	public subClass(int j) {
		super(3);
		System.out.println("cont with int-arg of sub-class");
		
	}
	public subClass(char d) {
		super('k');
		System.out.println("cont with char-arg of sub-class");
		
	}
	
	
	
}
