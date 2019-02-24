package assignment.jdbc.problem2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO {

	public ArrayList<User> getAllUsers() {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DbConnection.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT ur.name as User, r.name as Role, c.street as Street, c.city as City,\r\n" + 
					"c.state as State FROM user_role.user ur\r\n" + 
					"INNER JOIN user_role.role r ON ur.role_id = r.id\r\n" + 
					"INNER JOIN user_role.contact c ON ur.contact_id = ur.id;");

			while (rs.next()) {// get first result
//				System.out.println(	
//				rs.getString("User") + rs.getString("Role") + rs.getString("Street") + rs.getString("City") + rs.getString("State"));
				System.out.format("%-10s %-20s %-25s %-10s %-10s \n", rs.getString("User"), rs.getString("Role"), rs.getString("Street"), rs.getString("City"), rs.getString("State"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException ex) {
				ex.getMessage();
				ex.getSQLState();
				ex.getStackTrace();
			}
		}
		return null;
	}

}
