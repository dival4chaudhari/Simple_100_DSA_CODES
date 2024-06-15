package javawithDSA3;

public class floyds_triangle1 {
	public static void main(String args[])
	{
		floyd(5);
	}
	
	public static void floyd(int n)
	{
		int count = 1;
		
		//outer loop for each row
		for(int i=1;i<=n;i++)
		{
			//inner loop for each row position
			for(int j=1; j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println("");
		}
	}

}
