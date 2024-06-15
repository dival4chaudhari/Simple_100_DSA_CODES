package javawithDSA9;

public class Super_keyword10 {

	public static void main(String args[])
	{
		b bb = new b();
		System.out.println(bb.number);
	}
}

class a 
{
	int number;
	
	a()
	{
		System.out.println("a");	
	}
}

class b extends a
{
	b()
	{
		super.number = 10;
		System.out.println("b");
	}
}