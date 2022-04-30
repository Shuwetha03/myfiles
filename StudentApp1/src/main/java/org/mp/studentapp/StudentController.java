package org.mp.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentDataRunner dataRunner;

	/*
	 * @GetMapping("/name") public String getEmployeeName() { return
	 * dataRunner.getStudents().get(102);
	 * 
	 * }
	 */

	@GetMapping(value="/id",produces="application/json")
	public Student getEmployeeNameByEmpId(@RequestParam(value ="studentId") Integer studentId) {
		return dataRunner.getStudents().get(studentId);
		
	}
	
	@GetMapping("/name")
	public String getEmpName(@RequestParam("sid")Integer sid) {
		return "Shuwetha";
	}
	@GetMapping("/empId")
	public String getEmpId(@RequestParam("sname")String sname) {
		return "Shuwetha";
	}
	
	/*
	 * @GetMapping("/id/{Name}") public String getEmp(@PathVariable("Name")Integer
	 * studentId) { return dataRunner.getStudents().get(studentId); }
	 */
	
}
