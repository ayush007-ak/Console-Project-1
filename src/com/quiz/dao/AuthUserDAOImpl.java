package com.quiz.dao;

import java.util.HashMap;
import java.util.Map;

import com.quiz.entities.User;
import com.quiz.repository.UserRepo;

public class AuthUserDAOImpl implements AuthUserDAO {

	private Map<String,User> userList = new HashMap<String,User>();
	
	public AuthUserDAOImpl() {
		userList = UserRepo.loadUserInfo();
	}
	
	@Override
	public User authUser(String userName, String password) {
		User user = userList.get(userName);
		if(user != null) {
			if(password.equals(user.getUserPassword())) {
				return user;
			}
			else {
				return null;
			}
		}else {
			return null;
		}		
	}

}
