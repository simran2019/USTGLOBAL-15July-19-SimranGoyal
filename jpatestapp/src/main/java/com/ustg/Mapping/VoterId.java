package com.ustg.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "votercard")
public class VoterId {
	@Id
	@Column
	private int V_Id;
	@Column
	private String name;
	
	@OneToOne(mappedBy = "vi") // for estaiblish the bi direction relation
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getV_Id() {
		return V_Id;
	}

	public void setV_Id(int v_Id) {
		V_Id = v_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
