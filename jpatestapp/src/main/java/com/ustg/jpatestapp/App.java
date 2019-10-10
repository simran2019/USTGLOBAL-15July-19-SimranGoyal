package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.jpatestapp.dto.Movie;

public class App 
{


	public static void main( String[] args )
	{
		EntityTransaction transaction = null ;
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;

		Movie movie = new Movie();
		movie.setId(6);
		movie.setName("HSSH");
		movie.setRating("timepass");

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");  // for creating the object of entitymanager
			entityManager = entityManagerFactory.createEntityManager();
			transaction =  entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("saved");
			transaction.commit(); // without this statement we are not able to save the data in the database

		}catch(Exception e) {
			transaction.rollback();
			e.printStackTrace();


		}finally {
			entityManager.close();
		}


	}// end the main method
}// end the class
