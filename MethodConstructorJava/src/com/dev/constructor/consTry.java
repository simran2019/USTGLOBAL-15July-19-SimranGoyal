package com.dev.constructor;

public class consTry {

	public consTry() {
		System.out.println("this is no-arg constructor");
	}
	public consTry(int i) {
		System.out.println("this is int arg constructor");
	}
	public consTry(char a) {
		System.out.println("this is char-arg constructor");
	}
	public consTry(int i, char a) {
		System.out.println("this is int-arg and char-arg constructor");
	}
	public consTry(char a , int i) {
		System.out.println("this is char-arg and int-arg constructor");
	}
	public consTry(String q) {
		System.out.println("this is String-arg constructor");
	}
	public static void main(String[] args) {
		consTry con = new consTry();
		System.out.println(con);  // it give the address location
		consTry con1 = new consTry(2);
		System.out.println(con1);
		consTry con2 = new consTry('a');
		System.out.println(con2);
		consTry con3 = new consTry(5,'t');
		System.out.println(con3);
		consTry con4 = new consTry('u',4);
		System.out.println(con4);
		consTry con5 = new consTry("sim");
		System.out.println(con5);

	}
	


}
