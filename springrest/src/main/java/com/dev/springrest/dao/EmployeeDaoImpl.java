package com.dev.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dev.springrest.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	EntityManager manager = null;
	EntityTransaction transaction = null;

	@Override
	public boolean addEmployee(Employee employee) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		try {
			Employee employee = manager.find(Employee.class, id);
			manager.remove(employee);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
			
		}
	}

	@Override
	public boolean modifyEmployee(Employee employee) {
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Employee emp = manager.find(Employee.class, employee.getId());
		emp.setName(employee.getName());
		emp.setDob(employee.getDob());
		emp.setPassword(employee.getPassword());
		transaction.commit();
		return true;
	}

	@Override
	public Employee getEmployee(int id) {
		manager = factory.createEntityManager();
		return manager.find(Employee.class,id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		manager = factory.createEntityManager();
		String jpql = "from Employee";
		Query query = manager.createQuery(jpql);
		List<Employee> employee = query.getResultList();
		return employee;

	}

}
