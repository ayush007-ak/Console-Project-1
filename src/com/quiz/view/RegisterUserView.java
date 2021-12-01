package com.quiz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.quiz.controller.RegisterController;
import com.quiz.entities.User;

public class RegisterUserView {
	
	public void Register() {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("\n***************REGISTER USER***************");
			System.out.print("\nEnter Username : ");
			String userName = sc.next();
			
			System.out.print("\nEnter First Name:");
			String firstName = sc.next();
			
			System.out.print("\nEnter Last Name:");
			String lastName = sc.next();
			
			System.out.print("\nEnter Email : ");
			String userEmail = sc.next();
			
			System.out.print("\nEnter Password : ");
			String userPassword = sc.next();
			
			User user = new User(userName,firstName,lastName,userEmail,userPassword);
			RegisterController controller = new RegisterController();
			controller.registerController(user);
		
		}catch(InputMismatchException e) {
			System.out.println("Please Enter correct Details.");
		}
		
		
		
	}
}
