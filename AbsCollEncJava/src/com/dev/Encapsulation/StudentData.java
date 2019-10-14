package com.dev.Encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRegno(23435);
		s.setName("simran");
		s.setEmail("simuyu@gnail");
		s.setPassword("2343");
		
		System.out.println("RegNo = "+s.getRegno());
		System.out.println("name = "+s.getName());
		System.out.println("email = "+s.getEmail());
		
		
		
	}

}
