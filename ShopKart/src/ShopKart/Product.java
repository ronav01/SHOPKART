package ShopKart;

public class Product {
	private String prdId;
	private String prdName;
	private String brand;
	private double price;

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public Product(String prdId, String prdName, String brand, double price) {
		this.prdId = prdId;
		this.prdName = prdName;
		this.brand = brand;
		this.price = price;
	}

	public String getPrdId() {
		return prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void displayProduct() {

		System.out.println("Product Id \t: " + prdId + " , " + "Name \t: " + prdName + " , " + "Brand \t:  " + brand
				+ "price \t: " + price);

	}

}
