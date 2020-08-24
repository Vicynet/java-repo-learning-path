package chapter5;
import java.util.logging.Logger;

public class Trapezium extends TwoDimension {
	private Logger logger = Logger.getLogger(Trapezium.class.getName());
	private double breadth2;
	
	@Override
	public double area() {
		double result = 0.5 * (this.getBreadth() + breadth2) * this.getLength();
		logger.info("Area of Trapezium = " + result);
		return result;
	}
}
