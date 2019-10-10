package com.ustglobal.ustspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.ustspringboot.dto.Employee;
import com.ustglobal.ustspringboot.reposatory.EmployeeReposatory;

@Service("jpa")

public class EmployeeServicejpaImpl implements EmployeeService {

	@Autowired
	private EmployeeReposatory repository;
	
	@Override
	public boolean addEmployee(Employee employee) {
	repository.save(employee);
		return true;
	}

	@Override
	public boolean removeEmployee(int id) {
		repository.deleteById(id);;
		return true;
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
	repository.update(employee.getName(), employee.getPassword(), employee.getId());
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		return repository.findById(id).get();
		 
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return repository.findAll();
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
	
		return repository.findByName(name);
	}

}
