package com.mp.employeeapp.controller;

import java.net.http.HttpHeaders;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mp.employeeapp.dao.EmployeeDao;
import com.mp.employeeapp.entity.Employee;
import com.mp.employeeapp.exceptions.DepartmentEIENotAllowedException;
import com.mp.employeeapp.exceptions.EmployeeIDInvalidException;
import com.mp.employeeapp.exceptions.EmployeeIdNotProvidedException;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeDao empDao;

	
   Logger LOGGER = LoggerFactory.getLogger("EmployeeController.class");

	
	@GetMapping("/employee/{empId}")
	public Employee getEmp(@PathVariable("empId") Integer empId) {
		LOGGER.info("Retrieving emp{}",empId);
		Optional<Employee> empRecord = empDao.findById(empId);
		LOGGER.info("retrived emp{}", empRecord);
		if(empRecord.isEmpty()) {
			LOGGER.info("employee id not found {}",empId);
			throw new EmployeeIDInvalidException("Employee id: " + empId + " is invalid");
		}
		LOGGER.info("Retrieving emp{}",empRecord.get());
		return empRecord.get();
	}

	@PostMapping("/save")
	public String createEmployee(@RequestBody Employee emp) {
		if(emp.getDeptName().equals("eie")||emp.getDeptName().equals("EIE")) {
			throw new DepartmentEIENotAllowedException("EIE branch is not available at the moment");
		}
		Employee e = empDao.save(emp);
		return "employee"+e.getEmpName()+"Saved successfully";
	}

	@DeleteMapping("/remove")
	public String deleteEmployee(@RequestBody Employee emp)
	{
		empDao.delete(emp);
		return "Employee deleted sucessfully";
	}

	@DeleteMapping("/removeDept/{empId}")
	public String deleteEmployee(@PathVariable String deptName)
	{
		empDao.deleteByDeptName(deptName);
		return "Employee deleted sucessfully";
	}


	@DeleteMapping("/removeByDeptName/{empId}/{dept}")
	@Transactional
	public String deleteEmployee(@PathVariable("empId") String empName, @PathVariable("dept") String deptName)
	{
		empDao.deleteByEmpNameOrDeptName(empName, deptName);
		return "Employee deleted sucessfully";
	}
	
	@PutMapping("/employee/emp")
	public String updateEmployee(@RequestBody Employee emp) {
		
		empDao.save(emp);
		return emp.getEmpName() + " Saved Successfully";
	}
	
	@PatchMapping("/employee/name")
	public String updateEmpName(@RequestBody Employee emp) {
		if(emp.getEmpId()==null) {
			throw new EmployeeIdNotProvidedException("Employee Id is required");
		}
		
		Optional<Employee> empOpt = empDao.findById(emp.getEmpId());
		Employee employee = empOpt.get();
		employee.setEmpName(emp.getEmpName());
		empDao.save(employee);
		return "Employee name update successfully " + emp.getEmpId();
	}
	
	@GetMapping("/dummylogger")
	public void loggertest() {
		
		int x=30;
		String name="Shuwetha";
		LOGGER.info("INFO log",x,name);
		/*
		 * LOGGER.error("ERROR log"); LOGGER.warn("WARN log");
		 * LOGGER.debug("DEBUG log");
		 */
		}
	
}
