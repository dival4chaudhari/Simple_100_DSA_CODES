package javawithDSA5;

public class bubble_sort2 {
	public static void main(String args[])
	{
		int ar[] = {1,45,7,237,4,3,4335,23,4};
		bs(ar);
	}
	
	public static void bs(int[] ar)
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ ", ");
		}
	}
}
