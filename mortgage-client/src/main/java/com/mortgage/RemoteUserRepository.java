package com.mortgage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RemoteUserRepository implements ClientUserService {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	private int id;
	
	
	public int getId() {
		return id;
	}

	
	protected String serviceUrl;
	
	public RemoteUserRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}

	@Override
	public int login(User user) {
		User user2 =  restTemplate.getForObject(serviceUrl + "/user/" + user.getUsername() + "/get",User.class, user);
		System.out.println(user);
		System.out.println(user2);
		if (user2 != null && user.getUsername().equals(user2.getUsername()) && user.getPassword().equals(user2.getPassword())) {
			this.id = user2.getId();
			return user2.getId();
			
		} else { 
			return 0;
		}
	}

	@Override
	public ResponseEntity<Integer> adduserdetails(User user) {
		ResponseEntity<Integer> result = restTemplate.postForEntity(serviceUrl + "/user/adduserdetails", user, Integer.class);
		return result;
	}

	@Override
	public ResponseEntity<String> registeruserdetails(PersonalDetails personalDetails) {
		ResponseEntity<String> result1 = restTemplate.postForEntity(serviceUrl + "/user/registeruserdetails", personalDetails, String.class);
		return result1;
	}

}
