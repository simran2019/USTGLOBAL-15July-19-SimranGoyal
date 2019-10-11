package com.dev.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int [] intArr;   // declaration
		char [] charr = new char[5];    // declaration and initialization in one line
		byte byteArr [];

		intArr = new int[5];     // creation
		byteArr = new byte[5];

		intArr [0] = 34;         // initialization
		intArr [1] = 12;
		intArr [2] = 10;
		intArr [3] = 5;
		intArr [4] = 4;

		charr [0] = 'q';
		charr [1] = 'e';
		charr [2] = 's';
		charr [3] = 'h';
		charr [4] = 'i';

		byteArr[0] = 1;
		byteArr [1] = 33;
		byteArr [2] = 22;
		byteArr [3] = 12;
		byteArr [4] = 8;

		for(int i :intArr ) {
			System.out.println(i);
		}
		
		
		
	
		  int res = intArr[1]*3; // performing operation
		  System.out.println("result for mul = "+res);
		  
		  System.out.println(intArr[2]/2);
		  
		  int a = intArr [0]+6; System.out.println("result for sum = "+a);
		  
		  int b = intArr [3] - 1; System.out.println("result for diff = "+b);
		  
		  int c = intArr [4]%3; System.out.println("result for modulus = "+c);
		 
		  int [] intArr2 = {10,20,30,40}; System.out.println(intArr2[2]);
		 System.out.println("length of an arrat2 = "+intArr2.length);
		 

	}

}
