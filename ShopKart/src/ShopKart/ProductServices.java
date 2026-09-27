package ShopKart;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductServices {
	public static ArrayList<Product> products = new ArrayList<Product>();

	static {
		// Electronic
		Product item1 = new Electronics("E001", "Smartphone", "Samsung", 799.99, "1 Year 5");
		Product item2 = new Electronics("E002", "Laptop", "Apple", 1299.50, "2 Years 0");
		Product item3 = new Electronics("E003", "Wireless Headphones", "Sony", 199.99, "1 Year 6");

		// Clothes
		Product item4 = new Clothing("C004", "Shirt", "Zara", 2499, "L", "Sky Blue");
		Product item5 = new Clothing("C005", "T-Shirt", "H&M", 1999, "Xl", "Blue");
		Product item6 = new Clothing("C006", "Jeans", "H&M", 3499, "30", "Bege");

		// Groceries

		Groceries item7 = new Groceries("G001", "Whole Milk", "Organic Valley", 4.99, "1 Gallon", "2026-10-15");

		Groceries item8 = new Groceries("G002", "Basmati Rice", "India Gate", 14.50, "5 kg", "2027-05-20");

		Groceries item9 = new Groceries("G003", "Extra Virgin Olive Oil", "Filippo Berio", 12.99, "750 ml",
				"2028-01-10");

		// add items
		products.add(item1);
		products.add(item2);
		products.add(item3);
		products.add(item4);
		products.add(item5);
		products.add(item6);
		products.add(item7);
		products.add(item8);
		products.add(item9);

	}

	public static void displayProductDetails() {
		System.out.println("Product Size " + products.size());
		for (Product p : products) {
			p.displayProduct();
		}
	}

	public static void displayProduct() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n========================================");
			System.out.println("|          SHOPKART DASHBOARD           |");
			System.out.println("========================================\n");

			System.out.println("Select a Category to Browse: ");
			System.out.println("1. Electronics");
			System.out.println("2. Clothes / Apparel");
			System.out.println("3. Groceries & Books");
			System.out.println("4. View Cart");
			System.out.println("5. Logout");
			System.out.println("6. Exit\n");

			try {
				System.out.print("Enter Your Choice : ");
				int choice = sc.nextInt();

				if (choice == 6) {
					System.out.println("Thank you for using Shopkart Exiting...");
					break;
				}
				if (choice == 1) {

					for (Product p : products) {
						if (p instanceof Electronics) {
							p.displayProduct();
						}
					}
					AddtoCard.toAddCardAndGoMenu(products);
					PaymentController.PaymentMethod(AddtoCard.totalPrice);

				} else if (choice == 2) {

					for (Product p : products) {
						if (p instanceof Clothing) {
							p.displayProduct();
						}
					}
					AddtoCard.toAddCardAndGoMenu(products);
					PaymentController.PaymentMethod(AddtoCard.totalPrice);

				} else if (choice == 3) {

					for (Product p : products) {
						if (p instanceof Groceries) {
							p.displayProduct();
						}
					}
					AddtoCard.toAddCardAndGoMenu(products);
					PaymentController.PaymentMethod(AddtoCard.totalPrice);

				} else if (choice == 4) {

					AddtoCard.viewCard();

				} else if (choice == 5) {
					UserServices.logout();
					continue;

				} else if (choice == 6) {
					return;
				} else {
					System.out.println("Invalid Choice, Please Enter Any Option : ");
					continue;
				}

			} catch (Exception e) {
				System.err.println("input MisMatch, please enter valid input");
				System.err.println(e.getMessage());
				return;
			}

		}

	}

}
