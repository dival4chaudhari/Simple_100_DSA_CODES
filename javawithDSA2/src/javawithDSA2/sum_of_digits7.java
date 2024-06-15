package javawithDSA2;

public class sum_of_digits7 {
	public static void main(String args[])
	{
		System.out.println(sumofdigit(1734));
	}
	//function to find the sum of all digits in number
	public static int sumofdigit(int a)
	{
		int sum=0;
		// loop to add all digits in the number, starting from last to the first digit
		while(a>0)
		{
			sum = sum+ (a%10);
			a = a/10;
		}
		return sum;
	}

}
