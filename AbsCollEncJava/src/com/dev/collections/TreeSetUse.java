package com.dev.collections;

import java.util.TreeSet;

import com.dev.Encapsulation.Dog;

public class TreeSetUse {

	public static void main(String[] args) {
	
		TreeSet<Dog> ts = new TreeSet<Dog>();
		
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
		
		ts.add(d);
		ts.add(d1);
		ts.add(d3);
		
		System.out.println(ts);

	}

}
