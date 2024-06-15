package javawithDSA5;
import java.util.*;
import java.util.Collections;
public class inbuild_sort5 {

	public static void main(String args[])
	{
		Integer arr[] = {1,4,7,2,8,4,6,9,3,0,7,4};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		Arrays.sort(arr,1,6);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		Arrays.sort(arr,3,8, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		Arrays.sort(arr, Collections.reverseOrder());
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + ",");
		}
	}
}
