package com.dev.Strings;

public class String1 {

	public static void main(String[] args) {
		String str;
		str = "hello";


		String str1 = "java";


		String str2 = new String("Hello java");
		

		StringBuffer sb = new StringBuffer("HELLO");
		StringBuilder sb1 = new StringBuilder("JAVA");
		StringBuffer sb2 = new StringBuffer(-1);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

		
		System.out.println(sb); //string buffer
		System.out.println(sb1); // string builder
		System.out.println(sb+" "+sb1); // Concatenation of string buffer and string builder
		System.out.println(sb.length());  // for getting the length of string
		System.out.println(sb.capacity()); // for getting the capacity of string
		
		
		


	}

}
