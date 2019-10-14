package com.dev.Assignment;

import java.util.HashSet;

public class EmpIntImp implements EmpInterface {
	
	HashSet<EmployeeDetails> hs = new HashSet<EmployeeDetails>();

	@Override
	public boolean addEmployeeDetails(EmployeeDetails em) {
		if(em != null) {
			hs.add(em);
			return false;
		}else
		return true;
	}

	@Override
	public void getEmployeeDetails() {
		System.out.println(hs);
		
	}

	@Override
	public boolean removeEmployeeDetails(EmployeeDetails em) {
		boolean b = hs.remove(em);
		if(b) {
			return true;
		}
		else {
		return false;
		}
		
		
	}

	
	}
