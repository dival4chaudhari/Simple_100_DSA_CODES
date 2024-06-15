package javawithDSA;

public class primes_in_range10 {
	public static void main(String args[])
	{
		primerange(0, 20);
	}
	
	//function for checking prime or not
	public static boolean prime(int a)
	{
		boolean isprime = true; 
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				isprime = false; // if number is not prime
				break;
			}
		}
		return isprime;
	}
	
	//function for checking prime numbers in a range
	public static void primerange(int a, int b)
	{
		//loop to check each number one by one till the end of range
		for(int i=a;i<b;i++)
		{
			//calling prime funtion to check if the number is prime or not
			if(prime(i) && i>1)
			{
				System.out.print(i + " ");
			}
		}
	}
}

