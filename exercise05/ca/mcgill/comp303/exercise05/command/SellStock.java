package ca.mcgill.comp303.exercise05.command;

import sun.java2d.cmm.ProfileActivator;

public class SellStock implements Order
{
	private Stock abcStock;
	
	public SellStock(Stock aStock)
	{
		this.abcStock = aStock;
	}
	
		
	
	@Override
	public void exceute()
	{
		abcStock.sell();
	}

}
