package com.ustg.Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column
	private int id;
	@Column
	private String Name;
	@Column
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@OneToOne(cascade = CascadeType.ALL) // for estaiblish the uni direction relaition 
	@JoinColumn(name = "V_Id")
	private VoterId vi;

	public VoterId getVi() {
		return vi;
	}

	public void setVi(VoterId vi) {
		this.vi = vi;
	}

}
