package com.dev.Strings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Some String";
		String str1 = "some String";
		//====== for string length==

		int length = str.length();
		System.out.println(length);
		//or
		System.out.println("length of the string = "+str.length());

		//=======for charArray===

		char[] ch = str.toCharArray();
		System.out.println(ch[10]);
		//0r
		//System.out.println(str.toCharArray());
		//=========for char at=====
		char c = str.charAt(2);
		System.out.println(c);

		//==========for equal========
		boolean b = str.equals(str1);
		System.out.println(b);

		//=========== for equal ignore case===

		boolean d = str.equalsIgnoreCase(str1);
		System.out.println(d);

		//==========contains==
		boolean v = str.contains("Som");
		System.out.println("out put for contains = "+v);

		boolean w = str.contains("som");
		System.out.println("out put for contains = "+w);

		//===for replace======

		String z = str.replace("S", "A");
		System.out.println("output for replace = "+z);

		//====for index of=======

		int f = str.indexOf('z');
		System.out.println("index of z is = "+f);
		//or
		System.out.println("index of t = "+str.indexOf('t'));

		//======for convert the uppercase====

		String s = str.toUpperCase();
		System.out.println(s);

		//=======for convert in lowercase===

		String h = str.toLowerCase();
		System.out.println(h);

		//====substring(int)=====

		String i = str.substring(3);
		System.out.println("output for substring(int): = "+i);

		//====substring(int,int)=====

		String q = str.substring(3, 7);
		System.out.println("output for substring(int,int) = "+q);


		
		
	}

}
