package ca.mcgill.comp303.exercise02.countryexample;
import java.util.Comparator;

public class CountryComparator implements Comparator<Country>
{
	private int direction;

	public CountryComparator(boolean ascending)
	{
		if (ascending)
		{
			direction = 1;
		}
		else
		{
			direction = -1;
		}
	}

	@Override
	public int compare(Country o1, Country o2)
	{
		return direction * o1.getName().compareTo(o2.getName());
	}

}
