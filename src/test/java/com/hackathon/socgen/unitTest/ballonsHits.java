// Problem :- There is a set of numbers in array in ascending order
// Lets assume like {5,4,4,3,3} now lets take each element as a ballon number 
// A shotter shot the arrow first it will hit 5 (that is first element of array) and then loss the trajectory by 
// 1, (so then he will; shot like 4--> 3-->and so on means -1,)
// We need to find the number of shot required to burst all the ballons in the array

//Input {5,4,4,3,3}
// Output 2
//Explain :- First it will hit 5 ,4,3 remaining ballons are 4,4
//			 Second hit it will burst 4,3
//	So total number of shot required 2


package com.hackathon.socgen.unitTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ballonsHits {

	ballonsHits(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Space Seprated Array....");
		String input = sc.nextLine();
		String[] firstsrr = input.split(" ");
		ArrayList<Integer> fir = new ArrayList();
		ArrayList<Integer> sec = new ArrayList();
		System.out.println("pushing to arrylist");
		for(int i =0;i<firstsrr.length;i++)
		{
			fir.add(Integer.parseInt(firstsrr[i]));
		}
		int count =0;int hitball=0;
		int counterstop = fir.size();
		while(count<counterstop)
		{
			hitball=hitball+1;
			sec.addAll(fir);
			fir.clear();
			int firsthitsize= sec.get(0);
			for(int l =0;l<sec.size();l++)
			{
				if(firsthitsize==sec.get(l))
				{
					count++;
					firsthitsize=firsthitsize-1;
				}
				else
				{
					fir.add(sec.get(l));
				}
			}
			sec.clear();
		}
		System.out.println("No of hits required is :"+hitball);	
	}
	public static void main(String[] args) {
		ballonsHits bb = new ballonsHits();
	}
		
	
}
