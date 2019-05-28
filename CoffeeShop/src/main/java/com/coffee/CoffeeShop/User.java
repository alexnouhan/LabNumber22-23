package com.coffee.CoffeeShop;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String userName;
	
	private String password;
	
	private String first;
	
	private String last;
	
	private String email;
	
	private String gender;
	
	private String bday;
	
	public User() {
		
	}

	public User(String userName, String password, String first, String last) {
		super();
		this.userName = userName;
		this.password = password;
		this.first = first;
		this.last = last;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}
	
	
	
	
	
	

}
