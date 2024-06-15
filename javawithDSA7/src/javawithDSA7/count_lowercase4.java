package javawithDSA7;

public class count_lowercase4 {

	public static void main(String args[])
	{
		String str = " I Am dival";
		System.out.println(lowercasecount(str));
	}
	
	public static int lowercasecount(String str)
	{
		int count = 0;
		for(int i=0; i<str.length() ; i++)
		{
			if(str.charAt(i) != Character.toUpperCase(str.charAt(i)) && str.charAt(i) != ' ')
			{
				count++;
			}
		}
		return count;
	}
}
