
public class Vowelcount {
	
	public static void main(String args[])
	{
		
		String str="HELLO";
		String lower=str.toLowerCase();
		
		int vowel=0,non_vowel=0;
		for(int i=0;i<lower.length();i++)
		{
			char ch=lower.charAt(i);
			if(ch=='a' ||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
			{
				vowel++;
			}
			else
			{
				non_vowel++;
			}
			
					
		}
		System.out.println("No of vowels in the string="+vowel);
		System.out.println("No of vowels in the string="+non_vowel);
		
	}

}
