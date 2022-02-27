package com.zensar.training.ui;

import com.zensar.training.bean.Square;

public class Main2 {

	public static void main(String[] args) {
		Square[] squares=new Square[4];
		
		squares[0]=new Square(4);
		squares[1]=new Square(5);
		squares[2]=new Square(2);
	    squares[3]=new Square(3);
		
		for(Square square:squares) {
			System.out.println(square);
			System.out.println("size : "+square.getSize()+", "+"Area : "+square.calculateArea());
		}
		squares=null;

	}

}
