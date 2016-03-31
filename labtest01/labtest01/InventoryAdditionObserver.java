package labtest01;

import java.util.Observable;
import java.util.Observer;

import observer2.ObservableValue;

public class InventoryAdditionObserver implements Observer
{
	Inventory in = null;
	
	public InventoryAdditionObserver(Inventory inventory)
	{
		this.in = inventory;
	}
			
	
	@Override
	public void update(Observable o, Object arg)
	{
		

			Inventory in = (Inventory) o;
			Item it = (Item) arg;
			
			System.out.println(" The item amount: " + it.getName() + "has been changed.");
			System.out.println("The new quantity is :" + in.pAvailable(it));
		
	}

}
