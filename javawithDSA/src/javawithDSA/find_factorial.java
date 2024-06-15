package javawithDSA;

public class find_factorial {
	public static void main(String args[])
	{
		System.out.println(fact(5));
	}

	//function for factorial
	public static int fact(int num)
	{
		int ans=1;
		//loop for iteration multiplication
		for(int i=1;i<=num;i++)
		{
			ans = ans * i;
		}
		return ans;
	}
}
