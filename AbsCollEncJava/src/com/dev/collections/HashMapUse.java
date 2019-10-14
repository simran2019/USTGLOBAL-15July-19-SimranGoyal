package com.dev.collections;

import java.util.HashMap;

import com.dev.Encapsulation.Dog;

public class HashMapUse {

	public static void main(String[] args) {
		HashMap<String, Dog> hm = new HashMap<String, Dog>();
		
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
		
		hm.put("1", d);            // we have to invoke it otherwise we get null as o/p becz in put we get previous safe values
		hm.put("2", d1);
		hm.put("3", d3);
		
		System.out.println(hm);
		
		Dog b = hm.remove("1");
		
		
		System.out.println(b);
		System.out.println(hm);
		
		System.out.println("output of contains key:"+hm.containsKey("1"));
		
		System.out.println("output of containsValue:"+hm.containsValue(d3));

	}

}
