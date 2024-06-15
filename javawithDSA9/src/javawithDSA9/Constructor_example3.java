package javawithDSA9;

public class Constructor_example3 {

	public static void main(String args[])
	
	{
		Students s1 = new Students("dival");
		s1.rollno = 10;
		Students s2 = new Students(s1);
		s2.rollno = 20;
		System.out.println(s2.name);
	}
}


class Students
{
	String name;
	int rollno ;
	
	
	//shallow copy constructor
	Students(Students s1)
	{
		this.name = s1.name;
	}
	Students(String name)
	{
		this.name = name;
	}
}