package com.hackathon.asingh.adapters.secondary.repositories;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "public" )
public class JpaEmployeeEntity implements Serializable {

	
	@Id
	String userid;
	String employeefirstname;
	String employeelastname;
	String password;
	public JpaEmployeeEntity(String userid, String employeefirstname, String employeelastname, String password) {
		super();
		this.userid = userid;
		this.employeefirstname = employeefirstname;
		this.employeelastname = employeelastname;
		this.password = password;
	}
	
	
	public JpaEmployeeEntity() {
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
