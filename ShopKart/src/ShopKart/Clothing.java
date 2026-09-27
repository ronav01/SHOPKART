package ShopKart;

public class Clothing extends Product {
	String size;
	String color;

	public Clothing(String prdId, String prdName, String brand, double price, String size, String color) {
		super(prdId, prdName, brand, price);
		this.color = color;
		this.size = size;
	}

	@Override
	public void displayProduct() {
		System.out.println("\n---------- clothing ---------------");
		System.out.println("Product Id \t: " + getPrdId());
		System.out.println("Name \t\t: " + getPrdName());
		System.out.println("Brand \t\t: " + getBrand());
		System.out.println("Color \t\t: " + color);
		System.out.println("Size \t\t: " + size);
		System.out.println("Price \t\t: " + getPrice());
		System.out.println("___________________________________\n");
	}
}
