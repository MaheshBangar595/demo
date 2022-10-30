package com.singletondesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection connection = null;
	public static final String URL = "jdbc:mysql://localhost:3306/b17";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";

	private MyConnection() {
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		if (connection == null) {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return connection;
		}
		return connection;
	}
}
