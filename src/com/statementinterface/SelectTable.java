package com.statementinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTable {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "select * from orders";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				System.out.println("column number");
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
//				System.out.println(rs.getString(4));

				System.out.println(rs.getInt("oid"));
				System.out.println(rs.getString("oname"));
				System.out.println(rs.getString("price"));
				System.out.println(rs.getString("orderdate"));
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
