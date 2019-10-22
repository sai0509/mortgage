package com.mortgage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PersonalDetailsInterface personalDetailsInterface;

	public User userAuthentication(String user) {
		return userRepository.getUserByUsername(user);
	}

	public int adduserdetails(User user) {
		User tempuser = userRepository.save(user);
		System.out.println(tempuser.getId());
		int id;
		if (tempuser != null) {
			id = tempuser.getId();
		} else {
			id = 0;
		}
		return id;
	}
	
	public String registeruserdetails(PersonalDetails personalDetails) {
		System.out.println(personalDetails.getFirstname());
		System.out.println();
		System.out.println("bye");
		PersonalDetails personalDetails2 = personalDetailsInterface.save(personalDetails);
		String str = "";
		if (personalDetails2 != null) {
			str = "User Details Registered";
		} else {
			str = "User Details Not Found";
		}
		return str;
	}

}
