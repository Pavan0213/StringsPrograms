package unicodeeverycharacter;

public class UnicodeEveryCharacter {
	public static void Unicodeclass(String str)
	{
		char []arr =str.toCharArray();
		for(char x:arr)
		{
			
			int unicode=(x);
			System.out.println("the char is "+ x +" Unicode is "+ unicode);
		}
		
	
		
		
		
	}

}
