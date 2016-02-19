package ca.mcgill.comp303.exercise02.countryexample;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{

	public static void main(String[] args)
	{
		// Create an array list
		ArrayList<String> al = new ArrayList<>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("D");
		al.add("F");

		// User iterator to dispaly contents of al
		System.out.println("Original content of al: ");
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			Object element = itr.next();
			System.out.println(element + " ");
		}
	}

}
