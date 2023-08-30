package unicodeeverycharacter;

import java.util.Scanner;

public class UnicodeEveryCharacterAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String Value (or) Name ");
		String str =scan.nextLine();
		
		UnicodeEveryCharacter unic = new UnicodeEveryCharacter();
		unic.Unicodeclass(str);

	}

}
