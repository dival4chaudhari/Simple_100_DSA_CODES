package javawithDSA5;

public class counting_sorting6 {
	public static void main(String args[])
	{
		int arr[] = {1,2,5,7,4,2,5,9,7,3};
		cs(arr);
	}
	
	public static void cs(int [] arr)
	{
		int largest = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			largest = Math.max(largest,arr[i]);
		}
		
		int[] ch = new int[largest+1];
		for(int i=0 ; i<arr.length;i++)
		{
			ch[arr[i]]++;
		}
		
		
		int j = 0;
		for(int i = 0;i<ch.length;i++)
		{
			while(ch[i] > 0)
			{
				arr[j] = i;
				j++;
				ch[i]--;
			}
		}
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
