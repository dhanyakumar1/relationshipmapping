package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args)  {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
	IEmployeeService employeeService;
	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	ICourseService courseService;
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Employee employee = new Employee("Raj","bangalore", "IT"); Course course1 =
		 * new Course("java", 10, "full stack"); Course course2 = new Course("spring",
		 * 20, "full stack"); Course course3 = new Course("jdbc", 15, "full stack");
		 * Set<Course> courses=new HashSet<>(Arrays.asList(course1,course2,course3));
		 * employee.setCourses(courses); employeeService.addEmployee(employee);
		 */

		Employee employee = new Employee("hari","udupi", "Digital"); 
		Course course1 =courseService.getById(1);
		Course course2 =courseService.getById(2);
		Set<Course> courses=new HashSet<>(Arrays.asList(course1,course2));
		  employee.setCourses(courses);
		  employeeService.addEmployee(employee);
	}
	
	

}
