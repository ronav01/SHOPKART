package ShopKart;

public class User {
	private String name;
	private String email;
	private String phoneNo;
	private String password;

	public User(String name, String email, String phoneNo, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPhoneNO() {
		return this.phoneNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void displayUserDetails() {
		System.out.println("Name \t\t: " + getName());
		System.out.println("Phone Number \t: " + getPhoneNO());
		System.out.println("Email \t\t: " + getEmail());
	}

}
