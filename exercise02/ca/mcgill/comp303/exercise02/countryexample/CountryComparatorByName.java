package ca.mcgill.comp303.exercise02.countryexample;
import java.util.Comparator;

public class CountryComparatorByName implements Comparator<Country>
{

	@Override
	public int compare(Country o1, Country o2)
	{
		return o1.getName().compareTo(o2.getName());
	}

}
