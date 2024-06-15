package javawithDSA6;

public class substring_instring9 {
	public static void main(String args[])
	{
		String s = "dival chaudhari";
		String subs ="";
		for(int i= 4;i<7;i++)
		{
			subs += s.charAt(i);
			System.out.print(s.charAt(i));
		}
		System.out.print(subs);
		
		
		
		
		
		System.out.println(s.substring(4,7));
	}
}
