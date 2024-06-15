package javawithDSA8;

public class Clear_ith_bit5 {

	public static void main(String args[])
	{
		int i = 9;
		int bitmas = ~(1<<3);
		System.out.println(i & bitmas);
	}
}
