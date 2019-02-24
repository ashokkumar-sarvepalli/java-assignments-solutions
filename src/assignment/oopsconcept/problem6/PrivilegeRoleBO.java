package assignment.oopsconcept.problem6;

public class PrivilegeRoleBO {

	void displayRoleDetailsByPrivilege(PrivilegeRole[] privilegeRole, String privilege) {

		boolean isNotFound = true;
		boolean isFirst = true;
		
		for (PrivilegeRole pr : privilegeRole) {

			if (pr.getPrivilege().getName().equalsIgnoreCase(privilege)) {
				if(isFirst) {
					System.out.println("Role name :");
					isFirst = false;
				}
				System.out.println(pr.getRole().getName());
				isNotFound = false;
			}
		}

		if (isNotFound) {
			System.out.println("There is no  Privelege for that role");
		}
	}

	void displayPrivilegeDetailsByRole(PrivilegeRole[] privilegeRole, String role) {
		boolean isNotFound = true;
		boolean isFirst = true;
		for (PrivilegeRole pr : privilegeRole) {
			if (pr.getRole().getName().equalsIgnoreCase(role)) {
				if(isFirst) {
					System.out.println("Privilege name :");
					isFirst = false;
				}
				System.out.println(pr.getPrivilege().getName());
				isNotFound = false;
			}
		}

		if (isNotFound) {
			System.out.println("There is no  Privelege for that role");
		}
	}

	void displayRole(Role[] roles) {
		System.out.println("Role Details :");
		System.out.format("%-15s %s\n", "Id", "Name");
		for (Role r : roles)
			System.out.format("%-15d %s\n", r.getId(), r.getName());
	}

	void displayPrivilege(Privilege[] privilege) {
		System.out.println("Privilege Details :");
		System.out.format("%-15s %s\n", "Id", "Name");
		for (Privilege p : privilege)
			System.out.format("%-15d %s\n", p.getId(), p.getName());
	}

}
