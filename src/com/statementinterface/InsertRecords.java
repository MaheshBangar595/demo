package com.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "insert into person value(100,'Dipak','Pune')";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("record inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
