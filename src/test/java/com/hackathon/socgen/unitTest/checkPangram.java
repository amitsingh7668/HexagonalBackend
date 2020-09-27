package com.hackathon.socgen.unitTest;

import java.util.*;

public class checkPangram {

	
	public checkPangram(String inputQuote) 
	{
		inputQuote = inputQuote.toLowerCase().replace(" ","");
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i=0; i<inputQuote.length();i++)
		{
			if(mp.containsKey(inputQuote.charAt(i)))
			{
				mp.put(inputQuote.charAt(i),(int) mp.get(inputQuote.charAt(i))+1);
			}
			else
			{
				mp.put(inputQuote.charAt(i),1);
			}
		}
		if(mp.size()==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");	
		}
	}
	
	public static void main(String[] args)
	{
		checkPangram obj = new checkPangram("The quick brown fox jumps over the lazy dog");
	}
}
