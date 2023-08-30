package com.learn.reversepossiblesubstrng;

public class ReversePossibleSubStrngApp {
	public static void  revsePossible(String str)
	{
		char []arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			String newstr="";
			for(int j=arr.length-1;j>=i;j--)
			{
				newstr=newstr+arr[j];
				System.out.println(newstr);
			}
			System.out.println();
		}
	}

}
