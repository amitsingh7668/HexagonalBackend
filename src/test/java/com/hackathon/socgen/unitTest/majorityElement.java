package com.hackathon.socgen.unitTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class majorityElement {
	
	public void test2() {
		System.out.println("Time complexity O(n)");
		int[] A = {3,2,2,3,3,3};  //positive case
		HashMap mp = new HashMap();
		int majorityElement = (A.length)/2;
		for(int a : A)
		{
			if(mp.containsKey(a))
			{
				mp.put(a, (int) mp.get(a)+1);
			}
			else
			{
				mp.put(a, 1);
			}
		}
		
		java.util.Iterator<Map.Entry<Integer, Integer>> it = mp.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, Integer> m = it.next();
			
			if(m.getValue()>majorityElement) {
				System.out.println(m.getKey());
			}
		}
		
	}
public static void main(String[] args) {
	majorityElement mn = new majorityElement();
	mn.test2();
	System.out.println("Time complexity O(n*2)");
	int[] A = {3,2,2,3};  //positive case
//	int[] a = {1,3,1,1,1,4,4,5,5};  //Negative case
	int majorityElement = (A.length)/2;
	HashSet<Object> set = new HashSet<>();
	int numbers=0;
	for(int i=0;i<A.length;i++)
	{
		int count =0;
		for(int j=0;j<A.length;j++)
		{
			if(A[i]==A[j])
			{
				count ++;
				
				if(count>majorityElement)
//					if(count==majorityElement)
				{
					set.add(A[j]);
					numbers ++;
					break;
				}
			}
		}
	}
	if(numbers==0) {
	System.out.println("No majority elements avilable");
	}
	else
	{
		@SuppressWarnings("rawtypes")
		java.util.Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

}
