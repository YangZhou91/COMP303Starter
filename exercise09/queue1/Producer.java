package queue1;

public class Producer implements Runnable
{

	private String greeting;
	private BoundedQueue<String> queue;
	private int greetingCount;

	private static final int DELAY = 10;

	public Producer(String greeting, BoundedQueue<String> queue, int greetingCount)
	{
		// super();
		this.greeting = greeting;
		this.queue = queue;
		this.greetingCount = greetingCount;
	}

	@Override
	public void run()
	{

	}

}
