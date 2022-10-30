package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecordps {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "update person set pname = ? where pid = ?";
			System.out.println("enter person name for update");
			String newpersonname = sc.next();
			System.out.println("enter pid for update");
			int pid = sc.nextInt();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, newpersonname);
			ps.setInt(2, pid);
			int count = ps.executeUpdate();
			System.out.println("updated records counts :" + count);
			connection.close();
			System.out.println("record updated....");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
