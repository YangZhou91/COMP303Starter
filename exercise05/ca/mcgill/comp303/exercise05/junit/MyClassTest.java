package ca.mcgill.comp303.exercise05.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest
{
	private MyClass myClass;
	
	@Before
	public void initialize(){
		myClass = new MyClass();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown(){
		myClass.mulitply(1000, 5);
	}
	
	@Test
	public void testMulitply()
	{
		assertEquals("10 * 5 must be 50", 50, myClass.mulitply(10, 5));
	}

}
