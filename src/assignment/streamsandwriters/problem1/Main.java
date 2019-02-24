package assignment.streamsandwriters.problem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// fill your code
public class Main {
	public static void main(String args[]) throws FileNotFoundException, IOException {

		File file = new File("input.txt");

		try {

			BufferedReader brReader = new BufferedReader(new FileReader(file));
			List<User> userList = new ArrayList<>();
			String st;
			while ((st = brReader.readLine()) != null) {
				Long id = Long.parseLong(st.substring(0, 5));
				String fName = st.substring(5,15);
				String lName = st.substring(15,25);
				String uName = st.substring(25, 35);
				String pwd = st.substring(35, 43);
				String mobb = st.substring(43, st.length());

				User user = new User(id, fName, lName, uName, pwd, mobb);
				userList.add(user);
			}
			brReader.close();
            System.out.format("%-10s %-15s %-15s %-15s %-15s %s\n", "id","firstName","lastName","username","password","mobileNumber");


			userList.forEach(System.out::println);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}