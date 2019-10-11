package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {

	public static void main(String[] args) {
		
		Pattern pat = Pattern.compile("[A-Za-z]{1,25}\\s[A-Za-z]{1,25}");
		Matcher mat = pat.matcher("Simran Goyal");
		System.out.println("for name = "+mat.matches());
		
		pat = Pattern.compile("\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+");
		mat = pat.matcher("mahan mohalla gali Karari wali KASGANJ");
		System.out.println("for address = "+mat.matches());
		
		pat = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		mat = pat.matcher("simran2014goyal@gamil.com");
		System.out.println("for matching the email id = "+mat.matches());
		
		pat = Pattern.compile("\\w+\\W+\\d+");
		mat = pat.matcher("Simi@123*");
		System.out.println("for matching the password = "+mat.matches());

	}

}
