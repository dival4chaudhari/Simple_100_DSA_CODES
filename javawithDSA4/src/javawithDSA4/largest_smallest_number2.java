package javawithDSA4;

public class largest_smallest_number2 {
	public static void main(String args[])
	{
		int arr[] = {1,4,6,7,8,9,45,3};
		check(arr);
	}
	
	public static void check(int arr[])
	{
		int large = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large = arr[i];
			}
			if(small>arr[i])
			{
				small = arr[i];
			}
		}
		System.out.println("Largest number is " + large + "Smallest number is " + small);
	}

}
