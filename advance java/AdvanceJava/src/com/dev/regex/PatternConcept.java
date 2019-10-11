package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {

	public static void main(String[] args) {
		
		
	
		Pattern pat = Pattern.compile("\\d");   // for matching the digit (0-9) only one digit
		Matcher mat = pat.matcher("2");
		System.out.println("for \\d :"+mat.matches());
		
		pat = Pattern.compile("\\d+");    //for matching the digit (0-9) more then one digit
		mat = pat.matcher("1327");
		System.out.println("for \\d+:" +mat.matches());
		
		pat = Pattern.compile("\\d{2}");       //for matching the digit (0-9) only two digit
		mat = pat.matcher("13");
		System.out.println("for \\d+:" +mat.matches());
		
		pat = Pattern.compile("\\d{2,4}");      //for matching the digit (0-9) min two digit and max 4 digit
		mat = pat.matcher("1327");
		System.out.println("for \\d+:" +mat.matches());
		
		pat = Pattern.compile("\\D");        // for matching except the digit only one
		mat = pat.matcher("a");
		System.out.println("for \\D:" +mat.matches());
		
		pat = Pattern.compile("\\D+");            // for matching except the digit more then one
		mat = pat.matcher("abnkjdsh");
		System.out.println("for \\D+:" +mat.matches());
		
		pat = Pattern.compile("\\s");
		mat = pat.matcher(" ");
		System.out.println("for \\s:" +mat.matches());
		
		pat = Pattern.compile("\\s+");
		mat = pat.matcher("     ");
		System.out.println("for \\s+:" +mat.matches());
		
		pat = Pattern.compile("\\S");
		mat = pat.matcher("@");
		System.out.println("for \\S:" +mat.matches());
		
		pat = Pattern.compile("\\S+");
		mat = pat.matcher("@3r26@343#$%#%");
		System.out.println("for \\S+:" +mat.matches());
		
		pat = Pattern.compile("\\w");
		mat = pat.matcher("q");
		System.out.println("for \\w:" +mat.matches());
		
		pat = Pattern.compile("\\w+");
		mat = pat.matcher("qwerty");
		System.out.println("for \\w+:" +mat.matches());
		
		pat = Pattern.compile("\\W");
		mat = pat.matcher("@");
		System.out.println("for \\W:" +mat.matches());
		
		pat = Pattern.compile("\\W+");
		mat = pat.matcher("@#$   ");
		System.out.println("for \\W+:" +mat.matches());
		
	}

}
