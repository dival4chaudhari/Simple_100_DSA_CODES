package javawithDSA9;

public class Static_keyword9 {

	public static void main(String args[])
	{
		stu s1 = new stu();
		s1.schoolname = "PRC";
		stu s2 = new stu();
		System.out.println(s2.schoolname);
	}
}

class stu
{
	String name;
	int roll;
	
	static String schoolname;
	
	void setname()
	{
		this.name = name;
	}
	void getname()
	{
		System.out.println(this.name);
	}
}