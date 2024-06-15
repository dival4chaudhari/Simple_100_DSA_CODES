package javawithDSA4;

public class subarray_sum7 {
	public static void main(String args[])
	{
		int arr [] = {1,-4,-4, 6,7 , -1};
		System.out.println(sum_arr(arr));
	}
	
	public static int sum_arr(int arr[])
	{
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{   sum = 0;
				for(int z=i;z<=j;z++)
				{
					sum = sum + arr[z];
				}
				if(max<sum)
				{
					max = sum;
				}
				
			}
			
				
		}return max;
}
}
