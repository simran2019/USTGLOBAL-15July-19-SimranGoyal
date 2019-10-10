package com.ustg.jpatestapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustg.manytomany.Course;
import com.ustg.manytomany.Student;

public class ManyToMany {

	public static void main(String[] args) {

		Course course = new Course();
		course.setcName("sql");
		course.setcId(1);

		Course course1 = new Course();
		course1.setcId(2);
		course1.setcName("jdbc");

		ArrayList<Course> cou = new ArrayList<Course>();
		cou.add(course);
		cou.add(course1);

		Student stu = new Student();
		stu.setCourse(cou);
		stu.setsId(12);
		stu.setsName("FSD");

		Student stu1 = new Student();
		stu1.setCourse(cou);
		stu1.setsId(11);
		stu1.setsName("Simi");

		ArrayList<Student> stude = new ArrayList<Student>();
		stude.add(stu);
		stude.add(stu1);

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = Persistence.createEntityManagerFactory("TestPersistence");
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			System.out.println("uniDirection");
			//em.persist(stu);

			Course cou1 = em.find(Course.class, 1);
			System.out.println(cou1.getStud().get(0).getsName());

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
