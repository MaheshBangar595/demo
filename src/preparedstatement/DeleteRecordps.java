package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class DeleteRecordps {
	public static void main(String[] args) {

		try {

			String s = args[0];
			int i = Integer.parseInt(s);

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b17", "root", "root");
			String sql = "delete from person where pid =?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, i);
			ps.execute();
			System.out.println("record deleted....");
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
