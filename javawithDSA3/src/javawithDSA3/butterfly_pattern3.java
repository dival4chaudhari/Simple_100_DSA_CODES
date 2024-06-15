package javawithDSA3;

public class butterfly_pattern3 {
	public static void main(String args[])
	{
		butter(4);
	}
	
	//function to create butterfly pattern
	public static void butter(int n)
	{
		//outter loop for each row
		for(int i=1;i<=n;i++)
		{
			//loop to print star to position
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			//loop to print blank spaces at position
			for(int j=1;j<=(n*2)-(i*2);j++)
			{
				System.out.print(" ");
			}
			
			//loop to print star at position
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//inverted loop for half butterfly pattern
		for(int i=n;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=(n*2)-(i*2);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
