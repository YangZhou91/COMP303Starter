package labtest01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemDecoratorTest
{
	
	private Item item;
	private ItemDecorator itemD;
	
	@Before
	public void setUp() throws Exception
	{
		item = new Item("Cereal", 1, 200);
		itemD = new ItemDecorator(item);
	}

	@Test
	public void testGetName()
	{
		assertEquals("ITEM-" + item.getName(), itemD.getName());
		assertEquals("ITEM-Cereal", itemD.getName());
	}

	@Test
	public void testGetId()
	{
		assertEquals(1, itemD.getId());
	}

}
