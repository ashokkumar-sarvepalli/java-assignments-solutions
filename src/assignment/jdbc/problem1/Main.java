package assignment.jdbc.problem1;

public class Main {
	public static void main(String[] args) {

		System.out.println("Role Details:");
		RoleDAO dao = new RoleDAO();
		try {
			dao.getAllRoles();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
