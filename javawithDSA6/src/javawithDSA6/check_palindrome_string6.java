package javawithDSA6;

public class check_palindrome_string6 {
	public static void main(String args[])
	{
		String first = "levevel";
		System.out.print(check(first));
	}
	
	
	public static boolean check(String first)
	{
		
		for(int i=0;i<first.length()/2;i++)
		{
			if(first.charAt(i) != first.charAt(first.length()-1 - i))
			{
				return false;
			}
		}
		return true;
	}
}

