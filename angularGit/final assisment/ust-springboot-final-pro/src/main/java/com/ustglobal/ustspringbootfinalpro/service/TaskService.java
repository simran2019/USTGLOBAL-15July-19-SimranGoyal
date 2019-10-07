package com.ustglobal.ustspringbootfinalpro.service;

import java.util.List;

import com.ustglobal.ustspringbootfinalpro.dto.Task;

public interface TaskService {

	public boolean addTask(Task task);
	public boolean removeTask(int id);
	public boolean modifyTask(Task task);
	public Task getTask(int id);
	public List<Task> getAllTask();
	
	
}
