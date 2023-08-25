import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {

		// Declare your variables here

		
		
		
		
		
		// Do not alter code below this line

		// Get the name on the order
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name on the order?");
		orderName = input.next();

		// Get the items for the order and compute the subtotal
		while (orderFinished == false) {
			System.out.println("What item would you like?");
			itemName = input.next();
			if (itemName.equals("Coffee")) {
				total = total + 2.50;
				numItems = numItems + 1;
			} else if (itemName.equals("Latte")) {
				total = total + 5.49;
				numItems = numItems + 1;
			} else if (itemName.equals("Smoothie")) {
				total = total + 4.25;
				numItems = numItems + 1;
			} else {
				orderFinished = true;
			}
		}

		// Add the tax to the total
		total = total * TAXRATE;

		// Display the order
		System.out.println("Order for " + orderName);
		System.out.println(numItems + " items");
		System.out.println("Amount due: $" + total);

	}

}
