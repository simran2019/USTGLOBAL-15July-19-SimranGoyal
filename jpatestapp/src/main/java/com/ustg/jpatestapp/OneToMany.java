package com.ustg.jpatestapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.Mapping.VoterId;
import com.ustg.onetomany.Pencile;
import com.ustg.onetomany.PencileBox;

public class OneToMany {

	public static void main(String[] args) {
		Pencile p = new Pencile();
		p.setPencileId(1);
		p.setPencileName("Apsara");

		Pencile p1 = new Pencile();
		p1.setPencileId(2);
		p1.setPencileName("Doms");
		ArrayList<Pencile> ape = new ArrayList<Pencile>();
		ape.add(p);
		ape.add(p1);

		PencileBox pb = new PencileBox();
		pb.setBoxId(11);
		pb.setBoxName("ApsaraBox");
		pb.setPencile1(ape);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			System.out.println("uniDirection");
			em.persist(pb);
			System.out.println("Saved..");
			et.commit();
		} catch (Exception e) {

			et.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
