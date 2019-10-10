package com.ustg.mynewwebapp.servlets.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="newemp")
public class Employee_InfoBean {

	@Id
	@Column
	private int emp_id;
	@Column
	private int emp_age;
	@Column
	private String emp_name;
	@Column
	private String emp_designation;
	@Column
	private double emp_salary;
	@Column
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getEmp_age() {
		return emp_age;
	}
	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_designation() {
		return emp_designation;
	}
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
}
