package ShopKart;

import java.util.Scanner;

public class DebitCard implements Payment {
	public void makePayment(double amount) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 16-digit Card Number : ");
		long cardNum = sc.nextLong();

		System.out.print("Enter Expiry (MM/YY) : ");
		String expiry = sc.next();

		System.out.print("Enter CVV : ");
		String cvv = sc.next();

		System.out.println("\nProcessing " + amount + " via Debit Card");
		System.out.println("Paymet Successfull ! Order Palced Successfully.");

	}
}
