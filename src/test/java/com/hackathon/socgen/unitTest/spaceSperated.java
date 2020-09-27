package com.hackathon.socgen.unitTest;

import java.util.Scanner;

public class spaceSperated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] ch = in.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}
}
