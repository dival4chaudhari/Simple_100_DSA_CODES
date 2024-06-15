package javawithDSA8;

public class fast_exponentiation11 {

	public static void main(String args[])
	{
		int n = 4;
		int a = 5;
		int ans=1;
		
		while(n>0)
		{
			if((n & 1) == 1)
			{
				ans = ans * a;
			}
			a = a*a;
			n= n>>1;
		}
		System.out.print(ans);
		}
	
	
}
