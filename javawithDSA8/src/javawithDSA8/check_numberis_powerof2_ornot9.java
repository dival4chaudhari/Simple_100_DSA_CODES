package javawithDSA8;

public class check_numberis_powerof2_ornot9 {

	public static void main(String args[])
	{
		int n = 7;
		if((n & n-1) == 0)
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
	}
}
