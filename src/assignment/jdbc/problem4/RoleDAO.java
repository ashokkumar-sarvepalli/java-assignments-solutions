package assignment.jdbc.problem4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO {

	public void createRole(Role roleIns, ArrayList<Privilege> privilegeList)
			throws SQLException, ClassNotFoundException {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		int role_id = 0;
		int prev_id = 0;
		try {
			conn = DbConnection.getConnection();
			String roleName = roleIns.getName();
			String roleQuery = "INSERT INTO role_privilege.role(`name`) VALUES\r\n" + "(?)";
			PreparedStatement prepSt = conn.prepareStatement(roleQuery);
			prepSt.setString(1, roleName);
			prepSt.executeUpdate();

			String role_query = "SELECT * FROM role_privilege.role where name='" + roleName + "'";
			st = conn.createStatement();
			rs = st.executeQuery(role_query);
			while (rs.next()) {
				role_id = rs.getInt("id");
			}

			for (int l = 0; l < privilegeList.size(); l++) {

				String privilegeName = privilegeList.get(l).getName();

				String prev_query = "SELECT * FROM role_privilege.privilege where name='" + privilegeName + "'";
				rs = st.executeQuery(prev_query);
				while (rs.next()) {

					prev_id = rs.getInt("id");
				}

				String role_prev_query = "INSERT into role_privilege.role_privilege VALUES\r\n " + "(?, ?)";

				PreparedStatement pre = conn.prepareStatement(role_prev_query);
				pre.setInt(1, role_id);
				pre.setInt(2, prev_id);
				pre.executeUpdate();
			}

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

	public List<Privilege> getPreviligeByRole(String role) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		List<Privilege> privileges = new ArrayList<>();
		try {
			conn = DbConnection.getConnection();
			String query = "SELECT p.name FROM role_privilege.role_privilege rp, role_privilege.role r, role_privilege.privilege p "
					+ "where rp.role_id = r.id and p.id = rp.privilege_id and r.name ='" + role + "'";

			st = conn.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				Privilege privilege = new Privilege();
				privilege.setName(rs.getString("name"));
				privileges.add(privilege);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Privilege privilege : privileges) {
			System.out.println(privilege);
		}
		return privileges;
	}

}