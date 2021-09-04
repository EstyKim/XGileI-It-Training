package com.xgileit.learning.student.controller.service;

import java.util.HashMap;
import java.util.Map;

import com.xgileit.learning.student.controller.Student;

public class ServiceImplementer implements Management{
	Map<Integer, Student> studentDetails = new HashMap<>();
	
public String addStudent(Student student) {
	try {
	studentDetails.put(student.getStudentId(), student);
	}catch(Exception e) {
		System.out.println("Student Id already exists. Please input another ID");
	}
	return "Student has been Added";
}
public Map<Integer, Student> listAllStudentDetails(){
	return studentDetails;
}

public void deleteStudent(Student grader) {
	if(grader.getFirstName() == "Clarisse") {
		studentDetails.remove(grader);
	}
	System.out.println("Student has been deleted.");
}
public String updateStudent(Student findGrade) {

	return " Student has been updated";
}
	
}

