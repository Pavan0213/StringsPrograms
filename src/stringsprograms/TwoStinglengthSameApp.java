package stringsprograms;

import java.util.Scanner;

public class TwoStinglengthSameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the First String Length");
		String str1=scan.nextLine();
		
		System.out.println(" Enter the Second String Length");
		String str2 = scan.nextLine();
		
		TwoStinglengthSame length =new TwoStinglengthSame();
		length.StringLength(str1,str2);
		
		/*if(str1.equals(str2))
		{
			System.out.println("Both Strings lengths are same ");
		}
		else
		{
			System.out.println("Both Strings lengths are not same");
		} */
	/*	if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both String lengths are same ");
		}
		else
		{
			System.out.println("Both String lengths are not same");
		} */
			
			
		
		

	}

}
