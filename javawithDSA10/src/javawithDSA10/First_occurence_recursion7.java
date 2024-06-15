package javawithDSA10;

public class First_occurence_recursion7 {

	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,5};
		System.out.println(checkindex(arr, 5, 0));
	}
	public static int checkindex(int arr[], int key, int i)
	{
		if(i == arr.length)
		{
			return -1;
		}
		if(arr[i] == key)
		{
			return i;
		}
		
		return checkindex(arr,key,i+1);
		
	}
	
}
