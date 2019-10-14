package com.dev.inheritance;

public class parent2 extends parent1{
	


	String name = "simran";

	
	 static parent2 p2 = new parent2();
	
		@Override
		
		public void printName() {
			System.out.println(name+" "+super.name+" "+p2.lastName);
			}

	public static void main(String[] args) {
	p2.printName();

	}


}
