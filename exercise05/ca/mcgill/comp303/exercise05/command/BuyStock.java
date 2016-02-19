package ca.mcgill.comp303.exercise05.command;

public class BuyStock implements Order
{	
	private Stock abcStock;

	public BuyStock(Stock abcStock)
	{
		this.abcStock = abcStock;
	}
	
	@Override
	public void exceute()
	{
		abcStock.buy();
	}

}
