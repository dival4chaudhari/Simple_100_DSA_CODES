package javawithDSA9;

public class Abstract_oops7 {

	public static void main(String args[])
	{
		Horse h = new Horse();
		chicken c = new chicken();
		h.walk();
		System.out.println(h.skincolor);
		c.walk();
	}
}

abstract class animalss
{
	String skincolor;
	animalss()
	{
		skincolor = "red";
	}
	void eat()
	{
		System.out.println("eats");
	}
	abstract void walk();
}

class Horse extends animalss
{
	void walk()
	{
		System.out.println("walks on 4 legs");
	}
}
class chicken extends animalss
{
	void walk()
	{
		System.out.println("walks on 2 legs");
	}
}