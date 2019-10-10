package com.ustg.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustg.jpatestapp.dto.Movie;

public class ReadDemo {

	public static void main(String []args) {
		EntityTransaction transaction = null ;
		EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = null;


		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");  // for creating the object of entitymanager
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			// for getting the name ****************************************

			/*
			 * String jpql = "select name from Movie";
			 * Query query = entityManager.createQuery(jpql);
			 * List<String> resultList = query.getRersultList();
			 * for(String string : resultList) { 
			 * System.out.println(string);
			 *  }
			 */

			// for update the result **************************************

			/*
			 * transaction.begin();
			 * 
			 * String jpql = "update Movie set rating = 'not bad' where id = 1 ";
			 * 
			 * 
			 * Query query = entityManager.createQuery(jpql);
			 * 
			 * int resultList = query.executeUpdate(); // for getting the name output
			 * 
			 * if(resultList > 0) { System.out.println(resultList); }else {
			 * System.out.println("somthing went wrong"); } transaction.commit();
			 */

			// for whole data *************************************************

			/*	 String jpql = "from Movie"; // for getting the whole data
			 * Query query = entityManager.createQuery(jpql);
			 * List<Movie> resultList = query.getRersultList(); // for getting the whole o/p
			 * for(Movie movie : resultList) { 
			 * System.out.println(movie.getId());
			 * 
			 * System.out.println(movie);
			 * 
			 * }
			 */



		} catch (Exception e) {

			e.printStackTrace();
		}


	}
}
