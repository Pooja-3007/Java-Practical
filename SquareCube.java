package mypackage;

interface Printable
{
	void display();
}
interface Calculate
{
	int cal(int x);
}
class Square implements Printable, Calculate
{
	public void display() 
	{
		System.out.print("Square : ");
	}
	public int cal(int a)
	{
		return a*a;
	}
}
class Cube
{
	public void display() 
	{
		System.out.print("Cube : ");
	}
	public int cal(int a)
	{
		return a*a*a;
	}
}


public class SquareCube
{

	public static void main(String[] args) 
	{
		Square sq = new Square();
		sq.display();
		System.out.println(sq.cal(4));

		Cube cb = new Cube();
		cb.display();
		System.out.println(cb.cal(3));
	}

}