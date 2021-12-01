package com.quiz.service;

import com.quiz.exception.AuthenticationException;
import com.quiz.model.UserModel;

public interface AuthService {
	public UserModel authService(UserModel userModel) throws AuthenticationException;
}
