package com.zensar.training.bean;

public class Circle {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double computeArea() {
		return 1.34 * this.radius * this.radius;
	}
}
