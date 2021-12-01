package com.quiz.view;

import java.util.logging.Level;

import com.quiz.logger.Log;

public class ErrorView {
	public void authError() {
		System.out.println("Invalid userName or Password......");
		
		try {
			Log log = new Log("log.txt");
			
		log.logger.setLevel(Level.WARNING);
		
		log.logger.warning("Incorrect User and Password");
		log.logger.info("info message");
		log.logger.severe("Severe message");
		
			
		}catch (Exception e){
			
		}
	}
	
	
}

