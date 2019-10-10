package com.ust.springmvc.dao;

import java.util.List;

import com.ust.springmvc.controller.dto.Employee;

public interface EmployeeDAO {

	public Employee auth(String email, String password);

	public boolean registerEmployee(Employee employee);

	public boolean deleteEmployee(int id);

	public boolean updateEmployee(Employee employee);

	public List<Employee> getAllEmployee();

}
