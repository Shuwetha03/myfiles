package com.mp.employeeapp.exceptions;

public class DepartmentEIENotAllowedException extends RuntimeException{

	String msg;

	public DepartmentEIENotAllowedException(String msg) {
	
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DepartmentEIENotAllowedException [msg=" + msg + "]";
	}
	
	
}
