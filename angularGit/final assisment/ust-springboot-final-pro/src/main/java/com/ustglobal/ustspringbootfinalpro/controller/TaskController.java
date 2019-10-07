package com.ustglobal.ustspringbootfinalpro.controller;

import org.springframework.web.bind.annotation.InitBinder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.ustspringbootfinalpro.dto.Task;
import com.ustglobal.ustspringbootfinalpro.dto.TaskResponse;
import com.ustglobal.ustspringbootfinalpro.service.TaskService;

@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*" , allowedHeaders = "*" , allowCredentials = "true")
public class TaskController {

	@Autowired
	@Qualifier("jpa")
	private TaskService service;
	
@InitBinder
	public void InitBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping(path = "/get" , produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getTask(@RequestParam("id") int id) {
		TaskResponse response = new TaskResponse();
		Task task = service.getTask(id);
		if(task==null) {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("task not found");
		}else {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("task  found");
			response.setTasks(Arrays.asList(task));
		}
		return response;
	}
	
	@GetMapping(path = "/get-all" , produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse getAllTask() {
		TaskResponse response = new TaskResponse();
		List<Task> task = service.getAllTask();
		if(task==null) {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("tasks not found");
		}else {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("tasks  found");
			response.setTasks(task);
		}
		return response;
	}
	
	@PostMapping(path = "/add" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse addTask(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if(service.addTask(task)) {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("added");
			response.setTasks(Arrays.asList(task));
			
		}else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("not added");
		}
		return response;
	}
	
	@DeleteMapping(path = "/remove/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse removeTask(@PathVariable("id") int id) {
		TaskResponse response = new TaskResponse();
		if(service.removeTask(id)) {
			response.setStatusCode(201);
			response.setMsg("success");
			response.setDescription("task removed");
		}else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("task not removed");
		}
		return response;
	}
	
	@PutMapping(path = "/modify" , produces = MediaType.APPLICATION_JSON_VALUE)
	public TaskResponse modifyEmployee(@RequestBody Task task) {
		TaskResponse response = new TaskResponse();
		if(service.modifyTask(task)) {
			response.setStatusCode(201);
			response.setMsg("success");
			response.setDescription("task modify");
			response.setTasks(Arrays.asList(task));
		}else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription(" task not modify");
		}
		return response;
	}
}
