package com.mtz.emp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String userName;
	private String orgName;
	private int salary;
	private String phone;
	
	public Employee() {
	
	}

	public Employee(String userName, String orgName, int salary, String phone) {
		super();
		this.userName = userName;
		this.orgName = orgName;
		this.salary = salary;
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", orgName=" + orgName + ", salary=" + salary + ", phone=" + phone
				+ "]";
	}
	
	
	
	
	

}
