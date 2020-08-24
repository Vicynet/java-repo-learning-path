package javaoop;

import java.util.logging.Logger;

public class Fish extends Animal{
	private Logger logger = Logger.getLogger(Fish.class.getName());

//	@Override
//	public void move() {
//		// TODO Auto-generated constructor stub
//	}

	public Fish(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		logger.info("Swimming in the ocean...");
	}
}
