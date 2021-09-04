package com.xgileit.learning.student.controller.service;

import java.util.Map;
import com.xgileit.learning.student.controller.Student;

public interface Management {

public String addStudent(Student student);

public Map<Integer, Student> listAllStudentDetails();
public void deleteStudent(Student findFirstName);
public String updateStudent(Student findGrade);
}
