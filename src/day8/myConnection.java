package day8;

import java.sql.Connection;
import java.sql.DriverManager;

public class myConnection {

	private static Connection con;

	public static Connection getConnection() {
		System.out.println("inside myconnection");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviebooking", "root", "berlin@5");
			System.out.println("connection done");

			System.out.println("Test: " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
