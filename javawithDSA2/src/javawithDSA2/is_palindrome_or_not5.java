package javawithDSA2;

public class is_palindrome_or_not5 {
	public static void main(String args[])
	{
		System.out.println(palindrom(1221));
	}
	
	//to check number is palindrom or not
	public static boolean palindrom(int a) 
	{
		int dummy = a;
		int aa=0;
		//loop to create reverse of the number
		while(dummy>0)
		{
			aa = (aa*10) + dummy%10;
			dummy= dummy /10;
		}
		if(a == aa)
		{
			return true;
		}
		return false;
	}

}
