package com.dev.Assignment;

import java.util.TreeSet;

public class EmployeeTree {

	public static void main(String[] args) {
		TreeSet<EmployeeDetails> ts = new TreeSet<EmployeeDetails>();
		
		
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setName("Simran");
		e1.setId(1);
		e1.setEmail("simran2014goyal@gmail.com");
		e1.setPassword("simran@123");

		EmployeeDetails e2 = new EmployeeDetails();
		e2.setName("Luqhmaan");
		e2.setId(2);
		e2.setEmail("luqhmaan.@123");
		e2.setPassword("luqu123");
		
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);

	}

}
