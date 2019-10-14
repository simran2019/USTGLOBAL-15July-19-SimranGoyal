package com.dev.Encapsulation;

public class Dog implements Comparable <Dog> {
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", breeed=" + breeed + ", color=" + color + "]";
	}

	private int age;
	private String name;
	private String breeed;
	private String color;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreeed() {
		return breeed;
	}

	public void setBreeed(String breeed) {
		this.breeed = breeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public int compareTo(Dog d) {
		
		return this.age - d.age;
	}

}
