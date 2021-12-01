package com.quiz.view;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.quiz.controller.XmlController;
import com.quiz.model.UserModel;
import com.quiz.service.CalculateResult;
import com.quiz.service.SaveTextFile;

public class XmlView {

	public void xmlView(UserModel user){
		
		System.out.println("\n********* Select Subject for Quiz ************");
		System.out.println("\nPress 1 : for Database.");
		System.out.println("Press 2 : for Java.");
		System.out.println("Press 3 : for GK.");
		System.out.println("Press 4 : for HTML.");
		System.out.println("Press 5 : for Python.");
		System.out.println("Press 6 : for CSS.");
		
		System.out.print("Enter Your Choice: ");
		int score = 0;
		String subject = "";
		
		
		try(Scanner sc = new Scanner(System.in)){
		int choice = sc.nextInt();
		System.err.println("\nFor select Answer Enter A,B,C or D\n");
		XmlController controller = new XmlController();
		
		switch(choice) {
			case 1:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\Database.xml"));
				subject = "Database";
				break;
			case 2:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\Java.xml"));
				subject = "Java";
				break;
			case 3:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\GK.xml"));
				subject = "GK";
				break;
			case 4:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\HTML.xml"));
				subject = "HTML";
				break;
			case 5:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\Python.xml"));
				subject = "Python";
				break;
			case 6:
				score = controller.xmlController(new File("D:\\Java_Practice\\QuizSystem\\src\\com\\quiz\\xmlRepository\\CSS.xml"));
				subject = "CSS";
				break;
			default:
				System.out.println("no data of this type");
				break;
		}	
		}catch(InputMismatchException e) {
			System.err.println("Invalid Input. ");
		}
		CalculateResult result = new CalculateResult(score);
		System.out.println("Total Score = "+score+" out of 10");
		System.out.println("Percentage : "+result.calculatePercentage()+"%");
		System.out.println("Result : "+result.result());
		System.out.println("The Quiz is Completed");
		
		SaveTextFile file = new SaveTextFile();
		file.saveFile(user,subject,result);
	}
}
