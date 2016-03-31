package inheritance;

class Calculation
{
	int z;

	public void addition(int x, int y)
	{
		z = x + y;
		System.out.println("The sum of given number is " + z);
	}

	public void substraction(int x, int y)
	{
		z = x - y;
		System.out.println("The difference of given number is " + z);
	}
}

public class My_Calculation extends Calculation
{
	public void mulitplication(int x, int y)
	{
		z = x * y;
		System.out.println("The product of given number is " + z);
	}

	public static void main(String[] argv)
	{
		int a = 20;
		int b = 10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.substraction(a, b);
		demo.mulitplication(a, b);
	}

}
