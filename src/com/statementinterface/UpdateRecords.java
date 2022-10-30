package com.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecords {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "update person set pname='Dipak' where pid=103";
			Statement statement = connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("record updated");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
}
}