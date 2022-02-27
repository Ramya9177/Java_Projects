package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Student;

public class Main8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream is=new FileInputStream("students.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		List<Student> students;
		
		students=(List<Student>)ois.readObject();
		System.out.println(students);
		ois.close();
		is.close();
	}

}
