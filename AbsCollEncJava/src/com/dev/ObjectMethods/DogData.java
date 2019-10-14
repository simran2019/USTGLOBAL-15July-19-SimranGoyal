package com.dev.ObjectMethods;

public class DogData {

	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.setAge(1);
		d1.setBreeed("Dober man");
		d1.setColor("Black");
		d1.setName("shiro");

		d2.setAge(2);
		d2.setBreeed("Golden Retriver");
		d2.setColor("Golden");
		d2.setName("Dodo");
		
		d3.setAge(2);
		d3.setBreeed("Golden Retriver");
		d3.setColor("Golden");
		d3.setName("Dodo");
		
		Dog [] dogs = {d1,d2,d3};
		
		for(int i=0;i<dogs.length;i++) {
			/*
			 * System.out.println("age :"+dogs[i].getAge());
			 * System.out.println("name : "+dogs[i].getName());
			 * System.out.println("Breed : "+dogs[i].getBreeed());
			 * System.out.println("color : "+dogs[i].getColor());
			 */
			System.out.println(dogs[i]);   //toString method
			System.out.println("***********************");
			
			System.out.println(d2.equals(d1));
			System.out.println(d2.equals(d3));
		}
	}
}
