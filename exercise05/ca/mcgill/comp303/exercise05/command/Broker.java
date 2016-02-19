package ca.mcgill.comp303.exercise05.command;

import java.util.ArrayList;
import java.util.List;

public class Broker
{
	private List<Order> orderList = new ArrayList<Order>();


	public void takeOrder(Order order){
		
		orderList.add(order);
		
	}
	
	public void placeOrders(){
		
		for (Order order : orderList)
		{
			order.exceute();
		}
		
		
		orderList.clear();
	}
	
}
