package com.mortgage;

import java.util.List;

public interface ClientAccountService {
	
	public String applyloan(Loan loan);
	
	public List<Loan> getloans(int id);
}
