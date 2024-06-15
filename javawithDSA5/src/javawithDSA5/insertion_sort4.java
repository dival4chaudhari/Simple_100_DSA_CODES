package javawithDSA5;

public class insertion_sort4 {
	public static void main(String args[])
	{
		int arr[] = {2,6,1,8,4,6,9,2,5};
		is(arr);
	}
	
	public static void is(int[] arr)
	{
		for(int i = 1;i<arr.length; i++)
		{
			int curr = arr[i];
			int pre = i-1;
			
			while(pre >=0 && arr[pre] > curr)
			{
				arr[pre+1] = arr[pre];
				pre--;
			}
			
			arr[pre+1] = curr;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
	}
}
