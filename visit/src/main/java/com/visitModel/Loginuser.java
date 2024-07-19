package com.visitModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loginuser {
	
	@Id
	private String User1;
	private String pass1;
	
	
	public Loginuser() {
		
		
	}


	public String getUser1() {
		return User1;
	}


	public void setUser1(String user1) {
		User1 = user1;
	}


	public String getPass1() {
		return pass1;
	}


	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	
	

}
