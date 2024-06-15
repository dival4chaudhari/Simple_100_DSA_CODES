package javawithDSA8;

public class clear_last_i_bits7 {

	public static void main(String args[])
	{
		int n = 7;
		int bitmas = (~0)<<2;
		System.out.println(n & bitmas);
	}
}
