package javawithDSA7;

public class StringBuilder1 {

	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Dival");
		
		for(char ch = 'a' ; ch<= 'z' ; ch++)
		{
			sb.append(ch);
		}
		System.out.println(sb);		
		System.out.println(sb.length());

	}
}