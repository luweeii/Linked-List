package linked_list;

class ShoppingList{
	ShoppingListItem head;

	void addItem (String itemName, String itemDescription, Double itemPrice) {
		ShoppingListItem newItem = new ShoppingListItem (itemName, itemDescription, itemPrice);
		if (head == null) {
			head = newItem;
		} else {
			ShoppingListItem current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newItem;
		}
	}

	void displayList() {
		if (head == null) {
			System.out.println("Shopping List is empty.");
			return;
		}
		ShoppingListItem current = head;
		System.out.println("Shopping List:\n");
		while (current != null) {
			System.out.println("Item Name: " + current.itemName);
			System.out.println("Item Description: " + current.itemDescription);
			System.out.println("Item Price: " + current.itemPrice + "php");
			System.out.println("Purchase Condition: " + (current.itemPurchased ? "Purchased" : "Not Purchased"));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			current = current.next;
		}
	}

	void deleteItem (String itemToDelete) {
		if (head == null) {
			System.out.println("Shopping List is empty. Cannot delete anything.");
			return;
		}

		if (head.itemName.equals(itemToDelete)) {
			head = head.next;
			System.out.println("Item Deleted.");
			return;
		}

		ShoppingListItem current = head;
		while (current.next != null) {
			if (current.next.itemName.equals(itemToDelete)) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		System.out.println("Item name: '" + itemToDelete + "' is not found.");
	}

	void purchasedItem (String itemName) {
		ShoppingListItem current = head;
		while (current != null) {
			if (current.itemName.equals(itemName)) {
				current.itemPurchased = true;
				return;
			}
			current = current.next;
		}
		System.out.println("Item name: '" + itemName + "' is not found");
	}

}
