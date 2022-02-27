package com.zensar.training.ui;

import com.zensar.training.bean.pack2.GoodBye;
import com.zensar.training.bean.pack2.Hello;
import com.zensar.training.bean.pack2.Welcome;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello;
		
		hello=()->System.out.println("  ");//lambda expression 
	
		Welcome welcome=new Welcome();
		hello=welcome::sayWelcome;
		hello.doIt();
		
		GoodBye bye=new GoodBye();
		hello=bye::sayGoodBye;
		hello.doIt();
		
	}

}
