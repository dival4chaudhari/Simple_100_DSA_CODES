package javawithDSA2;

public class inverted_rotated_half_pyramid9 {
	public static void main(String args[])
	{
		IRHP(5);
	}
	
	//function to create inverted rotated half pyramid
	public static void IRHP(int n)
	{
		//loop for each row
		for(int i=1;i<=n;i++)
		{
			//loop for blank spaces total(n) minus i
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			
			//loop for starts to print multiple of i
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
