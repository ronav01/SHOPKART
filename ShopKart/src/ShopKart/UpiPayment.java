package ShopKart;

import java.util.Scanner;

public class UpiPayment implements Payment {

	@Override
	public void makePayment(double amount) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Upi Id (e.g., user@paytm) : ");
		String upiId = sc.nextLine();

		System.out.println("\nProcessing " + amount + "via UPI.....");
		System.out.println("Paymet Successfull ! Order Palced Successfully.");

	}
}
