package linked_list;

class ShoppingListItem{
	String itemName;
	String itemDescription;
	Boolean itemPurchased;
	Double itemPrice;
	ShoppingListItem next;

	ShoppingListItem(String itemName, String itemDescription, Double itemPrice){
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemPurchased = false;
		this.itemPrice = itemPrice;
		this.next = null;
	}
}

