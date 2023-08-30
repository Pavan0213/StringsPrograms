package com.learn.possiblesubstring;

public class PossibleSubStringApp {
	public static void  Possible(String str)
	{
		char []arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			String newstr="";
			for(int j=i;j<=arr.length-1;j++)
			{
				newstr=newstr+arr[j];
				System.out.println(newstr);
			}
			System.out.println();
		}
	}

	 

}
