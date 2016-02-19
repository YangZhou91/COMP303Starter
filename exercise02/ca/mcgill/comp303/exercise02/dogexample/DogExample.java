package ca.mcgill.comp303.exercise02.dogexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

 class Dog implements Comparator<Dog>, Comparable<Dog>
{
	private String name;
	private int age;

	Dog(){
		
	}
	
	Dog(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	@Override
	public int compareTo(Dog o)
	{
		return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Dog o1, Dog o2)
	{
		return o1.age - o2.age;
	}

}
 
 public class DogExample{
	 
	 public static void main(String args[]){
		 
		 List<Dog> list = new ArrayList<Dog>();
		 list.add(new Dog("Shaggy", 3));
		 list.add(new Dog("Lacy", 2));
		 list.add(new Dog("Roger", 10));
		 list.add(new Dog("Tommy", 4));
		 list.add(new Dog("Tammy", 1));
		 
		 
		 // Sort by name
		 java.util.Collections.sort(list);
		 for (Dog dog : list)
		{
			System.out.print(dog.getName() + " ");
		}
		 
		 System.out.println(" ");
		 java.util.Collections.sort(list, new Dog());
		 for (Dog dog : list)
		{
			System.out.print(dog.getName() + " :" + dog.getAge() + ", ");
		}
	 }
 }
