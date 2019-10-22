package com.mortgage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
 
	@Autowired
	UserService userRepositoryImpl;
	
	@RequestMapping("/{name}/get")
	public User getUser(@PathVariable("name") String user) {
		return userRepositoryImpl.userAuthentication(user);
	}
	
	@RequestMapping("/adduserdetails")
	public int adduserdetails(@RequestBody User user) {
		return userRepositoryImpl.adduserdetails(user);
	}
	
	@RequestMapping("/registeruserdetails")
	public String registeruserdetails(@RequestBody PersonalDetails personalDetails) {
		return userRepositoryImpl.registeruserdetails(personalDetails);
	}

	
}
