package inheritance;
class Super_class
{
	int num = 20;

	public void display()
	{
		System.out.println("The display method of super class");
	}
}

public class Sub_class extends Super_class
{
	int num = 10;

	@Override
	public void display()
	{
		System.out.println("This is display method of subclass");
	}

	public void my_method()
	{
		Sub_class sub = new Sub_class();
		sub.display();
		super.display();

		System.out.println("Value of the variable named in sub class: " + sub.num);
		System.out.println("Value of the variable named num in super class:" + super.num);

	}

	public static void main(String agrs[])
	{
		Sub_class obj = new Sub_class();
		obj.my_method();
	}
}
