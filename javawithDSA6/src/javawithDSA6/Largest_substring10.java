package javawithDSA6;

public class Largest_substring10 {

	public static void main(String args[])
	{
		String fruits[] = {"dival", "arti", "divyanshu"};
		String largest = fruits[0];
		
		for(int i=1; i<fruits.length; i++)
		{
			if(largest.compareTo(fruits[i]) < 0)
			{
				largest = fruits[i];
			}
		}
		System.out.println(largest);
	}
	
//	public static String Substring (String str, int si, int ei)
//	{
//		String substr = "";
//		
//		for(int i = si; i<ei; i++)
//		{
//			substr += str.charAt(i);
//		}
//		return substr;
//	}
}
