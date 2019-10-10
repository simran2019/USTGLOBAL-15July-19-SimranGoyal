package com.ustg.jpql;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserDyn {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;


	try {
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();

		transaction.begin();
		//String jpql = "update Movie set name =:nm where id =:id";
		String jpql = "insert into Movie(id,name,rating) values(id=:id,name=:nm,rating=:rating)";
		Query query = entityManager.createQuery(jpql);
		
		//System.out.println("enter the id =");
		query.setParameter("id" , 8);
		//System.out.println("enter the name of movie = ");
		query.setParameter("nm", "er");
		//System.out.println("Enter the ratting =");
		query.setParameter("rating", 3);
		int result = query.executeUpdate();
		
		if(result>0) {
			System.out.println(result);
		}else {
			System.out.println("something went wrong..");
		}
		transaction.commit();
	} catch (Exception e) {
		transaction.rollback();
		e.printStackTrace();
	}

}

}
