package com.zensar.training.ui;


import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;

public class Main6 {
	public static void main(String[] args) {
     List<Square>allSquare=new LinkedList<>();
		
		Square s1=new Square(5);
		Square s2=new Square(9);
		Square s3=new Square(8);
		Square s4=new Square(5);
		Square s5=new Square(2);
		
		
		allSquare.add(s1);
		allSquare.add(s2);
		allSquare.add(s3);
		allSquare.add(s4);
		allSquare.add(s5);
		
		//System.out.println(allSquare.get(0));
		//System.out.println(allSquare.size()-1);
		
		System.out.println(allSquare);
		allSquare.add(3, new Square(100));
		System.out.println(allSquare);
		allSquare.set(0, new Square(200));
		System.out.println(allSquare);
		
		System.out.println(allSquare.indexOf(new Square(8)));
		System.out.println(allSquare.contains(new Square(5)));
		
		for(Square square:allSquare) {
			System.out.println(square.calculateArea());
		}
		
		allSquare.clear();
		allSquare=null;
		
	}
	}

