package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecordsps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "insert into person values(?,?,?)";
			System.out.println("enter person id");
			int personid = sc.nextInt();
			System.out.println("enter person name");
			String personname = sc.next();
			System.out.println("enter person address");
			String personaddress = sc.next();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, personid);
			ps.setString(2, personname);
			ps.setString(3, personaddress);
			ps.execute();
			System.out.println("Record inserted....");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
