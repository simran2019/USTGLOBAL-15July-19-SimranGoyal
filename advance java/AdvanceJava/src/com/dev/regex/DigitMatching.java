package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitMatching {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("\\W\\d{2}\\W\\d{10}");
		Matcher mat = pat.matcher("+91 8983832056");
		System.out.println("matching the number = "+mat.matches());
		
		pat = Pattern.compile("\\d{2}\\W\\w{3}\\W\\d{2,4}");
		mat = pat.matcher("01-jan-2019");
		System.out.println("fro matching the date = "+mat.matches());
		
		pat = Pattern.compile("[1-9]|1[0-9]|2[0-9]");
		mat = pat.matcher("30");
		System.out.println("for matching the range its range is 1-29 = "+mat.matches());
		

	}

}
