package javawithDSA11;

public class Remove_duplicates2 {

	public static void main(String args[])
	{
		//only for lower case from a to z
		String s = "divalchaudhari";
		boolean map[] = new boolean[26];
		strings(0,s,new StringBuilder(""), map);
	}
	
	public static void strings(int idx, String s, StringBuilder newstring, boolean map[])
	{
		if(idx == s.length())
		{
			System.out.println(newstring);
			return;
		}
		
		//kaam
		char currchar = s.charAt(idx);
		if(map[currchar-'a'] == true)
		{
			strings( idx+1,s,newstring, map);
		}
		else
		{
			map[currchar -'a'] = true;
			strings(idx+1, s, newstring.append(currchar), map);
		}
	}
}
