package org.mp.studentapp;

public class Student {
String name;
String dept;
Integer sid;

public Student(String name, String dept, Integer sid) {
	this.name = name;
	this.dept = dept;
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}


}
