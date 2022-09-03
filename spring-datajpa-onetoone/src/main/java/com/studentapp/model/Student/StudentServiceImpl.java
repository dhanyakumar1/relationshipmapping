package com.studentapp.model.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.Student;
import com.studentapp.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentRepository studentRepository;
	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(int StudentId) {
		studentRepository.deleteById(StudentId);
	}

	@Override
	public Student getById(int StudentId) {
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getByDepartment(String department) {
		 return studentRepository.findStudsByDept(department);
		
	}

	@Override
	public List<Student> getByCity(String city) {
		return studentRepository.findStudByCity(city);
		}

	@Override
	public List<Student> getByCityAndDepartment(String city, String department) {
		return studentRepository.findByCityDEpt(city, department);
		}

	@Override
	public List<Student> getByCityAndState(String city, String state) {
	return studentRepository.findByCityState(city, state);


		}

}
