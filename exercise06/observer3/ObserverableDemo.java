package observer3;

import java.util.Observable;
import java.util.Observer;

import javafx.beans.value.ObservableDoubleValue;

class ObservedObject extends Observable
{
	private String watchedValue;

	public ObservedObject(String value)
	{
		watchedValue = value;
	}

	public void setValue(String value)
	{
		if (!watchedValue.equals(value))
		{
			System.out.println("Value changed to new valueL " + value);
			watchedValue = value;

			setChanged();
			notifyObservers(value);
		}
	}
}

public class ObserverableDemo implements Observer
{
	public static void main(String[] args)
	{
		ObservedObject watched = new ObservedObject("Original Value");

		ObserverableDemo watcher = new ObserverableDemo();

		watched.setValue("New Value");

		watched.addObserver(watcher);

		watched.setValue("Lastest Value");
	}

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.println("Update called with Argument: " + arg);

	}

}
