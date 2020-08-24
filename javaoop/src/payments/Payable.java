package payments;
import java.math.BigDecimal;

public interface Payable {
	//BigInteger calculatePayment(); //or
	public abstract BigDecimal calculatePayment();


}
