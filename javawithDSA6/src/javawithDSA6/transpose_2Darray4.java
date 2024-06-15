package javawithDSA6;

public class transpose_2Darray4 {
	public static void main(String arg[])
	{
		int arr[][] = {{1,2,3},{4,5,6}};
		transpose(arr);
	}
	
	public static void transpose(int [][] arr)
	{
		int[][] transpose = new int[arr[0].length][arr.length];
		for(int i =0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				transpose[i][j] = arr[j][i];
			}
		}
		
		for(int i =0;i<transpose.length;i++)
		{
			for(int j=0;j<transpose[0].length;j++)
			{
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
