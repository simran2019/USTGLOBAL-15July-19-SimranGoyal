package com.ustg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamincQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			String jpql = "update from Movie set name = :nm where id = :id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("nm", "abcd");
			query.setParameter("id" , 7);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
