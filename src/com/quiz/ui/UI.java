package com.quiz.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.quiz.view.LoginView;
import com.quiz.view.RegisterUserView;

public class UI {
	
	public static void main(String args[]) {
		UI obj = new UI();
		obj.ui();
		
	}
	
	public void ui() {
		try(Scanner sc = new Scanner(System.in)){
			while(true) {
				
				System.out.println("For Login ----> press 1\nFor Register ----> press 2\nFor Exit ----> press 3");
				System.out.print("Enter Your Choice :");
				int choice = sc.nextInt();
			
				switch(choice) {
					case 1:
						LoginView loginView = new LoginView();
						loginView.login();
						break;
					case 2:
						RegisterUserView registerUserView = new RegisterUserView();
						registerUserView.Register();
						break;
					case 3:
						System.exit(0);
				}
			  }
			}catch(InputMismatchException e) {
				System.err.println("Input is not Correct....");
	}
   }
}
