package com.ustg.ustspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustg.ustspringcore.beans.Animal;
import com.ustg.ustspringcore.beans.HelloWorld;
import com.ustg.ustspringcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class XmlConfigApp {

	public static void main(String[] args) {
		HelloWorld h1 = new HelloWorld();
		h1.setMsg("hello");
		h1.setCount(10);
		System.out.println(h1.getMsg());
		System.out.println(h1.getCount());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		

		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld h2 = context.getBean(HelloWorld.class);
		System.out.println(h2.getMsg());
		h2.getAnimal().makeSound();
		System.out.println(h2.getMap());
		
		context.close();
		
		

		/*
		 * Animal animal = context.getBean(Animal.class); animal.makeSound();
		 */
		System.out.println("***************************");

		/*
		 * Animal animal = (Animal) context.getBean("human"); animal.makeSound();
		 */

		/*
		 * Animal animal1 = (Animal) context.getBean("dog"); animal1.makeSound();
		 * 
		 * System.out.println("***************************");
		 * 
		 * Pet pet = context.getBean(Pet.class); System.out.println(pet.getName());
		 * pet.getAnimal().makeSound();
		 */
		
		

	}

}
