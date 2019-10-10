package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.jpatestapp.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 2);
			movie.setRating("awsome");
			System.out.println("Rating updated...");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			entityManager.close();
		}

	}// end of the main method

}// end of the class
