package com.quiz.factory;

import com.quiz.service.AuthService;
import com.quiz.service.AuthServiceImpl;

public class FactoryAuthService {
	
	public static AuthService getInstance() {
		
		AuthService authService = new AuthServiceImpl();
		
		return authService;
		
	}
}
