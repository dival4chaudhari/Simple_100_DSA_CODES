package javawithDSA4;

public class linear_search1 {
	public static void main(String args[]) 
	{
		int arr[] = {1,2,3,4,5,6};
		int key = 40;
		linearsearch(arr, key);
	}
	
	public static int linearsearch(int arr [], int key)
	{
		for(int i=0;i <arr.length;i++)
		{
			if(key == arr[i])
			{
				System.out.print("key is at " + i + "index");
				return 0;
			}
			
		}
		return -1;
	}

}
