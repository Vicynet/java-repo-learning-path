package javaoop;

public enum Wing {
	LEFT_BIG_WING(4),
	RIGHT_BIG_WING(4),
	LEFT_SMALL_WING(2),
	RIGHT_SMALL_WING(2);
	
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	Wing(int wingSize) {
		this.size = wingSize;
	}
}
