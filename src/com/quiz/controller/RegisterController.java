package com.quiz.controller;

import com.quiz.entities.User;
import com.quiz.factory.FactoryUserRepo;
import com.quiz.repository.UserRepo;
import com.quiz.view.LoginView;

public class RegisterController {
	private UserRepo userRepo;
	
	public RegisterController() {
		userRepo = FactoryUserRepo.getInstance();
	}
	public void registerController(User user) {
		userRepo.registerNewUser(user);
		LoginView loginView = new LoginView();
		loginView.login();
	}
	
}
