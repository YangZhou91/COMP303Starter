package observer1;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observable
{
	private String name;
	private Integer xCooridinate = 0;
	private Integer yCoordinatie = 0;

	private List<Observer> observers;

	public Player(String name)
	{
		this.name = name;
		this.observers = new ArrayList();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getxCooridinate()
	{
		return xCooridinate;
	}

	public Integer getyCoordinate()
	{
		return yCoordinatie;
	}

	public void moveForward(Integer steps)
	{
		xCooridinate += steps;
		notifyObservers();
	}

	public void moveBackward(Integer steps)
	{
		xCooridinate -= steps;
		notifyObservers();
	}

	public void jump(Integer height)
	{
		yCoordinatie += height;
		notifyObservers();
	}

	public void fallTo(Integer height)
	{
		yCoordinatie = height;
		notifyObservers();
	}

	@Override
	// push model
	// public void notifyObservers()
	// {
	// for (Observer observer : observers)
	// {
	// if (observer instanceof SoundEffectController)
	// {
	// observer.update(yCoordinatie);
	// }
	// else
	// {
	// if (observer instanceof LightEffectController)
	// {
	// observer.update(xCooridinate);
	// }
	// }
	// }
	//
	// }

	// pull model
	public void notifyObservers()
	{
		for (Observer o : observers)
		{
			o.update(this);
		}
	}

	@Override
	public void addObserver(Observer o)
	{
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o)
	{
		this.observers.add(o);
	}

}
