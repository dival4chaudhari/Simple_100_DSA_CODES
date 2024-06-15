package javawithDSA6;
import java.util.Scanner;
public class use_of_charAt5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String last = sc.next();
		System.out.println(first + " " + last);
		printstring(first);
	}
	
	public static void printstring(String first)
	{
		for(int i=0;i<first.length();i++)
		{
			System.out.print(first.charAt(i) + " ");
		}
	}
}
