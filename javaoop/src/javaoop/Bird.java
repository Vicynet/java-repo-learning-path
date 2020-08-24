package javaoop;

import java.util.logging.Logger;

public class Bird extends Animal {
	private Logger logger = Logger.getLogger(Bird.class.getName());
	private Wing leftWing;
	private Wing rightWing;
	private boolean flyer;
	
	public Bird() {
		super();
	}
	
	public Bird(String name) {
		//super(name);
		super();
		this.setName(name);
	}
	public Bird(String name, double weight) {
		super(name, weight);
	}
	public Bird(String name, Wing leftWing, Wing otherWing) {
		super(name);
		this.leftWing = leftWing;
		rightWing = otherWing;
	}
	
	public Wing getLeftWing() {
		return  this.leftWing;
	}
	
	public void setLeftWing(Wing aWing) {
		leftWing = aWing;
	}

	public Wing getRightWing() {
		return rightWing;
	}

	public void setRightWing(Wing rightWing) {
		this.rightWing = rightWing;
	}

	public boolean isFlyer() {
		return flyer;
	}

	public void setFlyer(boolean flyer) {
		this.flyer = flyer;
	}
	
	@Override
	public void move() {
		//System.out.println("I so fly...");
		logger.info("I am so fly...");
	}
	
	

//	public Wing getRightWing() {
//		return rightWing;
//	}
//
//	public void setRightWing(Wing rightWing) {
//		this.rightWing = rightWing;
//	}
	
}
