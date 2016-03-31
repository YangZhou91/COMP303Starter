package labtest01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;

/**
 * Represents the inventory of a 
 * physical grocery store.
 */
// Observer, monitor add or remove item

public class Inventory extends Observable
{
	private final String aName; // Unique
	private final HashMap<Item, Integer> aInventory = new HashMap<>();
	
	/**
	 * Creates a new inventory with no items in it,
	 * and identified uniquely with pName.
	 * @param pName A unique identifier for this inventory.
	 */
	public Inventory(String pName)
	{
		aName = pName;
		
	}
	
	/**
	 * @return The unique name of this inventory.
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * Adds pQuantity number of items to the inventory.
	 * @param pItem The type of item to add.
	 * @param pQuantity The amount to add.
	 */
	public void stock(Item pItem, int pQuantity)
	{
		int amount = 0;
		if( aInventory.containsKey(pItem))
		{
			amount = aInventory.get(pItem);
		}
		amount += pQuantity;
		
		aInventory.put(pItem, amount);
		
		
		//Observer
		setChanged();
		notifyObservers(pItem);
	}
	
	/**
	 * Removes pQuantity of items from the inventory,
	 * for example by selling them or tossing them in
	 * the garbage.
	 * @param pItem The type of item to dispose of
	 * @param pQuantity The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(Item pItem, int pQuantity)
	{
		assert aInventory.containsKey(pItem);
		assert pQuantity >= aInventory.get(pItem);
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
		
		// Observer 
		setChanged();
		notifyObservers(pItem);
	}
	
	/**
	 * @param pItem The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int pAvailable(Item pItem)
	{
		if( aInventory.containsKey(pItem))
		{
			return aInventory.get(pItem);
		}
		else
		{
			return 0;
		}
	}
	
	public int totalValue(){
		Iterator<Entry<Item, Integer>> iterator = this.aInventory.entrySet().iterator();
		int total = 0;
		while (iterator.hasNext())
		{
			Entry<Item, Integer> entry = iterator.next();
			total = total + entry.getValue();
		}
		
		return total;
	}

	
}
