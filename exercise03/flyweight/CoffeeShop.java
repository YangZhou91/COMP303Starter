package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Instance of CoffeeFlavour will be flyweights
class CoffeeFlavour
{
	private final String name;

	CoffeeFlavour(String newFlavour)
	{
		this.name = newFlavour;
	}

	@Override
	public String toString()
	{
		return name;
	}
}

class Menu
{
	private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

	CoffeeFlavour lookup(String flavourName)
	{
		if (!flavours.containsKey(flavourName))
		{
			flavours.put(flavourName, new CoffeeFlavour(flavourName));
		}
		return flavours.get(flavourName);

	}

	int totalCoffeeFlavourMade()
	{
		return flavours.size();
	}
}

public class CoffeeShop
{

}
