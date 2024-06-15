package javawithDSA11;

public class Friends_pairing_problem3 {

	public static void main(String args[])
	{
		int n = 4;
		friends(n);
		System.out.println(friends(n));
	}
	
	public static int friends(int n)
	{
		if(n==1 || n==2)
		{
			return n;
		}
		return friends(n-1) + ((n-1) * friends(n-2));
	}
}
