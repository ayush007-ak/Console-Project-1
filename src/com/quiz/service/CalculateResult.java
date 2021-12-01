package com.quiz.service;

public class CalculateResult {
	int score;
	
	public CalculateResult() {
		super();
	}
	public CalculateResult(int score) {
		super();
		this.score = score;
	}
	public int calculatePercentage() {
		int percent = (score*100)/10;
		return percent;
	}
	
	public String result() {
		
		if(score>=7) 
			return "Pass";
		else
			return "Fail";		
	}
}
