package javawithDSA11;
import java.util.*;
public class Tiling_problem1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(tiling(n));
	}
	
	public static int tiling(int n)
	{
		//base case
		if(n ==0 || n==1)
		{
			return 1;
		}
		//vertical
//		int vertical = tiling(n-1);
		
		//horizontal
//		int horizontal = tiling(n-2);
		
//		int total = vertical + horizontal;
		
//		return total;
		return tiling(n-1) + tiling(n-2);
	}
}
