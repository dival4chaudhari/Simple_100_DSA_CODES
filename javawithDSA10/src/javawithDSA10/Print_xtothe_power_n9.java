package javawithDSA10;

public class Print_xtothe_power_n9 {

	public static void main(String args[])
	{
		System.out.println(power(5,4));
	}
	public static int power(int x, int n)
	{
		if(n == 1)
		{
			return x;
		}
		
		return power(x,n-1)* x;
	}
}
