package javawithDSA9;

public class Bank_acount {
	public static void main(String args[])
	{
		ba myacc = new ba();
		myacc.username = "dival";
		myacc.setpass("dival1234");
	}
}

class ba 
{
	public String username;
	private String password;
	public void setpass(String pwd)
	{
		password = pwd;
//		System.out.println(password);
	}
}