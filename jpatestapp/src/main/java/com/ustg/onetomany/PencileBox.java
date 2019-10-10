package com.ustg.onetomany;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pencilebox")
public class PencileBox {
	@Id
	@Column
	private int boxId;
	@Column
	private String boxName;
	
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public String getBoxName() {
		return boxName;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "boxId" , nullable = false)
	List<Pencile> pencile1 ;
	
	public List<Pencile> getPencile1() {
		return pencile1;
	}
	public void setPencile1(List<Pencile> pencile1) {
		this.pencile1 = pencile1;
	}

}
