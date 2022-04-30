package com.mp.sapp.model;

public class Student {

	Integer studentId;
	String studentName;
	String deptName;

	public Student(Integer studentId, String studentName, String deptName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.deptName = deptName;
	}
	public Student() {
		super();
	}

	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", deptName=" + deptName + "]";
	}


}
