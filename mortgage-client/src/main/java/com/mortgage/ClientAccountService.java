package com.mortgage;

import java.util.List;

public interface ClientAccountService {
	
	public String applyloan(Loan loan);
	
	public List<Loan> getloans(int id);
	
	public int loanamount(int loanid);
	
	public boolean approveloan(Loan loan);
	
	public boolean denyloan(int loanid);

}
