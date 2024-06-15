package javawithDSA3;

public class solid_rhombus4 {
	public static void main(String args[])
	{
		solid(5);
	}
	//function to print solid rhombus
	public static void solid(int n)
	{
		// loop for each row
		for(int i=1;i<=n;i++)
		{
			//loop to print blank spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}

			//loop to print star at position
			for(int j=1;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
	}
}
