package javawithDSA6;

public class repeted_number_count_2Darray2 {
	public static void main(String args[])
	{
		int key=5;
		int arr[][] = {{1,2,3,4},{5,6,3,4},{1,3,5,3}};
		System.out.println(findcount(arr,key));
	}
	
	public static int findcount(int[][] arr,int key)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(key == arr[i][j])
				{
					count++;
				}
			}
		}
		return count;
	}
}
