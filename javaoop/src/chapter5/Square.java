package chapter5;
import java.util.logging.Logger;

public class Square extends TwoDimension {
	private Logger logger = Logger.getLogger(Square.class.getName());
	private int length;
	
	@Override
	public double area() {
		double result = this.length * this.length;
		logger.info("Area of Square = " + result);
		return result;
	}

	public Square(double len) {
		this.setLength(len);
		// TODO Auto-generated constructor stub
	}
	
}
