package javawithDSA10;

public class Recursion1 {

	public static void main(String args[])
	{
		printnumber(10);
	}
	
	public static void printnumber(int n)
	{
		System.out.print(n + " ");
		if(n >1)
		{
			printnumber(n-1);
		}
		
	}
}
