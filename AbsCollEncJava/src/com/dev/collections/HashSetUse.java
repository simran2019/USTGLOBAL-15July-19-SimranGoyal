package com.dev.collections;

import java.util.HashSet;

import com.dev.Encapsulation.Dog;

public class HashSetUse {

	public static void main(String[] args) {
		HashSet<Dog> hs = new HashSet<Dog>();
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

	d.setAge(2);
	d1.setAge(3);
	d3.setAge(6);
		
		boolean b = hs.add(d);
		boolean b1 = hs.add(d1);
		boolean b2 = hs.add(d3);
		
		System.out.println("output of add() : "+b+" "+b1+" "+b2);
		
	//	for(Dog dog:hs) {      // for each loop
	//		System.out.println(dog);
	//	}
		
		  System.out.println(hs);
		  
		  boolean b3 = hs.remove(d);
		  System.out.println("output of remove() : "+b3);
		  System.out.println(hs);
		  
		  System.out.println("Output of contains() : " +hs.contains(d1));
		  
		  System.out.println("size of HastSet hs: "+hs.size());
		  
		  hs.clear();
		  System.out.println("size of HastSet after clear() : "+hs.size());
		 
	}

}
