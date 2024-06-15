package javawithDSA8;

public class count_set_bits10 {

	public static void main(String args[])
	{
		int n = 1556865473;
		int count=0;
		while(n >0)
		{
			
			if(( n & 1 ) == 1)
			{
				n = n>>1;
				count++;
			}
			else
			{
				n = n>>1;
			}
		}
		System.out.print(count);
	}
}
