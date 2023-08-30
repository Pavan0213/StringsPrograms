package concatenatedstring;

import java.util.Scanner;

public class ConcatenatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter a String ");
		String str1 = scan.nextLine();
		  
		System.out.println("Enter a String ");
		String str2 =scan.nextLine();
		
		ConcatenatedStringAPP equal = new ConcatenatedStringAPP();
		equal.concatenated(str1,str2);

	}

}
