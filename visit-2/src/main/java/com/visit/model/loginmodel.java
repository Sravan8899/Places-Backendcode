package com.visit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class loginmodel {
	
	@Id
	private  String user1;
	private String pass1;
	

	public  String getUser1() {
		return user1;
	}


	public void setUser1(String user1) {
		this.user1 = user1;
	}


	public String getPass1() {
		return pass1;
	}


	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}


	@Override
	public String toString() {
		return "loginmodel [user1=" + user1 + ", pass1=" + pass1 + "]";
	}




	

	
	
}
