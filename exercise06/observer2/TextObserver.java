package observer2;

import java.util.Observable;
import java.util.Observer;

public class TextObserver implements Observer
{
	private ObservableValue ov = null;

	public TextObserver(ObservableValue ov)
	{
		this.ov = ov;
	}

	@Override
	public void update(Observable o, Object arg)
	{
		if (o == ov)
		{
			System.out.println(ov.getValue());
		}

	}

}
