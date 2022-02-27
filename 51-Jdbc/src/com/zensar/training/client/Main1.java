package com.zensar.training.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

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
		// step 3(Run Queries)
		//String Sql = "insert into Temployees(name,doj,grade,basic_salary,gender) values('Raghu','2020-07-16','C',11000.00,'M')";
		String Sql="update temployees set Grade='B' where id =5";
		//String Sql="delete from temployees where id=4";
		
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Statement createted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		int count;
		try {
			count = statement.executeUpdate(Sql);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// step 4 closing the resources
		try {
			statement.close();
			connection.close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
