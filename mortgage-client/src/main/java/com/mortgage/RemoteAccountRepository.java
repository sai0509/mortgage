package com.mortgage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinesh.Rajput
 *
 */
public class RemoteAccountRepository implements ClientAccountService {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}

	@Override
	public String applyloan(Loan loan) {
		System.out.println("repo" + loan);
		ResponseEntity<String> res = restTemplate.postForEntity(serviceUrl + "/loan/newloan", loan, String.class);
		return res.getBody();
	}

	@Override
	public List<Loan> getloans(int id) {
		List<Loan> loans = (List<Loan>) restTemplate.getForObject(serviceUrl + "/loan/" + id + "/getloans", Loan.class);
		return loans;
	}
	
	

	
		
	}
	
//	@Override
//	public List<Account> getAllAccounts() {
//		Account[] accounts = restTemplate.getForObject(serviceUrl+"/accounts", Account[].class);
//		return Arrays.asList(accounts);
//	}
//
//	@Override
//	public Account getAccount(String number) {
//		return restTemplate.getForObject(serviceUrl + "/accounts/{id}",
//				Account.class, number);
//	}


