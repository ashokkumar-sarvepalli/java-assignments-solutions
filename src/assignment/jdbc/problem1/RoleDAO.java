package assignment.jdbc.problem1;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RoleDAO {

    public ArrayList<Role> getAllRoles() throws ClassNotFoundException {
    	
    	    Connection con = null;
    	    Statement st = null;
    	    ResultSet rs = null;
    	
    	try {
    		
        	con = DbConnection.getConnection();
        	st = con.createStatement();
        	rs = st.executeQuery("SELECT * FROM role ORDER BY name ASC;");
        	
            while (rs.next()) {//get first result
            	Role role = new Role(rs.getInt("id"), rs.getString("name"));
            	System.out.println(role.toString());
            }
        	
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	} 
    	
    	finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
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
