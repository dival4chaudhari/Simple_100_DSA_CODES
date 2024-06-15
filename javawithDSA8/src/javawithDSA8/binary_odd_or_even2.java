package javawithDSA8;

public class binary_odd_or_even2 {

	public static void main(String args[])
	{
		int i = 8;
		if((i & 1) == 1) // and with 1 gives 1 when i is odd
		{
			System.out.println("number is odd");
		}
		else
		{
			System.out.println("number is even");
		}
	}
}
