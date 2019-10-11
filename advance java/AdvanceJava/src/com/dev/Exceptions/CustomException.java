package com.dev.Exceptions;

public class CustomException extends Exception{	

	public CustomException() {

		System.out.println("Custom Exception");
	}

	public CustomException(int i) {

		System.out.println("Custom Exception oucred for intger");
	}

	public CustomException(String str) {

		System.out.println("Custom Exception ouccred for string");
	}


	public static void main(String[] args) {


	}

}
