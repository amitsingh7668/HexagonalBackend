package com.hackathon.asingh.adapters.primary;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hackathon.asingh.adapters.secondary.repositories.JpaEmployeeRepostory;
import com.hackathon.asingh.adapters.secondary.repositories.SpringDataJpaEmployeeRepository;
import com.hackathon.asingh.corelogic.gateways.repositories.EmployeeRepository;
import com.hackathon.asingh.corelogic.usecases.createHandler;
import com.hackathon.asingh.corelogic.usecases.employee.createEmployee;

@Configuration
@EntityScan(basePackages = {"com.hackathon.asingh.adapters.secondary"})
@EnableJpaRepositories(basePackages = {"com.hackathon.asingh.adapters.secondary.repositories"})
public class BeanConfiguration {
	
	@Bean
	public createHandler create ()
	{
		return new createHandler();
	}
	
	@Bean
	public EmployeeRepository empRepository(SpringDataJpaEmployeeRepository jpaEmployeeRepository)
	{
		return new JpaEmployeeRepostory(jpaEmployeeRepository);
	}
	
	@Bean
	public createEmployee createEmp(EmployeeRepository employeeRepository)
	{
		return new createEmployee(employeeRepository);

}
}
