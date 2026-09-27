package ShopKart;

public class COD implements Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Cash on Delivery selected for amount ₹" + amount);
		System.out.println("Order Placed Successfully! Please keep exact change ready. 🎉");
	}
}
