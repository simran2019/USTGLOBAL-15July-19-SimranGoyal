package com.dev.Assignment;

public class DogData {
	
	public static void main(String []args) {
		DogImp di = new DogImp();
		
	Dog d = new Dog();
		
		d.setAge(1);
		d.setBreeed("DM");
		d.setColor("black");
		d.setName("Dodo");

		Dog d1 = new Dog();

		d1.setAge(2);
		d1.setBreeed("Dalmation");
		d1.setColor("black");
		d1.setName("shiro");
		
		Dog d3 = new Dog();

		d3.setAge(5);
		d3.setBreeed("Dalmation");
		d3.setColor("white");
		d3.setName("jimmy");

		di.putDog("1" , d);
		di.putDog("2", d1);
		di.putDog("3", d3);
		
		di.getDog();
		
	
		
	}

}
