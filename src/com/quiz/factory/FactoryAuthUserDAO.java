package com.quiz.factory;

import com.quiz.dao.AuthUserDAO;
import com.quiz.dao.AuthUserDAOImpl;

public class FactoryAuthUserDAO {
	public static AuthUserDAO getInstance() {
		AuthUserDAO authUserDAO = new AuthUserDAOImpl();
		return authUserDAO;
	}
}
