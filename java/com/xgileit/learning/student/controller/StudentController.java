/**
 * Testing on transforming a program into a REST service using annotations and SpringBoot.
 */

package com.xgileit.learning.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xgileit.learning.student.controller.service.Management;
import com.xgileit.learning.student.controller.service.ServiceImplementer;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {
	ServiceImplementer studentManager = new ServiceImplementer();
	HashMap<Integer, Student>  identity = new HashMap<>();
	List<String> studentList = new ArrayList<>();
	
	
@GetMapping
public HashMap<Integer, Student> selectStudent() {
	/**
	 * Selects the names and Id numbers of Students with their grades.
	 */
	return identity;
}

@PostMapping
public HashMap<Integer, Student> addNewStudent(Student adder){
	/**
	 * Adds a new Student to the HashMap list.
	 */
	return identity;
}
	
@PutMapping
public String updateStudent(Student updater) {
	updater.setGrades(9);
	return " Student grade has been updated";
}

@DeleteMapping
public void deleteStudent() {
	/**
	 * Deletes a student based on their Name.
	 **/
	
}

@RequestMapping(value =  "/fetch/{id}", method = RequestMethod.GET)//this is an alternative way to write the GET method above.
//fetch is a placeholder or unique identifier that shows the exact particular method you want to be called.
public String studentPath(@PathVariable("id")int studentId) {
	if(studentId ==2) {
		return "Student Found";
	}
	return "Student Not Found";
}
@RequestMapping(value = "/all/{studentId}", method= RequestMethod.GET)
public List listOfStudents(@PathVariable("studentid") int studentId, @RequestParam(value = "name", required = false)String name){
	if(studentId == 2) {
		studentList.add(name);
	}
	return studentList;
}
}

