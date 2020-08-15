package com.hackathon.asingh.corelogic.models;

public class InvalidUser extends Exception{

	
	public InvalidUser (String errorMessage)
	{
		super(errorMessage);
	}
	
}
