package javawithDSA6;

public class shortest_path_to_reach_destination_string7 {
	public static void main(String args[])
	{
		String first = "WNEENESENN";
		System.out.println(dist(first));
	}
	
	public static int dist(String first)
	{
		if(first.length() ==1)
		{
			return (int)Math.sqrt(2);
		}
		if(first.length() == 0)
		{
			return 0;
		}
		int i=0;
		int y =0;
		int x =0;
		while(i<first.length())
		{
			switch(first.charAt(i))
			{
			case 'W':
				x--;
				break;
			case 'E':
				x++;
				break;	
			case 'S':
				y--;
				break;
			case 'N':
				y++;
				break;	
			}
			i++;
		}
		return (int)Math.sqrt((x*x) + (y*y));
	}
}
