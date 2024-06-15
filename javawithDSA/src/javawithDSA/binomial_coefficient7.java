package javawithDSA;

public class binomial_coefficient7 {
	public static void main(String args[])
	{
		System.out.println(bc(7,4));
	}
	
	//function for coefficient with formula to return answer
	public static int bc(int n,int r)
	{
		//formula
		return (fact(n)/(fact(r)*fact(n-r)));
	}
	
	//function for factorial 
	public static int fact(int num)
	{
		//iterative multiplication for factorial
		for(int i=num-1;i>0;i--)
		{
			num=num*i;
		}
		return num;
	}

}
