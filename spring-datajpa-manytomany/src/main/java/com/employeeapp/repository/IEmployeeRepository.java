package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	List<Employee> findByCity(String city);
	@Query("from Employee s inner join s.courses c where c.courseName=?1")
	List<Employee> findByCourseName(String courseName);
	@Query("from Employee s inner join s.courses c where c.category=?1")
	List<Employee> findByCourseCategory(String category);
}
