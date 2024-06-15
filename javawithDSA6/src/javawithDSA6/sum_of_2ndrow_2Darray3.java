package javawithDSA6;

public class sum_of_2ndrow_2Darray3 {
	public static void main(String args[])
	{
		int arr[][] = {{1,2,3},{4,8,6},{7,8,9}};
		System.out.print(secondrowsum(arr));
	}
	
	public static int secondrowsum(int[][] arr)
	{
		int sum =0;
		for(int i=0;i<arr[0].length;i++)
		{
			sum += arr[1][i];
		}
		return sum;
	}
}
