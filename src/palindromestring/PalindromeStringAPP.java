package palindromestring;

import java.util.Scanner;

public class PalindromeStringAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Palindrome ");
		String str = scan.nextLine();
		
		PalindromeString palin=new PalindromeString();
		palin.Palindrome(str);

	}

}
