package com.hackathon.asingh.corelogic.models;

public class Employee {

	String userid;
	String employeefirstname;
	String employeelastname;
	String password;
	public Employee(String userid, String employeefirstname, String employeelastname, String password) {
		super();
		this.userid = userid;
		this.employeefirstname = employeefirstname;
		this.employeelastname = employeelastname;
		this.password = password;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmployeefirstname() {
		return employeefirstname;
	}
	public void setEmployeefirstname(String employeefirstname) {
		this.employeefirstname = employeefirstname;
	}
	public String getEmployeelastname() {
		return employeelastname;
	}
	public void setEmployeelastname(String employeelastname) {
		this.employeelastname = employeelastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
