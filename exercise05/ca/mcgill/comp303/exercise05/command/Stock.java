package ca.mcgill.comp303.exercise05.command;

public class Stock
{
	private String name = "ABC";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [ Name:" + name +", Quantity: " + quantity + "] bought");
	}
			
	public void sell(){
		System.out.println("Stock [ name: " + name+ ", Quantity: " + quantity + " ] sold" );
	}
}
