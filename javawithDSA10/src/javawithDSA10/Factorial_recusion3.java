package javawithDSA10;

public class Factorial_recusion3 {

	public static void main(String args[])
	{
		System.out.println(fact(6));
	}
	
	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int fn = n * fact(n-1);
		return fn;
	}
}
