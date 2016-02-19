package ca.mcgill.comp303.exercise02.countryexample;
import java.util.Comparator;

public class Country implements Comparable<Country>
{
	private String name;
	private double area;

	public Country(String aName, double anArea)
	{
		name = aName;
		area = anArea;
	}

	public String getName()
	{
		return name;
	}

	public double getArea()
	{
		return area;
	}

	@Override
	public int compareTo(Country other)
	{
		if (area < other.area)
			return -1;
		if (area > other.area)
			return 1;
		return 0;
	}

}
