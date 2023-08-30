package lowtoupp;

import java.util.Scanner;

public class LowToUpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println(" Enter a Lower Case string ");
		String str=scan.nextLine();
		
		char []arr = str.toCharArray();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int unicode =arr[i];
					
			int upper = unicode-32;
		    arr[i]=(char)upper;
		    System.out.println(arr[i]);
		}

	}

}
