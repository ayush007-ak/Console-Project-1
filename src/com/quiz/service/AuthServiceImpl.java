package com.quiz.service;

import com.quiz.dao.AuthUserDAO;
import com.quiz.entities.User;
import com.quiz.exception.AuthenticationException;
import com.quiz.factory.FactoryAuthUserDAO;
import com.quiz.model.UserModel;

public class AuthServiceImpl implements AuthService {

	private AuthUserDAO authUserDAO;
	
	public AuthServiceImpl() {
		authUserDAO = FactoryAuthUserDAO.getInstance();
	}
	@Override
	public UserModel authService(UserModel userModel) throws AuthenticationException {
		User user = authUserDAO.authUser(userModel.getUserName(), userModel.getUserPassword());
		if(user!=null) {
			userModel.setRegistered(true);
			userModel.setFirstName(user.getFirstName());
			userModel.setLastName(user.getLastName());
			userModel.setUserEmail(user.getUserEmail());
			return userModel;
		}else {
			throw new AuthenticationException("userName or Password in not match with record please register..");
		}
		
	}

}
