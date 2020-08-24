package javaoop;

public abstract class Reptile extends Animal{
	private int[] scales;
	
	public abstract void crawl();
	
	public int[] getScales() {
		return this.scales;
	}
	
	public void setScales(int[] scales) {
		this.scales = scales;
	}
	
	public void addScales(int numberOfScales) {
		;
	}
}
