package javawithDSA4;

public class reverse_array4 {
	public static void main(String args[])
	{
		int arr [] = {1,2,3,4,5,6};
		rev(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void rev(int arr [])
	{
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

}
