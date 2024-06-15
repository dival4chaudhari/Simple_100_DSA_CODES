package javawithDSA5;
import java.util.Scanner;
public class largest_smallest_in2Darray8 {
	public static void main(String args[])
	{
		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(largest(arr));
		System.out.println(smallest(arr));
	}
	
	public static int largest(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] > ans)
				{
					ans = arr[i][j];
				}
			}
		}
		return ans ;
	}
	
	public static int smallest(int[][] arr)
	{
		int n = arr.length;
		int m = arr[0].length;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j] < ans)
				{
					ans = arr[i][j];
				}
			}
		}
		return ans ;
	}
	
}
