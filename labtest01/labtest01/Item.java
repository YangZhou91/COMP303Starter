package labtest01;

import java.util.Comparator;
import java.util.Observable;



/**
 * An item in a grocery store: 
 * Jar of peanut butter, package of pasta,
 * whatever.
 */
// Make abstract 
// shoval, bucket extends abstract item overwrite item name 
public abstract class Item extends Observable implements Comparator<Item>, Comparable<Item>, ItemInterface 
{
	private final String aName;
	private final int aId;
	private final int aPrice; // In cents: 100 = one dollar
	
	
	
	/**
	 * Creates a new item.
	 * @param pName The name of the item. Not necessarily unique.
	 * @param pId A unique id for the item
	 * @param pPrice The price of the item in cents
	 */
	public Item(String pName, int pId, int pPrice)
	{
		aName = pName;
		aId = pId;
		aPrice = pPrice;
	}
	
	/**
	 * @return The name of the item
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * @return The ID of the item.
	 */
	public int getId()
	{
		return aId;
	}
	
	/**
	 * @return The price of the item in cents
	 */
	public int getPrice()
	{
		return aPrice;
	}
	
	/**
	 * @return the comparison of price
	 */
	@Override
	public int compare(Item o1, Item o2)
	{
		return o1.compareTo(o2);
	}

	@Override
	public int compareTo(Item o)
	{
		// TODO Auto-generated method stub
		return this.getPrice() - o.getPrice();
	}


}
