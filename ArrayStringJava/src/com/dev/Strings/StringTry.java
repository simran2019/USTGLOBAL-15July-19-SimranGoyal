package com.dev.Strings;

public class StringTry {

	public static void main(String[] args) {
		String name = "Simran Goyal";
		String NAME = "simran goyal";
		
		int length = name.length();
		System.out.println("length of name = "+length);
		
		
		char[] ch = name.toCharArray();
		System.out.println("letter at position 5 = "+ch[5]);
		
		char b = name.charAt(3);
		System.out.println(b);
		
		boolean d = name.equals(NAME);
		System.out.println("output for equal = "+d);
		
		boolean e = name.equalsIgnoreCase(NAME);
		System.out.println("output for equal ignore = "+e);

	}

}
