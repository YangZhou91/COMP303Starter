import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountrySortTester
{
	public static void main(String[] args)
	{
		ArrayList<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Uruguary", 176220));
		countries.add(new Country("Thailand", 514000));
		countries.add(new Country("Belgium", 30510));

		Collections.sort(countries);

		for (Country country : countries)
		{
			System.out.println(country.getName() + " " + country.getArea());
		}

		// Comparator<Country> comp = new CountryComparatorByName();
		// Sort by name
		Collections.sort(countries, new CountryComparatorByName());
		for (Country country : countries)
		{
			System.out.println(country.getName() + " " + country.getArea());
		}

		Comparator<Country> reverseComp = new CountryComparator(false);
		Collections.sort(countries, reverseComp);
		for (Country country : countries)
		{
			System.out.println(country.getName() + " " + country.getArea());
		}

	}
}
