package reversstring;

public class ReverseString
{
	public static void Reverse(String str)
	{
		
		String revearr = "";
		char ch ;
		 
		for(int i=0;i<=str.length()-1; i++)
		{
			ch=str.charAt(i);
			revearr=ch+revearr;
		}
		
		System.out.println(" Reversed Word : " +revearr);

		
	}

}
