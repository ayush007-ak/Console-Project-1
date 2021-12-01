package com.quiz.entities;

public class User {
	private String userName;
	private String firstName;
	private String lastName;
	private String userPassword;
	private String userEmail;
	private int userScore;
	private boolean flag;
	
	public User() {
		super();
	}
	
	

	public User(String userName, String firstName, String lastName, String userEmail, String userPassword) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
	}



	public User(String userName, String firstName, String lastName, String userPassword, String userEmail,
			 int userScore) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userScore = userScore;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserScore() {
		return userScore;
	}

	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", userPassword="
				+ userPassword + ", userEmail=" + userEmail + ", userScore="
				+ userScore + ", flag=" + flag + "]";
	}
	
	
	

}
