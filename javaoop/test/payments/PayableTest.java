package payments;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayableTest {

	private Logger logger = Logger.getLogger(PayableTest.class.getName());

	@Test
	void payableExistTest() {
		//BigDecimal.
		Payable joel = new Employee(1, "Joe", "Doe", new BigDecimal(100000));
		Payable dave = new Employee(2, "dave", "davy", new BigDecimal(10000));
		
		Payable februaryInvoice = new Invoice();
		Product water = new Product(1, 10, "Water", 1000.0);
		Product marker = new Product(2, 30, "Board Maker", 100.0);
		Product[] febProducts = {water, marker};
		februaryInvoice.setProducts(febProducts);
		
		List<Payable> payables = new ArrayList<>();
		payables.add(joel);
		payables.add(dave);
		payables.add(februaryInvoice);
		
		for(Payable payable : payables) {
			logger.info(payable.calculatePayment().toString());
		}
		
		
		
		
	}

}
