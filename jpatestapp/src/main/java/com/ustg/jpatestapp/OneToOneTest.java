package com.ustg.jpatestapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.Mapping.Person;
import com.ustg.Mapping.VoterId;

public class OneToOneTest {

	public static void main(String[] args) {
		System.out.println("started");
		Person person = new Person();
		person.setId(1);
		person.setAge(22);
		person.setName("Simran");

		VoterId vc = new VoterId();
		vc.setName("Simran");
		vc.setV_Id(22);
		person.setVi(vc);
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			// uniDirection
			//em.persist(person);
			// biDirection
			VoterId  vi2 = em.find(VoterId.class, 22);
			System.out.println(vi2.getPerson().getName());
			System.out.println("saved");
			et.commit();
		} catch (Exception e) {
			
			et.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
