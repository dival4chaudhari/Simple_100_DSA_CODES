package javawithDSA10;

public class Last_occurence8 {
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,9};
		System.out.println(checkindex(arr, 5, arr.length-1));
	}
	
	public static int checkindex(int arr[], int key, int i)
	{
		if(i == -1)
		{
			return -1;
		}
		if(arr[i] == key)
		{
			return i;
		}
		
		return checkindex(arr,key,i-1);
		
	}

}
