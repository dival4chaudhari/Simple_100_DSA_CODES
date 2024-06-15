package javawithDSA;

public class function_overloadding8 {
	public static void main(String args[])
	{
		System.out.println(multiply(5, 8));
		System.out.println(multiply(5,8,6));
		System.out.println(multiply(5.6f,5.6f));
	}
	
	//function with 2 int parameter
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	
	//function with 3 int parameter
	public static int multiply(int a,int b,int c)
	{
		return a*b*c;
	}
	
	//function with 2 float parameter
	public static float multiply(float a , float b)
	{
		return a*b;
	}

}
