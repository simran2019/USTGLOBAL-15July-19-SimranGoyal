package com.dev.collections;

import java.util.ArrayList;

import com.dev.Encapsulation.Dog;

public class ArrayListUse {

	public static void main(String[] args) {
	ArrayList<Dog> arl = new ArrayList<Dog>(2);
	
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
	
	arl.add(d);
	arl.add(d1);
	arl.add(d3);
	
	System.out.println(arl);
	
	arl.trimToSize();
	
	System.out.println("size of an array list after trim to size = "+arl.size());
	

	}

}
