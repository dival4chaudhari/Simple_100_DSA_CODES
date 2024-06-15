package javawithDSA4;

public class pairs_in_array5 {
	public static void main(String args[])
	{
		int arr [] = { 2,4,6,8,10};
		pairmaking(arr);
	}
	
	public static void pairmaking(int arr [])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print ("(" + arr[i] + "," + arr[j] + ") ");
			}
			System.out.println();
		}
	}
	
}
