package com.in28minutes.jee;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("user1") && password.equals("user1")) {
			return true;
		}
		return false;
	}
	
}
