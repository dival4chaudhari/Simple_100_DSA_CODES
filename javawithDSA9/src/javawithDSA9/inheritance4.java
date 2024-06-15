package javawithDSA9;

public class inheritance4 {

	public static void main(String args[])
	{
		fish shark = new fish();
		shark.eat();
		dog sheru = new dog();
		sheru.eat();
	}
}

class animal
{
	String color;
	
	void eat()
	{
		System.out.println("eats");
	}
	void breath()
	{
		System.out.println("breathes");
	}
}

class fish extends animal
{
	int fins;
	
	void swim()
	{
		System.out.println("swims");
	}
}

class mammal extends animal
{
	
}
class birds extends animal
{
	
}

class dog extends mammal
{
	
}








