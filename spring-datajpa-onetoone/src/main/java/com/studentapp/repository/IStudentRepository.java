package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentapp.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{
	
//	List<Student> findByDepartment(String department);
//	 List<Student> findByAddressCity(String city);
//	 List<Student> findByAddressCityAndDepartment(String city,String department);
//	 List<Student> findByAddressCityAndState(String city,String state);

// custom queries - JPQL
	
	@Query("from Student s where s.department=?1")
	List<Student> findStudsByDept(String dept);
	
	@Query("from Student s inner join s.address a where a.city=?1")
	List<Student> findStudByCity(String city);
	
	@Query("from Student s inner join s.address a where a.city=?1 and s.department=?2")
	List<Student> findByCityDEpt(String city, String department);
	
	@Query("from Student s inner join s.address a where a.city=?1 and a.state=?2")
	List<Student> findByCityState(String city, String state);
}
