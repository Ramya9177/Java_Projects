package com.zensar.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindTotalSalaryTask implements Runnable{

	@Override
	public void run() {
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

		// step 3
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("statement created");
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String Sql = "select basic_salary from temployees ";

		ResultSet rs = null;
		double sum=0;
		try {
			rs = statement.executeQuery(Sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				
				//System.out.print(rs.getDouble(1) + ",");
				sum+=rs.getDouble(1);
				
			}
			System.out.println(Thread.currentThread().getName()+" : "+sum);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		// step 4 close all the resourses
		try {
			statement.close();
			rs.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
