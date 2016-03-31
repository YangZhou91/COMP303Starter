package observer1;

public class SoundEffectController implements Observer
{
	private boolean isSoundPlaying = false;

	public void playSound()
	{
		System.out.println("Play an errie sound");
		isSoundPlaying = true;
	}

	@Override
	// push
	// public void update(Object o)
	// {
	//
	// if (o instanceof Integer)
	// {
	// Integer yCoordinate = (Integer) o;
	// if (yCoordinate > 0 && isSoundPlaying == false)
	// {
	// playSound();
	// }
	//
	// }
	// }

	// pull model
	public void update(Object o)
	{
		if (o instanceof Player)
		{
			Player p = (Player) o;
			Integer yCoordiante = p.getyCoordinate();
			if (yCoordiante > 0 && isSoundPlaying == false)
			{
				playSound();
			}
		}
	}

}
