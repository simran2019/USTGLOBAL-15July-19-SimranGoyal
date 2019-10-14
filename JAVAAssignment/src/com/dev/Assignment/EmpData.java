package com.dev.Assignment;

public class EmpData {

	public static void main(String[] args) {
		
		EmpIntImp ee = new EmpIntImp();
		
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
		
		boolean b = ee.addEmployeeDetails(e1);
		boolean b1 = ee.addEmployeeDetails(e2);
		
		System.out.println(b+" "+b1);
		
		ee.getEmployeeDetails();
		
	boolean f =	ee.removeEmployeeDetails(e1);
	System.out.println(f);
	
	
	
	
	
		

	}

}
