package com.dev.Assignment;

public class SumArray {

	public static void main(String[] args) {

		int[] Array = new int[7];

		Array[0] = 1;
		Array[1] = 2;
		Array[2] = 3;
		Array[3] = 4;
		Array[4] = 5;
		Array[5] = 6;
		Array[6] = 7;

		System.out.println("index of middle element = " + Array.length / 2);

		System.out.println("index of second last element = " + (Array.length - 2));

		int a = Array[0];

		System.out.println("value of first element = " + a);

		int b = Array[3];

		System.out.println("value of middle element = " + b);

		int c = Array[5];

		System.out.println("value of second last element = " + c);
		int d = a + b + c;

		System.out.println("Sum of an elements is = " + d);
	}

}
