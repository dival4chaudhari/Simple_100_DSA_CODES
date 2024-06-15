package javawithDSA;

public class Half_pyramid_pattern {

	public static void main(String args[])
	{
		int num=5;
		half_pyramid(num);
	}
	
	public static void half_pyramid(int num)
	{
		//outter loop for number of lines
		for(int i=1; i<=num;i++) 
		{
			
			//first element of each line
			int count=1;
			
			
			//inner loop for each line position
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println("");
		}
	}
}
