package ShopKart;

public class Groceries extends Product {
	String weight;
	String expiryDate;

	public Groceries(String prdId, String prdName, String brand, double price, String weight, String expiryDate) {
		super(prdId, prdName, brand, price);
		this.weight = weight;
		this.expiryDate = expiryDate;
	}

	@Override
	public void displayProduct() {
		System.out.println("\n---------- groceries -----------");
		System.out.println("Product Id \t: " + getPrdId());
		System.out.println("Name \t\t: " + getPrdName());
		System.out.println("Brand \t\t: " + getBrand());
		System.out.println("Weight \t\t: " + weight);
		System.out.println("Expiry Date \t: " + expiryDate);
		System.out.println("Price \t\t: " + getPrice());
		System.out.println("__________________________________\n");
	}
}
