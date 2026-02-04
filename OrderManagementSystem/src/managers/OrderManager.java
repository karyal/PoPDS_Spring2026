package managers;

import pojos.OrderItem;

public class OrderManager {
	private OrderItem orderItem;//Customer, Item, Order Info
	public void save() {
		//send orderItem to Database Manager for Save on database
	}
	public void search(int orderID) {
		//send orderID to Database manager for search OrderItem based on orderID
	}
}