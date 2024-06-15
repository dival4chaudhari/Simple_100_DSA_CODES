package javawithDSA9;

public class oops1 {
	public static void main(String args[])
	{
		Pen p1 = new Pen();
		p1.setColor("red");
		System.out.print(p1.getcolor());
		
	}
}

class Pen {
	private String color;
	int tip;
	
	String getcolor()
	{
		return this.color;
	}
	int gettip()
	{
		return this.tip;
	}
	void setColor(String newcolor)
	{
		color = newcolor;
	}
	void setTip(int newtip)
	{
		tip = newtip;
	}
}

class Student 
{
	String name;
	int age;
	float cgpa;
	
	void calccgpa (int phy, int chem, int math)
	{
		cgpa = (phy+chem+math)/3;
	}
}




