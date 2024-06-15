package javawithDSA8;

public class clear_range_of_bits8 {

	public static void main(String args[])
	{
		int n = 25;
		int i = 2;
		int j = 3;
		int bitmass = ((~0)<<(j+1) | (1<<i)-1 );
		
		System.out.print(bitmass & n);
		
	}
}
