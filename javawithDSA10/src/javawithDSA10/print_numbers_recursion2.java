package javawithDSA10;

public class print_numbers_recursion2 {

	public static void main(String args[])
	{
		printnumber(10);
	}
	
	public static void printnumber(int n)
	{
		if(n>1)
		{
			printnumber(n-1);
		}
		System.out.println(n);
	}
}
