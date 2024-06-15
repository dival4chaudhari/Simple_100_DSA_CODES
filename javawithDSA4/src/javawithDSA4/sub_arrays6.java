package javawithDSA4;

public class sub_arrays6 {
	public static void main(String args[])
	{
		int arr [] = {2,4,6,8,10};
		subarray(arr);
	}
	
	public static void subarray(int arr [])
	{
		for(int i =0;i<=arr.length;i++)
		{
			for(int j=i+1;j<=arr.length;j++)
			{
				for(int z=i;z<j;z++)
				{
					System.out.print(arr[z] + " ");
				}
				System.out.println();
			}
		}
	}

}
