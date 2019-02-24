package assignment.oopsconcept.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		User user = new User();
		int noOfUsers;
		String line = null;

		System.out.println("Enter the total number of users");
		noOfUsers = Integer.parseInt(buff.readLine());

		User[] userArray = new User[noOfUsers];

		for (int i = 0; i < noOfUsers; i++) {
			System.out.println("Enter user details");
			line = buff.readLine();

			String[] split = line.split(",");
			userArray[i] = new User(split[0], split[1], split[2], split[3]);

		}

		int option;
		System.out.println("1)Search user by user name\n2)Search user by first name and last name");
		System.out.println("Enter your option");
		option = Integer.parseInt(buff.readLine());
		String userName = null;
		String firstName = null;
		String lastName = null;

		if (option == 1) {

			System.out.println("Enter the user name to search");
			userName = buff.readLine();

			User resultUser = user.findUser(userArray, userName);

			if (resultUser != null) {
				System.out.println("User details :");
				System.out.println("UserName :" + resultUser.getUserName());
				System.out.println("FirstName :" + resultUser.getFirstName());
				System.out.println("LastName :" + resultUser.getLastName());
				System.out.println("Contact :" + resultUser.getContact());

			}

			else {
				System.out.println("User not found");
			}

		}

		else if (option == 2) {
			System.out.println("Enter the first name to search");
			firstName = buff.readLine();
			System.out.println("Enter the last name to search");
			lastName = buff.readLine();
			User resultUser = user.findUser(userArray, firstName, lastName);

			if (resultUser != null) {
				System.out.println("User details :");
				System.out.println("UserName :" + resultUser.getUserName());
				System.out.println("FirstName :" + resultUser.getFirstName());
				System.out.println("LastName :" + resultUser.getLastName());
				System.out.println("Contact :" + resultUser.getContact());

			}

			else {
				System.out.println("User not found");
			}

		}

	}
}
