package assignment.jdbc.problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DbConnection {

    public static Connection getConnection() {
    	Connection conn = null;
    	try {
        //ResourceBundle rb = ResourceBundle.getBundle("mysql");
		//String url = rb.getString("db.url");
		//String username = rb.getString("db.username");
		//String password = rb.getString("db.password");
	   
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Ashok@Tutor");
		
		
    	}catch(Exception ex) {ex.printStackTrace();}
		
		return conn;
    }
}
