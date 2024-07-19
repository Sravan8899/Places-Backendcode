package com.visit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class addnewplacemodel {

	@Id
	private String nplace;
	private String ncounty;
	private String nzipcode;
	private String nurl;
	
	
	public addnewplacemodel() {
		
		
	}


	public String getNplace() {
		return nplace;
	}


	public void setNplace(String nplace) {
		this.nplace = nplace;
	}


	public String getNcounty() {
		return ncounty;
	}


	public void setNcounty(String ncounty) {
		this.ncounty = ncounty;
	}


	public String getNzipcode() {
		return nzipcode;
	}


	public void setNzipcode(String nzipcode) {
		this.nzipcode = nzipcode;
	}


	public String getNurl() {
		return nurl;
	}


	public void setNurl(String nurl) {
		this.nurl = nurl;
	}


	
	
	
}
