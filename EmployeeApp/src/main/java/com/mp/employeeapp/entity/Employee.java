package com.mp.employeeapp.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="id")
	Integer empId;

	@Column(name="empName")
	String empName;
	
	@Column(name="deptName")
	String deptName;
	
	@Column(name="phone")
	Integer phoneNo;


	public Employee() {
		
	}



	public Employee(Integer empId, String empName, String deptName, Integer phoneNo) {
		
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.phoneNo = phoneNo;
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public Integer getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", phoneNo=" + phoneNo
				+ "]";
	}
	
	
}
