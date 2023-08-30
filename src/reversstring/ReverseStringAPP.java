package reversstring;

import java.util.Scanner;

public class ReverseStringAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		ReverseString rever = new ReverseString();
		rever.Reverse(str);
		//ReverseStringAPP.Reverse(str);
	}

}
