package javawithDSA5;

public class diagonal_sum_2Darray10 {
	public static void main(String args[])
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		diagonalsum(arr);
	}
	
	public static void diagonalsum(int[][] arr)
	{
		int firstdiagonalsum = 0;
		int lastdiagonalsum = 0;
		int start = 0;
		int end = arr.length;
//		for(int i=0; i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				if( i == j)
//				{
//					firstdiagonalsum += arr[i][j];
//				}
//				if( i == start && j == end-1 && i != j)
//				{
//					lastdiagonalsum += arr[i][j];
//					start++;
//					end--;
//				}
//				if(i == arr.length/2 && j == arr.length/2)
//				{
//					start++;
//					end--;
//				}
//				
//			}
//		}
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i][i];
			if(i != arr.length-i-1)
			{
			sum += arr[i][arr.length-1-i];
			}
		}
		
		System.out.println( firstdiagonalsum + lastdiagonalsum);
		System.out.println(lastdiagonalsum);
		System.out.println(sum);
	}
}
