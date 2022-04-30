package org.mp.studentapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDataRunner implements ApplicationRunner{
	
	
	
	
@Override
	public String toString() {
		return "StudentDataRunner [students="+students+"]";
	}

Map<Integer,Student> students = new HashMap<>();

public Map<Integer,Student> getStudents(){
	return students;
}

public void setStudents(Map<Integer, Student> students) {
	this.students=students;
	
}

@Override
public void run(ApplicationArguments args) throws Exception {
students.put(101 ,new Student("Shuwetha","CSE",102) );
students.put(102 ,new Student("Prem Kumar","ISE",103) );
students.put(103 ,new Student("PaPa","EEE",101) );
}

}
