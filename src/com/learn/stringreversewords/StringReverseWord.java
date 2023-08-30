package com.learn.stringreversewords;

import java.util.Scanner;

public class StringReverseWord {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=scan.nextLine();
		
		String []arr=str.split(" ");
		String newstr="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
			newstr = newstr+arr[i]+"";
			
			
		}
		return newstr;
		
		 
		

	}

	
	}

