package chapter5;
import java.util.logging.Logger;

public class Rectangle extends TwoDimension {
	private Logger logger = Logger.getLogger(Rectangle.class.getName());
	
	public Rectangle (double len, double breadth) {
		this.setLength(len);
		this.setBreadth(breadth);
	}
	
	
	@Override
	public double area() {
		double result = length + breadth;
		logger.info("Area of Rectangle = " + result);
		return result;
	}
}
