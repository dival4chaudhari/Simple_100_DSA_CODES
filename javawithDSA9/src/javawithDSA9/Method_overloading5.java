package javawithDSA9;

public class Method_overloading5 {

	public static void main(String args[])
	{
		calc cal = new calc();
		cal.sum(5,6);
		cal.sum(4.9f,6.5f);
		cal.sum(3,4,6);
	}
}

class calc
{
	int sum(int a, int b)
	{
		return a+b;
	}
	float sum(float a, float b)
	{
		return a+b;
	}
	int sum(int a, int c, int b)
	{
		return a+b+c;
	}
}