package javawithDSA;

public class starptn {
	public static void main(String args[])
	{
		star(10);
	}
	public static void star(int num) {
		
		//outter loop for each line
		for(int i=1;i<=num;i++)
		{
			
			//inner loop for each position in line's
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			//new line
			System.out.println("");
		}
	}
}
