package com.quiz.dao;

import com.quiz.entities.User;

public interface AuthUserDAO {
	public User authUser(String userName,String password);
}
