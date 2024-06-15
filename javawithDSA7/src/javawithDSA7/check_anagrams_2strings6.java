package javawithDSA7;
import java.util.Arrays;
public class check_anagrams_2strings6 {

	public static void main(String args[])
	{
		String str1 = "earrth";
		String str2 = "hreart";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char[] strr1 = str1.toCharArray();
			char[] strr2 = str2.toCharArray();
			
			Arrays.sort(strr1);
			Arrays.sort(strr2);
			
			boolean result = Arrays.equals(strr1, strr2);
			if(result)
			{
				System.out.println(str1 + " and " + str2 + " are anagrams of each other");
			}
			else
			{
				System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
			}
		}
		else
		{
			System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
		}
	}
}
