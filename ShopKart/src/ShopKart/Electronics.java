package ShopKart;

public class Electronics extends Product {
	String warranty;

	public Electronics(String prdId, String prdName, String brand, double price, String warranty) {
		super(prdId, prdName, brand, price);
		this.warranty = warranty;
	}

	@Override
	public void displayProduct() {
		System.out.println("\n---------- electronics -----------");
		System.out.println("Product Id \t: " + getPrdId());
		System.out.println("Name \t\t: " + getPrdName());
		System.out.println("Brand \t\t: " + getBrand());
		System.out.println("Warranty \t: " + warranty + " Months");
		System.out.println("Price \t\t: " + getPrice());
		System.out.println("__________________________________\n");

	}
}
