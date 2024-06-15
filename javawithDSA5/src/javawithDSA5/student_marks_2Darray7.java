package javawithDSA5;
import java.util.Scanner;
public class student_marks_2Darray7 {
	
	public static boolean search(int[][] ar, int key)
	{
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[0].length ; j++)
			{
				if(ar[i][j]==key)
				{
					System.out.print("found it!! ");
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		int n= 3,m = 4;
		int ar[][] = new int[n][m];
		int[][] arr = {{1,2,3}, {4,5,6}};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<m ; j++)
			{
				ar[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<n;i++)
		{
			for(int j=0; j<m ; j++)
			{
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		int key = 9;
		search(ar,key );
	}
}