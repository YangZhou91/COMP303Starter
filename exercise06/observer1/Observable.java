package observer1;

public interface Observable
{
	public void notifyObservers();

	public void addObserver(Observer o);

	public void removeObserver(Observer o);
}
