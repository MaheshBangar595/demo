package com.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		System.out.println("---------main method start--------");

		try {

			// Step 1 : load the Driver class

			Class.forName("com.mysql.jdbc.Driver");

			// Step 2 : create the connection
			// UsernName
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root"); // Password

			// Step 3: Build sql query
			String sql = "insert into student values(106,'Mahesh')";

			// Step 4: create the statement
			Statement smt = connection.createStatement();

			// step 5: execute sql queries
			smt.execute(sql);

			// step 6: close the connectin
			connection.close();

			System.out.println("Record inserted!!!!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------main method end-----");
	}

}
