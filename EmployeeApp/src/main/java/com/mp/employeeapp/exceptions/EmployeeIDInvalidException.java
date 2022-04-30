package com.mp.employeeapp.exceptions;

public class EmployeeIDInvalidException extends RuntimeException {
	
	
	private String message;
	

	public EmployeeIDInvalidException(String m) {
		System.out.println("m value is " + m);
		this.message = m;
	}


	public EmployeeIDInvalidException() {
	
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "EmployeeIDInvalidException [message=" + message + "]";
	}
	

	
}
