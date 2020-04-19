package org.cap.entities;

public class Item {
	
	private int itemId;
	private  String itemName;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Item(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
