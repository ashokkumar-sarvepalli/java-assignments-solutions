package assignment.jdbc.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args)
			throws NumberFormatException, IOException, ClassNotFoundException, SQLException {

		RoleDAO roleDAO = new RoleDAO();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("List of privileges :");
		System.out.format("%-15s %s\n", "Privilege ID", "Privilege Name");
		PrivilegeDAO privilegeDAO = new PrivilegeDAO();
		List<Privilege> privileges = privilegeDAO.getAllPrivileges();
		for (int i = 0; i < privileges.size(); i++) {
			System.out.format("%-15s %s\n", privileges.get(i).getId(), privileges.get(i).getName());
		}

		System.out.println("Enter number of new Roles to be created :");
		Integer n = Integer.parseInt(br.readLine());

		System.out.println("Enter the role and privileges :");

		for (int j = 0; j < n; j++) {
			ArrayList<Privilege> privilegeList = new ArrayList<>();
			String input = br.readLine();
			String[] firstArray = input.split(",");
			String role = null;

			if (firstArray[0] != null) {
				role = firstArray[0];
			}

			for (int i = 1; i < firstArray.length; i++) {
				if (!firstArray[i].isEmpty()) {
					Privilege previlege = new Privilege();
					previlege.setName(firstArray[i]);
					privilegeList.add(previlege);
				}
			}

			Role userRole = new Role();
			userRole.setName(role);
			roleDAO.createRole(userRole, privilegeList);
		}


		System.out.println("Enter the Role :");
		String rol = br.readLine();
		System.out.println("Privileges for " + rol + " :");
		roleDAO.getPreviligeByRole(rol);
		

	}
}
