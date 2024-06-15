package javawithDSA10;

public class Print_nth_ficonacci5 {

	public static void main(String args[])
	{
		System.out.print(fibo(45));	
	}
	
	public static int fibo(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		
		int ans = fibo(n-1) + fibo(n-2);
		return ans;
		
		
		
	}
}
