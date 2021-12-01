package com.quiz.repository;

import java.util.HashMap;
import java.util.Map;

import com.quiz.entities.User;

public class UserRepo {
	private static Map<String,User> userList = new HashMap<>();
	
	public static Map<String,User> loadUserInfo(){
		userList.put("mDhoni", new User("mDhoni","Mahendra","Dhoni","mDhoni@gmail.com","password@1"));
		userList.put("Bella", new User("bHoward","Bella","" +"Howard","bHoward@gmail.com","password@1"));
		userList.put("jBell", new User("jBell","Jessica","Bell","jBell@gmail.com","password@1"));
		userList.put("hKing", new User("hKing","Harry","King","hKing@gmail.com","password@1"));
		userList.put("iMay", new User("iMay","Isaac","May","iMay@gmail.com","password@1"));
		userList.put("jGlover", new User("jGlover","Jack","Glover","jGlover@gmail.com","password@1"));
		
		return userList;	
	}
	
	public void registerNewUser(User user) {
		userList.put(user.getUserName(), user);
	}
}
