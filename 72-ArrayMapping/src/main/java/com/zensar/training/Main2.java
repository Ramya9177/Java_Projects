package com.zensar.training;

import java.util.List;

import com.zensar.training.bean.Product;
import com.zensar.training.bean.Student;


public class Main2 {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);
	}

	private static void insertTesting() {
		Product product=new Product();
		product.setId(201);
		product.setName("Iphone");
		product.setDiscounts(0,10);
		product.setDiscounts(1, 11);
		product.setDiscounts(2, 15);

		

		System.out.println("Product Object Saved with ID " );
	}

	private static void loadTesting(int id) {
		
	}

	private static void loadAllTesting() {
		

	}

	private static void updateTesting(int id) {

		

	}

	private static void deleteTesting(int id) {
		

	}

}
