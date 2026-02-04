package pojos;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerAddress;
	//Constructors - Multi-value setting
	public Customer() {
		this.customerID=-1;
		this.customerName="NA";
		this.customerAddress="NA";
	}
	public Customer(int customerID, String customerName, String customerAddress) {
		this.customerID=customerID;
		this.customerName=customerName;
		this.customerAddress=customerAddress;
	}
	public Customer(Customer c) {
		this.customerID=c.customerID;
		this.customerName=c.customerName;
		this.customerAddress=c.customerAddress;
	}
	//Setters
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress=customerAddress;
	}
	//Getters
	public int getCustomerID() {
		return this.customerID;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	//toString
	public String toString() {
		return this.customerID+", "+this.customerName+", "+this.customerAddress;
	}
}







