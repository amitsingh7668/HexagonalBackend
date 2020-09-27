package com.hackathon.socgen.unitTest;

import java.util.HashSet;
import java.util.Iterator;

public class smallestNumber {

	
	public static void main(String[] args) {
		int n =2;
		HashSet  set = new HashSet();
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
			set.add(String.valueOf(i)+String.valueOf(j));
			
			}
		}
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
