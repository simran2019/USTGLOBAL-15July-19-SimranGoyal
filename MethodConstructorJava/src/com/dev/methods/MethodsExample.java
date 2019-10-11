package com.dev.methods;

public class MethodsExample {

	static MethodsExample me = new MethodsExample(); // it is a global object creation we can use it in any where in side that class.
	
	public static int calcArea(int side) {

		int area = side * side;

		int n = me.areaRec(4, 8);
		System.out.println(n);
		return area;           // return statement is the last statement of the calling method

	}

	public int areaRec(int len, int width) {
		int area = len * width;
		return area;
	}

	public static void main(String[] args) {
		// MethodsExample me = new MethodsExample();      // it is a local object creation we can use it in that method only.

		int area = calcArea(5);
		System.out.println("Area of the square = " + area);
		int area1 = me.areaRec(2, 4);
		System.out.println("aea of rectangle = " + area1);

	}

	

}
