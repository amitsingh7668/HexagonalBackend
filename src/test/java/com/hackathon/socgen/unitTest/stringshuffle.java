package com.hackathon.socgen.unitTest;

import java.util.Scanner;
public class stringshuffle {

	
	void shuffle() {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		int shuff = sc.nextInt();
		sc.close();
		
		for(int i =0;i<input.length();i++)
		{
			int asc = input.charAt(i);
			System.out.println(asc);
			char a = (char) (asc+2);
			input = input.replace(input.charAt(i), a);
		}
		System.out.println(input);
		
		
		
	}
	public static void main(String[] args) {
		stringshuffle as= new stringshuffle();
		as.shuffle();
		
	}
}
