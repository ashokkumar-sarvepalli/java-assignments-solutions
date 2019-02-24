package assignment.streamsandwriters.problem2;
//fill your code

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static Long ID = 100L;
	public static void main(String args[]) throws IOException {
		
	

		List<User> userList = new ArrayList<User>();
		String fileName = "output.txt";

		try {
			BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));
			// fill your code
			System.out.println("Enter the number of users:");
			int n = Integer.parseInt(brReader.readLine());
			System.out.println("Enter user details");

			for (int i = 0; i < n; i++) {
				System.out.println("Enter the User ID");
				Long userId = Long.parseLong(brReader.readLine());
				System.out.println("Enter the first name");
				String firstName = brReader.readLine();
				System.out.println("Enter the last name");
				String lastName = brReader.readLine();
				System.out.println("Enter the username");
				String userName = brReader.readLine();
				System.out.println("Enter the password");
				String password = brReader.readLine();
				System.out.println("Enter the mobile number");
				String mobileNumber = brReader.readLine();
				System.out.println("Enter the role name");
				String roleName = brReader.readLine();
				Role role = new Role(ID++, roleName);
				User user = new User(userId, firstName, lastName, userName, password, mobileNumber, role);
				userList.add(user);
			}

			UserBO userBO = new UserBO();
			userBO.saveAllUser(userList, fileName);
			System.out.println("User information saved successfully");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
