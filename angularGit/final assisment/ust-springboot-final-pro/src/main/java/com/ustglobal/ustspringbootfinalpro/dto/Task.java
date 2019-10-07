package com.ustglobal.ustspringbootfinalpro.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="task_manager")
public class Task {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(nullable = false)
	private String task;
	@Column(nullable = false)
	@CreationTimestamp
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date start_date;
	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date end_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
}
