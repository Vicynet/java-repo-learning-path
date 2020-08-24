package chapter5;

public abstract class TwoDimension implements Quadrilateral {
	private double length;
	private double breadth;
	
	public abstract double area(); //at least one abstract method
	
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return this.breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public final int getNoSides() {
		return 4;
	}
	

}
