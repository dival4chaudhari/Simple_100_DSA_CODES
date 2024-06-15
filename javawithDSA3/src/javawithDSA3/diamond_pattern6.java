package javawithDSA3;

public class diamond_pattern6 {
	public static void main(String args[])
	{
		diamond(6);
//		diamond(7);
	}
	
	//function to create diamond pattern
	public static void diamond(int n)
	{
		//loop for each row
		for(int i=1;i<=n/2+1;i++)
		{
			//loop to print blank spaces
			for(int j=1; j<=n/2+1-i;j++)
			{
				System.out.print("   ");
			}
			
			//loop to print stars
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		//inverse of above loop to create lower half diamond
		for(int i=n/2+1;i>=1;i--)
		{
			for(int j=1; j<=n/2+1-i;j++)
			{
				System.out.print("   ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}
	}

}
