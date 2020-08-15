package com.hackathon.asingh.corelogic.usecases;

import javax.transaction.Transactional;

import com.hackathon.asingh.corelogic.models.InvalidUser;

@Transactional
public class createHandler {

	
	public String handle(String id , String password)
	{
		if(id.equals("amit") && password.equals("singh"))
		{
			System.out.println("Yes i am in");
		
		 return "valid";
		}
		else if(id.equals("naveen") && password.equals("singh"))
		{
			System.out.println("Yes i am in");
		
		 return "valid";
		}
	else
	{
		try
		{
		throw new InvalidUser("");
		}
		catch(Exception e)
		{
			return "invalid";		}
	}
		
	
}
	
	public String   handle_view()
	{
		System.out.println("connection with react");
		return "ok";
	}
}
