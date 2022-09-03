package com.investmentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.investmentapp.exceptions.PlanNotFoundException;
import com.investmentapp.model.Investment;
import com.investmentapp.service.IInvestmentService;
@RestController
public class InvestmentController {
	@Autowired
	IInvestmentService investmentService;
	@PostMapping("/investments")
	void addInvestment(@RequestBody Investment investment)
	{
		investmentService.addInvestment(investment);
	}
	@PutMapping("/investments")
	void updateInvestment(@RequestBody Investment investment){
		investmentService.updateInvestment(investment);
	}
	@DeleteMapping("/investments/{planId}")
	void deleteInvestment(@PathVariable("planId") int planId) {
		investmentService.deleteInvestment(planId);
	}
	@GetMapping("/investments/type/{type}")
	public List<Investment> getByType(@PathVariable("risk") String type) throws PlanNotFoundException{
		return investmentService.getByType(type);
		
	}
	@GetMapping("/investments/risk/{risk}/term/{term}")
	public List<Investment> getByRiskAndTerm(@PathVariable("risk") String risk, @PathVariable("term") int mterm) throws PlanNotFoundException{
		return investmentService.getByRiskAndTerm(risk, mterm);
	}
	@GetMapping("/investments/purpose/{purpose}")
	public List<Investment> getByPurpose(@PathVariable("purpose") String purpose) throws PlanNotFoundException{
		return investmentService.getByPurpose(purpose);
		
	}
	public List<Investment> getAll(){
		return investmentService.getAll();
		
	}
	
	public List<Investment> calculateMaturity(Investment investment) {
		return null;
		
	}
	public Investment getById(int planId) throws PlanNotFoundException {
		return investmentService.getById(planId);
		
	}
}
