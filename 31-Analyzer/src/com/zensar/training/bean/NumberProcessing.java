package com.zensar.training.bean;

import java.util.Arrays;

public class NumberProcessing {
	private int[] array;
	private int currentIndex = 0;

	public NumberProcessing(int n) {
		this.array = new int[n];
	}

	public void add(int numberdata) {
		this.array[this.currentIndex] = numberdata;
		this.currentIndex++;
	}

	public int getMaximum() {
		Arrays.sort(array);
		return array[array.length - 1];
	}

	// public int getMaximum() {
	// int max=array[0];
	// if()
	// }

	public int getMinimum() {
		Arrays.sort(array);
		return array[0];
	}

	public int getSum() {
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		return sum;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.array);
	}
}
