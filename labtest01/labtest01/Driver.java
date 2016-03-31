package labtest01;

import java.util.Arrays;
import java.util.Collections;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Bucket("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Bucket("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Bucket("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		for( Item item : ITEMS )
		{
			System.out.println(item.getName());
		}
		
		System.out.println(" ");
		
		Arrays.sort(ITEMS);
		for (Item item : ITEMS)
		{
			System.out.println(item.getName() + ": " + item.getPrice());
		}
		
		
		Inventory aInventory = new Inventory("labTest1");
		aInventory.addObserver(new InventoryAdditionObserver(aInventory));
		aInventory.stock(ITEM_CEREAL, 10);
		aInventory.dispose(ITEM_CEREAL, 50);
		
	
		
	}
}
