package com.quiz.controller;

import com.quiz.exception.AuthenticationException;
import com.quiz.factory.FactoryAuthService;
import com.quiz.model.UserModel;
import com.quiz.service.AuthService;
import com.quiz.view.ErrorView;
import com.quiz.view.WelcomeView;

public class AuthenticationController {
	
	private AuthService authService;
	
	public AuthenticationController() {
		authService = FactoryAuthService.getInstance();
	}
	public void authUser(UserModel userModel) {
		try {
			UserModel user = authService.authService(userModel);
			
			WelcomeView welcomeView = new WelcomeView();
			welcomeView.welcome(user);
		}catch(AuthenticationException e) {
			ErrorView errorView = new ErrorView();
			errorView.authError();
		}
	}
}
