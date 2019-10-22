package com.mortgage;

import org.springframework.http.ResponseEntity;

public interface ClientUserService {

	public int login(User user);

	public ResponseEntity<Integer> adduserdetails(User user);
	
	public ResponseEntity<String> registeruserdetails(PersonalDetails personalDetails); 
	
}
