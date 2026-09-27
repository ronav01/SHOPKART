package ShopKart;

import java.util.Scanner;

public class PaymentController {
	static Scanner sc = new Scanner(System.in);

	public static void PaymentMethod(double totalPricel) {
		System.out.println("\n_____________________________");
		System.out.println("1. Proceed To payment");
		System.out.println("2. Back To DashBord");
		System.out.println("_____________________________\n");

		System.out.print("Enter Your choice : ");
		int choice = sc.nextInt();

		if (choice == 1) {
			paymentMod(totalPricel);
		} else if (choice == 2) {
			ProductServices.displayProduct();
		} else {
			System.out.println("Invlaid Choice , Please Select Valid Option.");
			paymentMod(totalPricel);
		}

	}

	public static void paymentMod(double totalPricel) {
		while (true) {
			System.out.println("\n=============================");
			System.out.println("|         Payment Mod         |");
			System.out.println("=============================\n");
			System.out.println("1. UPI");
			System.out.println("2. Debit Card");
			System.out.println("3. Credit Card");
			System.out.println("4. COD (Cash On Delivery)");
			System.out.println("5. Back to DashBord");
			System.out.println("6. Exit\n");

			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			if (choice == 6) {
				System.out.println("\nTankyou for shopping......");
				break;
			}
			Payment paymentMethod = null;
			if (choice == 1) {
				paymentMethod = new UpiPayment();
			} else if (choice == 2) {
				paymentMethod = new DebitCard();
			} else if (choice == 3) {
				paymentMethod = new CreditCard();
			} else if (choice == 4) {
				paymentMethod = new COD();
			} else if (choice == 5) {
				ProductServices.displayProduct();
				return;
			} else {
				System.out.println("Invlaid Choice , Please Select Valid Option.");
				continue;
			}

			if (paymentMethod != null) {
				paymentMethod.makePayment(totalPricel);

				AddtoCard.cartdItems.clear();
				AddtoCard.totalPrice = 0.0;
				break;
			}
		}

	}

}
