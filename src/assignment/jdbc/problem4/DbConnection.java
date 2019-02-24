package assignment.jdbc.problem4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection conn = null;
		try {
			ResourceBundle rb = ResourceBundle.getBundle("mysql");
			String url = rb.getString("db.url");
			String username = rb.getString("db.username");
			String password = rb.getString("db.password");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception ex) {
			ex.getStackTrace();
		}

		return conn;
	}
}