package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main9 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile = new RandomAccessFile("employees.dat", "rw");
		List<Employee> employees = new LinkedList<>();

		while (true) {
			try {
				int id = accessFile.readInt();
				String name = accessFile.readUTF();
				char grade = accessFile.readChar();
				
				String hd = accessFile.readUTF();
				LocalDate hiredDate = LocalDate.parse(hd);
				
				double basicSalary = accessFile.readDouble();
				
				String gender = accessFile.readUTF();
				Gender gender1;
				if (gender.equals("MALE"))
					gender1 = Gender.MALE;
				else
					gender1 = Gender.FEMALE;

				Employee employee = new Employee(id, name, grade, hiredDate, basicSalary, gender1);
				employees.add(employee);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(employees);
				return;
			}
		}

	}

}
