package javawithDSA8;

public class uppercase_to_lowercase_usingbits14 {

	public static void main(String args[])
	{
		for(char ch = 'A'; ch <= 'Z' ; ch++)
		{
			System.out.println(ch & ' ');
			System.out.println((char)(ch | ' '));
		}
	}
}
