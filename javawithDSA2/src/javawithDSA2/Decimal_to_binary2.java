package javawithDSA2;

public class Decimal_to_binary2 {
	public static void main(String args[])
	{
		System.out.println(dtob(6));
	}
	
	//function to convert decimal to binary
	public static int dtob(int a)
	{
		int pow =0;
		int bin=0 ;
		while(a>0)
		{
			//formula for conversion from decimal to binary
			bin = bin + (a%2)*(int)Math.pow(10, pow);
			pow++;
			a = a/2;
		}
		return bin;
	}
}