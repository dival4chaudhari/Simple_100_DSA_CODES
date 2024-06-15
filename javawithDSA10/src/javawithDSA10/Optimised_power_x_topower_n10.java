package javawithDSA10;

public class Optimised_power_x_topower_n10 {

	public static void main(String args[])
	{
		System.out.println(optpower(5,4));
	}
	public static int optpower(int x, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		int halfpower = optpower(x, n/2);
		int halfpowersq = halfpower * halfpower;
		
		if( n%2 !=0)
		{
			halfpowersq = x *halfpower;
		}
		return halfpowersq;
	}
	
}
