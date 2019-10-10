package com.ustg.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pencile")
public class Pencile {
	
	@Id
	@Column
	private int pencileId;
	@Column
	private String pencileName;
	public int getPencileId() {
		return pencileId;
	}
	public void setPencileId(int pencileId) {
		this.pencileId = pencileId;
	}
	public String getPencileName() {
		return pencileName;
	}
	public void setPencileName(String pencileName) {
		this.pencileName = pencileName;
	}
	

}
