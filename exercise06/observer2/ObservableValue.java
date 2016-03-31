package observer2;

import java.util.Observable;
// import java.util.Observer;

public class ObservableValue extends Observable
{
	private int n = 0;

	public ObservableValue(int n)
	{
		this.n = n;
	}

	public void setValue(int n)
	{
		this.n = n;
		setChanged();
		notifyObservers();
	}

	public int getValue()
	{
		return n;
	}
}
