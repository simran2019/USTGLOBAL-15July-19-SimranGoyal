package com.ustglobal.ustspringbootfinalpro.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.ustspringbootfinalpro.dto.Task;
import com.ustglobal.ustspringbootfinalpro.reposatory.TaskReposatory;

@Service("jpa")
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskReposatory reposatory;

	@Override
	public boolean addTask(Task task) {
		Date date = new Date();
		task.setStart_date(date);
		reposatory.save(task);
		return true;
	}

	@Override
	public boolean removeTask(int id) {
		reposatory.deleteById(id);
		return true;
	}

	@Override
	public boolean modifyTask(Task task) {
		Date date = new Date();
		reposatory.update(date, task.getId());
		return true;
	}

	@Override
	public Task getTask(int id) {
		
		return reposatory.findById(id).get();
	}

	@Override
	public List<Task> getAllTask() {
		
		return reposatory.findAll();
	}

}
