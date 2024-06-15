package javawithDSA5;
import java.util.Scanner;
public class spiral_matrix_2Darray9 {
	public static void main(String args[])
	{
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0;i<4;i++)
//		{
//			for(int j = 0;j<4;j++)
//			{
//				arr[i][j] = sc.nextInt();
//			}
//		}
		spiral(arr);
	}
	
	public static void spiral(int[][] arr)
	{ 
		int n = arr.length;
		int srow = 0;
		int scol = 0;
		int erow = n-1;
		int ecol = n-1;
		while(srow <= erow && scol <= ecol)
		{
			for(int j = scol;j<=ecol;j++)
			{
				System.out.print(arr[srow][j]);
			}
			for(int j =srow+1;j<=erow;j++)
			{
				System.out.print(arr[j][ecol]);
			}
			for(int j =ecol-1;j>=scol;j--)
			{
				System.out.print(arr[erow][j]);
			}
			for(int j = erow-1;j>srow;j--)
			{
				System.out.print(arr[j][srow]);
			}
			srow++;
			erow--;
			scol++;
			ecol--;
		}
	}
}
