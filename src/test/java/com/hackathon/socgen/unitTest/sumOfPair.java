package com.hackathon.socgen.unitTest;

public class sumOfPair {
 
	public  sumOfPair()
	{

		int[] a = {1,3,4,4,2,3};
		// int sum = 8
		int min =a[0];
		int max = a[a.length-1];
		for(int i : a)
		{
			System.out.println(min+"min max "+max);
			if(min +max ==8)
			{
				System.out.println("true");
				System.out.println(min+""+max);
				
			}
			else if(min +max <8  && min<=max)
			{
				min = a[i];
			}
			else if(min +max <8  && max<=min)
			{
				min = a[a.length-1-i];
			}
			else if(min +max>8 && min<=max)
			{
				min = a[i];
			}
			else if(min +max>8 && min>=max)
			{
				min = a[a.length-1-i];
			}
		}
		
		
		
	}
	public static void main(String[] args)
	{
		sumOfPair sa = new sumOfPair();
	}
}
