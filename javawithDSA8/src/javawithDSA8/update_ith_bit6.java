package javawithDSA8;

public class update_ith_bit6 {

	public static void main(String args[])
	{
		int n = 11;
		int index = 1;
		int value = 0;
		if(value == 0)
		{
			System.out.println(n & ~(1<<index));
		}
		else
		{
			System.out.println(n | 1<<index);
		}
	}
}
