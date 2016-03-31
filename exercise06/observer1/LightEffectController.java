package observer1;

public class LightEffectController implements Observer
{
	private boolean isLightFlickering = false;

	public void flickerLights()
	{
		System.out.println("Flicker the lights");
		isLightFlickering = true;
	}

	@Override
	public void update(Object o)
	{
		if (o instanceof Integer)
		{
			Integer xCoordiante = (Integer) o;
			if (xCoordiante > 10 && isLightFlickering == false)
			{
				flickerLights();
			}
		}
	}

}
