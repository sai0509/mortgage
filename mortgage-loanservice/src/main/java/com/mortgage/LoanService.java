package com.mortgage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

	@Autowired
	LoanRepository loanRepository;

	public String applyloan(Loan loan) {
		String res = "";
		Loan loan2 = loanRepository.getLoanByPropertyid(loan.getPropertyid());
		if (loan2 == null) {
			if (loan.getResidence().toLowerCase().equals("india")) {
				if (loan.getCreditscore() < 1000) {
					if (loan.getCreditscore() > 500) {
						System.out.println("service" + loan);
						Loan loan3 = loanRepository.save(loan);
						if (loan3 != null) {
							res = "Loan Applied";
						} else {
							res = "Loan Details are not perfect";
						}

					} else {
						res = "Credit Score Should Not be less than 500";
					}
				} else {
					res = "Credit Score Should Not be Greater than 1000";
				}
			} else {
				res = "Not A Legal Residence";
			}
		} else {
			res = "Loan cannot be applied on same property";
		}
		return res;
	}
	
	public List<Loan> getloans(int id) {
		return loanRepository.getLoanByid(id);
		
	}
}
