package com.quiz.factory;

import com.quiz.repository.UserRepo;

public class FactoryUserRepo {
	public static UserRepo getInstance() {
		UserRepo userRepo = new UserRepo();
		return userRepo;
	}
}
