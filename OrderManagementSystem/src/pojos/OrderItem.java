package pojos;
import java.time.LocalDateTime;

public class OrderItem {
	private int orderID;
	private LocalDateTime orderDate; //Date Time
	private int qty;
	private Item item;//itemID//Item Details
	private Customer customer;//customerID//Customer Details
	
	public OrderItem() {
		this.orderID = -1;
		this.orderDate = null;
		this.qty = -1;
		this.item = null;
		this.customer = null;
	}
	
	public OrderItem(int orderID, LocalDateTime orderDate, int qty, Item item, Customer customer) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.qty = qty;
		this.item = item;
		this.customer = customer;
	}
	
	public OrderItem(OrderItem oi) {
		this.orderID = oi.orderID;
		this.orderDate = oi.orderDate;
		this.qty = oi.qty;
		this.item = oi.item;
		this.customer = oi.customer;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderItem [orderID=" + orderID + ", orderDate=" + orderDate + ", qty=" + qty + ", item=" + item
				+ ", customer=" + customer + "]";
	}
}
