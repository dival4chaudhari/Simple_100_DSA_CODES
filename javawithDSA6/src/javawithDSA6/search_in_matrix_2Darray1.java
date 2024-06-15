package javawithDSA6;

public class search_in_matrix_2Darray1 {
	public static void main(String args[])
	{
		int key = 10;
		int arr[][] = {{10,20,30},{15,25,35},{27,29,37}};
		System.out.print(staircasesearch(arr, key));
	}
	
	
	public static int staircasesearch(int[][] arr,int key)
	{
		int i = 0;
		int n = arr[0].length-1;
		while(i <arr.length && n >= 0)
		{
			if(arr[i][n] == key)
			{
				System.out.print("key found at " + " ("+ i + ", " + n + ")");
				return arr[i][n];
			}
			if(arr[i][n] > key)
			{
				n--;
			}
			if(arr[i][n] < key)
			{
				i++;
			}
		}
		return -1;
	}
}
