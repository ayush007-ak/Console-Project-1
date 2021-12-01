package com.quiz.view;

import com.quiz.model.UserModel;

public class WelcomeView {
	
	public void welcome(UserModel userModel) {
		System.out.println("\n************ User Profile ***********");
		System.out.print("Welcome : "+userModel.getFirstName()+" "+userModel.getLastName());
		
		XmlView view = new XmlView();
		view.xmlView(userModel);
		LogoutView logoutView = new LogoutView();
		logoutView.logout();
	}
}
