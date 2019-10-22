package com.mortgage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	LoanService loanService;
	
	@RequestMapping("/newloan")
	public String applyloan(@RequestBody Loan loan) {
		return loanService.applyloan(loan);
	}
	
	@RequestMapping("/{id}/getloans")
	public List<Loan> getloans(@PathVariable("id") int id) {
		return loanService.getloans(id);
	}
}
