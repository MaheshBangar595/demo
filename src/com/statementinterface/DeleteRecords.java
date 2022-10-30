package com.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecords {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "delete from person where pid=100";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("record deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
