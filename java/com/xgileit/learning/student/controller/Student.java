package com.xgileit.learning.student.controller;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private  int grades;
	private String gender;
	HashMap<Integer, String>  identity = new HashMap<>();
	List<String> studentList = new ArrayList<>();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName; 
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGrades() {
		return grades;
	}
	public void setGrades(int grades) {
		this.grades = grades;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getGender() {
		return gender;
	}
	Scanner scan = new Scanner(System.in);
	
	public Student(String firstName, String lastName, int grades, String gender) {
		try{
			System.out.println("Please enter your First Name :");
		this.firstName = scan.nextLine();
		System.out.println("Please enter your Last Name :");
		this.lastName = scan.nextLine();
		System.out.println("Please enter your grade");
		if(grades <= 12)
		this.grades = scan.nextInt();
		System.out.println("Please enter your gender :");
		this.gender = scan.next();
		System.out.println("New Student has been added");
	}catch(Exception e) {
		System.out.println("Invalid input");
	}
	}
}
