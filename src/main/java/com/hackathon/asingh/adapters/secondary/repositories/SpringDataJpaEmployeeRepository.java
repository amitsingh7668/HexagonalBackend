package com.hackathon.asingh.adapters.secondary.repositories;

import org.springframework.stereotype.Repository;

import com.sun.el.stream.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface SpringDataJpaEmployeeRepository extends JpaRepository<JpaEmployeeEntity, Long> {

	@Query("Select d from JpaEmployeeEntity d where d.userid= ?1 and d.password = ?2")
	JpaEmployeeEntity byUserId(String userId, String passowrd);
	
	@Query("Select count(d) from JpaEmployeeEntity d where d.userid= ?1")
	int byuserNameAvaibilityCheck(String userId);
	

}
