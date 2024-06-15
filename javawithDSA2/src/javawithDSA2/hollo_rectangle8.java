package javawithDSA2;

public class hollo_rectangle8 {
	public static void main(String args[])
	{
		hollo(5);
	}
	//function to print hollow rectangle
	public static void hollo(int n)
	{
		//loop for each line/row iteration
		for(int i=1;i<=n;i++)
		{
			//inner loop for each position on each line
			for(int j=1;j<=n;j++)
			{
				//condition to check if the position is the boundary or not
				if(i==1 ||i==n ||j==1 ||j==n)
				{
					System.out.print(" * ");
				}
				
				//if not boundary then blank space
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}

}
