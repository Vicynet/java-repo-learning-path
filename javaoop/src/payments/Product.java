package payments;

public class Product {
	
	private int productId;
	private int quantity;
	private String name;
	private double price;
	
	public Product() {
		
	}
	
	public Product(int productId, int quantity, String name, double price) {
		this.productId = productId;
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
