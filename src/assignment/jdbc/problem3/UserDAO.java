package assignment.jdbc.problem3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import assignment.jdbc.problem2.DbConnection;

public class UserDAO {

	public void createUser(User user) throws Exception {
		Connection conn = null;
		try {
			conn = DbConnection.getConnection();
			Role role = user.getRole();
			String query = "INSERT INTO userrole.user (`name`, `username`, `password`, `mobile number`, `role`) VALUES\r\n"
					+ "(?, ?, ?, ?, ?)";

			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setString(1, user.getName());
			preparedStmt.setString(2, user.getUserName());
			preparedStmt.setString(3, user.getPassword());
			preparedStmt.setString(4, user.getMobileNumber());
			preparedStmt.setString(5, role.getRoleName());


			preparedStmt.executeUpdate();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void displayDetails() throws Exception {
		System.out.println("User details:");
		System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n", "User id", "Name", "User name", "Password",
				"Mobile number", "Role");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
    	try {
    		conn = DbConnection.getConnection();
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM userrole.user ORDER BY id DESC LIMIT 2;");
    		
			while (rs.next()) {
				System.out.format("%-15s %-15s %-15s %-15s %-15s %s\n", rs.getInt("id"), rs.getString("name"),rs.getString("username"), rs.getString("password"),
						rs.getString("Mobile number"), rs.getString("Role"));
	       //     System.out.format("%-15s %-25s %s\n", rs.getInt("id"),rs.getString("name"),rs.getString("description"));
			}
        	
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}
	}

}
