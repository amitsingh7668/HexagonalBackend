package com.hackathon.asingh.adapters.secondary.repositories;
import  com.hackathon.asingh.corelogic.gateways.repositories.EmployeeRepository;
import com.hackathon.asingh.corelogic.models.Employee;

import javax.transaction.Transactional;

@Transactional
public class JpaEmployeeRepostory implements EmployeeRepository{
	
	private SpringDataJpaEmployeeRepository jpaEmployeeRepository; 
	
	public  JpaEmployeeRepostory(SpringDataJpaEmployeeRepository jpaEmployeeRepository) {
		this.jpaEmployeeRepository = jpaEmployeeRepository;
	}

	@Override
	public void save(Employee employee) {
		
		JpaEmployeeEntity emp = new JpaEmployeeEntity(employee.getUserid(),employee.getEmployeefirstname(),
				employee.getEmployeelastname(),employee.getPassword());
		jpaEmployeeRepository.save(emp);
		
	}

	@Override
	public String byId(String Employeeid ,String password) {
		JpaEmployeeEntity jp =  jpaEmployeeRepository.byUserId(Employeeid,password);
		if (jp ==null)
		{
			return "invalid";
		}
		else
		{
		return jp.employeefirstname+" "+jp.employeelastname;
		}
	}

	@Override
	public String userNameAvaibilityCheck(String userId) {
		int a = jpaEmployeeRepository.byuserNameAvaibilityCheck(userId);
		if(a>0)
		{
			return "taken";
		}
		else
		{
			return "available";
		}
	}

}
