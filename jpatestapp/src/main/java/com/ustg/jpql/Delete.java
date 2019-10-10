package com.ustg.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		
		EntityTransaction transaction = null ;
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;
		
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");  // for creating the object of entitymanager
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		
		transaction.begin();
		String jpql = "delete from Movie where id = 7";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		
		if(result>0) {
			System.out.println(result+"deleted..");
			
		}else {
			System.out.println("something went wrong...");
		}
		transaction.commit();
		

	}

}
