package assignment.jdbc.problem3;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.List;

import assignment.jdbc.problem2.DbConnection;
public class RoleDAO {
    
    public List<Role> getAllRoles() throws Exception
    {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
    	try {
    		conn = DbConnection.getConnection();
    		st = conn.createStatement();
    		rs = st.executeQuery("SELECT * FROM userrole.role;");
    		
			while (rs.next()) {
	            System.out.format("%-15s %-25s %s\n", rs.getInt("id"),rs.getString("name"),rs.getString("description"));
			}
        	
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}

    	return null;
    }
    
}
