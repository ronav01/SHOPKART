package ShopKart;

import java.util.Scanner;

public class AppController {

	public static void main(String[] args) {

		System.out.println("=================================");
		System.out.println("|   WELCOME TO SHOPKART PORTAL   |");
		System.out.println("=================================");

		while (true) {
			System.out.println("\n========== Login Page ===========\n");
			System.out.println("1. Registor");
			System.out.println("2. Login");
			System.out.println("0. Exit");

			Scanner sc = new Scanner(System.in);

			System.out.print("\nEnter Your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 0) {

				System.out.println("Thank you for using Shopkart. Exiting...");
				break;

			} else if (choice == 1) {

				UserServices.register();

				System.out.println("\nPlease Login to continue....");

				boolean isLoginSuccessfull = UserServices.login();

				if (isLoginSuccessfull) {
					ProductServices.displayProduct();
				}

			} else if (choice == 2) {

				boolean isLoginSuccessfull = UserServices.login();

				if (isLoginSuccessfull) {
					ProductServices.displayProduct();
				}

				if (!isLoginSuccessfull) {

					System.err.println("Please Register Your Account First !\n");

					System.out.print("Do you want to register now? (1 for Yes / 2 for No) : ");
					int reChoice = sc.nextInt();

					if (reChoice == 1) {

						UserServices.register();

						System.out.println("\nPlease Login to continue....");

						boolean loginAfterRegister = UserServices.login();

						if (loginAfterRegister) {
							ProductServices.displayProduct();
						}

					} else if (reChoice == 2) {

						System.out.println("Returning to login Page.");

					} else {

						System.err.println("Invalid Choice");
					}

				}
			} else {

				System.err.println("Invalid Choice!");
			}

		}
	}

}
