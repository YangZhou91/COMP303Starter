package greeting;

public class ThreadTester
{
	public static void main(String[] args)
	{
		Runnable r1 = new GreetingProducer("Hello World!");
		Runnable r2 = new GreetingProducer("Goodby, World!");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}
