package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			CallableStatement cs = connection.prepareCall("{call select_merit_person()}");
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
