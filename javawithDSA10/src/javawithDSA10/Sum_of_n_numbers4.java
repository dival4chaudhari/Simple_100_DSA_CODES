package javawithDSA10;

public class Sum_of_n_numbers4 {

	public static void main(String args[])
	{
		System.out.println(sum(10));
	}
	
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		int ans = n + sum(n-1);
		return ans;
	}
}
