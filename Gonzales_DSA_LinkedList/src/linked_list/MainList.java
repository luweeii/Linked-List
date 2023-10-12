package linked_list;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainList {

	public static void main(String[] args) {
		ShoppingList myList = new ShoppingList();
		Scanner sc = new Scanner (System.in);
		String itemName;
		String itemDescription;
		Double itemPrice;
		Boolean exit = false;

		while (!exit) {
			try {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Pat's Shopping List | Main Menu");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			System.out.println("[1] Display Shopping List");
			System.out.println("[2] Add Item");
			System.out.println("[3] Remove Item");
			System.out.println("[4] Mark Item as Purchased");
			System.out.println("[5] Exit");

			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println();
				myList.displayList();

				} else if (choice == 2) {
				System.out.print("\nEnter Item Name: ");
				itemName = sc.nextLine();
				System.out.print("Enter Item Description: ");
				itemDescription = sc.nextLine();
				System.out.print("Enter Item Price: ");
				itemPrice = sc.nextDouble();

				myList.addItem(itemName, itemDescription, itemPrice);

				} else if (choice == 3){
					System.out.print("\nEnter Item Name to remove: ");
					itemName = sc.nextLine();
					myList.deleteItem(itemName);

				} else if (choice == 4) {
					System.out.println("\nEnter Item Name to mark as Purchased: ");
					itemName = sc.nextLine();
					myList.purchasedItem(itemName);
				}


			} catch (InputMismatchException e) {
				System.out.println("Invalid choice. Please enter a valid number.");
				sc.nextLine();
			}
		}
	}

}
