package com.learn.reversewordatsameplace;

public class ReverseWordAtSamePlaceApp {
	public static void reversewords(String str) 
	{
		//Converting the string into type of array
				String []arr=str.split(" ");
				
				//traverse to string
				
				for(String x : arr)
				{
					String newstr="";
					for(int i=x.length()-1;i>=0;i--)
					{
						newstr=newstr+x.charAt(i);
					}
					System.out.print(newstr+" ");
				}
	}

}
