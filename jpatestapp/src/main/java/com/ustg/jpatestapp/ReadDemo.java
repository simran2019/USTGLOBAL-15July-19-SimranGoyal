package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			/*
			 * Movie movie = entityManager.getReference(Movie.class, 105);  
			 * System.out.println(movie.getClass());                        
			 */
			Movie movie = entityManager.find(Movie.class, 1);
			/*
			 * System.out.println(movie.getId()); System.out.println(movie.getName());
			 * System.out.println(movie.getRating());
			 */
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			
			transaction.commit();




		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}// end the main method

}
