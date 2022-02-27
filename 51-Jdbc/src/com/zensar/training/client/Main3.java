package com.zensar.training.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// step 2 connect with database
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/TrainingDB";
		String username = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connection established");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String name;
		LocalDate doj;
		char grade;
		double basic;
		char gender;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enetr name : ");
		name = scanner.next();

		System.out.print("Enter DOJ dd-MMM-yyy : ");
		String temp = scanner.next();
		doj = LocalDate.parse(temp, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

		System.out.println("Enter Gender : ");
		grade = scanner.next().charAt(0);

		System.out.println("Enter Basic : ");
		basic = scanner.nextDouble();

		System.out.println("Enter Gender M-Male F-Female : ");
		gender = scanner.next().charAt(0);

		String Sql = "insert into Temployees(name,doj,grade,basic_salary,gender) values(?,?,?,?,?)";

		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(Sql);
			System.out.println("Statement Created.....!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			statement.setString(1, name);
			Date date = Date.valueOf(doj);
			statement.setDate(2, date);
			statement.setString(3, grade + "");
			statement.setDouble(4, basic);
			statement.setString(5, gender + "");
			int count = statement.executeUpdate();
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
