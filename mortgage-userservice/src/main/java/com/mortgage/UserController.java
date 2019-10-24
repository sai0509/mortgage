package com.mortgage;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userRepositoryImpl;

	private static final Logger logger = Logger.getLogger(UserController.class);

	public UserController() {
		logger.info("UserController");
		System.out.println("UserController()");
	}

	@RequestMapping("/{name}/get")
	public User getUser(@PathVariable("name") String user) {
		logger.info("Calling  getuser method...");
		return userRepositoryImpl.userAuthentication(user);
	}

	@RequestMapping("/adduserdetails")
	public int adduserdetails(@RequestBody User user) {
		logger.info("Calling  adduserdetails method...");
		return userRepositoryImpl.adduserdetails(user);
	}

	@RequestMapping("/registeruserdetails")
	public String registeruserdetails(@RequestBody PersonalDetails personalDetails) {
		logger.info("Calling  registeruserdetails method...");
		return userRepositoryImpl.registeruserdetails(personalDetails);
	}

	@RequestMapping("/getpersonaldetails/{id}")
	public PersonalDetails getpersonaldetails(@PathVariable("id") int id) {
		logger.info("calling getpersonaldetails method...");
		return userRepositoryImpl.getpersonaldetails(id);
	}

}
