package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import com.ustg.jpatestapp.dto.Movie;

public class RetriveData {

	public static void main(String[] args) {

		EntityManager entityManager = null;

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = emf.createEntityManager();
		Movie movie = entityManager.getReference(Movie.class, 2);
		// Movie movie = entityManager.find(Movie.class, 4);

		System.out.println(movie.getId());
		System.out.println(movie.getName());
		System.out.println(movie.getRating());

	}// end the main method

}// end the class
