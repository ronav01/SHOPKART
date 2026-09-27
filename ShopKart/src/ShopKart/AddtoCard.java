package ShopKart;

import java.util.ArrayList;
import java.util.Scanner;

public class AddtoCard {
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Product> cartdItems = new ArrayList<Product>();

	public static double totalPrice = 0;

	public static void addItems(Product items) {
		cartdItems.add(items);
		totalPrice += items.getPrice();
		System.out.println("Product added to cart successfully!");
	}

	public static void viewCard() {
		if (cartdItems.isEmpty()) {
			System.out.println("Your Card is Empty.");
		} else {
			System.out.println("\n========== YOUR CART ==========");
			for (Product items : cartdItems) {
				items.displayProduct();
			}

			System.out.println("\nTotal Amount to Pay : " + totalPrice);
			System.out.println("_________________________________");
			PaymentController.PaymentMethod(totalPrice);
		}
	}

	public static void toAddCardAndGoMenu(ArrayList<Product> products) {

		if (!UserServices.isLoggedIn) {
			System.err.println("Please Login First to add items to the card.");
			boolean isLoginSuccessfull = UserServices.login();

			if (isLoginSuccessfull) {
				ProductServices.displayProduct();
			}

		}
		System.out.println("\n-----------------------------------");
		System.out.println("1. Add Product to Cart");
		System.out.println("2. Back to Dashboard / Main Menu ");
		System.out.println("-----------------------------------\n");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		Product foundProduct = null;
		if (choice == 1) {

			System.out.print("Enter Product Id to add to card : ");
			String userInput = sc.next();

			for (Product p : products) {
				if (userInput.equalsIgnoreCase(p.getPrdId())) {
					foundProduct = p;
				}
			}

			if (foundProduct != null) {
				addItems(foundProduct);
			}

			String userChoice;
			do {
				System.out.print("\nDo you want to and more items (y/n) : ");
				userChoice = sc.next().toLowerCase();

				if (userChoice.equalsIgnoreCase("y")) {
					System.out.print("\nEnter Product Id to add more : ");
					String nextChoice = sc.next();

					Product nextProduct = null;

					for (Product p : products) {
						if (nextChoice.equalsIgnoreCase(p.getPrdId())) {
							nextProduct = p;
							break;
						}
					}

					if (nextProduct != null) {
						addItems(nextProduct);
					} else {
						System.out.println("Invalid Product Id");
					}
				}

			} while (userChoice.equalsIgnoreCase("y"));

		} else if (choice == 2) {
			ProductServices.displayProduct();
		}
	}

}
