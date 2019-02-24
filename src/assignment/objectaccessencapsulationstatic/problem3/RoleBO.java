package assignment.objectaccessencapsulationstatic.problem3;

public class RoleBO {

	public void display(Role[] role) {
		int max = role[0].getPrivilege().length;

		for (int i = 1; i < role.length; i++) {
			if (role[i].getPrivilege().length > max) {
				max = role[i].getPrivilege().length;
			}
		}

		System.out.println("Role names which has more number of privileges :");
		for (int i = 0; i < role.length; i++) {
			if (role[i].getPrivilege().length == max) {
				System.out.println(role[i].getName());
			}
		}

	}

}
