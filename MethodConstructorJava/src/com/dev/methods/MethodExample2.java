package com.dev.methods;

public class MethodExample2 {

	public static void main(String[] args) {
		
		MethodsExample me = new MethodsExample();
		
		int a = MethodsExample.calcArea(7);  // calling method form another class
		System.out.println("are of square = "+a);

		int area2 = me.areaRec(3,7);
		System.out.println("area of rectangle = "+area2);
		
		
	}
}
