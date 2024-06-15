package javawithDSA9;

public class Interface_oops8 {

	public static void main(String args[])
	{
		bear b = new bear();
		b.eatsnonveg();
		b.eatsveg();
	}
}

interface chessplayer
{
	void moves();
}

class queen implements chessplayer
{
	public void moves()
	{
		System.out.println("all 8 directions");
	}
}
class king implements chessplayer
{
	public void moves()
	{
		System.out.println("all 8 directions. 1 step only ");
	}
}
class rook implements chessplayer
{
	public void moves()
	{
		System.out.println("all 4 directions. not diagonal");
	}
}


//for multiple inheritance
interface veg
{
	void eatsveg();
}
interface nonveg
{
	void eatsnonveg();
}

class bear implements veg,nonveg
{
	public void eatsveg()
	{
		System.out.println("eats veg");
	}
	public void eatsnonveg()
	{
		System.out.println("eats non veg");
	}
}