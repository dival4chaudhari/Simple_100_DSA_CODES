package javawithDSA4;

public class binary_search3 {
	public static void main(String args[]) {
		int arr [] = {1,2,3,4,5,6,7,8,9};
		int key =9;
		binsearch(arr, key);
	}
	
	public static void binsearch(int arr[], int key)
	{
		int first = 0;
		int end = arr.length - 1;
		while(first<=end)
		{
			int mid = (first+end)/2;
			
			if(arr[mid] == key)
			{
				System.out.print("key is on "+mid + "index");
			}
			if(arr[mid]<key)
			{
				first = mid +1;
			}
			else
			{
				end = mid-1;
			}
		}
		if(first>end)
		{
			System.out.println("not found");
		}
		
	}

}
