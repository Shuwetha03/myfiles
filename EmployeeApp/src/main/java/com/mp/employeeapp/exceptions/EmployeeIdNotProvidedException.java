package com.mp.employeeapp.exceptions;

public class EmployeeIdNotProvidedException extends RuntimeException {

	String mess;

	public EmployeeIdNotProvidedException(String mess) {

		this.mess = mess;
	}

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	@Override
	public String toString() {
		return "EmployeeIdNotProvidedException [mess=" + mess + "]";
	}
	
}
