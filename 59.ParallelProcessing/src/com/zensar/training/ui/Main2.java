package com.zensar.training.ui;

import java.util.List;


import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		List<Square> allSquares=CollectionFactory.getSquareList();
		
		allSquares.stream().parallel().forEach((s)->System.out.println(s));
		
		
       List<Student> allStudents=CollectionFactory.getStudentList();
		
		allStudents.stream().parallel().forEach((s)->System.out.println(s));
	}

}
