package com.dev.Assignment;

import java.util.HashSet;

public class Employee1 {

	public static void main(String[] args) {
		HashSet<EmployeeDetails> em = new HashSet<EmployeeDetails>();

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

		e1.setEmail("simi12@gmail");
		e2.setEmail("luqhmana@123");

		boolean b = em.add(e1);
		boolean b1 = em.add(e2);

		System.out.println("output of add() : "+b+" "+b1);
		System.out.println(em);
		
		System.out.println("size of an details : "+em.size());

	}

}
