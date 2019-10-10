package com.dev.springrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.springrest.dto.Employee;
import com.dev.springrest.dto.EmployeeResponse;
import com.dev.springrest.service.EmployeeService;

@RestController   // for controller + respose body
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(path = "/get" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		Employee employee = service.getEmployee(id);
		if(employee==null) {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("employee not found");
		}else {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("employee  found");
			response.setEmployee(Arrays.asList(employee));
		}
		return response;
	}
	
	@GetMapping(path = "/get-all" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		EmployeeResponse response = new EmployeeResponse();
		List<Employee> employee = service.getAllEmployee();
		if(employee==null) {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("employee not found");
		}else {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("employee  found");
			response.setEmployee(employee);
		}
		return response;
				
	}
	
	@PostMapping(path = "/add" , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.addEmployee(employee)) {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("not added");
		}else {
			response.setStatusCode(201);
			response.setMsg("successs");
			response.setDescription("added");
		}
		return response;
	}
	
	@DeleteMapping(path = "/remove/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@PathVariable("id") int id) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.removeEmployee(id)) {
			response.setStatusCode(201);
			response.setMsg("success");
			response.setDescription("employee removed");
		}else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("not removed");
		}
		return response;
	}
	
	@PutMapping(path = "/modify" , produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody Employee employee) {
		EmployeeResponse response = new EmployeeResponse();
		if(service.modifyEmployee(employee)) {
			response.setStatusCode(201);
			response.setMsg("success");
			response.setDescription("employee modify");
		}else {
			response.setStatusCode(401);
			response.setMsg("failed");
			response.setDescription("not modify");
		}
		return response;
	}
}
