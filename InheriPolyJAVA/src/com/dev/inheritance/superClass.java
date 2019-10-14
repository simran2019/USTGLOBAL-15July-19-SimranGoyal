package com.dev.inheritance;

public class superClass {
	
	public superClass() {
		System.out.println("cont with no-arg of super-class");
	}
	
	public superClass(int i) {
		System.out.println("cont with int-arg of super-class");
	}
	
	public superClass(String str) {
		System.out.println("cont with string-arg of super-class");
	}
	
	public superClass(char b) {
		System.out.println("cont with char-arg of super-class");
	}
	
	public superClass(int i , String str) {
		System.out.println("cont with int and string-arg of super-class");
	}

	public static void main(String[] args) {
		superClass s = new superClass();
		superClass s1 = new superClass(4);
		superClass s2 = new superClass("a");
		superClass s3 = new superClass('y');
		superClass s4 = new superClass(4,"f");
	}

}
