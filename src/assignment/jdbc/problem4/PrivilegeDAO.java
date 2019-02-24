package assignment.jdbc.problem4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assignment.jdbc.problem2.DbConnection;

public class PrivilegeDAO {
	
	public List<Privilege> getAllPrivileges() throws SQLException, ClassNotFoundException {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<Privilege> list = new ArrayList<Privilege>();
    	try {
    		conn = DbConnection.getConnection();
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM role_privilege.privilege;");
    		
    		
			while (rs.next()) {
//	            System.out.format("%-15s %s", rs.getInt("id"),rs.getString("name"));
	            Privilege privilege = new Privilege(rs.getInt("id"),rs.getString("name"));
	            list.add(privilege);
			}
        	
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}

    	return list;
    }	
}