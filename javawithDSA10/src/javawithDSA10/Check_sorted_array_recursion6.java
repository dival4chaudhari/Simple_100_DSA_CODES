package javawithDSA10;

public class Check_sorted_array_recursion6 {

	public static void main(String args[])
	{
		int arr[] = {1,5,4,4,5};
		System.out.print(checksort( arr, 1));
	}
	
	public static boolean checksort(int arr[], int i)
	{
		if(i == arr.length-1)
		{
			return true;
		}
		if(arr[i] < arr[i-1])
		{
			return false;
		}
		
		
		return checksort(arr, i+1);
		
		
	}
}
