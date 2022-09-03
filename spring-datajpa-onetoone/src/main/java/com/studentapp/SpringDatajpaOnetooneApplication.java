package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
	@Autowired
	IStudentService studentService;
	
	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("Bangalore","KAR");
		
		Student student = new Student("Jo","CSE",address);
	
		studentService.addStudent(student);
		System.out.println();
		
		studentService.getByDepartment("CSE").forEach(System.out::println);
		System.out.println();
		
		studentService.getByCity("Bangalore").forEach(System.out::println);
		System.out.println();
		
		studentService.getByCityAndDepartment("Bangalore", "CSE").forEach(System.out::println);
		System.out.println();
		
		studentService.getByCityAndState("Bangalore", "KAR").forEach(System.out::println);
	
	
	}

	
	
	
}
