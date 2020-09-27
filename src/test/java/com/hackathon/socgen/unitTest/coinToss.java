package com.hackathon.socgen.unitTest;

import java.util.*;

public class coinToss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aValue = sc.nextInt();
		String[] result = new String[aValue];
		for(int i =0;i<aValue;i++)
		{
			String res = sc.next();
			result[i]=res;
			
		}
		int headtemp =0;
		int tailstemp =0;
		int temph=0;
		int tempt=0;
		int resulth=0;
		int resultht=0;
		for(int j =0;j<result.length;j++)
		{
			
			if(result[j].equals("Heads"))
			{   
				tailstemp=0;
				headtemp = headtemp+1;
				if(headtemp>=resulth)
				{
					resulth=headtemp;
				}
			}
			else if(result[j].equals("Tails"))
			{
				headtemp =0;
				tailstemp = tailstemp+1;
				if(tailstemp>=resultht)
				{
					resultht=tailstemp;
				}
			}
		}
		System.out.println(resulth+" "+resultht);
		
		
		}
}
