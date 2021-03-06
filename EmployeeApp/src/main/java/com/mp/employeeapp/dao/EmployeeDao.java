package com.mp.employeeapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mp.employeeapp.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

	public void deleteByDeptName(String name);
	
	public void deleteByEmpNameOrDeptName(String e, String d);
}
