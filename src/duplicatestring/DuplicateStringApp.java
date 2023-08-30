package duplicatestring;

import java.util.Scanner;

public class DuplicateStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String Name ");
		String str =scan.nextLine();
		String newstr="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!newstr.contains(str.charAt(i)+""))
			{
				newstr=newstr+ str.charAt(i);
			}
		}
		System.out.println(newstr);


	}

}
