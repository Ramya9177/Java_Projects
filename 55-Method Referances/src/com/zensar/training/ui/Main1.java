package com.zensar.training.ui;

import com.zensar.training.bean.pack1.Addition;
import com.zensar.training.bean.pack1.Multiplication;
import com.zensar.training.bean.pack1.Task1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1 task;
		task=Addition::add;//)a,b)->a+b//method referance for static method
		System.out.println(task.execute(10,20));

		/*task=(a,b)->a*b;       //using lambda expression
		System.out.println(task.execute(10,20));*/
		
		
		task=Multiplication::multiply;//)a,b)->a+b//method referance for static method
		System.out.println(task.execute(10,20));
	}

}
