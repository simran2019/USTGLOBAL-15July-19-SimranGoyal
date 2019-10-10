package com.ustg.mynewwewbapp.dao;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;

public interface EmployeeDao {
	
	public Employee_InfoBean login(int empid , String password);
	
	public Employee_InfoBean searchEmployee(int id);
	
	public boolean addEmployee(Employee_InfoBean e);
	
	public boolean deleteEmployee(int id);
	
	public boolean updateEmployee(int id , int age , String name , String designation , double salary );

}
