package ShopKart;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServices {
	static ArrayList<User> users = new ArrayList<User>();
	public static boolean isLoggedIn = false;

	public static void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n========== Register Page ===========");

		User u1 = null;
		System.out.print("Enter name : ");
		String name = sc.nextLine();

		System.out.print("Enter phone number : ");
		String phoneNO = sc.nextLine();

		System.out.print("Enter gmail : ");
		String email = sc.nextLine();

		System.out.print("Enter password : ");
		String password = sc.nextLine();

		System.out.print("Enter Re-Password : ");
		String rePassword = sc.nextLine();

		if (password.equals(rePassword)) {
			u1 = new User(name, email, phoneNO, rePassword);
			users.add(u1);
			System.out.println("Register Successfull.");
			return;
		} else {
			u1 = null;
			System.out.println("Passwrod doesn't match.");
		}
	}

	public static boolean login() {
		isLoggedIn = true;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n========== Login ===========");

		System.out.print("Enter Phone Number/Email : ");
		String userInput = sc.next();

		System.out.print("Enter Password : ");
		String pwd = sc.next();

		for (User u1 : users) {

			boolean isMatchUserInput = (userInput.equals(u1.getEmail()) || userInput.equals(u1.getPhoneNO()));
			boolean isPwdMatch = pwd.equals(u1.getPassword());

			if (isMatchUserInput && isPwdMatch) {
				System.out.println("\nLogin Successfully !\n" + "Welcome back, " + u1.getName());
				return true;
			}
		}
		System.out.println("Invalid Phone/Email or Password!");
		return false;
	}

	public static void logout() {
		System.out.println("Logout Sucessfull.");
		isLoggedIn = false;
	}

}
