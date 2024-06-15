package javawithDSA8;

public class Swap_two_numbers_bitmanipulation12 {

	public static void main(String args[])
	{
		int x= 3;
		int y=4;
		System.out.println(" x is " + x + " y is " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(" x is " + x + " y is " + y);

	}
}
