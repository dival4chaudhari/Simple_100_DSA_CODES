package javawithDSA;

public class character_pattern {
	public static void main(String args[])
	{
		int num = 26;
		char_print(num);
	}
	
	public static void char_print(int num)
	{
		//outter loop to print every line 
		for(int i=1;i<=num;i++)
		{
			char ch = 'a';
			
			//nested loop for printing chars in one line for each line
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			
			//new line
			System.out.println("");
		}
	}

}
