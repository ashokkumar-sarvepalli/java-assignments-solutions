package assignment.jdbc.problem3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import assignment.jdbc.problem2.DbConnection;

public class Main {

	public static void main(String[] args) throws Exception {
		int choice, roleId, c = 0;
		String userDetails;
		Role role = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		User user;
		String roleName = null;
		String roleDescription = null;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		while (true) {
			System.out.println("1. Create User\n2. Display Details\n3. Exit\nEnter the choice :");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1:
				System.out.println("Enter the user details:");
				userDetails = br.readLine();
				String[] inputUserDetails = userDetails.split(",");

				String name = inputUserDetails[0];
				String userName = inputUserDetails[1];
				String password = inputUserDetails[2];
				String mobileNumber = inputUserDetails[3];

				System.out.println("Role details:");
				System.out.format("%-15s %-25s %s\n", "Role id", "Role name", "Role description");
				RoleDAO dao = new RoleDAO();
				dao.getAllRoles();

				System.out.println("Enter the role id:");
				roleId = Integer.parseInt(br.readLine());
				try {
					conn = DbConnection.getConnection();
					st = conn.createStatement();
					String query = "SELECT * FROM userrole.role where id='" + roleId + "'";
					rs = st.executeQuery(query);
					while (rs.next()) {
						roleName = rs.getString("name");
						roleDescription = rs.getString("description");
					}
					role = new Role(roleId, roleName, roleDescription);
					user = new User(name, userName, password, mobileNumber, role);
					UserDAO userDao = new UserDAO();
					userDao.createUser(user);

				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				UserDAO udao = new UserDAO();
				udao.displayDetails();
				break;
			case 3:
				System.exit(0);
			}
		}
	}

}
