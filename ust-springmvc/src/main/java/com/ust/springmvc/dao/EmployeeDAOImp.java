package com.ust.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ust.springmvc.controller.dto.Employee;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory = null;
	
	
	EntityManager manager = null;
	EntityTransaction transaction = null;

	@Override
	public Employee auth(String email, String password) {
		String jpql = "from Employee where email=:email and password=:pwd";
		manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		query.setParameter("pwd", password);
		try {
		return (Employee) query.getSingleResult();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		if (checkEmail(employee.getEmail())) {
			return false;
		}
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		return true;
	}

	private boolean checkEmail(String email) {
		manager = factory.createEntityManager();
		String jpql = "from Employee where email=:email";
		
		Query query = manager.createQuery(jpql);
		query.setParameter("email", email);
		try {
		Employee employee = (Employee) query.getSingleResult();
		
			return true;
		} catch(Exception e){
			return false;
		}
	}// end of cheak email is present or not

	@Override
	public boolean deleteEmployee(int id) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Employee employee = manager.find(Employee.class, id);
		if(employee==null) {
			return false;
		}
		manager.remove(employee);
		transaction.commit();
		return true;
	}
	
	@Override
	public boolean updateEmployee(Employee employee) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		if(emp==null) {
			return false;
		}
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		transaction.commit();
	
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	          public List<Employee> getAllEmployee() {
		manager = factory.createEntityManager();
		String jpql = "from Employee";
		Query query = manager.createQuery(jpql);
		List<Employee> employee = query.getResultList();
		return employee;
	}

}
