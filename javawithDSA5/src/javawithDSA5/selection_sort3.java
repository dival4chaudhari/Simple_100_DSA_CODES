package javawithDSA5;

public class selection_sort3 {
	public static void main(String args[])
	{
		int arr[] = {1,45,7,237,4,3,4335,23,4};
		ss(arr);
	}
	
	public static void ss(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			int minpos = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minpos] > arr[j])
				{
					minpos = j;
				}
			}
			int temp = arr[minpos];
			arr[minpos] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",  ");
		}
	}
}
