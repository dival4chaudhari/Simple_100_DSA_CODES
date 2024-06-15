package javawithDSA2;

public class is_even_or_not4 {
	public static void main(String args[])
	{
		System.out.println(iseven(2));
	}
	
	//function to check number is even or odd
	public static boolean iseven(int a)
	{
		if(a%2 == 0)
		{
			return true; // return true if even 
		}
		return false; // return false if odd
	}

}
