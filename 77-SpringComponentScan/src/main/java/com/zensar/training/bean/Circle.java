package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value="circ")
public class Circle implements Shape{
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "\nCircle [radius=" + radius + "]";
	}
	public double calculateArea() {
		return this.radius*this.radius*3.14;
	}

	@Override
	public void setSize(int size) {
		setRadius(size);
		
	}

	@Override
	public double computeArea() {
		
		return this.calculateArea();
	}
}
