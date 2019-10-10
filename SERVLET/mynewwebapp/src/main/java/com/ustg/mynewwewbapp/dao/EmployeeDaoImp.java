package com.ustg.mynewwewbapp.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg.mynewwebapp.servlets.dto.Employee_InfoBean;

public class EmployeeDaoImp implements EmployeeDao{

	@Override
	public Employee_InfoBean searchEmployee(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee_InfoBean employee_InfoBean = null;
		
		
		 try {
			employee_InfoBean = entityManager.find(Employee_InfoBean.class, id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		return employee_InfoBean;
	}

	@Override
	public boolean addEmployee(Employee_InfoBean e) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		
		 try {
			 entityTransaction.begin();
			entityManager.persist(e);
			entityTransaction.commit();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee_InfoBean employee_InfoBean = null;
		
		
		 try {
			 entityTransaction.begin();
			Employee_InfoBean eid = entityManager.find(Employee_InfoBean.class, id);
			
			entityManager.remove(eid);
			System.out.println("data deleted...");
			entityTransaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		return true ;
	}

	@Override
	public Employee_InfoBean login(int empid, String password) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee_InfoBean employee_InfoBean = null;
		
		String jpaQuery = "from Employee_InfoBean where emp_id = :id and password = :pwd";
		Query query = entityManager.createQuery(jpaQuery);
		query.setParameter("id", empid);
		query.setParameter("pwd", password);
		
		employee_InfoBean = (Employee_InfoBean) query.getSingleResult();
		
		
		return employee_InfoBean;
	}

	@Override
	public boolean updateEmployee(int id , int age , String name , String designation , double salary) {

		 Employee_InfoBean employee_InfoBean = new Employee_InfoBean();
	
		 try {
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction = entityManager.getTransaction();
			 
			    employee_InfoBean = entityManager.find(Employee_InfoBean.class, id);
			    
				employee_InfoBean.setEmp_id(id);
				employee_InfoBean.setEmp_age(age);
				employee_InfoBean.setEmp_designation(designation);
				employee_InfoBean.setEmp_salary(salary);
				employee_InfoBean.setEmp_name(name);
				
				if(entityManager != null) {
					entityTransaction.begin();
					entityManager.persist(employee_InfoBean);
					entityTransaction.commit();
				}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return true;
		
	}

	
}
