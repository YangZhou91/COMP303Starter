package labtest01;

public class ItemDecorator implements ItemInterface
{
	protected Item decoratoredItem;
	
	public ItemDecorator(Item item){
		this.decoratoredItem = item;
	}

	@Override
	public String getName()
	{
		// TODO Auto-generated method stub
		return "ITEM-" + decoratoredItem.getName();
	}

	@Override
	public int getId()
	{
		// TODO Auto-generated method stub
		return decoratoredItem.getId();
	}
}
