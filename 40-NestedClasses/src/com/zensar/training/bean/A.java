package com.zensar.training.bean;

public class A {
	private int x;
	private static int y;

	void test() {
		B obj = new B(8);
		System.out.println(obj.a);
	}

	public class B { // regular class

		private int a;
		

		public B(int a) {
			super();
			this.a = a;
		}

       
		void m1() {
			System.out.println(x);
			System.out.println(y);
		}

	}

	public static class C {// static class
		
		void m1() {
			System.out.println(y);

		}

	}

	public void calc() {
		class Calculator {// method inner class
			int sum(int a, int b) {
				System.out.println(x);
				System.out.println(y);
				return a + b;

			}

			int substract(int a, int b) {
				return a - b;

			}

			int multyply(int a, int b) {
				return a * b;

			}

			int division(int a, int b) {
				return a / b;

			}
		}
		Calculator calculator = new Calculator();
	}
}
