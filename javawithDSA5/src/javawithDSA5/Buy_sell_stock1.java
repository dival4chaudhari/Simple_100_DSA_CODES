package javawithDSA5;

public class Buy_sell_stock1 {
	public static void main(String args[])
	{
		int stockprice[] = {8,7,3,7,4,1,3};
		System.out.println(profit(stockprice));
	}
	
	public static int profit(int[] pro)
	{
		int buy = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for(int i=0;i<pro.length;i++)
		{
			if(buy < pro[i])
			{
				int profit = pro[i] - buy;
				maxprofit = Math.max(maxprofit, profit);
			}
			else
			{
				buy = pro[i];
			}
		}
		return maxprofit;
	}
}
