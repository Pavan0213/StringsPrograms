package com.learn.anagram;

import java.util.Scanner;

public class Anargramprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string :1");
		String str1 = scan.nextLine();
		System.out.println("Enter a string :2");
		String str2 = scan.nextLine();
		
		AnargramprogramApp.Anagram(str1, str2);
		

	}

}
