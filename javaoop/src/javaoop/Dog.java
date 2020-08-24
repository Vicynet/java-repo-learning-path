package javaoop;
import java.util.logging.Logger;

public class Dog extends Animal {
	private Logger logger = Logger.getLogger(Dog.class.getName());
	
	public Dog() {
		
	}
	
	public Dog(String name) {
		//super(name);
		super();
		this.setName(name);
	}
	
	@Override
	public void move() {
		logger.info("Barking at David...");
	}
}
