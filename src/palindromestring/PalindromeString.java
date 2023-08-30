package palindromestring;

public class PalindromeString {
	static void Palindrome(String str)
	{
		String revearr="";
		char ch;
		for(int i=0;i<=str.length()-1;i++)
		{
			ch=str.charAt(i);
			revearr=ch+revearr;
		}
		System.out.println(" Reversed string "+revearr);
		
		if(str==revearr)
		{
			System.out.println("This String is Palindrome :");
		}
		else
		{
			System.out.println("This String is Not Palindrome :");
		}
	}

}
