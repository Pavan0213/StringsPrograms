package uptolow;

import java.util.Scanner;

public class UpToLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter Capital Strings ");
		String str=scan.nextLine();
		
		char[]arr=str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int unicode =arr[i];
			//System.out.println(unicode);
			
			int lower = unicode+32;
		    arr[i]=(char)lower;
		    
		
		 	System.out.println(arr[i]);
		    }
		
		{
	/*	for(int j=0;j<=arr.length-1;j++)
		    {
		    	int unicode =arr[j];
		    	int upper =unicode-32;
		    	arr[j]=(char)upper;
		    	//System.out.println(arr[j]);
		    	
		    } */
		
		    
		}

	}

}
