package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repository.ICourseRepository;
@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	ICourseRepository courseRepository;
	@Override
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	

	@Override
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	@Override
	public void deleteCourse(int courseId) {
		courseRepository.deleteById(courseId);
	}

	@Override
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course getById(int courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public List<Course> getByCategory(String category) {
		return courseRepository.findByCategory(category);
	}

	@Override
	public List<Course> getByEmployee(String name) {
		return courseRepository.findByEmployee(name);
	}

	@Override
	public List<Course> getByCity(String city) {
		return courseRepository.findByCity(city);
	}

}
