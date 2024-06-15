package javawithDSA4;

public class prefix_sum8 {
	public static void main(String args[])
	{
		int arr[] ={5,-4,-4, 6,7 , -1};
		System.out.println(prefix(arr));
	}

	public static int prefix(int arr [])
	{
		int pre [] = new int[arr.length];
		int sum = 0;
		int max = 0;
		for(int i=1;i<pre.length;i++)
		{
			pre[i] = pre[i-1] + arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int start = i;
			for(int j=i;j<arr.length;j++)
			{
				int end = j;
				sum= start ==0 ? pre[end] : pre[end] - pre[start -1];
				if(max<sum)
				{
					max = sum;
				}
			}
			
		}
		return max;
	}
}
