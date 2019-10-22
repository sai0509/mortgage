package com.mortgage;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Integer>{

	public List<Loan> getLoanByid(int id);
	
	public Loan getLoanByPropertyid(int propertyid);
}
