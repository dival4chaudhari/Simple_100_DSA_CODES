package javawithDSA3;

public class hollow_rhombus5 {
	public static void main(String args[])
	{
		hollow(5);
	}
	
	//function to print hollow rhombus
	public static void hollow(int n)
	{
		//outter loop for each row
		for(int i=1;i<=n;i++)
		{
			//loop to print blank spaces at position
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("   ");
			}
			
			//loop to check if the position is boundary positon or not
			for(int j=1;j<=n;j++)
			{
				//print star if boundary and blank space if not boundary
				if( i == 1 || i == n || j== 1 || j==n)
				{
					System.out.print(" * ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
