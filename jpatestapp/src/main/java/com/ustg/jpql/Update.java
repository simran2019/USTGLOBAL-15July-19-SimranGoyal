package com.ustg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			
			String jpql = "update from Movie set  rating = 5  where id = 1";
			Query query = entityManager.createQuery(jpql);
			int resultSet = query.executeUpdate();
			transaction.commit();
			if(resultSet>0) {
				System.out.println(resultSet+" updated");
			}else {
				System.out.println("something went wrong...");
			}
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		

	}

}
