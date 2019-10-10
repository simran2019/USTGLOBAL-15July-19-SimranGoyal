package com.ustglobal.ustspringboot.service;

import java.util.List;

import com.ustglobal.ustspringboot.dto.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);

	public boolean removeEmployee(int id);

	public boolean modifyEmployee(Employee employee);

	public Employee getEmployee(int id);

	public List<Employee> getAllEmployee();

	public List<Employee> getEmployeesByName(String name);
}
