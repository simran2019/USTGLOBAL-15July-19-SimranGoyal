package com.dev.Encapsulation;

public class PetsDetails {

	public static void main(String[] args) {
		Pets p1 = new Pets();
		Pets p2 = new Pets();
		Pets p3 = new Pets();
		
		
		p1.setAge(2);
		p1.setColor("Golden");
		p1.setBreed("golden retriver");
		p1.setName("Dodo");
		p1.setType("Dog");
		
		
		p2.setAge(3);
		p2.setColor("black");
		p2.setBreed("German");
		p2.setName("chiki");
		p2.setType("Cat");
		
		p3.setAge(3);
		p3.setColor("Green");
		p3.setBreed("indian");
		p3.setName("Kartik");
		p3.setType("Tortoise");
		
		Pets [] pets = {p1,p2,p3};
		
	for(int i =0 ; i< pets.length ; i++) {
		System.out.println( "Type is : "+pets[i].getType());
		System.out.println("Age is : "+pets[i].getAge());
		System.out.println("Breed is : "+pets[i].getBreed());
		System.out.println("Name is : "+pets[i].getName());
		System.out.println("Color is : "+pets[i].getColor());
		System.out.println("********************************");
	}
		
	}
	

}
