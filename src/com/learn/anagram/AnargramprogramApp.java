package com.learn.anagram;

import java.util.Arrays;

public class AnargramprogramApp {
	
	public static String Anagram(String str1,String str2)
	{
		char[]arr1=str1.toCharArray();
		char[]arr2=str2.toCharArray();
	     Arrays.sort(arr1);
	     Arrays.sort(arr2);
	     
	     
	     String newstr1=new String(arr1);
	     String newstr2=new String(arr2);
	     
	     
	     if(newstr1.equals(newstr2))
	     {
	    	 return "Both Strings Are Same";
	     }
	     else
	     {
	    	 return "Both Strings Are Not Same";
	     }
	     
	     
	     
		
		
	}

}
