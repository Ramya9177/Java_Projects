package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.zensar.training.bean.Employee;

public class Main4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		Employee employee=null;
		InputStream is=new FileInputStream("employee.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		
		employee=(Employee)ois.readObject();

		System.out.println(employee);
		
		ois.close();
		is.close();
	}

}
