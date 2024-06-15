package javawithDSA11;

public class Binary_Strings_problem4 {

	public static void main(String args[])
	{
		//print all binary strings of size n without consecutive ones.
		binary(100,0,"");
	}
	
	public static void binary(int n, int lp , String str)
	{
		if(n ==0)
		{
			System.out.println(str);
			return;
		}
//		if(lp == 0)
//		{
//			binary(n-1, 0, str.append("0"));
//			binary(n-1, 1, str.append("1"));
//		}
//		else
//		{
//			binary(n-1, 0, str.append("0"));
//		}
		
		binary(n-1, 0, str+"0");
		if(lp == 0)
		{
			binary(n-1, 1, str+"1");
		}
		
		
	}
}
