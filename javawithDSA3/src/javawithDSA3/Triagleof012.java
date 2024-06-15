package javawithDSA3;

public class Triagleof012 {
	public static void main(String args[])
	{
		tri(10);
	}
	
	//function to create 0 and 1 pyramid
	public static void tri(int n)
	{
		//outter loop for each row
		for(int i=1;i<=n;i++)
		{
			//inner loop for each row position
			for(int j=1;j<=i;j++)
			{
				if((j+i) % 2 == 0)
				{
					System.out.print(1);
				}
				else 
				{
					System.out.print(0);
				}
			}
			System.out.println("");
		}
	}

}
