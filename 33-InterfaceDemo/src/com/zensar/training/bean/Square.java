package com.zensar.training.bean;

public class Square implements Shape {
	
	private int size;
	

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public double computeArea() {
		return this.size*this.size;
	}

	@Override
	public double getArea(int radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
