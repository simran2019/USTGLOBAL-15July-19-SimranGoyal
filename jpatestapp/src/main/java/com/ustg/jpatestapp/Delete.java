package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.jpatestapp.dto.Movie;

public class Delete {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		 transaction = entityManager.getTransaction();
		 transaction.begin();
		 Movie movie = entityManager.find(Movie.class, 3);
		 entityManager.remove(movie);
		 System.out.println("record Deleted...");
		 
		 transaction.commit();
		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		
		

	}

}
