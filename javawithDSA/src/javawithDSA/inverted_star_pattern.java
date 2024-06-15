package javawithDSA;

public class inverted_star_pattern {

	public static void main(String args[])
	{
		//call function
		star(10);
	}
	public static void star(int num) {
		
		
		// outter loop for each lines
		for(int i=num;i>=1;i--)
		{
			
			//inner loop for each line's every position
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
			//new line
			System.out.println("");
		}
	}
}
