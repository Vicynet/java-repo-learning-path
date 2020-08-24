package chapter5;
import java.util.logging.Logger;

public class Parallelogram extends TwoDimension {
	private Logger logger = Logger.getLogger(Parallelogram.class.getName());
//	private double base;
	private double height;
	
	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		double result = this.getBreadth() * this.getLength();
		logger.info("Area of Parallelogram = " + result);
		return result;
	}
	
	public Parallelogram(double len, double bre) {
		this.setLength(len);
		this.setBreadth(bre);
	}
	
}
