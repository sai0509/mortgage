package com.mortgage;

import java.util.List;

import org.apache.log4j.Logger;
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

	private static final Logger logger = Logger.getLogger(LoanController.class);

	public LoanController() {
		logger.info("LoanController");
		System.out.println("LoanController()");
	}

	@RequestMapping("/newloan")
	public String applyloan(@RequestBody Loan loan) {
		logger.info("Calling  applyloan method...");
		return loanService.applyloan(loan);
	}

	@RequestMapping("/{id}/getloans")
	public List<Loan> getloans(@PathVariable("id") int id) {
		logger.info("Calling  getloans method...");
		return loanService.getloans(id);
	}

	@RequestMapping("/loanamount/{loanid}")
	public int loanAmount(@PathVariable("loanid") int loanid) {
		logger.info("Calling  loanamount method...");
		return loanService.loanAmount(loanid);
	}

	@RequestMapping("/approveloan")
	public boolean approveloan(@RequestBody Loan loan) {
		logger.info("Calling  approveloan method...");
		return loanService.approveloan(loan);
	}

	@RequestMapping("/denyloan/{loanid}")
	public boolean denyloan(@PathVariable("loanid") int loanid) {
		logger.info("Calling  denyloan method...");
		return loanService.denyloan(loanid);
	}

}
