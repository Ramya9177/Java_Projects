package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("program begins......!");
		
		int[] arr= {10,20,30};
		String str="125";
		
		try {
		System.out.println(arr[10]);
		int x=Integer.parseInt(str);
		x++;
		System.out.println(x);
		System.out.println(12/1);
		String s=null;
		System.out.println(s.toUpperCase());
		}
		catch(ArithmeticException e) {
			System.out.println("Some Atithmetic Error Occurs");
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Data for Conversion");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing Invalid Array Elements");
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Runs Always");
		}
		
		System.out.println("program ends....!");

	}

}
