package com.hackathon.socgen.unitTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class maplearn {

	public maplearn() {
	HashMap<String, Integer> mp = new HashMap<String, Integer>();
	mp.put("fsf", 1);
	Iterator<Map.Entry<String,Integer>> it = mp.entrySet().iterator();
	while(it.hasNext())
	{
		Map.Entry<String,Integer> mp1 = it.next();
		System.out.println(mp1.getKey()+""+mp1.getValue());
	}
	}
	
	public void test() {
		
		String str = "aaaammmiiiitttsssii";
		char[] ch = str.toCharArray();
		HashMap mp = new HashMap();
		int count=0;
		for(char a :ch )
		{
			if(mp.containsKey(a))
			{ 
				count=1;
				mp.put(a,(int) mp.get(a)+1);
				count=0;
			}
			else
			{
				mp.put(a, 1);
			}
		}
		System.out.println(mp);
	}
public static void main(String[] args) {
	maplearn m = new maplearn();
	m.test();
}
}
