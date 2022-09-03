package com.studentapp.model.Student;

import java.util.List;

import com.studentapp.Student;


public interface IStudentService {
	 void addStudent(Student student);
	 void updateStudent(Student student);
	 void deleteStudent(int StudentId);
	 Student getById(int StudentId);
	 List<Student> getAll();
	 
	 List<Student> getByDepartment(String department);
	 List<Student> getByCity(String city);
	 List<Student> getByCityAndDepartment(String city,String department);
	 List<Student> getByCityAndState(String city,String state);

}
