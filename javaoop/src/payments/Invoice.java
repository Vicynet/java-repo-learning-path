package payments;

import java.math.BigDecimal;

public class Invoice implements Payable {
	private Product[] products;
	
	public BigDecimal calculatePayment() {
		BigDecimal result = BigDecimal.ZERO;
		for (Product product : products) {
			double amount = product.getPrice() * product.getQuantity();
			result = result.add(new BigDecimal(amount));
		}
		return result;
		
	}
	
//	public Product[] getProducts() {
//		
//	}
//	
//	public void setProducts(Product[] products) {
//		
//	}
//	
	
}
