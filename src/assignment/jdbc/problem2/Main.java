package assignment.jdbc.problem2;

public class Main {

	public static void main(String[] args) {

		System.out.format("%-10s %-20s %-25s %-10s %-10s \n", "User", "Role", "Street", "City", "State");
		UserDAO dao = new UserDAO();
		try {
			dao.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
