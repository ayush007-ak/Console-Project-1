package com.quiz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.quiz.controller.AuthenticationController;
import com.quiz.model.UserModel;

public class LoginView {
	
	public void login() {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("\n************* Login ****************");
			System.out.print("Enter UserName :");
			String userName = sc.next();
			
			System.out.print("Enter Password :");
			String userPassword = sc.next();
			
			UserModel userModel = new UserModel();
			userModel.setUserName(userName);
			userModel.setUserPassword(userPassword);
			
			AuthenticationController controller = new AuthenticationController();
			controller.authUser(userModel);
			
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
	}
}
