package com.dev.Assignment;

public class EmployeeDetails implements Comparable<EmployeeDetails> { // we use here implements comparable for treeset

	private String name;
	private int id;
	private String email;
	private String password;

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

	public static void main(String[] args) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int compareTo(EmployeeDetails em) {

		return this.id - em.id; // we use here id bcoz i want to shot my details on the bases of id
	}

}
