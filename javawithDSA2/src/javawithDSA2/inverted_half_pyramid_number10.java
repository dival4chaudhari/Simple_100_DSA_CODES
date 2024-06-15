package javawithDSA2;

public class inverted_half_pyramid_number10 {
	public static void main(String args[])
	{
		IHPN(7);
	}
	
	//function to create inverted half pyramid numbers
	public static void IHPN(int n)
	{
		//for each row starting from total(n)-i+1
		for(int i=1;i<=n;i++)
		{
			int count=1;
			
			//inner loop for each row positions having total(n) -i+1
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(" " + count + " ");
				count++;
				
			}
			System.out.println();
		}
	}

}
