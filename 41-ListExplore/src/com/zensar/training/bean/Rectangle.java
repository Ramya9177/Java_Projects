package com.zensar.training.bean;

public class Rectangle implements Comparable{
	int height;
	int width;
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public Rectangle() {
		super();
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int compareTo(Object o) {
		if(this.height<o.height)
			return -1;
		if(this.height>o.height)
			return 1;
		return 0;
	}
	

}
