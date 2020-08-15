package com.hackathon.asingh.corelogic.gateways.repositories;

import com.hackathon.asingh.corelogic.models.Employee;

public interface EmployeeRepository {

	
	void save (Employee employee);
	String byId (String Employeeid,String Password);
	
	String userNameAvaibilityCheck (String userId);
	
	
}
