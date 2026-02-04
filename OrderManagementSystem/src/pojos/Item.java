package pojos;

public class Item {

	private int itemID;
	private String itemName;
	private String itemDescription;
	private double price;
	private int qty;
	
	public Item() {
		this.itemID = 0;
		this.itemName = "NA";
		this.itemDescription = "NA";
		this.price = -1;
		this.qty = -1;
	}
	
	public Item(int itemID, String itemName, String itemDescription, double price, int qty) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.price = price;
		this.qty = qty;
	}
	
	public Item(Item item) {
		this.itemID = item.itemID;
		this.itemName = item.itemName;
		this.itemDescription = item.itemDescription;
		this.price = item.price;
		this.qty = item.qty;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", price="
				+ price + ", qty=" + qty + "]";
	}

}
