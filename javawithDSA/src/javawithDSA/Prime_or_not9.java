package javawithDSA;

public class Prime_or_not9 {
	public static void main(String args[])
	{
		System.out.println(prime(11));
	}
	
	//function for checking number is prime or not
	public static boolean prime(int a)
	{
		boolean isprime = true; // if the number is prime return true
		//from 2 to the square root of given number
		for(int i=2;i<Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				System.out.println(a + " Not Prime");
				isprime = false; //if the number is not prime return false
				break;
			}
		}
		return isprime;
	}

}
