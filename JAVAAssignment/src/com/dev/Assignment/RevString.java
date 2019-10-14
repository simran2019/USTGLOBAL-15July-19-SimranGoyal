package com.dev.Assignment;

public class RevString {

	public static void main(String[] args) {

		String str = "simran";

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i));

		}
		System.out.println();

		for (int j = str.length() - 1; j >= 0; j--) {
			System.out.print(str.charAt(j));
		}

	}

}
