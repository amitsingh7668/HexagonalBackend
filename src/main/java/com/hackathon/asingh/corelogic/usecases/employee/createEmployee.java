package com.hackathon.asingh.corelogic.usecases.employee;

import com.hackathon.asingh.corelogic.gateways.repositories.EmployeeRepository;
import com.hackathon.asingh.corelogic.models.Employee;

public class createEmployee {
public EmployeeRepository employeeRepository;

public createEmployee(EmployeeRepository employeeRepository) {
	
	
	this.employeeRepository = employeeRepository;
}
public String logIn(String employeeId , String passowrd) {
	
	String employeeName = employeeRepository.byId(employeeId,passowrd);
	System.out.println(employeeName);
	return employeeName;
	
	
}

public String  saveUserinDb(String employeeId,String firstname,String lastname,  String password) {
	String checkpoint = employeeRepository.userNameAvaibilityCheck(employeeId);
	if(checkpoint.equals("taken"))
	{
		System.out.println("taken");
		return "taken";
	}
	else
	{
 employeeRepository.save(new Employee(employeeId, firstname,lastname, password));
 return  "created";
	}
	
	
	
}

public String validUser(String username, String password)
{
	return null;
}



}
