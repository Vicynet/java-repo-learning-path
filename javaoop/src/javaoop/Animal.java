package javaoop;

public class Animal {
	private  String name;
	private double weight;
	private Color color;
	protected static int lifeSpan;
	private int xCoordinate;
	private int yCoordinate;
	
	public Animal() {
		
	}
	
	public Animal(String animalName, double animalWeight, Color color) {
		name = animalName;
		weight = animalWeight;
		this.color = color;
	}
	public Animal(String animalName, double animalWeight) {
		name = animalName;
		weight = animalWeight;
	}
	
	public Animal(String animalName) {
		name = animalName;
	}

	public void move() {
		System.out.println("This animal is on the move...");
	}
	
	public void sound() {
		System.out.println("This animal is sounding...");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public static int getLifeSpan() {
		return lifeSpan;
	}

	public static void setLifeSpan(int lifeSpan) {
		Animal.lifeSpan = lifeSpan;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xPosition) {
		this.xCoordinate = xPosition;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	

}
