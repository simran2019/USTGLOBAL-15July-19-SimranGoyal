package com.ustglobal.ustspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice     // controller advice + respose body
public class ExceptionHandlerClass {

	@ExceptionHandler(Exception.class)
	public String catchException() {
		System.out.println("handel Exception");
		return "handel Exception";
	}
	
	
}
