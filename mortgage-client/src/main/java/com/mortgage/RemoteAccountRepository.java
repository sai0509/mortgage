package com.mortgage;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

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
		Loan[] loans = restTemplate.getForObject(serviceUrl + "/loan/" + id + "/getloans", Loan[].class);
		return Arrays.asList(loans);
	}

	@Override
	public int loanamount(int loanid) {
		ResponseEntity<Integer> amount = restTemplate.getForEntity(serviceUrl + "/loan/loanamount/" + loanid, Integer.class);
		return amount.getBody();
	}

	@Override
	public boolean approveloan(Loan loan) {
		ResponseEntity<Boolean> result = restTemplate.postForEntity(serviceUrl + "/loan/approveloan", loan, boolean.class);
		return result.getBody();
	}

	@Override
	public boolean denyloan(int loanid) {
	ResponseEntity<Boolean> result = restTemplate.getForEntity(serviceUrl + "/loan/denyloan/" + loanid, boolean.class);
	return result.getBody();
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


