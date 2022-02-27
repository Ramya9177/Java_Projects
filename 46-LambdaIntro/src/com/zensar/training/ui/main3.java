package com.zensar.training.ui;

import com.zensar.training.bean.Executable;

public class main3 {
	public static void main(String[] args) {
		Executable executable;

	
		executable = (Integer obj,String sobj) -> {
			System.out.println(sobj+obj.doubleValue());
		};
		executable.execute(25,"welcome");
		executable = (Integer obj,String sobj) -> {
			System.out.println(sobj+obj.intValue());
		};
		executable.execute(56,"good bye");

	}
}
