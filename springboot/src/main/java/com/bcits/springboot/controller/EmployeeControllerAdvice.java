package com.bcits.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bcits.springboot.beans.EmployeeResponse;
import com.bcits.springboot.customexception.EmployeeException;
@RestControllerAdvice
public class EmployeeControllerAdvice {
@ExceptionHandler(EmployeeException.class)
public EmployeeResponse handleEmployeeException(EmployeeException ex) {
	EmployeeResponse response=new EmployeeResponse();
	response.setStatusCode(501);
	response.setMessage("exception");
	response.setDescription(ex.getMessage());
	return response;
}
}
