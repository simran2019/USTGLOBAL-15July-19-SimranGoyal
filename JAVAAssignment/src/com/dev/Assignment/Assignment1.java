package com.dev.Assignment;

public class Assignment1 {

	public static void main(String[] args) {

		int[] Array = new int[5];

		Array[0] = 1;
		Array[1] = 2;
		Array[2] = 3;
		Array[3] = 4;
		Array[4] = 5;

		int i;
		for (i = 0; i < Array.length; i++) {
			System.out.print(Array[i]);
		}

		int j;

		for (j = Array.length - 1; j >= 0; j--) {
			System.out.print(Array[j]);
		}

	}

}
