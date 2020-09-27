package com.hackathon.socgen.unitTest;

import java.util.*;

public class passwordComplexity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		int aValue = sc.nextInt();
		int complexity = 0;
		for(int i=0;i<password.length();i++)
		{  
		int siz =0;
		   siz= password.charAt(i)-97+aValue;
		   if(siz <26)
		   {
			   complexity = complexity+siz;
		   }
		   else
		   {
			   complexity = complexity+siz-26;
		   }
		   
		}
		System.out.println(complexity);
		
	}
	
}
