package javawithDSA2;

public class binary_to_decimal1 {
	public static void main(String args[])
	{
		System.out.print("decimal is " + btod(1011));
	}
	
	//function to convert binary to decimal
	public static int btod(int a)
	{
		int pow=0;
		int decimal=0;
		while(a>0)
		{
			//formula for conversion
			decimal = decimal + ((a%10)*(int)Math.pow(2, pow));
			a = a/10;
			pow++;
		}
		return decimal;
	}

}
