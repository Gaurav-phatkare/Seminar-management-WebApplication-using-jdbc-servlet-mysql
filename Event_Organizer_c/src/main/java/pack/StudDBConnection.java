package pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudDBConnection {
	public static Connection conn;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/event_organizer","root","rootuser");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}	

	public static Connection getConnection() {
		return conn;
	}

}
