package com.dev.Encapsulation;

public class DogData {

	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.setAge(1);
		d1.setBreeed("Dober man");
		d1.setColor("Black");
		d1.setName("shiro");

		d2.setAge(2);
		d2.setBreeed("Golden Retriver");
		d2.setColor("Golden");
		d2.setName("Dodo");
		
		Dog [] dogs = {d1,d2};
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println("age :"+dogs[i].getAge());
			System.out.println("name : "+dogs[i].getName());
			System.out.println("Breed : "+dogs[i].getBreeed());
			System.out.println("color : "+dogs[i].getColor());
			System.out.println("***********************");
		}
	}
}
