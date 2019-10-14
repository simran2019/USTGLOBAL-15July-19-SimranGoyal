package com.dev.polymorphisum;

public class RunTime2 extends RunTime {
	String lastname = "goyal";

	static RunTime2 rt = new RunTime2();

	public static void main(String[] args) {
		rt.run();

	}

	@Override
	public void run() {
		System.out.println("full name = " + " " + super.name + " " + lastname);

	}

}
