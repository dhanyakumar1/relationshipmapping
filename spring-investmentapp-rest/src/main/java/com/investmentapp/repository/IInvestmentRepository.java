package com.investmentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.investmentapp.model.Investment;
@Repository
public interface IInvestmentRepository extends JpaRepository<Investment, Integer> {
	@Query("from Investment i where i.risk=?1 and i.term=?1")
	List<Investment> findByRiskAndTerm(String risk, int term);
	@Query("from Investment i where i.type=?1")
	List<Investment> findByType(String type);
	@Query("from Investment i where i.purpose=?1")
	List<Investment> findByPurpose(String purpose);
	
}