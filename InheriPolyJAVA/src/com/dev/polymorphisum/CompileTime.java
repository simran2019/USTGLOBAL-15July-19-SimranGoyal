package com.dev.polymorphisum;

public class CompileTime {
	static CompileTime c = new CompileTime();
	
	
	
	public static void main(String[] args) {
		c.compile(5);
		c.compile(5, 8);
		c.compile(5 , 6 ,5);
	}
	
	public void compile(int i) {
		int k = i;
		System.out.println("output of one int = "+k);
	}
	public void compile(int i , int j) {
		int x = i + j ;
		System.out.println("output of two int = "+x);
	}
	public void compile(int i , int j ,int k) {
		int y = i*j*k;
		System.out.println("output of three int = "+y);
	}

}
