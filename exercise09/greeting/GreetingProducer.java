package greeting;

public class GreetingProducer implements Runnable
{
	private static final int REPETITION = 10;
	private static final long DELAY = 100;

	public GreetingProducer(String aGreeting)
	{
		greeting = aGreeting;
	}

	@Override
	public void run()
	{
		try
		{
			for (int i = 1; i < REPETITION; i++)
			{
				System.out.println(i + ": " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	private String greeting;
}
