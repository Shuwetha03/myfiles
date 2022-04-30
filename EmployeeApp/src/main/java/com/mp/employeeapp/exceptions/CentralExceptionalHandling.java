package com.mp.employeeapp.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CentralExceptionalHandling {

	@ExceptionHandler(EmployeeIDInvalidException.class)
	public String empIDIsInvalid(EmployeeIDInvalidException e) {
		System.out.println("in handler message");
		return e.getMessage();
	}

	@ExceptionHandler(DepartmentEIENotAllowedException.class)
	public String invalidDepartment(DepartmentEIENotAllowedException e) {
		System.out.println("in handler message INVALID EIE department " + e);
		return e.getMsg();
	}


	@ExceptionHandler(EmployeeIdNotProvidedException.class)
	public String employeeIdNotPresent(EmployeeIdNotProvidedException e) {
		System.out.println("in handler message expected employee id " + e);
		return e.getMess();
	}
}
