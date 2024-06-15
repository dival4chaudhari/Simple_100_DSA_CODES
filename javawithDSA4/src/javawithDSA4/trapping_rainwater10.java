package javawithDSA4;

public class trapping_rainwater10 {
	public static void main(String args[])
	{
		int water[] = { 1,8,8,8,1};
		water(water);
		System.out.println(water(water));
	}
	
	public static int water(int[] water)
	{
//		int ans =0;
//		if(water.length >3)
//		{
//			return ans;
//		}
//		
		
		//left max value
		int leftb[] = new int[water.length];
		leftb[0] = water[0];
		for(int i = 1;i<leftb.length;i++)
		{
			leftb[i] = Math.max(water[i], leftb[i-1]);
		}
		
		
		
		
		//right max value
		int rightb[] = new int[water.length];
		rightb[rightb.length-1] = water[water.length-1];
		for(int i=rightb.length-2;i>=0;i--)
		{
			rightb[i] = Math.max(water[i], rightb[i+1]);
		}
		
		
		
		
		
		//water level calculate
		int waterans = 0;
		for(int i= 0; i<water.length; i++)
		{
			int waterlevel = Math.min(rightb[i], leftb[i]) - water[i];
			if ( waterlevel<0)
			{
				waterlevel = 0;
			}
			waterans = waterans + waterlevel;
		}
		
		return waterans;
	}

}
