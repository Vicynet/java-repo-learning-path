package javaoop;

import java.util.logging.Logger;

public class Pigeon extends Bird {
	private Logger logger = Logger.getLogger(Pigeon.class.getName());
	
	public Pigeon() {
		
	}
	public Pigeon(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		logger.info("Flying away now...");
	}
}
