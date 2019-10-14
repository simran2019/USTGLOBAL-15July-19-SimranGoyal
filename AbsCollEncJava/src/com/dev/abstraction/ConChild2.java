package com.dev.abstraction;
 
public class ConChild2 extends AbsChild1 {         // normal class extends the abstract class
	static ConChild2 cc = new ConChild2();
	
	
	
	public static void main(String[] args) {
		cc.animal();
		cc.mamels();
		cc.birds();
	}

	
}
