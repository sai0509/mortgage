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
		Loan loan2 = loanRepository.getLoanByIdAndPropertyid(loan.getId(), loan.getPropertyid());
		System.out.println("property details" + loan2);
		if (loan2 == null) {
			if (loan.getResidence().toLowerCase().equals("india")) {
				if (loan.getCreditscore() < 1000) {
					if (loan.getCreditscore() > 600) {
						if (loan.getAreacode() > 0 && loan.getAreacode() <= 300) {
							System.out.println("service" + loan);
							loan.setStatus("pending");
							Loan loan3 = loanRepository.save(loan);
							if (loan3 != null) {
								res = "Loan Applied";
							} else {
								res = "Loan Details are not perfect";
							}
						} else {
							res = "area code is out of range";
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

	public int loanAmount(int loanid) {
		Loan loan = loanRepository.getLoanByLoanid(loanid);
		int areacode = loan.getAreacode();
		int sqrate = 0;
		int creditscore = loan.getCreditscore();
		float per = 0;
		int loanamount = 0;
		if (areacode > 0 && areacode <= 100) {
			sqrate = 3000;
		}
		if (areacode > 100 && areacode <= 200) {
			sqrate = 1000;
		}
		if (areacode > 200 && areacode <= 300) {
			sqrate = 2000;
		}
		if (creditscore > 600 && creditscore <= 700) {
			per = 0.6f;
		}
		if (creditscore > 700 && creditscore <= 800) {
			per = 0.7f;
		}
		if (creditscore > 800 && creditscore <= 1000) {
			per = 0.8f;
		}
		loanamount = (int) (sqrate * loan.getPropertysq() * per);
		if (loan.getStatus().equals("pending")) {
			loanamount = loanamount-0;
		} else {
			loanamount = loanamount-loan.getLoanamount();
		}
		return loanamount;
	}
	
	public boolean approveloan(Loan loan) {
		boolean res = false;
		Loan loan2 = loanRepository.getLoanByLoanid(loan.getLoanid());
		if (loan2.getStatus().equals("pending")) {
		loan2.setLoanamount(loan.getLoanamount());
		loan2.setStatus("Approved");
		loanRepository.save(loan2);
		res = true;
		} else if (loan2.getStatus().equals("Approved")) {
			loan2.setLoanamount(loan2.getLoanamount() + loan.getLoanamount());
			loan2.setStatus("Approved");
			loanRepository.save(loan2);
			res = true;
		}
		return res;
	}
	
	public boolean denyloan(int loanid) {
		boolean res = false;
		Loan loan2 = loanRepository.getLoanByLoanid(loanid);
		if (loan2.getStatus().equals("pending")) {
		loanRepository.delete(loan2);
		res = true;
		} else {
		res = true;
		}
		return res;
		}
}
