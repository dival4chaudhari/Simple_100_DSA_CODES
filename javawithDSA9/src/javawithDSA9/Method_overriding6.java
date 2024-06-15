package javawithDSA9;

public class Method_overriding6 {

	public static void main(String args[])
	{
		animals ani = new animals();
		ani.eat();
		Lion li = new Lion();
		li.eat();
	}
}


class animals
{
	void eat()
	{
		System.out.println("eats anything");
	}
}

class Lion extends animals
{
	void eat()
	{
		System.out.println("eats meat");
	}
}