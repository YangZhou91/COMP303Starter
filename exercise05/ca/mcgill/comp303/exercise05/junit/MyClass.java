package ca.mcgill.comp303.exercise05.junit;

public class MyClass
{
	public int mulitply(int x, int y){
		
		if (x > 999){
			throw new IllegalArgumentException("X should be less than 1000");
			
		}
		
		return x * y;
	}
}
