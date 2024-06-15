package javawithDSA4;

public class kadanes_sum9 { 
	 public static void main(String args[]) 
	 {
		 int arr[]= {5,-3,4,-9,5};
		 System.out.println(kadan(arr));
	 }
	 
	 public static int kadan(int arr [])
	 {
		 int sum = 0;
		 int max = 0;
		 for(int i=0;i<arr.length;i++)
		 {
			 sum = sum + arr[i];
			 if(sum<1)
			 {
				 sum = 0;
			 }
			 max = Math.max( max, sum);
		 }
		 return max;
	 }

}
